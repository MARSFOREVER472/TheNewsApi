package cl.disc.ucn.dsm.mlam.TheNewsApi.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * The News Api service interface.
 */
public interface NewsApi {

    final String API_KEY = "33486ed32d974966be1b007956de9db2";

    @Headers({"X-Api-Key: " + API_KEY})
    @GET("top-headlines?language=es")
    Call<NewsApiResult> getTopHeadLines(@Query("pageSize") int pageSize);
}
