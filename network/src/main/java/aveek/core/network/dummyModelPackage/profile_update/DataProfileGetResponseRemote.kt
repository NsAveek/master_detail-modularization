package aveek.core.network.dummyModelPackage.profile_update

import com.google.gson.annotations.SerializedName


data class DataProfileGetResponseRemote (

  @SerializedName("id"                ) var id               : Int?    = null,
  @SerializedName("name"              ) var name             : String? = null,
  @SerializedName("mobile"            ) var mobile           : String? = null,
  @SerializedName("department_id"     ) var departmentId     : Int?    = null,
  @SerializedName("designation_id"    ) var designationId    : Int?    = null,
  @SerializedName("timezone_id"       ) var timezoneId       : Int?    = null,
  @SerializedName("image"             ) var image            : String? = null,
  @SerializedName("image_url"         ) var imageUrl         : String? = null,
  @SerializedName("email"             ) var email            : String? = null,
  @SerializedName("type"              ) var type             : String? = null,
  @SerializedName("role_departments"  ) var roleDepartments  : String? = null,
  @SerializedName("role_designations" ) var roleDesignations : String? = null,
  @SerializedName("status"            ) var status           : String? = null

)