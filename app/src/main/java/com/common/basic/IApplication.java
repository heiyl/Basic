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

package com.common.basic;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttpfinal.OkHttpFinal;
import okhttpfinal.OkHttpFinalConfiguration;
import okhttpfinal.Part;

/**
 * Desction:
 * Author:pengjianbo
 * Date:15/12/10 下午3:07
 */
public class IApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initOkHttpFinal();
    }

    private void initOkHttpFinal() {

        List<Part> commomParams = new ArrayList<>();
        Headers commonHeaders = new Headers.Builder().build();

        List<Interceptor> interceptorList = new ArrayList<>();
        OkHttpFinalConfiguration.Builder builder = new OkHttpFinalConfiguration.Builder()
                .setCommenParams(commomParams)
                .setCommenHeaders(commonHeaders)
                .setTimeout(Constants.REQ_TIMEOUT)
                .setInterceptors(interceptorList)
                        //.setCookieJar(CookieJar.NO_COOKIES)
                        //.setCertificates(...)
                        //.setHostnameVerifier(new SkirtHttpsHostnameVerifier())
                .setDebug(true);
//        addHttps(builder);
        OkHttpFinal.getInstance().init(builder.build());
    }


}
