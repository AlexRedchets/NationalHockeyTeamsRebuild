package com.azvk.nationalhockeyteams;

import android.util.Log;

import org.greenrobot.eventbus.Subscribe;

public class EventBusListener {

    private static final String TAG = EventBusListener.class.getSimpleName();



    @Subscribe
    public void onEvent(EventList eventList){
        switch (eventList.getResultCode()){
            case 111:
                Log.i(TAG, "GET click received");

                break;
            case 222:
                Log.i(TAG, "CLEAR click received");

                break;
        }
    }

}
