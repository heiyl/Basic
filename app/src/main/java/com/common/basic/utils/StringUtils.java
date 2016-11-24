package com.common.basic.utils;

/**
 * basic
 * 2016/7/3.
 * yulong
 */
public class StringUtils {

    public static boolean hasValue(String str) {
        return str != null && !"".equals(str.trim());
    }
}
