package com.example.nekitenzogmailcom.hookahtimer;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.IBinder;
import android.os.Vibrator;
import android.support.annotation.RequiresApi;

import android.widget.Toast;


import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by nekitenzo@gmail.com on 09.08.2017.
 */

public class HookahService extends Service {
    Timer timer;

    String kekes;
    boolean starter1;
    Vibrator vibrator;
    long timer12,kek1,timer1s,timer1m,timer1h;
    public int NOTIFICATION_ID = 127;
    NotificationManager nm;
    Notification notification;
    Notification.Builder builder;
    PendingIntent pendingIntent;
    Intent notyfyIntent;
    boolean boolshit1;
    @Override
    public void onCreate() {
        super.onCreate();

        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        builder = new Notification.Builder(getApplicationContext());

    }

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

         boolshit1 = intent.getBooleanExtra("starter1",true);
         kek1 = intent.getLongExtra("FirstTimer",1);
        kekes = intent.getStringExtra("kek");


        Toast.makeText(getApplicationContext(), ("сервис бле робит " + kekes ), Toast.LENGTH_LONG).show();
        notyfyIntent = new Intent(getApplicationContext(), HookahService.class);
         PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);


        OnSomeTask();
        return START_STICKY;
    }

    public void OnSomeTask() {
        if (boolshit1) {

            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {

                    timer12 += 1;
                    kek(timer12);


                }
            }, 0, 1000);
        } else {
            timer12 = 0;
            timer.cancel();
            nm.cancel(127);
        }
    }


        @Override
        public IBinder onBind(Intent intent) {
         //   Toast.makeText(getApplicationContext(), ("сервис блед onBIND"), Toast.LENGTH_LONG).show();
            return null;

        }
        public void kek(long timer12) {

            builder
                    .setContentIntent(pendingIntent)
                    .setSmallIcon(R.mipmap.icon)
                    .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.mipmap.icon))
                    .setTicker("Первый стол")
                    // .setWhen(System.currentTimeMillis())
                    // .setAutoCancel(true)
                    .setContentTitle("Первый стол")
                    .setContentText("Время с посаки = Часов: " + timer12/3600 + ", минут: "+ timer12/60 ) ;
            notification = builder.build();
            nm.notify(NOTIFICATION_ID, notification);
            if ((timer12/60 > 20) && (timer12/60 < 22)) {
                vibrator.vibrate(2000);
            }

}






        @Override
        public void onDestroy() {
            super.onDestroy();
            //Toast.makeText(getApplicationContext(),("сервис блед сдох") ,Toast.LENGTH_SHORT).show();
        }

}