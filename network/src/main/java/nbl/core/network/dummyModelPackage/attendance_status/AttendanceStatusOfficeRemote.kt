package nbl.core.network.dummyModelPackage.attendance_status

import com.google.gson.annotations.SerializedName


data class AttendanceStatusOfficeRemote (

  @SerializedName("id"            ) var id           : Int?    = null,
  @SerializedName("name"          ) var name         : String? = null,
  @SerializedName("latitude"      ) var latitude     : String? = null,
  @SerializedName("longitude"     ) var longitude    : String? = null,
  @SerializedName("radius"        ) var radius       : Int?    = null,
  @SerializedName("radius_length" ) var radiusLength : Int?    = null,
  @SerializedName("status"        ) var status       : String? = null

)