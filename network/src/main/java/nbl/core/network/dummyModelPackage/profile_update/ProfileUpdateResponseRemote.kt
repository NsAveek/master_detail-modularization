package nbl.core.network.dummyModelPackage.profile_update

import com.google.gson.annotations.SerializedName


data class ProfileUpdateResponseRemote (

  @SerializedName("success" ) var success : Boolean? = null,
  @SerializedName("message" ) var message : String?  = null,
  @SerializedName("data"    ) var data    : DataProfileGetResponseRemote?    = DataProfileGetResponseRemote()

)