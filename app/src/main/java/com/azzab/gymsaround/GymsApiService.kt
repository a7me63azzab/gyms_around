package com.azzab.gymsaround

import retrofit2.Call
import retrofit2.http.GET

interface GymsApiService {
    @GET(value = "gyms.json")
    fun getGyms():Call<List<Gym>>
}