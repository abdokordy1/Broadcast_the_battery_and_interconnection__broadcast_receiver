package com.example.android.broadcasts;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private    IntentFilter ifilter =new IntentFilter();
   MyReceiver as =new MyReceiver();
    private static MainActivity ins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ins = this;


        ifilter.addAction(Intent.ACTION_BATTERY_CHANGED);
       // Intent asd=
                registerReceiver(as,ifilter);


    }
    public static MainActivity  getInstance(){
        return ins;
    }
    public void updateTheTextView(final String t) {
        MainActivity.this.runOnUiThread(new Runnable() {
            public void run() {
                TextView textV1 = (TextView) findViewById(R.id.txt);
                textV1.setText(t);
            }
        });
    }


    public void broadcastIntent(View view){
     //   Intent intent = new Intent();
      //  intent.setAction("com.tutorialspint.USTOM_INTENT");
       // sendBroadcast(intent);
      //  IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
      //  ifilter.addAction(Intent.ACTION_BATTERY_CHANGED);
    //    Intent batteryStatus = this.registerReceiver(m, ifilter);
       // sendBroadcast(batteryStatus);
    }
}
