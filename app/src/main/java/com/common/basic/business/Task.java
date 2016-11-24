package com.common.basic.business;

public class Task {

    public static final int FLAG_DATALIST = 0;
    /**
     * 获取首页广告信息列表
     */
    public static final int FLAG_GETINDEXCHANNEL = 1;
    /**
     * 搜索学校列表
     */
    public static final int FLAG_GETSCHOOLINFOLISTFORAPP = 2;
    /**
     * 根据ID获取学校信息
     */
    public static final int FLAG_GETSCHOOLINFOCONTRASTFORAPP = 3;
    /**
     * 获取院校详情信息
     */
    public static final int FLAG_GETSCHOOLDETAILINFO = 4;
    /**
     * 获取选校结果集统计值
     */
    public static final int FLAG_GETSELECTSCHOOLCOUNT = 5;
    /**
     * 获取专题活动类别
     */
    public static final int FLAG_GETSPECIALEVENTSCATEGORY = 6;
    /**
     * 根据专题活动类别获取内容
     */
    public static final int FLAG_GETSPECIALEVENTSLIST = 7;
    /**
     * 获取专题、活动详情
     */
    public static final int FLAG_GETSPECIALEVENTDETAIL = 8;
    /**
     * 登录
     */
    public static final int FLAG_GETLOGININFO = 9;
    /**
     * 获取短信验证码
     */
    public static final int FLAG_GETSMSMESSAGE = 10;
    /**
     * 注册
     */
    public static final int FLAG_GETREGISTINFO = 11;
    /**
     * 找回密码
     */
    public static final int FLAG_GETREUSERPWDINFO = 12;
    /**
     * 修改用户信息
     */
    public static final int FLAG_GETREMODIFYUSERINFO = 13;
    /**
     * 修改密码
     */
    public static final int FLAG_GETMODIFYPWDINFO = 14;
    /**
     * 意见反馈
     */
    public static final int FLAG_GETFEEDBACKINFO = 15;
    /**
     * 退出登录
     */
    public static final int FLAG_GETLOGOUTINFO = 16;
    /**
     * 我的收藏
     */
    public static final int FLAG_GETMYFAVORITEINFO = 17;
    /**
     * 获取院校详情其它信息
     */
    public static final int FLAG_GETSCHOOLDETAILOTHERINFO = 18;
    /**
     * 添加收藏
     */
    public static final int FLAG_GETCOLLECT = 19;
    /**
     * 取消收藏
     */
    public static final int FLAG_GETUNCOLLECT = 20;
    /**
     * 获取热门话题
     */
    public static final int FLAG_GETHOTTOPICLIST = 21;
    /**
     * 批量关注话题
     */
    public static final int FLAG_GETFOCUSTOPICS = 22;
    /**
     * 获取留学圈推荐动态列表
     */
    public static final int FLAG_GETBLOGLISTBYRECOMMEND = 23;
    /**
     * 获取留学圈好友动态列表
     */
    public static final int FLAG_GETBLOGLISTBYFRIENDS = 24;
    /**
     * 获取话题动态列表：根据话题ID获取含有该话题的动态
     */
    public static final int FLAG_GETBLOGLISTBYTOPIC = 25;
    /**
     * 获取个人资料
     */
    public static final int FLAG_GETPERSONINFO = 26;
    /**
     * 获取动态详情
     */
    public static final int FLAG_GETBLOGDETAILBYID = 27;
    /**
     * 获取个人动态列表
     */
    public static final int FLAG_GETBLOGBYUSER = 28;
    /**
     * 对动态点赞
     */
    public static final int FLAG_GETPRAISESINFO = 29;
    /**
     * 对动态取消点赞
     */
    public static final int FLAG_GETUNPRAISESINFO = 30;
    /**
     * 发圈
     */
    public static final int FLAG_GETSENDBLOGINFO = 31;
    /**
     * 我的好友
     */
    public static final int FLAG_GETFRIENDS = 32;
    /**
     * 评论
     */
    public static final int FLAG_GETSENDCOMMENTINFO = 33;
    /**
     * 检测验证码是否正确
     */
    public static final int FLAG_CHECKREGISTERCODE = 34;
    /**
     * 删除动态
     */
    public static final int FLAG_GETDELBLOGINFO = 35;
    /**
     * 小红点个数
     */
    public static final int FLAG_MESSAGECOUNT = 36;
    /**
     * 第三方登录
     */
    public static final int FLAG_THIRD_LOGIN = 37;
    /**
     * 同意加好友
     */
    public static final int FLAG_ACCEPT_FRIEND = 38;

