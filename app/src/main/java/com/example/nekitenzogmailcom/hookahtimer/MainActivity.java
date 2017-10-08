package com.example.nekitenzogmailcom.hookahtimer;

import android.app.NotificationManager;

import android.content.Context;
import android.content.Intent;

import android.os.SystemClock;
import android.os.Vibrator;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.Toast;




import static com.example.nekitenzogmailcom.hookahtimer.R.layout.activity_main;



public class MainActivity extends AppCompatActivity {
    private NotificationManager nm;
    private final int NOTIFICATION_ID = 127;
    boolean starter1;
    boolean starter2;
    boolean starter3;
    boolean starter4;
    boolean starter5;
    boolean starter6;
    boolean starter7;
    boolean starter8;
    boolean starter9;
    boolean starter10;
    Vibrator vibrator;
    String kek;
    Intent intent;
    public long elapsedMillis1,elapsedMillis2,sec1,min1,hours1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(activity_main);
        nm = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);


kek = "кек";

        starter1 = false;
        starter2 = false;
        starter3 = false;
        starter4 = false;
        starter5 = false;
        starter6 = false;
        starter7 = false;
        starter8 = false;
        starter9 = false;
        starter10 = false;
vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
         final Chronometer chronometer1 = (Chronometer) findViewById(R.id.chronometer1);
        final Chronometer chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
        final Chronometer chronometer3 = (Chronometer) findViewById(R.id.chronometer3);
        final Chronometer chronometer4 = (Chronometer) findViewById(R.id.chronometer4);
        final Chronometer chronometer5 = (Chronometer) findViewById(R.id.chronometer5);
        final Chronometer chronometer6 = (Chronometer) findViewById(R.id.chronometer6);
        final Chronometer chronometer7 = (Chronometer) findViewById(R.id.chronometer7);
        final Chronometer chronometer8 = (Chronometer) findViewById(R.id.chronometer8);
        final Chronometer chronometer9 = (Chronometer) findViewById(R.id.chronometer9);
        final Chronometer chronometer10 = (Chronometer) findViewById(R.id.chronometer10);
     final Button start1 = (Button) findViewById(R.id.StrBtn1);
     final Button start2 = (Button) findViewById(R.id.StrBtn2);
     final Button start3 = (Button) findViewById(R.id.StrBtn3);
     final Button start4 = (Button) findViewById(R.id.StrBtn4);
     final Button start5 = (Button) findViewById(R.id.StrBtn5);
     final Button start6 = (Button) findViewById(R.id.StrBtn6);
     final Button start7 = (Button) findViewById(R.id.StrBtn7);
     final Button start8 = (Button) findViewById(R.id.StrBtn8);
     final Button start9 = (Button) findViewById(R.id.StrBtn9);
     final Button start10 = (Button) findViewById(R.id.StrBtn10);

    final CheckBox check1Tbl1 = (CheckBox)findViewById(R.id.check1Tbl1);
      final CheckBox check2Tbl1 = (CheckBox)findViewById(R.id.check2Tbl1);
      final CheckBox check3Tbl1 = (CheckBox)findViewById(R.id.check3Tbl1);

      final CheckBox check1Tbl2 = (CheckBox)findViewById(R.id.check1Tbl2);
      final CheckBox check2Tbl2 = (CheckBox)findViewById(R.id.check2Tbl2);
      final CheckBox check3Tbl2 = (CheckBox)findViewById(R.id.check3Tbl2);

        final CheckBox check1Tbl3 = (CheckBox)findViewById(R.id.check1Tbl3);
      final CheckBox check2Tbl3 = (CheckBox)findViewById(R.id.check2Tbl3);
      final CheckBox check3Tbl3 = (CheckBox)findViewById(R.id.check3Tbl3);

        final CheckBox check1Tbl4 = (CheckBox)findViewById(R.id.check1Tbl4);
      final CheckBox check2Tbl4 = (CheckBox)findViewById(R.id.check2Tbl4);
      final CheckBox check3Tbl4 = (CheckBox)findViewById(R.id.check3Tbl4);

        final CheckBox check1Tbl5 = (CheckBox)findViewById(R.id.check1Tbl5);
        final CheckBox check2Tbl5 = (CheckBox)findViewById(R.id.check2Tbl5);
        final CheckBox check3Tbl5 = (CheckBox)findViewById(R.id.check3Tbl5);

        final CheckBox check1Tbl6 = (CheckBox)findViewById(R.id.check1Tbl6);
        final CheckBox check2Tbl6 = (CheckBox)findViewById(R.id.check2Tbl6);
        final CheckBox check3Tbl6 = (CheckBox)findViewById(R.id.check3Tbl6);

        final CheckBox check1Tbl7 = (CheckBox)findViewById(R.id.check1Tbl7);
        final CheckBox check2Tbl7 = (CheckBox)findViewById(R.id.check2Tbl7);
        final CheckBox check3Tbl7 = (CheckBox)findViewById(R.id.check3Tbl7);

        final CheckBox check1Tbl8 = (CheckBox)findViewById(R.id.check1Tbl8);
        final CheckBox check2Tbl8 = (CheckBox)findViewById(R.id.check2Tbl8);
        final CheckBox check3Tbl8 = (CheckBox)findViewById(R.id.check3Tbl8);

        final CheckBox check1Tbl9 = (CheckBox)findViewById(R.id.check1Tbl9);
        final CheckBox check2Tbl9 = (CheckBox)findViewById(R.id.check2Tbl9);
        final CheckBox check3Tbl9 = (CheckBox)findViewById(R.id.check3Tbl9);

        final CheckBox check1Tbl10 = (CheckBox)findViewById(R.id.check1Tbl10);
        final CheckBox check2Tbl10 = (CheckBox)findViewById(R.id.check2Tbl10);
        final CheckBox check3Tbl10 = (CheckBox)findViewById(R.id.check3Tbl10);

        //startService(new Intent(this, HookahService.class));


        start1.setOnClickListener(new View.OnClickListener() {

       //  long elapsedMillis1,sec1,min1,hours1;
            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter1){

                    startService(new Intent(MainActivity.this, HookahService.class));
                    chronometer1.setBase(SystemClock.elapsedRealtime());
                    chronometer1.start();
                    start1.setText("Сброс!");
                //    start1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    start1.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.stop_buttons));
                    starter1 = true;

                    chronometer1.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis1 = SystemClock.elapsedRealtime()- chronometer1.getBase();
                            sec1 = elapsedMillis1/1000;
                            min1 = elapsedMillis1/60000;
                            hours1 = elapsedMillis1/3600000;



//                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                                Notification.Builder builder = new Notification.Builder(getApplicationContext());
//                                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0 ,intent, PendingIntent.FLAG_CANCEL_CURRENT);
//                                builder
//                                        .setContentIntent(pendingIntent)
//                                        .setSmallIcon(R.mipmap.icon)
//                                        .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.mipmap.icon))
//                                        .setTicker("Первый стол")
//                                        .setWhen(System.currentTimeMillis())
//                                        .setAutoCancel(true)
//                                        .setContentTitle("Первый стол" )
//                                       // .setContentText("Время с посадки(чч:мм) = " + elapsedMillis1/3600000 + ":" + elapsedMillis1/60000);
//                                        .setContentText("Время с посадки(ч:м) = " + hours1 + ":" + min1 +  ":" + sec1);
//                                Notification notification = builder.build();
//                                nm.notify(NOTIFICATION_ID, notification);


//                            if (elapsedMillis1 > 2000 && elapsedMillis1 < 7000) {
//                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                                Notification.Builder builder = new Notification.Builder(getApplicationContext());
//                                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0 ,intent, PendingIntent.FLAG_CANCEL_CURRENT);
//                                builder
//                                        .setContentIntent(pendingIntent)
//                                        .setSmallIcon(R.mipmap.icon)
//                                        .setLargeIcon(BitmapFactory.decodeResource(getApplication().getResources(), R.mipmap.icon))
//                                        .setTicker("Первый стол")
//                                        .setWhen(System.currentTimeMillis())
//                                        .setAutoCancel(true)
//                                        .setContentTitle("Первая смена (20 мин)")
//                                        .setContentText("оглы блед");
//                                Notification notification = builder.build();
//                                nm.notify(NOTIFICATION_ID, notification);

//                            }
                            if (elapsedMillis1 > 4000 && elapsedMillis1 < 7000) {
                                    String strElapsedMillis = "Первая смена углей 9 стола!";
                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
                                  //   vibrator.vibrate(2000);

                                }
                        }






                    });

                }
                else {
                    nm.cancel(127);
                    check1Tbl1.setChecked(false);
                    check2Tbl1.setChecked(false);
                    check3Tbl1.setChecked(false);
                    check1Tbl1.setText("Первая смена");
                    check2Tbl1.setText("Вторая смена");
                    check3Tbl1.setText("Третья смена ");
                    start1.setText("Посадка");
                    chronometer1.setBase(SystemClock.elapsedRealtime());
                    chronometer1.stop();

               //     start1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    start1.setBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.start_button));
                    starter1 = false;
                }
                check1Tbl1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl1.setText("Первая смена в: " + (elapsedMillis1 /60000) + " мин");
                    }
                });
                check2Tbl1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl1.setText("Вторая смена в: " + (elapsedMillis1 /60000) + " мин");
                    }
                });
                check3Tbl1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl1.setText("Третья смена в: " + (elapsedMillis1 /60000) + " мин");

                    }
                });
            }



        });




        start2.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis2;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter2) {

                    chronometer2.setBase(SystemClock.elapsedRealtime());
                    chronometer2.start();
                    start2.setText("Сброс!");
                    start2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter2 = true;

                    chronometer2.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis2 = SystemClock.elapsedRealtime()- chronometer2.getBase();

//                                if (elapsedMillis9 > 2000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(2000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl2.setChecked(false);
                    check2Tbl2.setChecked(false);
                    check3Tbl2.setChecked(false);
                    check1Tbl2.setText("Первая смена");
                    check2Tbl2.setText("Вторая смена");
                    check3Tbl2.setText("Третья смена");
                    start2.setText("Посадка");
                    chronometer2.setBase(SystemClock.elapsedRealtime());
                    chronometer2.stop();
                    start2.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter2 = false;
                }
                check1Tbl2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl2.setText("Первая смена в: " + (elapsedMillis2 /60000) + " мин");
                    }
                });
                check2Tbl2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl2.setText("Вторая смена в: " + (elapsedMillis2 /60000) + " мин");
                    }
                });
                check3Tbl2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl2.setText("Третья смена в: " + (elapsedMillis2 /60000) + " мин");
                    }
                });
            }
        });



        start3.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis3;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter3) {

                    chronometer3.setBase(SystemClock.elapsedRealtime());
                    chronometer3.start();
                    start3.setText("Сброс!");
                    start3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter3 = true;

                    chronometer3.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis3 = SystemClock.elapsedRealtime()- chronometer3.getBase();

//                                if (elapsedMillis9 > 3000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(3000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl3.setChecked(false);
                    check2Tbl3.setChecked(false);
                    check3Tbl3.setChecked(false);
                    check1Tbl3.setText("Первая смена");
                    check2Tbl3.setText("Вторая смена");
                    check3Tbl3.setText("Третья смена");
                    start3.setText("Посадка");
                    chronometer3.setBase(SystemClock.elapsedRealtime());
                    chronometer3.stop();
                    start3.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter3 = false;
                }
                check1Tbl3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl3.setText("Первая смена в: " + (elapsedMillis3 /60000) + " мин");
                    }
                });
                check2Tbl3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl3.setText("Вторая смена в: " + (elapsedMillis3 /60000) + " мин");
                    }
                });
                check3Tbl3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl3.setText("Третья смена в: " + (elapsedMillis3 /60000) + " мин");
                    }
                });
            }
        });


        start4.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis4;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter4) {

                    chronometer4.setBase(SystemClock.elapsedRealtime());
                    chronometer4.start();
                    start4.setText("Сброс!");
                    start4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter4 = true;

                    chronometer4.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis4 = SystemClock.elapsedRealtime()- chronometer4.getBase();

//                                if (elapsedMillis9 > 4000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(4000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl4.setChecked(false);
                    check2Tbl4.setChecked(false);
                    check3Tbl4.setChecked(false);
                    check1Tbl4.setText("Первая смена");
                    check2Tbl4.setText("Вторая смена");
                    check3Tbl4.setText("Третья смена");
                    start4.setText("Посадка");
                    chronometer4.setBase(SystemClock.elapsedRealtime());
                    chronometer4.stop();
                    start4.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter4 = false;
                }
                check1Tbl4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl4.setText("Первая смена в: " + (elapsedMillis4 /60000) + " мин");
                    }
                });
                check2Tbl4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl4.setText("Вторая смена в: " + (elapsedMillis4 /60000) + " мин");
                    }
                });
                check3Tbl4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl4.setText("Третья смена в: " + (elapsedMillis4 /60000) + " мин");
                    }
                });
            }
        });



        start5.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis5;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter5) {

                    chronometer5.setBase(SystemClock.elapsedRealtime());
                    chronometer5.start();
                    start5.setText("Сброс!");
                    start5.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter5 = true;

                    chronometer5.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis5 = SystemClock.elapsedRealtime()- chronometer5.getBase();

//                                if (elapsedMillis9 > 5000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(5000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl5.setChecked(false);
                    check2Tbl5.setChecked(false);
                    check3Tbl5.setChecked(false);
                    check1Tbl5.setText("Первая смена");
                    check2Tbl5.setText("Вторая смена");
                    check3Tbl5.setText("Третья смена");
                    start5.setText("Посадка");
                    chronometer5.setBase(SystemClock.elapsedRealtime());
                    chronometer5.stop();
                    start5.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter5 = false;
                }
                check1Tbl5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl5.setText("Первая смена в: " + (elapsedMillis5 /60000) + " мин");
                    }
                });
                check2Tbl5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl5.setText("Вторая смена в: " + (elapsedMillis5 /60000) + " мин");
                    }
                });
                check3Tbl5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl5.setText("Третья смена в: " + (elapsedMillis5 /60000) + " мин");
                    }
                });
            }
        });


        start6.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis6;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter6) {

                    chronometer6.setBase(SystemClock.elapsedRealtime());
                    chronometer6.start();
                    start6.setText("Сброс!");
                    start6.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter6 = true;

                    chronometer6.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis6 = SystemClock.elapsedRealtime()- chronometer6.getBase();

//                                if (elapsedMillis9 > 6000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(5000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl6.setChecked(false);
                    check2Tbl6.setChecked(false);
                    check3Tbl6.setChecked(false);
                    check1Tbl6.setText("Первая смена");
                    check2Tbl6.setText("Вторая смена");
                    check3Tbl6.setText("Третья смена");
                    start6.setText("Посадка");
                    chronometer6.setBase(SystemClock.elapsedRealtime());
                    chronometer6.stop();
                    start6.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter6 = false;
                }
                check1Tbl6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl6.setText("Первая смена в: " + (elapsedMillis6 /60000) + " мин");
                    }
                });
                check2Tbl6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl6.setText("Вторая смена в: " + (elapsedMillis6 /60000) + " мин");
                    }
                });
                check3Tbl6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl6.setText("Третья смена в: " + (elapsedMillis6 /60000) + " мин");
                    }
                });
            }
        });
        start7.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis7;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter7) {

                    chronometer7.setBase(SystemClock.elapsedRealtime());
                    chronometer7.start();
                    start7.setText("Сброс!");
                    start7.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter7 = true;

                    chronometer7.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis7 = SystemClock.elapsedRealtime()- chronometer7.getBase();

//                                if (elapsedMillis9 > 6000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(5000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl7.setChecked(false);
                    check2Tbl7.setChecked(false);
                    check3Tbl7.setChecked(false);
                    check1Tbl7.setText("Первая смена");
                    check2Tbl7.setText("Вторая смена");
                    check3Tbl7.setText("Третья смена");
                    start7.setText("Посадка");
                    chronometer7.setBase(SystemClock.elapsedRealtime());
                    chronometer7.stop();
                    start7.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter7 = false;
                }
                check1Tbl7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl7.setText("Первая смена в: " + (elapsedMillis7 /60000) + " мин");
                    }
                });
                check2Tbl7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl7.setText("Вторая смена в: " + (elapsedMillis7 /60000) + " мин");
                    }
                });
                check3Tbl7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl7.setText("Третья смена в: " + (elapsedMillis7 /60000) + " мин");
                    }
                });
            }
        });


        start8.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis8;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter8) {

                    chronometer8.setBase(SystemClock.elapsedRealtime());
                    chronometer8.start();
                    start8.setText("Сброс!");
                    start8.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter8 = true;

                    chronometer8.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis8 = SystemClock.elapsedRealtime()- chronometer8.getBase();

//                                if (elapsedMillis9 > 6000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(5000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl8.setChecked(false);
                    check2Tbl8.setChecked(false);
                    check3Tbl8.setChecked(false);
                    check1Tbl8.setText("Первая смена");
                    check2Tbl8.setText("Вторая смена");
                    check3Tbl8.setText("Третья смена");
                    start8.setText("Посадка");
                    chronometer8.setBase(SystemClock.elapsedRealtime());
                    chronometer8.stop();
                    start8.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter8 = false;
                }
                check1Tbl8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl8.setText("Первая смена в: " + (elapsedMillis8 /60000) + " мин");
                    }
                });
                check2Tbl8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl8.setText("Вторая смена в: " + (elapsedMillis8 /60000) + " мин");
                    }
                });
                check3Tbl8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl8.setText("Третья смена в: " + (elapsedMillis8 /60000) + " мин");
                    }
                });
            }
        });

        start10.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view){
                long elapsedMillis;
                if (!starter10) {
                   elapsedMillis = SystemClock.elapsedRealtime()- chronometer10.getBase();
                    chronometer10.setBase(SystemClock.elapsedRealtime());
                    chronometer10.start();
                    start10.setText("Сброс!");
                    start10.setBackgroundColor(ContextCompat.getColor(MainActivity.this , R.color.red));
                    starter10 = true;
                    if (elapsedMillis > 5000) {
                        String strElapsedMillis = "кекес";
                        Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
                    }




                }
                else {
                    check1Tbl10.setChecked(false);
                    check2Tbl10.setChecked(false);
                    check3Tbl10.setChecked(false);

                    start10.setText("Посадка");
                    chronometer10.setBase(SystemClock.elapsedRealtime());
                    chronometer10.stop();
                    start10.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter10 = false;


                }



            }
        });

        start9.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis9;

           // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter9) {

                        chronometer9.setBase(SystemClock.elapsedRealtime());
                        chronometer9.start();
                        start9.setText("Сброс!");
                        start9.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                        starter9 = true;

                        chronometer9.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                            @Override
                            public void onChronometerTick(Chronometer chronometer) {
                                elapsedMillis9 = SystemClock.elapsedRealtime()- chronometer9.getBase();

//                                if (elapsedMillis9 > 6000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(5000);
//
//                                }
                            }
                        });
                    }
                    else {

                        check1Tbl9.setChecked(false);
                        check2Tbl9.setChecked(false);
                        check3Tbl9.setChecked(false);
                    check1Tbl9.setText("Первая смена");
                    check2Tbl9.setText("Вторая смена");
                    check3Tbl9.setText("Третья смена");
                        start9.setText("Посадка");
                        chronometer9.setBase(SystemClock.elapsedRealtime());
                        chronometer9.stop();
                        start9.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                        starter9 = false;
                    }
                check1Tbl9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl9.setText("Первая смена в: " + (elapsedMillis9 /60000) + " мин");
                    }
                });
                check2Tbl9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl9.setText("Вторая смена в: " + (elapsedMillis9 /60000) + " мин");
                    }
                });
                check3Tbl9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl9.setText("Третья смена в: " + (elapsedMillis9 /60000) + " мин");
                    }
                });
                 }
        });


        start10.setOnClickListener(new View.OnClickListener() {
            long elapsedMillis10;

            // long elapsedMillis = SystemClock.elapsedRealtime() - chronometer9.getBase();
            @Override
            public void onClick(View view){
                if (!starter10) {

                    chronometer10.setBase(SystemClock.elapsedRealtime());
                    chronometer10.start();
                    start10.setText("Сброс!");
                    start10.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.red));
                    starter10 = true;

                    chronometer10.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
                        @Override
                        public void onChronometerTick(Chronometer chronometer) {
                            elapsedMillis10 = SystemClock.elapsedRealtime()- chronometer9.getBase();

//                                if (elapsedMillis9 > 6000 && elapsedMillis9 < 7000) {
//                                    String strElapsedMillis = "Первая смена углей 9 стола!";
//                                    Toast.makeText(getApplicationContext(), strElapsedMillis, Toast.LENGTH_LONG).show();
//                                   //  vibrator.vibrate(5000);
//
//                                }
                        }
                    });
                }
                else {

                    check1Tbl10.setChecked(false);
                    check2Tbl10.setChecked(false);
                    check3Tbl10.setChecked(false);
                    check1Tbl10.setText("Первая смена");
                    check2Tbl10.setText("Вторая смена");
                    check3Tbl10.setText("Третья смена");
                    start10.setText("Посадка");
                    chronometer10.setBase(SystemClock.elapsedRealtime());
                    chronometer10.stop();
                    start10.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
                    starter10 = false;
                }
                check1Tbl10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check1Tbl10.setText("Первая смена в: " + (elapsedMillis10 /60000) + " мин");
                    }
                });
                check2Tbl10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check2Tbl10.setText("Вторая смена в: " + (elapsedMillis10 /60000) + " мин");
                    }
                });
                check3Tbl10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        check3Tbl10.setText("Третья смена в: " + (elapsedMillis10 /60000) + " мин");
                    }
                });
            }
        });




    }

public void startService(View view){
//intent = new  Intent(this,HookahService.class);
    intent.putExtra("FirstTimer",elapsedMillis2);
    intent.putExtra("kek",kek);
}








    @Override
    protected void onPause() {
        super.onPause();



    }



    @Override
    protected void onResume() {
        super.onResume();
    }
}
