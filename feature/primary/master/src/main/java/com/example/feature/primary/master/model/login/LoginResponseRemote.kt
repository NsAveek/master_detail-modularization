package com.example.feature.primary.master.model.login


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class LoginResponseRemote (

  @SerializedName("success") @Expose val success : Boolean,
  @SerializedName("message") @Expose val message : String,
  @SerializedName("token") @Expose val token : String,
  @SerializedName("data") @Expose val data : DataLoginResponseRemote

)