package com.mokhtar.offerstask.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OfferMessage(var id: String, var from: String, var data: String) : Parcelable {
}