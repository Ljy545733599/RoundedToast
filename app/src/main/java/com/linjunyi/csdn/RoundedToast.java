package com.linjunyi.csdn;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 圆角Toast
 *
 * @author ljy545733599@163.com
 */
public class RoundedToast {
    /**
     * 展示toast==LENGTH_SHORT
     *
     * @param msg
     */
    public static void show(Context context, String msg) {
        show(context, msg, Toast.LENGTH_SHORT);
    }

    /**
     * 展示toast==LENGTH_LONG
     *
     * @param msg
     */
    public static void showLong(Context context, String msg) {
        show(context, msg, Toast.LENGTH_LONG);
    }

    private static void show(Context context, String massage, int show_length) {
        if (context == null) {
            return;
        }
        //使用布局加载器，将编写的toast_layout布局加载进来
        View view = LayoutInflater.from(context).inflate(R.layout.toast_rounded, null);
        //获取TextView
        TextView title = view.findViewById(R.id.tv_toast);
        //设置显示的内容
        title.setText(massage);
        Toast toast = new Toast(context);
        //设置Toast要显示的位置，水平居中并在底部，X轴偏移0个单位，Y轴偏移70个单位，
        toast.setGravity(Gravity.CENTER, 0, 0);
        //设置显示时间
        toast.setDuration(show_length);
        toast.setView(view);
        toast.show();
    }
}
