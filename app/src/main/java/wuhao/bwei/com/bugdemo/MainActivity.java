package wuhao.bwei.com.bugdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String str = null;
//        str.equals("");
        Logger.d("hello"); Logger.e("hello"); Logger.w("hello"); Logger.v("hello"); Logger.wtf("hello");
        Logger.json(""); // 支持 json Logger.xml(XML_CONTENT); // 支持 xml Logger.log(DEBUG, "tag", "message", throwable);
        Logger.d("hello %s", "world"); // 支持 String 格式化参数
        Logger.i("大家好，我叫%s，今年%d，很高兴大家来看我的文章！！！", "Jerry", 18);
        Logger.d(""); // 支持 List Logger.d(map); // 支持 Map Logger.d(set); // 支持 Set Logger.d(new String[]); // 支持 Array
        Logger.t("mytag").d("hello"); // 改变一次 TAG Logger.e(exception, "message");


    }




}
