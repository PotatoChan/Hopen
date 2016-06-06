package com.goodsbull.pmall.activity;

import android.content.Context;
import android.content.Intent;

import com.goodsbull.pmall.R;
import com.goodsbull.pmall.base.BasicAct;

/**
 * 短信登录页面
 */
public class LoginBySMSAct extends BasicAct {

    @Override
    public int getContentResId() {
        return R.layout.act_login_by_sms;
    }

    @Override
    public int getTitleResId() {
        return R.string.title_activity_login_by_sms;
    }

    public static void startAct(Context context) {
        Intent intent = new Intent(context, LoginBySMSAct.class);
        context.startActivity(intent);
    }
    
    @Override
    public void initView() {

    }

}
