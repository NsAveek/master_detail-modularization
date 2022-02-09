package nbl.core.network.dummyModelPackage.profile_get

import com.google.gson.annotations.SerializedName


data class ProfileResponseGetTimezoneRemote (

  @SerializedName("id"         ) var id        : Int?    = null,
  @SerializedName("text"       ) var text      : String? = null,
  @SerializedName("value"      ) var value     : String? = null,
  @SerializedName("abbr"       ) var abbr      : String? = null,
  @SerializedName("offset"     ) var offset    : String? = null,
  @SerializedName("isdst"      ) var isdst     : String? = null,
  @SerializedName("utc"        ) var utc       : String? = null,
  @SerializedName("status"     ) var status    : String? = null,
  @SerializedName("created_by" ) var createdBy : String? = null,
  @SerializedName("updated_by" ) var updatedBy : String? = null,
  @SerializedName("created_at" ) var createdAt : String? = null,
  @SerializedName("updated_at" ) var updatedAt : String? = null,
  @SerializedName("deleted_at" ) var deletedAt : String? = null

)