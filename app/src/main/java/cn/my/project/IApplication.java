/*
 * Copyright (C) 2015 pengjianbo(pengjianbosoft@gmail.com), Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package cn.my.project;

import android.app.Application;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import cn.my.project.business.API;
import okhttp3.Headers;
import okhttp3.Interceptor;

import com.common.basic.Constants;
import com.common.basic.Imagefinal.GlideConfig.GlideUtils;
import com.common.basic.Imagefinal.wrap.ImageLoaderUtils;
import com.common.basic.okhttpfinal.business.OkHttpFinal;
import com.common.basic.okhttpfinal.business.OkHttpFinalConfiguration;
import com.common.basic.okhttpfinal.business.Part;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Desction:
 * Author:pengjianbo
 * Date:15/12/10 下午3:07
 */
public class IApplication extends Application {

    private SSLContext sslContext;

    @Override
    public void onCreate() {
        super.onCreate();
        initOkHttpFinal();
        initImageFactory();
    }

    private void initOkHttpFinal() {

        List<Part> commomParams = new ArrayList<>();
        Headers commonHeaders = new Headers.Builder().build();

        overlockCard();
        List<Interceptor> interceptorList = new ArrayList<>();
        OkHttpFinalConfiguration.Builder builder = new OkHttpFinalConfiguration.Builder()
                .setCommenParams(commomParams)
                .setCommenHeaders(commonHeaders)
                .setTimeout(Constants.REQ_TIMEOUT)
                .setInterceptors(interceptorList)
                .setSSLSocketFactory(sslContext.getSocketFactory())
                //.setCookieJar(CookieJar.NO_COOKIES)
                //.setCertificates(...)
                //.setHostnameVerifier(new SkirtHttpsHostnameVerifier())
                .setDebug(true);
//        addHttps(builder);
        OkHttpFinal.getInstance().init(builder.build());
    }

    private void initImageFactory() {
        ImageLoaderUtils.init(this, GlideUtils.getImageTmpDir(this), API.isDebug);
    }

    /**
     * 忽略所有https证书
     */
    private void overlockCard() {
        final TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            @Override
            public void checkClientTrusted(
                    java.security.cert.X509Certificate[] chain,
                    String authType) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(
                    java.security.cert.X509Certificate[] chain,
                    String authType) throws CertificateException {
            }

            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                X509Certificate[] x509Certificates = new X509Certificate[0];
                return x509Certificates;
            }
        }};
        try {
            sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts,
                    new java.security.SecureRandom());
        } catch (Exception e) {
        }

    }


}
