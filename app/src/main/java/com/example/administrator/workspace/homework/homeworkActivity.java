package com.example.administrator.workspace.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.workspace.homework.FatherBarActivity;
import com.example.administrator.workspace.R;

/**
 * Created by pdg on 2016/5/29.
 */
public class homeworkActivity extends FatherBarActivity {

    ListView lv;
    String[]s={"作业1：hello world！","作业2：放一个图片","作业3：获取手机分辨率","作业4：点击图片循环","作业5：画出心形","作业6：布局1","作业6：布局2","短信验证测试框","回到桌面查看联系人发送短信","选择省份城市","frame动画","飞机","画板","下载任务","百度tts","共享stuDB","radio练习"
            ,"局部显示图片","图片上传","完成自动搜索","仿照淘宝做listview","做一个搜索框","toast3个选项卡","国际化设置","异步任务的下载显示进度条","横竖屏" };
     Class []bb={hm01_helloworldActivity.class,hm02_image_Activity.class,phone_fenbianlv.class,home_picture.class,heartActivity.class,hm06_01_Activity.class ,hm06_02_Activity.class,Hm12Activity.class,Telphone_Activity.class,hm25_city_Activity.class,hm35_animationActivity.class,planeActivity.class,hm_board_1_Activity.class
,hm_loadfile_Activity.class,hm_baiduspeakerActivity.class,hm_Provider_Activity.class};
    @Override
    public void child(Bundle savedInstanceState) {
        setContentView(R.layout.homework_layout);
        lv= (ListView) findViewById(R.id.home_list);
        final ArrayAdapter aa=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,s);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent ii=new Intent(homeworkActivity.this,bb[i]);
                 startActivity(ii);


            }
        });
    }
}
