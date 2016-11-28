package cn.my.project.models;


import java.util.ArrayList;
import java.util.List;

/**
 * 首页数据信息
 * llxue2.0
 * 2016/1/21.
 * yulong
 */
public class IndexMessagesDto extends ResultDto {
    public IndexMessageRespObject respObject;

    public class IndexMessageRespObject {
        public List<IndexMessageItemDto> index = new ArrayList<IndexMessageItemDto>();
    }

}

