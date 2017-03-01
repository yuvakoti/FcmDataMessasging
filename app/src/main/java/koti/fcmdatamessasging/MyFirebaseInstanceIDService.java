package koti.fcmdatamessasging;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by User on 3/1/2017.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d("TOKEN",token);
    }
}
