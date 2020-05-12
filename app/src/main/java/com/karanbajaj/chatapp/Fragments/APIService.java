package com.karanbajaj.chatapp.Fragments;



import com.karanbajaj.chatapp.Notification.MyResponse;
import com.karanbajaj.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA-vpED5M:APA91bGXt4lKhht5IrPkmrqd_qJM6KCU9-aA_58ZWGKR3o86hrhdkmtxV3koeq-PxDjmM_JHwOKhnCA51OXUH53_imVY_IkgU_wPFzc3szDwCYEDkQUbI8yqYB1j2RY4NaIKumzAL5uX"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
