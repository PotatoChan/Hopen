package com.goodsbull.pmall.activity;

import com.goodsbull.pmall.R;
import com.goodsbull.pmall.base.BasicAct;
import com.goodsbull.pmall.fragment.HomeFrg;
import com.goodsbull.pmall.fragment.MyFrg;
import com.goodsbull.pmall.fragment.QuotationFrg;
import com.goodsbull.pmall.fragment.TransFrg;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import cn.walink.heaven.utils.LogUtils;
import cn.walink.hopen.tabhost.HMenuTabLayout;
import cn.walink.hopen.tabhost.HMenuTabLayoutListener;
import cn.walink.hopen.tabhost.MenuTab;

public class MainAct extends BasicAct implements HMenuTabLayoutListener {


    @Bind(R.id.layout_menu_tab)
    HMenuTabLayout hMenuTabLayout;

    @Override
    public int getContentResId() {
        return R.layout.act_main;
    }

    @Override
    public int getTitleResId() {
        return R.string.title_activity_main;
    }

    @Override
    public void initView() {

        if (hMenuTabLayout == null) {
            LogUtils.e("fuck you all");
        }

        List menuTabList = new ArrayList<>();
        menuTabList.add(new MenuTab(this, HomeFrg.class, R.string.home, R.mipmap.ic_home_normal, R.mipmap.ic_home_selected));
        menuTabList.add(new MenuTab(this, QuotationFrg.class, R.string.quotation, R.mipmap.ic_quotation_normal, R.mipmap.ic_quotation_selected));
        menuTabList.add(new MenuTab(this, TransFrg.class, R.string.trans, R.mipmap.ic_trans_normal, R.mipmap.ic_trans_selected));
        menuTabList.add(new MenuTab(this, MyFrg.class, R.string.my, R.mipmap.ic_my_normal, R.mipmap.ic_my_selected));


        hMenuTabLayout.init(this, menuTabList);

    }


    @Override
    public void afterClickTab(int index) {

    }

    @Override
    public int getIconColorWhenNormal() {
        return R.color.colorGray;
    }

    @Override
    public int getIconColorWhenSelected() {
        return R.color.colorPrimary;
    }
}
