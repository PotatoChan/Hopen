package com.goodsbull.pmall.base;

import android.view.View;

import com.goodsbull.pmall.R;

import cn.walink.heaven.activity.BasicActivity;
import cn.walink.heaven.activity.ToolbarType;
import cn.walink.hopen.progress.HProgressType;

/**
 * 作用：
 * 创建者：Potato Chan
 * 创建日期：16/6/4
 * 更新历史：
 */
public abstract class BasicAct extends BasicActivity {

    public void back(View view) {
        finish();
    }

    @Override
    public HProgressType getProgressType() {
        return HProgressType.PointProgress;
    }



    @Override
    public ToolbarType getToolbarType() {
        return ToolbarType.Default;
    }


    @Override
    public int getTitleTextViewResId() {
        return R.id.title;
    }


    @Override
    public int getToolBarId() {
        return R.id.toolbar;
    }

}
