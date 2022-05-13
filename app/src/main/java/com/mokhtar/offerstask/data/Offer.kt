package com.mokhtar.offerstask.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Offer(
    var id: String,
    var employeeId: String,
    var employeeName: String,
    var managerId: String,
    var title: String,
    var salary: String,
    var equity: String,
    var bonus: String,
    var benefits: String,
    var rule: String, var team: String, var organization: String
) : Parcelable {}
