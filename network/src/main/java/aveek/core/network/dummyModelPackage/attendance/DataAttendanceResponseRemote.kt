package aveek.core.network.dummyModelPackage.attendance
import com.google.gson.annotations.SerializedName

/*
Copyright (c) 2022 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


data class DataAttendanceResponseRemote (

	@SerializedName("id") val id : Int,
	@SerializedName("user_id") val user_id : Int,
	@SerializedName("type") val type : String,
	@SerializedName("checkin_location") val checkin_location : String,
	@SerializedName("checkin_latitude") val checkin_latitude : Double,
	@SerializedName("checkin_longitude") val checkin_longitude : Double,
	@SerializedName("checkin_time") val checkin_time : String,
	@SerializedName("checkout_location") val checkout_location : String,
	@SerializedName("checkout_latitude") val checkout_latitude : Double,
	@SerializedName("checkout_longitude") val checkout_longitude : Double,
	@SerializedName("checkout_time") val checkout_time : String,
	@SerializedName("duration") val duration : String,
	@SerializedName("comment") val comment : String,
	@SerializedName("status") val status : String
)