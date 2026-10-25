package dahlia.com.example.githubprofile.services

import dahlia.com.example.githubprofile.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
interface GithubUserService {
    @GET("users/{login}")
    fun loginUser(
        @Header("Authorization") token: String,
        @Path("login") userLogin: String
    ): Call<GithubUser>
}