package com.louis.skin.libraray.utils;

import android.app.Activity;
import android.content.res.TypedArray;

public class NavigationUtils {
    public static void forNavigation(Activity activity) {
        TypedArray a = activity.getTheme().obtainStyledAttributes(0, new int[]{
                android.R.attr.statusBarColor
        });

        int color = a.getColor(0, 0);
        activity.getWindow().setNavigationBarColor(color);
        a.recycle();
    }
}
