package com.common.basic.business;

public class API {

    public static final Boolean isDebug = Boolean.TRUE;

    // 线上测试环境（测试人员使用）
//    public static String baseURI = "http://123.57.17.29:9090/openapi/";
    // 线上正式环境（上线专用）
//    public static String baseURI = "http://service.66xue.com/openapi/";
    //本地环境（南哥使用）
//      public static String baseURI = "http://10.200.16.43:8080/openapi/";
    //黄磊本地环境
    //  public static String baseURI = "http://10.200.16.64:8080/openapi/";

    //正式环境URL(区别于上面的URI)
//    public static String baseURL = "http://www.66xue.com/";
    //测试环境URL
//    public static String baseURL = "http://123.57.17.29/";

//    public static String baseURI = isDebug ? "http://10.200.16.92:8080/openapi/" : "http://service.66xue.com/openapi/";//南哥本地环境
//    public static String baseURI = isDebug ? "http://10.200.16.64:8080/openapi/" : "http://service.66xue.com/openapi/";//黄磊本地环境
    public static String baseURI = isDebug ? "http://123.57.17.29:9090/openapi/" : "http://service.66xue.com/openapi/";

    public static String baseURL  = isDebug ? "http://123.57.17.29/" : "http://www.66xue.com/";

    public static String postPhoto = baseURI + "user/modifyUserPhoto.shtml";
    /**
     * 获取自动更新的信息
     */
    //    public static String getUpdateInfo = "https://fir.im/api/v2/app/version/55750a1d719925a322000057?token=79bdc410e36111e48c1ef3717c02f6cb4f67a2d0";
    //    public static String getUpdateInfo = baseURI + "main/appupdate.shtml?appChannelType=" + String.valueOf(Constant.CHANNEL_TYPE);
    public static String getUpdateInfo = baseURI + "main/appupdate.shtml?appChannelType=%s";
    /**
     * 获取首页广告信息列表
     */
    public static String getIndexChannel = baseURI + "main/getIndexChannel.shtml";
    /**
     * 搜索学校列表接口：
     * http://123.57.17.29:8080/ServiceFactory/school/getSchoolInfoListForApp.shtml?schoolCountry =美国&pageSize
     * =20&pageNo=1&schoolName =快乐&orderkey=0&orderType=0
     */
    public static String getSchoolInfoListForApp = baseURI + "school/getSchoolInfoListForAppV1.shtml";

    /**
     * 根据ID获取学校信息
     */
    public static String getSchoolInfoContrastForApp = baseURI + "school/getSchoolInfoContrastForAppV1.shtml";

    /**
     * 获取院校详情信息
     */
    //    public static String getSchoolDetailInfo = baseURI + "school/getSchoolInfo.shtml";
    public static String getSchoolDetailInfo = baseURI + "school/getSchoolInfoV1.shtml";
    /**
     * 选校结果集统计值接口
     */
    public static String getselectSchoolCount = baseURI + "school/selectSchoolCountV1.shtml";

