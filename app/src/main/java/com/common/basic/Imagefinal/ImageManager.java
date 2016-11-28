
package com.common.basic.Imagefinal;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

import com.common.basic.Imagefinal.wrap.GlideWrapper;
import com.common.basic.Imagefinal.wrap.ImageConfigProduct;
import com.common.basic.Imagefinal.wrap.ImageLoaderUtils;
import com.common.basic.Imagefinal.wrap.ImageLoaderWrapper;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.core.listener.ImageLoadingProgressListener;

public class ImageManager {
    public static final int GLIDE_TYPE = 1;
    public static final int IMAGELOADER_TYPE = 2;
    private static int LOADFRAMEWORKTYPE = GLIDE_TYPE;//默認使用Glidei加載圖片
    private static ImageManager instance = new ImageManager();

    private ImageManager() {
    }

    public static ImageManager getInstance() {
        return instance;
    }

    /**
     * 重新执行图片加载
     */
    public void onResume() {
        GlideWrapper.getDefalt().resume();
        ImageLoaderWrapper.getDefault().resume();
    }

    /**
     * 暂停图片加载
     */
    public void onPause() {
        GlideWrapper.getDefalt().pause();
        ImageLoaderWrapper.getDefault().pause();
    }

    /**
     * 清除缓存图片数据
     */
    public void clear() {
        ImageLoaderUtils.getFramework(GLIDE_TYPE)
                .createImageLoader()
                .cleanImageCache();
        ImageLoaderUtils.getFramework(IMAGELOADER_TYPE)
                .createImageLoader()
                .cleanImageCache();
    }

    /**
     * 加载网络图片
     * @param imageView ：显示图片的视图
     * @param urlStr：图片资源路径url
     * @param defaultImageResourceID:默认加载的图片资源id
     */
    public void displayImage(ImageView imageView, String urlStr, int defaultImageResourceID) {

        if (imageView == null) {
            return;
        }
        if (TextUtils.isEmpty(urlStr)) {
            if (defaultImageResourceID > 0) {
                imageView.setImageResource(defaultImageResourceID);
            }
            return;
        }

        ImageConfigProduct configProduct = ImageLoaderUtils.getFramework(LOADFRAMEWORKTYPE)
                .createImageConfig();
        configProduct.setDefaulRes(defaultImageResourceID);
        configProduct.setLoadingRes(defaultImageResourceID);
        configProduct.setFailRes(defaultImageResourceID);
        configProduct.setFadeIn(0);
        ImageLoaderUtils.getFramework(LOADFRAMEWORKTYPE)
                .createImageLoader()
                .display(
                        urlStr, imageView, configProduct);
    }

    /**
     * 加载网络图片
     * @param imageView：显示图片的视图
     * @param urlStr：图片资源路径url
     * @param defaultImageResourceID:默认加载的图片资源id
     * @param loadframeworktype:加载图片选择的框架类型 1：Glide 2:ImageLoader
     */
    public void displayImage(ImageView imageView, String urlStr, int defaultImageResourceID, int loadframeworktype) {

        if (imageView == null) {
            return;
        }
        if (TextUtils.isEmpty(urlStr)) {
            if (defaultImageResourceID > 0) {
                imageView.setImageResource(defaultImageResourceID);
            }
            return;
        }

        LOADFRAMEWORKTYPE = loadframeworktype;
        ImageConfigProduct configProduct = ImageLoaderUtils.getFramework(LOADFRAMEWORKTYPE)
                .createImageConfig();
        configProduct.setDefaulRes(defaultImageResourceID);
        configProduct.setLoadingRes(defaultImageResourceID);
        configProduct.setFailRes(defaultImageResourceID);
        configProduct.setFadeIn(0);
        ImageLoaderUtils.getFramework(LOADFRAMEWORKTYPE)
                .createImageLoader()
                .display(
                        urlStr, imageView, configProduct);
    }

    /**
     * ImageLoader模式加载图片显示进度
     * @param imageView
     * @param url
     * @param defaultImageResourceID
     * @param listener
     */
    public void displayImage(ImageView imageView, String url, int defaultImageResourceID, final ImageListener listener) {
        if (listener != null && imageView != null) {
            if (TextUtils.isEmpty(url)) {
                if (defaultImageResourceID > 0) {
                    imageView.setImageResource(defaultImageResourceID);
                }
                return;
            }
            DisplayImageOptions options = new DisplayImageOptions.Builder().showImageOnLoading(defaultImageResourceID)
                    .showImageForEmptyUri(defaultImageResourceID).showImageOnFail(0).cacheInMemory(true)
                    .cacheOnDisk(true).considerExifParams(true).build();
            ImageLoader.getInstance().displayImage(url, imageView, options, new ImageLoadingListener() {

                @Override
                public void onLoadingStarted(String imageUri, View view) {
                    listener.onLoadingStarted(imageUri, view);
                }

                @Override
                public void onLoadingFailed(String imageUri, View view, FailReason failReason) {
                    listener.onLoadingFailed(imageUri, view, failReason);

                }

                @Override
                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                    listener.onLoadingComplete(imageUri, view, loadedImage);

                }

                @Override
                public void onLoadingCancelled(String imageUri, View view) {
                    listener.onLoadingCancelled(imageUri, view);

                }
            }, new ImageLoadingProgressListener() {

                @Override
                public void onProgressUpdate(String imageUri, View view,
                                             int current, int total) {
                    listener.onProgressUpdate(imageUri, view, current, total);

                }
            });
        }
    }

    public interface ImageListener {
        void onLoadingStarted(String imageUri, View view);

        void onLoadingCancelled(String imageUri, View view);

        void onLoadingFailed(String imageUri, View view, FailReason failReason);

        void onLoadingComplete(String imageUri, View view, Bitmap loadedImage);

        void onProgressUpdate(String imageUri, View view, int current, int total);
    }

}