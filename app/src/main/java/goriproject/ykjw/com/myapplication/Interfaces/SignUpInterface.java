package goriproject.ykjw.com.myapplication.Interfaces;

import org.json.JSONObject;

import goriproject.ykjw.com.myapplication.domain.SignUpModel;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;


public interface SignUpInterface {

    //@Headers("Content-Type:application/json")
    @POST("member/signup/")
    Call<ResponseBody> createUser(
            @Body SignUpModel model
    );

    @FormUrlEncoded
    @POST("member/login/")
    Call<Result2> login(@Field("username") String username, @Field("password") String password);

    @FormUrlEncoded
    @POST("member/token-auth/")
    Call<Result> facebooklogin(@Field("access_token") String token);
}
