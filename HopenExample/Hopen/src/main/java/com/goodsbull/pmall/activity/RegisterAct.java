package com.goodsbull.pmall.activity;


import android.content.Context;
import android.content.Intent;
import android.widget.Button;

import com.goodsbull.pmall.R;
import com.goodsbull.pmall.base.BasicAct;

import butterknife.Bind;
import cn.walink.heaven.utils.LogUtils;

/**
 * 注册页
 */
public class RegisterAct extends BasicAct {

    @Bind(R.id.btn)
    Button button;


    @Override
    public int getContentResId() {
        return R.layout.act_register;
    }

    @Override
    public int getTitleResId() {
        return R.string.title_activity_register;
    }

    public static void startAct(Context context) {
        Intent intent = new Intent(context, RegisterAct.class);
        context.startActivity(intent);
    }

    @Override
    public void initView() {

        if (button == null) {
            LogUtils.e("哈哈哈");
        }


    }


}
