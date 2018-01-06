package com.example.lenovo.viswanath.inter;

import com.example.lenovo.viswanath.model.Status;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by lenovo on 1/6/2018.
 */

public interface ApiInterface {
    @Headers("{\"user_id\":\"428\",\"url\":\"https://shelllogic.isteer.co/restphp/lead/fetchDSRLeads\",\"session_id\":\"1btj7svbktoj49uvvoit4hvse1\"}")
    @POST("restphp/lead/fetchDSRLeads")
    Call<Status> GetData(
            @Header("user_id") Integer user_id,
            @Header("url") String url,
            @Header("session_id") String session_id,
            @Body String task
    );
}
