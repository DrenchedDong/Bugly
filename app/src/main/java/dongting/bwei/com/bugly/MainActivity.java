package dongting.bwei.com.bugly;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(s.equals("any string"));

        //startService(new Intent(this,MyService.class));

      /*  Logger.clearLogAdapters();
        PrettyFormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)
                .methodCount(0)
                .tag("MyTag")
                .build();
       // Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

        Logger.addLogAdapter(new DiskLogAdapter(formatStrategy));

        Logger.w("my log message with my tag");*/


       /* KLog.file(TAG, Environment.getExternalStorageDirectory(), "test.txt", "aa");

        KLog.d("版本");*/
    }
}
