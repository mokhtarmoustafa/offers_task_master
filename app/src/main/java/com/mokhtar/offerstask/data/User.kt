package com.mokhtar.offerstask.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(
    var id: String,
    var name: String,
    var type: String
) : Parcelable {
}
