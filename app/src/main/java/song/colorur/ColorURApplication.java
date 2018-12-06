package song.colorur;

import android.app.Application;
import android.content.Context;


public class ColorURApplication extends Application {
    private static Context context;


    @Override
    public void onCreate()
    {
        // 初始化全局变量
        super.onCreate();
        ColorURApplication.context = getApplicationContext();

    }

    public static Context getAppContext() {
        return ColorURApplication.context;
    }

}
