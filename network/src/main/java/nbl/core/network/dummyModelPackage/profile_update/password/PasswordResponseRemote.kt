package nbl.core.network.dummyModelPackage.profile_update.password

import com.google.gson.annotations.SerializedName


data class PasswordResponseRemote (

  @SerializedName("success" ) var success : Boolean? = null,
  @SerializedName("message" ) var message : String?  = null

)