package com.example.nekitenzogmailcom.hookahtimer;
import android.app.Notification;
import android.app.NotificationManager;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;



/**
 * Created by nekitenzo@gmail.com on 09.08.2017.
 */

public class HookahService extends Service
{
    Intent intent;
    long chronom;
  String kek;
 //public final int NOTIFICATION_ID = 127;
     NotificationManager nm;


    @Override
    public void onCreate() {
        super.onCreate();
        //Toast.makeText(getApplicationContext(),("сервис") ,Toast.LENGTH_SHORT).show();
        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);




    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        someTask();
     // chronom  = intent.getLongExtra("FirstTimer", 0);
     kek  = intent.getStringExtra("kek");
        Toast.makeText(getApplicationContext(),("сервис блед робит " + kek) ,Toast.LENGTH_LONG).show();




        //          intent = new Intent(getApplicationContext(), MainActivity.class);
//            Notification.Builder builder = new Notification.Builder(getApplicationContext());
//            PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//            builder
//                    .setContentIntent(pendingIntent)
//                    .setSmallIcon(R.mipmap.icon)
//                    .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.mipmap.icon))
//                    .setTicker("Первый стол")
//                    .setWhen(System.currentTimeMillis())
//                    .setAutoCancel(true)
//                    .setContentTitle("Первый стол")
//                    .setContentText("Время с посадки(чч:мм) = " + chron1);
//            // .setContentText("Время с посадки(ч:м) = " + hours1 + ":" + min1 +  ":" + sec1);
//            Notification notification = builder.build();
//            nm.notify(NOTIFICATION_ID, notification);

         //   Toast.makeText(getApplicationContext(), ("сервис блед робит " + chronom), Toast.LENGTH_LONG).show();



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