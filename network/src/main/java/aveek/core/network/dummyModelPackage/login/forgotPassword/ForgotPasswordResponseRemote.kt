package aveek.core.network.dummyModelPackage.login.forgotPassword

import com.google.gson.annotations.SerializedName

data class ForgotPasswordResponseRemote(
    @SerializedName("success" ) var success : Boolean? = null,
    @SerializedName("message" ) var message : String?  = null,
)
