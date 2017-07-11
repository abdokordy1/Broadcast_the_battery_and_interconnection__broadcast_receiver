package com.example.android.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

/**
 * Created by Abdallah on 5/21/2017.
 */

public class  MyReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent batteryStatus) {


      //  int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
     //   int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
        int status = batteryStatus.getIntExtra(BatteryManager.EXTRA_STATUS, -1);

        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
        float batteryPct = (level*100)/scale;
     //   Toast.makeText(context, String.valueOf( batteryPct), Toast.LENGTH_LONG).show();


        MainActivity.getInstance().updateTheTextView(String.valueOf( batteryPct));

    }
}
