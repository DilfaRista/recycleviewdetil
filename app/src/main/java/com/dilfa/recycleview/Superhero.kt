package com.dilfa.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import kotlinx.parcelize.Parceler

@Parcelize
data class Superhero(

    val imageSuperhero: Int,
    val nameSuperhero: String,
    val descSuperhero: String,

): Parcelable
