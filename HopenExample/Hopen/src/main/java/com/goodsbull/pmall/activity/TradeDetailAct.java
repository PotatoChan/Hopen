package com.goodsbull.pmall.activity;

import android.content.Context;
import android.content.Intent;

import com.goodsbull.pmall.R;
import com.goodsbull.pmall.base.BasicAct;

public class TradeDetailAct extends BasicAct {

    @Override
    public int getContentResId() {
        return R.layout.act_trade_detail;
    }

    @Override
    public int getTitleResId() {
        return R.string.title_activity_trade_detail;
    }

    public static void startAct(Context context) {
        Intent intent = new Intent(context, TradeDetailAct.class);
        context.startActivity(intent);
    }

    @Override
    public void initView() {



    }

}