    /**
     * 获取专题活动类别
     */
    public static String getSpecialEventsCategory = baseURI + "main/initChannel.shtml";
    /**
     * 根据专题活动类别获取内容
     */
    public static String getSpecialEventsList = baseURI + "main/getChannelList.shtml";
    /**
     * 获取专题、活动详情
     */
    public static String getSpecialEventDetail = baseURI + "main/getContent.shtml";
    /**
     * 登录
     */
    public static String getLoginInfo = baseURI + "login.shtml";
    /**
     * 获取短信验证码:传递type字段的值--->注册新帐号：1；找回登录密码：2；重置登录密码：3
     */
    public static String getSmsMessage = baseURI + "main/sendMessage.shtml";
    /**
     * 注册
     */
    public static String getRegistInfo = baseURI + "user/regist.shtml";
    /**
     * 找回密码
     */
    public static String getreUserPwdInfo = baseURI + "user/reUserPwd.shtml";
    /**
     * 修改用户信息
     */
    public static String getreModifyUserInfo = baseURI + "user/modify.shtml";
    /**
     * 修改密码
     */
    public static String getModifyPwdInfo = baseURI + "user/modifyPwd.shtml";
    /**
     * 意见反馈
     */
    public static String getFeedBackInfo = baseURI + "user/feedback.shtml";
    /**
     * 退出登录
     */
    public static String getLogOutInfo = baseURI + "logout.shtml";
    /**
     * 我的收藏
     */
    public static String getMyFavoriteInfo = baseURI + "main/getSchoolListByUser.shtml";
    /**
     * 添加收藏
     */
    public static String getCollect = baseURI + "main/collect.shtml";
    /**
     * 取消收藏
     */
    public static String getunCollect = baseURI + "main/delCollect.shtml";
    /**
     * 获取热门话题
     */
    public static String getHotTopicList = baseURI + "topic/getList.shtml";
    /**
     * 批量关注话题
     */
    public static String getFocusTopics = baseURI + "main/collects.shtml";
    /**
     * 获取留学圈推荐动态列表
     */
    public static String getBlogListByRecommend = baseURI + "blog/getBlogList.shtml";
    /**
     * 获取留学圈好友动态列表
     */
    public static String getBlogListByFriends = baseURI + "blog/getBlogListByFriends.shtml";
    /**
     * 获取话题动态列表:根据话题ID获取含有该话题的动态
     */
    public static String getBlogListByTopic = baseURI + "blog/getTopicBlog.shtml";
    /**
     * 获取个人资料
     */
    public static String getPersonInfo = baseURI + "user/getUser.shtml";
    /**
     * 获取动态详情
     */
    public static String getBlogDetailByID = baseURI + "blog/get.shtml";
    /**
     * 获取个人动态列表
     */
    public static String getBlogByUser = baseURI + "user/getBlogByUser.shtml";
    /**
     * 对动态点赞
     */
    public static String getPraisesInfo = baseURI + "comment/create.shtml";
    /**
     * 对动态取消点赞
     */
    public static String getUnPraisesInfo = baseURI + "comment/del.shtml";
    /**
     * 发圈
     */
    public static String getSendBlogInfo = baseURI + "blog/create.shtml";
    /**
     * 我的好友
     */
    public static String getFriends = baseURI + "user/getFriends.shtml";
    /**
     * 评论
     */
    public static String getSendCommentInfo = baseURI + "comment/create.shtml";
    /**
     * 我关注的话题
     */
    public static String getUserCollectTopic = baseURI + "user/getUserCollectTopic.shtml";
    /**
     * 检测验证码是否正确
     */
    public static String checkRegisterCode = baseURI + "main/valCode.shtml";
    /**
     * 删除动态
     */
    public static String getDelBlogInfo = baseURI + "blog/del.shtml";
    /**
     * 小红点个数
     */
    public static String getRedPointCount = baseURI + "main/viewCount.shtml";

    /**
     * 第三方登录
     */
    public static String getThirdLoginUrl = baseURI + "tpLogin.shtml";

    /**
     * 同意加好友
     */
    public static String AcceptFriend = baseURI + "user/applyUpdate.shtml";
    /**
     * 群列表
     */
    public static String groups_url = baseURI + "group/getGroupByRelation.shtml";
    /**
     * 创建群
     */
    public static String create_group_url = baseURI + "group/create.shtml";
    /**
     * 加入群
     */
    public static String join_group_url = baseURI + "group/addUser.shtml";
    /**
     * 删除群组中的成员
     */
    public static String delete_user_in_group_url = baseURI + "group/delUser.shtml";
    /**
     * 解除群组
     */
    public static String delete_group_url = baseURI + "group/del.shtml";
    /**
     * 获取群组成员
     */
    public static String group_menbers_url = baseURI + "group/getGroupUsers.shtml";
    /**
     * 获取群详情
     */
    public static String group_detail_url = baseURI + "group/get.shtml";
    /**
     * 获取群简单详情，主要是群图片
     */
    public static String group_photo_url = baseURI + "group/getGroupPhoto.shtml";
    /**
     * 修改群信息
     */
    public static String group_modifyDetail_url = baseURI + "group/modify.shtml";
    /**
     * 上传群头像
     */
    public static String upload_group_img_url = baseURI + "group/modifyPhoto.shtml";

    /**
     * 上传推送id
     */
    public static String regist_push_clientId_url = baseURI + "main/pushbase.shtml";
    /**
     * 获取用户待处理事项
     */
    public static String pendings_url = baseURI + "main/pendings.shtml";

