package com.atguigu.a321video02.pager;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.atguigu.a321video02.fragment.BaseFragment;

/**
 * Created by Administrator on 2017/5/20.
 */

public class NetVideoPager extends BaseFragment {

    private TextView textView;


    @Override
    public View initView() {

        textView = new TextView(context);
        textView.setTextSize(30);
        textView.setTextColor(Color.RED);
        textView.setGravity(Gravity.CENTER);
        return textView;
    }

    public void initData(){
        super.initData();
        textView.setText("我是网络视频");
    }
}
