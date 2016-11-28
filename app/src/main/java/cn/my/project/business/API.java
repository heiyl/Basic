package cn.my.project.business;

public class API {

    public static final Boolean isDebug = Boolean.TRUE;
    public static String baseURI = isDebug ? "http://123.57.17.29:9090/openapi/" : "http://service.66xue.com/openapi/";
    /**
     * 获取首页数据
     */
    public static String getIndexMessages = baseURI + "main/index.shtml";
}
