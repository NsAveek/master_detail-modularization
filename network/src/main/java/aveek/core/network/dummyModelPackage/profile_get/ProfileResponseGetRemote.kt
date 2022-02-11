package aveek.core.network.dummyModelPackage.profile_get

import com.google.gson.annotations.SerializedName


data class ProfileResponseGetRemote (

  @SerializedName("success" ) var success : Boolean? = null,
  @SerializedName("data"    ) var data    : ProfileResponseGetDataRemote?    = ProfileResponseGetDataRemote()

)