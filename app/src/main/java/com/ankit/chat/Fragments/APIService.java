package com.ankit.chat.Fragments;

import com.ankit.chat.Notifications.MyResponse;
import com.ankit.chat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAPySoWcI:APA91bGTqEHV-POFPL_mtDpnFesVZGmf8d6V8Oq2-PPQY9sFyvUoOv_ePn4Xpm5VSHDDmARrGeA3FfQOG8DHRcbUfAlZR1xLoBC6Ie7AeFWW5cjECwIV7bf8GIG7PaapKcb7Yr6oya9w"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
