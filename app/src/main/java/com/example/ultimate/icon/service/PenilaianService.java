package com.example.ultimate.icon.service;


import com.example.ultimate.icon.models.Penilaian;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ULTIMATE on 2017/12/08.
 */

public interface PenilaianService {

    @POST("Ratingservice")
    Call<Penilaian> createPenilaian(@Body Penilaian penilaian);
}

