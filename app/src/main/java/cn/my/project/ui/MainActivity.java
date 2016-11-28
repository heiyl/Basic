package cn.my.project.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.common.basic.R;
import com.common.basic.net.ResponseListener;
import com.common.basic.okhttpfinal.business.RequestParams;
import com.common.basic.tools.ILogger;
import com.common.basic.tools.JsonFormatUtils;
import com.common.basic.tools.app.ImageCompressUtils;
import com.common.basic.tools.logger.Logger;

import java.io.File;

import cn.my.project.models.ResultDto;
import cn.my.project.business.API;
import cn.my.project.business.Task;
import cn.my.project.models.IndexMessagesDto;
import cn.my.project.service.IndexModelCenter;
import okhttp3.MediaType;

public class MainActivity extends Activity implements ResponseListener<ResultDto>,View.OnClickListener{

    RequestParams requestParams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_post = (TextView)this.findViewById(R.id.tv_post);
        tv_post.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

//        authToken=c1974ae97e8d4f65b0be8cb57faa9c9b&channeltype=5
//        http://123.57.17.29:9090/openapi/main/index.shtml?pageSize=20&pageNo=1
        request();

    }

    /**
     * 请求获取热门话题列表
     */
    private void request() {
        try {
            /*IndexModelCenter modelCenter = new IndexModelCenter();
            requestParams = new RequestParams();
            requestParams.addHeader("authToken","c1974ae97e8d4f65b0be8cb57faa9c9b");
            requestParams.addHeader("channeltype","2");
            requestParams.addFormDataPart("pageSize", "10");
            requestParams.addFormDataPart("pageNo", "1");
            modelCenter.getRequest(API.getIndexMessages, requestParams, Task.FLAG_GET_INDEXMESSAGES, this);*/

            IndexModelCenter modelCenter = new IndexModelCenter();
            requestParams = new RequestParams();
            requestParams.addHeader("authToken","e2eff599e85245a895444f996849a912");
            requestParams.addHeader("channeltype","2");
            requestParams.addFormDataPart("userId", "85430607ce9840eba934e35f75565f38");
            requestParams.addFormDataPart("content", "圖片");
            for (int i = 0; i < 2; i++) {
                //使用ImageCompressUtils压缩图片
                String path = "";
                if(i == 0) {
                    path = "/storage/emulated/0/66xue/66xue_Portrait/66xue_crop_20161101151824.jpg";
                }else if(i == 1) {
                    path = "/storage/emulated/0/DCIM/Camera/1473243914621.jpg";
                }
                File f = ImageCompressUtils.compressImageFile(path);
                requestParams.addFormDataPart(new String("files"), f);
            }
            modelCenter.postRequest("https://api.66xue.com/openapi/blog/create.shtml", requestParams, 2, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        /*try {
            IndexModelCenter modelCenter = new IndexModelCenter();
            requestParams = new RequestParams();
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("authToken","c1974ae97e8d4f65b0be8cb57faa9c9b");
            jsonObject.put("channeltype","2");
            jsonObject.put("pageSize", "10");
            jsonObject.put("pageNo", "1");
            requestParams.setRequestBody(MediaType.parse("application/json;charset=utf-8"),jsonObject.toString());
            modelCenter.getRequest(API.getIndexMessages, requestParams, Task.FLAG_GET_INDEXMESSAGES, this);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public void onResponseSuccess(int taskId, ResultDto dto, String content) {
        Log.i("heiyulong", JsonFormatUtils.formatJson(content));
        try {
            switch (taskId) {
                case Task.FLAG_GET_INDEXMESSAGES:
                    IndexMessagesDto resultDto = (IndexMessagesDto) dto;
                    break;
                case 2:
                    Toast.makeText(MainActivity.this,content,Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
        }
    }

    @Override
    public void onResponseFailure(int taskId, String content) {
        Log.i("heiyulong", JsonFormatUtils.formatJson(content));

    }

    @Override
    public void onResponseLoading(int taskId, int progress, long networkSpeed, boolean done) {

    }

    @Override
    public void onResponseStart(int taskId) {

    }
}