    /**
     * 获取校园印象动态列表
     */
    public static String getSchoolBlog = baseURI + "blog/getSchoolBlog.shtml";
    /**
     * 删除好友关系
     */
    public static String deleteFriend = baseURI + "user/delRelation.shtml";

    /**
     * 删除单个待处理事项
     */
    public static String delete_one_pending = baseURI + "main/affirmPending.shtml";
    /**
     * 删除单个待处理事项
     */
    public static String delete_all_pending = baseURI + "main/clearPending.shtml";

    //2.0API
    /**
     * 获取首页数据
     */
    public static String getIndexMessages = baseURI + "main/index.shtml";
    /**
     * 获取大专业列表
     */
    public static String getMajorMessages = baseURI + "major/gets.shtml";
    /**
     * 获取大专业详情
     */
    public static String getMajorDetailMessages = baseURI + "major/get.shtml";
    /**
     * 查专业 参数传递someone="小专业名称"
     */
    public static String searchMajors = baseURI + "major/someOne.shtml";
    /**
     * 查询用户接口 参数传递someone="用户昵称"
     */
    public static String searchUsers = baseURI + "user/someone.shtml";

    /**
     * 获取院校接口
     */
    public static String getSchoolChannel = baseURI + "channel/getSchoolChannel.shtml";
    /**
     * 获取工具接口
     */
    public static String getToolChannels = baseURI + "channel/toolChannels.shtml";

    /**
     * 添加标签
     */
    public static String createTag = baseURI + "tag/create.shtml";//（relationId<关系id>，tag<标签>，userId<当前用户id>） （tag添加）
    /**
     * 删除标签
     */
    public static String delTag = baseURI + "tag/del.shtml";//（relationId<关系id>，tag<标签>，userId<当前用户id>） （tag删除）
    /**
     * 获取标签
     */
    public static String getTags = baseURI + "tag/gets.shtml";//（relationId<关系id>） （获取tags用拿到的id 查询  获取国家-地区   地区-学校）
    /**
     * 获取选择阶段获取国家地区
     */
    public static String getTagsCountry = baseURI + "tag/init.shtml";//tag根据选择阶段获取国家地区

    /**
     * 获取收藏的专栏列表  （userId<用户id>，collectType<1：学校；4：话题；5：专业>，pageSize<一页几行>，pageNo<第几页>）
     */
    public static String getMajors = baseURI + "collect/gets.shtml";
    /**
     * 获取推荐信息
     */
    public static String getTagsRecommendInfo = baseURI + "tag/choose.shtml";//（userId<用户id>，type<需求推荐类型1：群组；2：用户>） （获取推荐信息）
    /**
     * 获取热门群组
     */
    public static String getHotGroup = baseURI + "group/getHots.shtml";//获取热门群组
    /**
     * 获取群组搜索结果
     */
    public static String getSearchGroupResult = baseURI + "group/someOne.shtml";//获取搜索群组结果列表
    /**
     * 获取用户搜索结果
     */
    public static String getSearchUsersResult = baseURI + "user/getUserByCondition.shtml";//获取搜索用户组结果列表
    /**
     * 获取我的群组
     */
    public static String getGroupByRelation = baseURI + "group/getGroupByRelation.shtml";//获取我的群组列表

    /**
     * 更新手机号
     */
    public static String modifyUserPhone = baseURI + "user/modifyPhoneNo.shtml";
    /**
     * 获取签到积分
     */
    public static String getPoints = baseURI + "user/getPoints.shtml";
    /**
     * 用户签到
     */
    public static String userSign = baseURI + "user/sign.shtml";
    /**
     * 用户积分历史
     */
    public static String getPointsLog = baseURI + "user/getPointsLog.shtml";
    /**
     * 订阅初始化接口
     */
    public static String getInitSubscribe = baseURI + "tag/initSubscribe.shtml";
    /**
     * 每日推荐
     */
    public static String gettopDay = baseURI + "main/topDay.shtml";

    /**
     * 获取群成员
     */
    public static String getGroupUsers = baseURI + "group/getGroupUsers.shtml";
    /**
     * 群成员搜索
     */
    public static String searchGroupMesbers = baseURI + "group/someUser.shtml";
}
