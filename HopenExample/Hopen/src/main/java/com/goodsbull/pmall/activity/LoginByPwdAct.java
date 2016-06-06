package com.goodsbull.pmall.activity;

import android.content.Context;
import android.content.Intent;

import com.goodsbull.pmall.R;
import com.goodsbull.pmall.base.BasicAct;

/**
 * 密码登录页
 */
public class LoginByPwdAct extends BasicAct {


    @Override
    public int getContentResId() {
        return R.layout.act_login_by_pwd;
    }

    @Override
    public int getTitleResId() {
        return R.string.title_activity_login_by_pwd;
    }

    public static void startAct(Context context) {
        Intent intent = new Intent(context, LoginByPwdAct.class);
        context.startActivity(intent);
    }

    @Override
    public void initView() {

    }

}
