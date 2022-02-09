package nbl.core.network.dummyModelPackage.attendance_status

import com.google.gson.annotations.SerializedName


data class AttendanceStatusResponseRemote (

    @SerializedName("success" ) var success : Boolean? = null,
    @SerializedName("message" ) var message : String?  = null,
    @SerializedName("data"    ) var data    : AttendanceStatusDataRemote?    = AttendanceStatusDataRemote(),
    @SerializedName("office"  ) var office  : AttendanceStatusOfficeRemote?  = AttendanceStatusOfficeRemote()

)