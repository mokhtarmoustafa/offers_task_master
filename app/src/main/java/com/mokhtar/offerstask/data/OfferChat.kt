package com.mokhtar.offerstask.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OfferChat(
    var chat_id: String,
    var offer_id: String,
    var messageList: List<OfferMessage>
) :
    Parcelable {
}