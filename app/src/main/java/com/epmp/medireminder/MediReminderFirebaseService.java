package com.epmp.medireminder;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MediReminderFirebaseService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, remoteMessage.getNotification().getBody());

//        final NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());
//        builder.setSmallIcon(R.mipmap.icons_pill);
//        //builder.setContentIntent(pi);
//        builder.setContentTitle("Medicine Schedule Updated");
//        builder.setContentText("Dr Anshuman has updated your medicines. New medicines with schedule added. Click for more details");
//        builder.setPriority(Notification.PRIORITY_MAX);
//        builder.setAutoCancel(true);
//        builder.setDefaults(Notification.DEFAULT_ALL);
//        builder.setStyle(new NotificationCompat.BigTextStyle()
//                .bigText("Dr Anshuman has updated your medicines. New Medicines added. click for more details"));
//
//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        Notification notification = builder.build();
//
//        int notificationId = 1234;
//
//        notificationManager.notify(notificationId, notification);

    }

    @Override
    public void onNewToken(@NonNull String s) {

        //send token to server
    }
}
