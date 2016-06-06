package com.goodsbull.pmall.activity;

import android.content.Context;
import android.content.Intent;

import com.goodsbull.pmall.R;
import com.goodsbull.pmall.base.BasicAct;

public class HamalAct extends BasicAct {


    @Override
    public int getContentResId() {
        return R.layout.act_hamal;
    }

    @Override
    public int getTitleResId() {
        return R.string.title_activity_hamal;
    }

    public static void startAct(Context context) {
        Intent intent = new Intent(context, HamalAct.class);
        context.startActivity(intent);
    }

    @Override
    public void initView() {

    }

}
