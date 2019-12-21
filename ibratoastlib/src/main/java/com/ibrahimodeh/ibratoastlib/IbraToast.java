package com.ibrahimodeh.ibratoastlib;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class IbraToast extends Toast {

    public static int SUCCESS = 1;
    public static int ERROR = 2;
    public static int INFO = 3;
    public static int DARK = 4;

    public IbraToast(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, String message, int duration, int type) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);

        View layout = LayoutInflater.from(context).inflate(R.layout.ibratoast_layout, null, false);
        TextView textToast = (TextView) layout.findViewById(R.id.text_toast);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.custom_toast_layout_id);
        ImageView img = (ImageView) layout.findViewById(R.id.toast_icon);
        textToast.setText(message);

        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success_shape);
                img.setImageResource(R.drawable.ic_success);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.error_shape);
                img.setImageResource(R.drawable.ic_error);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.info_shape);
                img.setImageResource(R.drawable.ic_info);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.dark_shape);
                img.setVisibility(View.GONE);
                break;
        }

        toast.setView(layout);
        return toast;
    }
}
