package com.example.nekitenzogmailcom.hookahtimer;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;

import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.widget.Chronometer;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by nekitenzo@gmail.com on 09.08.2017.
 */

public class HookahService extends Service {
    String strDate;
    Timer timer;
    MyTimerTask mMyTimerTask;
    int boolshit1;

    public final int NOTIFICATION_ID = 127;
    NotificationManager nm;
    // long kek1;
    MediaPlayer media;

    @Override
    public void onCreate() {
        super.onCreate();

        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);


    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        OnSomeTask();
        media = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        media.setLooping(true);


        String kek = intent.getStringExtra("kek");
        boolshit1 = intent.getIntExtra("bolshit1",1);
        Toast.makeText(getApplicationContext(), ("сервис бле робит " + kek), Toast.LENGTH_LONG).show();


        new Intent(getApplicationContext(), HookahService.class);
        Notification.Builder builder = new Notification.Builder(getApplicationContext());
        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        builder
                .setContentIntent(pendingIntent)
                .setSmallIcon(R.mipmap.icon)
                .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.mipmap.icon))
                .setTicker("Первый стол")
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                .setContentTitle("Первый стол")
                .setContentText("Время с посаки(ч:м) = " + " "+ strDate);
        Notification notification = builder.build();
        nm.notify(NOTIFICATION_ID, notification);

        // Toast.makeText(getApplicationContext(), ("сервис блед робит " + chronom), Toast.LENGTH_LONG).show();


        return START_STICKY;
    }

    public void OnSomeTask() {


        if (boolshit1 == 1) {
            if (timer != null) {
                timer = new Timer();
                mMyTimerTask = new MyTimerTask();
                timer.schedule(mMyTimerTask, 1000);
            } else {
                timer.schedule(mMyTimerTask, 1000, 5000);
            }
        } else {
            timer.cancel();
            timer = null;
        }

    }


public class MyTimerTask extends TimerTask {


        @Override
        public void run() {
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss a", Locale.getDefault());
            strDate = simpleDateFormat.format(calendar.getTime());
//            runOnUiThread(new Runnable());
//            {
//                run();
//            }
        }

    }
        @Override
        public IBinder onBind(Intent intent) {
            Toast.makeText(getApplicationContext(), ("сервис блед onBIND"), Toast.LENGTH_SHORT).show();
            return null;

        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            //Toast.makeText(getApplicationContext(),("сервис блед сдох") ,Toast.LENGTH_SHORT).show();
        }

}