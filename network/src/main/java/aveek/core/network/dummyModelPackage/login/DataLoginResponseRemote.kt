package aveek.core.network.dummyModelPackage.login

import com.google.gson.annotations.SerializedName


data class DataLoginResponseRemote (

  @SerializedName("id") val id : Int,
  @SerializedName("name") val name : String,
  @SerializedName("mobile") val mobile : Int,
  @SerializedName("department_id") val department_id : Int,
  @SerializedName("designation_id") val designation_id : Int,
  @SerializedName("timezone_id") val timezone_id : Int,
  @SerializedName("image") val image : String,
  @SerializedName("image_url") val image_url : String,
  @SerializedName("email") val email : String,
  @SerializedName("email_verified_at") val email_verified_at : String,
  @SerializedName("type") val type : String,
  @SerializedName("role_departments") val role_departments : String,
  @SerializedName("role_designations") val role_designations : String,
  @SerializedName("status") val status : String,
  @SerializedName("created_at") val created_at : String,
  @SerializedName("updated_at") val updated_at : String

)