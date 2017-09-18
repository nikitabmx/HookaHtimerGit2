package com.example.nekitenzogmailcom.hookahtimer;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcelable;
import android.widget.Chronometer;
import android.support.annotation.Nullable;
import android.widget.Toast;


import static com.example.nekitenzogmailcom.hookahtimer.R.id.chronometer1;

/**
 * Created by nekitenzo@gmail.com on 09.08.2017.
 */

public class HookahService extends Service
{

    @Override
    public void onCreate() {
        super.onCreate();
        //Toast.makeText(getApplicationContext(),("сервис") ,Toast.LENGTH_SHORT).show();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        someTask();
        Toast.makeText(getApplicationContext(),("сервис блед робит") ,Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    private void someTask() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(getApplicationContext(),("сервис блед onBIND") ,Toast.LENGTH_SHORT).show();
        return null;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),("сервис блед сдох") ,Toast.LENGTH_SHORT).show();
    }
}
