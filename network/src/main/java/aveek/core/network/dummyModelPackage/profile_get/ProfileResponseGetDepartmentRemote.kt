package aveek.core.network.dummyModelPackage.profile_get

import com.google.gson.annotations.SerializedName


data class ProfileResponseGetDepartmentRemote (

  @SerializedName("id"         ) var id        : Int?    = null,
  @SerializedName("name"       ) var name      : String? = null,
  @SerializedName("status"     ) var status    : String? = null,
  @SerializedName("created_by" ) var createdBy : String? = null,
  @SerializedName("updated_by" ) var updatedBy : String? = null,
  @SerializedName("created_at" ) var createdAt : String? = null,
  @SerializedName("updated_at" ) var updatedAt : String? = null

)