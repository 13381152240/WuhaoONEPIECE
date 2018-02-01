package wuhao.bwei.com.wuhaoonepiece.view;

import android.app.Activity;
import android.content.Intent;

import wuhao.bwei.com.wuhaoonepiece.R;

/**
 * Created by alienware on 2018/1/30.
 */

public class ThemeUtil {
    //我當前應用的主題
    private static int theme = 0;

    private static final int DAY_THEME = 0;

    private static final int NIGHT_THEME = 1;

    public static void onActivityCreatedSetTheme(Activity activity){
        switch (theme){
            case DAY_THEME:
                activity.setTheme(R.style.day_theme);
            break;

            case NIGHT_THEME:
                activity.setTheme(R.style.night_theme);
                break;
        }


    }

    //点击按钮改变对应得主题
    public static void ChangeCurrentTheme(Activity activity) {

        //1、改变当前主题的theme变量
        switch (theme) {
            case DAY_THEME:
                theme = NIGHT_THEME;
                break;
            case NIGHT_THEME:
                theme = DAY_THEME;
                break;
        }

        //2、重启这个activity
        activity.finish();
        activity.overridePendingTransition(R.anim.sliding_in, R.anim.sliding_out);
        activity.startActivity(new Intent(activity, activity.getClass()));
    }


}
