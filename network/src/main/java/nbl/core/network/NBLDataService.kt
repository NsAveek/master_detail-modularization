package nbl.core.network

import nbl.core.network.dummyModelPackage.attendance.AttendanceResponseRemote
import nbl.core.network.dummyModelPackage.attendance_status.AttendanceStatusResponseRemote
import nbl.core.network.dummyModelPackage.login.LoginResponseRemote
import nbl.core.network.dummyModelPackage.login.forgotPassword.ForgotPasswordResponseRemote
import nbl.core.network.dummyModelPackage.profile_get.ProfileResponseGetRemote
import nbl.core.network.dummyModelPackage.profile_update.ProfileUpdateResponseRemote
import nbl.core.network.dummyModelPackage.profile_update.password.PasswordResponseRemote
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface NBLDataService {

    companion object {
        const val BASE_URL = "https://nblas.sudip.me/"
        const val NETWORK_PAGE_SIZE = 20
    }

    @POST("api/login")
    suspend fun loginRequest(@Body user : Map<String , String>) : Response<LoginResponseRemote>

    @POST("api/forgot-password")
    suspend fun forgotPasswordRequest(@Body userName : Map<String, String>) : Response<ForgotPasswordResponseRemote>

    @POST("api/attendance-in")
    suspend fun attedanceIn( @Body officeMap : Map<String, String>) : Response<AttendanceResponseRemote>

    @POST("api/attendance-out")
    suspend fun attedanceOut(@Body officeMap : Map<String, String>) : Response<AttendanceResponseRemote>

    @GET("api/attendance-status")
    suspend fun getAttedanceStatus() : Response<AttendanceStatusResponseRemote>

    @GET("api/profile")
    suspend fun getProfile() : Response<ProfileResponseGetRemote>

    @POST("api/profile-update")
    suspend fun updateProfile(@Body profileMap : Map<String, String>) : Response<ProfileUpdateResponseRemote>

    @POST("api/password-update")
    suspend fun updatePassword(@Body passwordMap : Map<String, String>) : Response<PasswordResponseRemote>



//    @GET("api/exception-attendance")
//    suspend fun exceptionAttedance(@Path page : Int) : Response<ForgotPasswordResponseRemote>



}