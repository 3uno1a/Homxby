package com.example.smarthome.ui.smartCam.data


import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")   // http://192.168.35.245:8000/api/imgfile
    val previous: String,
    @SerializedName("results")   // 이미지 파일들
    val results: List<Result>
)

