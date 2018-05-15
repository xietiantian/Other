package com.example.notificationdemo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.CountDownTimer;
import android.support.v4.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity {

    NotificationManager mNotificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNotificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void showNormalNotification(View view) {
        Log.i("zyq", "showNormalNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        Notification n = mBuilder.build();
        mNotificationManager.notify(99, n);
    }

    public void showBigTextNotification(View view) {
        Log.i("zyq", "showBigTextNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        NotificationCompat.BigTextStyle mBigTextStyle = new NotificationCompat.BigTextStyle();
        mBigTextStyle.setBigContentTitle("This is BigContentTitle");
        mBigTextStyle.setSummaryText("This is BigSummaryText");
        mBigTextStyle.bigText("This is BigText \n 如果。所有的伤痕都能够痊愈。 如果。所有的真心都能够换来真意。 如果。所有的相信都能够坚持。如果。所有的情感都能够完美。如果。依然能相遇在某座城。单纯的微笑。微微的幸福。肆意的拥抱。 该多好。可是真的只是如果。");
        mBuilder.setStyle(mBigTextStyle);
        Notification n = mBuilder.build();
        mNotificationManager.notify(98, n);
    }

    public void showBigPictureNotification(View view) {
        Log.i("zyq", "showBigPictureNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        NotificationCompat.BigPictureStyle mBigPictureStyle = new NotificationCompat.BigPictureStyle();
        mBigPictureStyle.bigPicture(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
        mBigPictureStyle.bigLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round));
        mBuilder.setStyle(mBigPictureStyle);
        Notification n = mBuilder.build();
        mNotificationManager.notify(97, n);
    }

    public void showInboxNotification(View view) {
        Log.i("zyq", "showInboxNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        NotificationCompat.InboxStyle mInboxStyle = new NotificationCompat.InboxStyle();
        mInboxStyle.setBigContentTitle("This is Inbox BigContentTitle");
        mInboxStyle.setSummaryText("This is SummaryText");
        for (int i = 0; i < 6; i++) {
            mInboxStyle.addLine("---------" + i);
        }
        mBuilder.setStyle(mInboxStyle);
        Notification n = mBuilder.build();
        mNotificationManager.notify(96, n);
    }

    public void showMediaNotification(View view) {
        Log.i("zyq", "showMediaNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        mBuilder.addAction(new NotificationCompat.Action.Builder(R.mipmap.ic_launcher_round, "1", null).build())
                .addAction(new NotificationCompat.Action.Builder(R.mipmap.ic_launcher, "2", null).build())
                .addAction(new NotificationCompat.Action.Builder(R.mipmap.ic_launcher, "2", null).build())
                .addAction(new NotificationCompat.Action.Builder(R.mipmap.ic_launcher_round, "3", null).build());
        NotificationCompat.MediaStyle mMediaStyle = new NotificationCompat.MediaStyle();
        mMediaStyle.setShowActionsInCompactView(0, 1, 2);
        mBuilder.setStyle(mMediaStyle);
        Notification n = mBuilder.build();
        mNotificationManager.notify(95, n);
    }

    public void showMessagingNotification(View view) {
        Log.i("zyq", "showMessagingNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        NotificationCompat.MessagingStyle mMessagingStyle = new NotificationCompat.MessagingStyle("zhuyuqiang");
        mMessagingStyle.addMessage("Message Content", 10 * 1000, "sender");
        mMessagingStyle.setConversationTitle("10086");
        mBuilder.setStyle(mMessagingStyle);
        Notification n = mBuilder.build();
        mNotificationManager.notify(94, n);
    }

    public void showCustomStyleNotification(View view) {
        Log.i("zyq", "showCustomStyleNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        RemoteViews remoteViews = new RemoteViews(getPackageName(), R.layout.custom_layout_notification);
        mBuilder.setCustomContentView(remoteViews);
        NotificationCompat.DecoratedCustomViewStyle mCustomStyle = new NotificationCompat.DecoratedCustomViewStyle();
        mBuilder.setStyle(mCustomStyle);
        Notification n = mBuilder.build();
        mNotificationManager.notify(93, n);
    }

    public void showReplyStyleNotification(View view) {
        Log.i("zyq", "showCustomStyleNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        RemoteInput remoteInput = new RemoteInput.Builder("key_text_reply").setLabel("reply label").build();
        NotificationCompat.Action action = new NotificationCompat.Action.Builder(R.mipmap.ic_launcher, getString(R.string.reply), PendingIntent.getService(MainActivity.this,
                0, new Intent("start.notification.service"), 0))
                .addRemoteInput(remoteInput).build();
        mBuilder.addAction(action);
        mBuilder.setGroup("hello");
        Notification n = mBuilder.build();
        mNotificationManager.notify(92, n);
    }

    public void showHeadUpNotification(View view) {
        Log.i("zyq", "showHeadUpNotification");
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setFullScreenIntent(mPendingIntent, true);
        mBuilder.setPriority(Notification.PRIORITY_MAX);
        mBuilder.setCustomHeadsUpContentView(new RemoteViews(getPackageName(), R.layout.heads_up));
        Notification n = mBuilder.build();
        mNotificationManager.notify(91, n);
    }

    public void showProgressNotification(View view) {
        Log.i("zyq", "showNormalNotification");
        final NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this);
        mBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        mBuilder.setContentTitle("this is Notification Title");
        mBuilder.setContentText("this is Notification Text");
        Intent mIntent = new Intent();
        ComponentName name = new ComponentName("com.example.notificationdemo", "com.example.notificationdemo.MainActivity");
        mIntent.setComponent(name);
        PendingIntent mPendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, mIntent, 0);
        mBuilder.setContentIntent(mPendingIntent);
        mBuilder.setProgress(100, 50, false);
        Notification n = mBuilder.build();
        mNotificationManager.notify(91, n);
        new CountDownTimer(10000, 100) {
            private int i = 0;

            @Override
            public void onTick(long millisUntilFinished) {
                mBuilder.setProgress(100, i, false);
                i++;
                Notification n = mBuilder.build();
                mNotificationManager.notify(91, n);
            }

            @Override
            public void onFinish() {
                mBuilder.setProgress(100, 100, false);
                Notification n = mBuilder.build();
                mNotificationManager.notify(91, n);
            }
        }.start();
    }
}
