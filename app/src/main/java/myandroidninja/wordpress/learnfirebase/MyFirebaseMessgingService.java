package myandroidninja.wordpress.learnfirebase;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Kavitha on 13-11-2017.
 */

public class MyFirebaseMessgingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.i("MSG"," From "+remoteMessage.getFrom());

        Log.i("MSG"," Notification  "+remoteMessage.getNotification().getBody());
    }
}
