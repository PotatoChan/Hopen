package com.goodsbull.pmall.base;

import cn.walink.heaven.fragment.BasicFragment;
import cn.walink.hopen.progress.HProgressType;

/**
 * 作用：
 * 创建者：Potato Chan
 * 创建日期：16/6/4
 * 更新历史：
 */
public abstract class BasicFrg extends BasicFragment {
    @Override
    public HProgressType getProgressType() {
        return HProgressType.PointProgress;
    }


}
