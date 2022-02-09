package nbl.core.network.dummyModelPackage.attendance_status

import com.google.gson.annotations.SerializedName


data class AttendanceStatusDataRemote (

  @SerializedName("id"                 ) var id                : Int?    = null,
  @SerializedName("user_id"            ) var userId            : Int?    = null,
  @SerializedName("type"               ) var type              : String? = null,
  @SerializedName("checkin_location"   ) var checkinLocation   : String? = null,
  @SerializedName("checkin_latitude"   ) var checkinLatitude   : String? = null,
  @SerializedName("checkin_longitude"  ) var checkinLongitude  : String? = null,
  @SerializedName("checkin_time"       ) var checkinTime       : String? = null,
  @SerializedName("checkout_location"  ) var checkoutLocation  : String? = null,
  @SerializedName("checkout_latitude"  ) var checkoutLatitude  : String? = null,
  @SerializedName("checkout_longitude" ) var checkoutLongitude : String? = null,
  @SerializedName("checkout_time"      ) var checkoutTime      : String? = null,
  @SerializedName("duration"           ) var duration          : String? = null,
  @SerializedName("comment"            ) var comment           : String? = null,
  @SerializedName("status"             ) var status            : String? = null

)