    /** 群列表 */
    public static final int FLAG_GROUPS_URL = 39;
    /** 创建群 */
    public static final int FLAG_CREATE_GROUP_URL = 40;
    /** 加入群 */
    public static final int FLAG_JOIN_GROUP_URL = 41;
    /** 删除群组中的成员 */
    public static final int FLAG_DELETE_USER_IN_GROUP_URL = 42;
    /** 解散群组 */
    public static final int FLAG_DELETE_GROUP_URL = 43;
    /** 获取群组成员 */
    public static final int FLAG_GROUP_MENBERS_URL = 44;
    /** 获取群详情 */
    public static final int FLAG_GROUP_DETAIL_URL = 45;
    /** 获取群简单详情，主要是群图片 */
    public static final int FLAG_GROUP_PHOTO_URL = 46;
    /** 修改群信息 */
    public static final int FLAG_GROUP_MODIFYDETAIL_URL = 47;
    /** 上传群头像 */
    public static final int FLAG_UPLOAD_GROUP_IMG_URL = 48;
    /** 退出群组 */
    public static final int FLAG_EXIT_GROUP_URL = 49;
    /** 推送 */
    public static final int FLAG_REGIST_PUSH_TPID_URL = 50;
    /** 待处理消息 */
    public static final int FLAG_PENDING_URL = 51;
    /**
     * 解除好友关系
     */
    public static final int FLAG_DELETEFRIENDS = 52;

    /**
     * 删除单个待处理事项
     */
    public static final int FLAG_DELETE_ONE_PENDING = 53;
    /**
     * 删除单个待处理事项
     */
    public static final int FLAG_DELETE_ALL_PENDING = 54;

    //2.0TAG
    /**
     * 获取首页列表数据
     */
    public static final int FLAG_GET_INDEXMESSAGES = 55;
    /**
     * 获取专业列表数据
     */
    public static final int FLAG_GET_MAJORMESSAGES = 56;
    /**
     * 获取小专业列表数据
     */
    public static final int FLAG_GET_MAJORDETAILMESSAGES = 57;
    /**
     * 搜索专业
     */
    public static final int FLAG_SEARCH_MAJORs = 58;
    /**
     * 获取工具
     */
    public static final int FLAG_GETTOOLCHANNELS = 59;

    /**
     * 添加标签
     */
    public static final int FLAG_CREATETAG = 60;
    /**
     * 删除标签
     */
    public static final int FLAG_DELTAG = 61;
    /**
     * 获取标签
     */
    public static final int FLAG_GETTAGS = 62;
    /**
     * 获取标签选择中的国家
     */
    public static final int FLAG_GET_TAGS_COUNTRY = 63;
    /**
     * 获取推荐信息
     */
    public static final int FLAG_GET_TAGS_RECOMMENDINFO = 64;
    /**
     * 获取收藏的专业
     */
    public static final int FLAG_GET_FAVPROTE_MAJOR = 65;
    /**
     * 获取我的群组
     */
    public static final int FLAG_GET_GROUP_BY_RELATION = 66;
    /**
     * 获取话题动态列表：根据话题ID获取含有该话题的动态的（最新评论排序）
     */
    public static final int FLAG_GETBLOGLISTBYTOPIC_NEW_REPLY = 67;
    /**
     * 获取话题动态列表：根据话题ID获取含有该话题的动态的（最热评论排序）
     */
    public static final int FLAG_GETBLOGLISTBYTOPIC_HOT_REPLY = 68;
    /**
     * 更新用户手机号
     */
    public static final int FLAG_MODIFY_USER_PHONE = 70;
    /**
     * 获取签到积分
     */
    public static final int FLAG_GETPOINTS = 71;
    /**
     * 用户签到
     */
    public static final int FLAG_USERSIGN = 72;
    /**
     * 用户积分历史
     */
    public static final int FLAG_GETPOINTSLOG = 73;
    /**
     * 订阅初始化
     */
    public static final int FLAG_GETINITSUBSCRIBE = 74;
    /**
     * 订阅初始化
     */
    public static final int FLAG_GETTOPDAY = 75;
    /**
     * 获取群成员
     */
    public static final int FLAG_GETGROUPUSERS = 76;
    /**
     * 群成员搜索
     */
    public static final int FLAG_SEARCHGROUPMESBERS = 77;
    /** 解散群组 */
    public static final int FLAG_MYGROUP_DELETE_GROUP_URL = 78;
}
