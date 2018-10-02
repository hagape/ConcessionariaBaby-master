package concessionaria.baby.com.br.concessionariababy.api

import concessionaria.baby.com.br.concessionariababy.model.Carro
import concessionaria.baby.com.br.concessionariababy.model.Usuario
import retrofit2.Call
import retrofit2.http.*

interface CarroAPI {

    @GET("/carro")
    fun buscarCarros(): Call<List<Carro>>

    @GET("/carro/{marca}")
    fun buscarPorMarca(@Path("marca") marca: String): Call<List<Carro>>

    @POST("/carro")
    fun salvar(@Body carro: Carro): Call<Void>

    @PUT("/carro")
    fun update(@Body carro: Carro): Call<Void>

    @DELETE("/carro/{id}/deletar")
    fun delete(@Path("id") id: String): Call<Void>
}