package cn.walink.hopen.progress;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;

import cn.walink.hopen.R;

/**
 * 作用：
 * 创建者：陈佳润
 * 创建日期：16/6/1
 * 更新历史：
 */
public class HProgress extends Dialog {

    private Context context;

    public HProgress(Context context) {
        super(context);
        this.context = context;
    }

    public HProgress(Context context, int themeResId) {
        super(context, themeResId);
        this.context = context;
    }

    /**
     * 获取一个 TYProgressDialog 对象
     *
     * @return
     */
    public static HProgress createDialog(Context context, HProgressType type) {


        switch (type) {

            case PointProgress:

                return createPointProgress(context);

            case PointCircleProgress:

                return createPointCircleProgress(context);
        }

        return null;
    }

    /**
     * 点式加载
     *
     * @param context
     * @return
     */
    public static HProgress createPointProgress(Context context) {

        HProgress dialog = new HProgress(context, R.style.hprogress_1);
        dialog.setContentView(R.layout.hprogress_1);
        dialog.getWindow().getAttributes().gravity = Gravity.CENTER;

        return dialog;
    }

    public static HProgress createPointCircleProgress(Context context) {

        HProgress dialog = new HProgress(context, R.style.hprogress_2);
        dialog.setContentView(R.layout.hprogress_2);
        dialog.getWindow().getAttributes().gravity = Gravity.CENTER;

        return dialog;
    }


}
