package com.example.kopikenangan.dataclass

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Produk (
    val photo : Int,
    val nama : String,
    val harga : String
):Parcelable
