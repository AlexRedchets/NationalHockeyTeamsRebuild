package com.azvk.nationalhockeyteams.client;

import com.azvk.nationalhockeyteams.models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface UserClient {

    @POST("api/login")
    Observable<Boolean> userLogin(@Body User user);
}
