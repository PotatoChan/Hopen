package com.goodsbull.pmall.activity;

import android.content.Context;
import android.content.Intent;

import com.goodsbull.pmall.R;
import com.goodsbull.pmall.base.BasicAct;

/**
 * 忘记密码
 */
public class ForgetPasswordAct extends BasicAct {


    @Override
    public int getContentResId() {
        return R.layout.act_forget_password;
    }

    @Override
    public int getTitleResId() {
        return R.string.title_activity_forget_password;
    }

    public static void startAct(Context context) {
        Intent intent = new Intent(context, ForgetPasswordAct.class);
        context.startActivity(intent);
    }

    @Override
    public void initView() {

    }
}
