package nbl.core.network.dummyModelPackage.profile_get

import com.google.gson.annotations.SerializedName


data class ProfileResponseGetDataRemote (

  @SerializedName("id"                ) var id               : Int?         = null,
  @SerializedName("number"            ) var number           : String?      = null,
  @SerializedName("name"              ) var name             : String?      = null,
  @SerializedName("mobile"            ) var mobile           : String?      = null,
  @SerializedName("office_id"         ) var officeId         : String?      = null,
  @SerializedName("department_id"     ) var departmentId     : String?      = null,
  @SerializedName("designation_id"    ) var designationId    : String?      = null,
  @SerializedName("timezone_id"       ) var timezoneId       : String?      = null,
  @SerializedName("image"             ) var image            : String?      = null,
  @SerializedName("image_url"         ) var imageUrl         : String?      = null,
  @SerializedName("email"             ) var email            : String?      = null,
  @SerializedName("email_verified_at" ) var emailVerifiedAt  : String?      = null,
  @SerializedName("type"              ) var type             : String?      = null,
  @SerializedName("role_departments"  ) var roleDepartments  : String?      = null,
  @SerializedName("role_designations" ) var roleDesignations : String?      = null,
  @SerializedName("status"            ) var status           : String?      = null,
  @SerializedName("created_at"        ) var createdAt        : String?      = null,
  @SerializedName("updated_at"        ) var updatedAt        : String?      = null,
  @SerializedName("office"            ) var office           : ProfileResponseGetOfficeRemote?      = ProfileResponseGetOfficeRemote(),
  @SerializedName("department"        ) var department       : ProfileResponseGetDepartmentRemote?  = ProfileResponseGetDepartmentRemote(),
  @SerializedName("designation"       ) var designation      : ProfileResponseGetDesignationRemote? = ProfileResponseGetDesignationRemote(),
  @SerializedName("timezone"          ) var timezone         : ProfileResponseGetTimezoneRemote?    = ProfileResponseGetTimezoneRemote()

)