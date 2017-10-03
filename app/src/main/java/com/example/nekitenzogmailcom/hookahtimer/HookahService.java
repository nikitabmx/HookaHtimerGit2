package com.example.nekitenzogmailcom.hookahtimer;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.media.audiofx.BassBoost;
import android.os.IBinder;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.widget.Chronometer;
import android.support.annotation.Nullable;
import android.widget.TextView;
import android.widget.Toast;



import static android.content.Intent.getIntentOld;
import static com.example.nekitenzogmailcom.hookahtimer.R.id.chronometer1;

/**
 * Created by nekitenzo@gmail.com on 09.08.2017.
 */

public class HookahService extends Service
{
public MediaPlayer player;
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
        Toast.makeText(getApplicationContext(),("сервис блед робит") ,Toast.LENGTH_SHORT).show();
      //  return super.onStartCommand(intent, flags, startId);
 player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();




//             Intent intent1 = new Intent(getApplicationContext() , MainActivity.class);
//        Notification.Builder builder = new Notification.Builder(getApplicationContext());
//        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0 ,intent, PendingIntent.FLAG_CANCEL_CURRENT);
//        builder
//                .setContentIntent(pendingIntent)
//                .setSmallIcon(R.mipmap.icon)
//                .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.mipmap.icon))
//                .setTicker("Первый стол")
//                .setWhen(System.currentTimeMillis())
//                .setAutoCancel(true)
//                .setContentTitle("Первый стол" )
//                 .setContentText("Время с посадки(чч:мм) = ");
//               // .setContentText("Время с посадки(ч:м) = " + hours1 + ":" + min1 +  ":" + sec1);
//        Notification notification = builder.build();
//        nm.notify(NOTIFICATION_ID, notification);


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
        player.stop();
        Toast.makeText(getApplicationContext(),("сервис блед сдох") ,Toast.LENGTH_SHORT).show();
    }
}
