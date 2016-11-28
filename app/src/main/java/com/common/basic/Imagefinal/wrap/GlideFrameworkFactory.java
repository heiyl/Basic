package com.common.basic.Imagefinal.wrap;

public class GlideFrameworkFactory implements ImageFrameworkFactory {

    @Override
    public ImageLoaderProduct createImageLoader() {
        return new GlideLoaderProduct();
    }

    @Override
    public ImageConfigProduct createImageConfig() {
        return new GlideConfigProduct();
    }
}
