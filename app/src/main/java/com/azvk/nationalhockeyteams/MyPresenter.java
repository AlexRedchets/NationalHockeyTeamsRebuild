package com.azvk.nationalhockeyteams;

import android.provider.Settings;
import android.util.Log;

import com.azvk.nationalhockeyteams.client.UserClient;
import com.azvk.nationalhockeyteams.models.User;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MyPresenter {

    private static final String TAG = MyPresenter.class.getSimpleName();


    public MyPresenter(String username, String password) {

       /* User user = new User(username, password);
        UserClient userClient = Generator.createService(UserClient.class);
        Observable<Boolean> userObservable = userClient.userLogin(user);
        userObservable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(userData ->
                {if (userData){
                    Log.i(TAG, "Login successful");
                } else{
                    Log.i(TAG, "Login UNsuccessful");
                }
                },
                    throwable -> {
                        Log.e("Error", throwable.getMessage());
                    });

        Observable<List<Player>> russia_players = client.player("Russia");
        russia_players
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(playerData -> {
                            list = playerData;
                            publish();
                        },
                        throwable -> {
                            Log.e("Error", throwable.getMessage());
                            error = throwable;
                            publish();

                        }
                );
    }

    public void onGetView(RecycleViewFragment view){
        this.view = view;
        publish();
    }

    private void publish(){
        if (view != null){
            if (list != null){
                view.setView(list);
            }
            else if (error != null){
                //function to show info
                Log.e("Error", "ERROR");
            }

        }
    }*/

    }
}