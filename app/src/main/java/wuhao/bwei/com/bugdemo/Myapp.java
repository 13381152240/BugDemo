package wuhao.bwei.com.bugdemo;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by alienware on 2018/2/1.
 */

public class Myapp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.init("tag")
                //可以控制Log的位置的方法数量，可以为0
                .methodCount(0)
                //设置是否打印log
                .logLevel(LogLevel.FULL)
                //隐藏线程信息
                .hideThreadInfo();


//可以打印异常
        Logger.e(new Exception("我是错误"),"錯誤原因");

        CrashReport.initCrashReport(getApplicationContext(), "870d7d8fc6", false);

    }
}
