package com.example.aplicaciongrupo.Api;

import com.example.aplicaciongrupo.Datos.Respuesta;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiPokemon {
    @GET("pokemon")
    Call<Respuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);
}
