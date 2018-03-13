package com.example.admin.multipart;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by admin on 07/03/18.
 */

public interface UploadImageInterface  {
    @Multipart
    @POST("upload2.php")
    Call<UploadObject> uploadFile(@Part MultipartBody.Part user_photo, @Part("name") RequestBody name);
}
