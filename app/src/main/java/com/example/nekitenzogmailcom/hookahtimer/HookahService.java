package com.example.nekitenzogmailcom.hookahtimer;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.provider.Settings;
import android.widget.Toast;

import java.util.Timer;


/**
 * Created by nekitenzo@gmail.com on 09.08.2017.
 */

public class HookahService extends Service
{


 public final int NOTIFICATION_ID = 127;
     NotificationManager nm;
    // long kek1;
     MediaPlayer media;
    @Override
    public void onCreate() {
        super.onCreate();
        //Toast.makeText(getApplicationContext(),("сервис") ,Toast.LENGTH_SHORT).show();
        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);




    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        someTask();
        media = MediaPlayer.create(this,Settings.System.DEFAULT_ALARM_ALERT_URI);
        media.setLooping(true);
      //  media.start();
        long chronom  = intent.getLongExtra("FirstTimer", 1L);
    String kek  = intent.getStringExtra("kek");
        Toast.makeText(getApplicationContext(),("сервис блед робит " + kek) ,Toast.LENGTH_LONG).show();




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
            .setContentText("Время с посадки(ч:м) = " + chronom + " " + kek);
            Notification notification = builder.build();
            nm.notify(NOTIFICATION_ID, notification);

           // Toast.makeText(getApplicationContext(), ("сервис блед робит " + chronom), Toast.LENGTH_LONG).show();



return  START_STICKY;
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
        //Toast.makeText(getApplicationContext(),("сервис блед сдох") ,Toast.LENGTH_SHORT).show();
    }
}
