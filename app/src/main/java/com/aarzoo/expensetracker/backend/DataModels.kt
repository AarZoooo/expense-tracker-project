package com.aarzoo.expensetracker.backend

import com.google.firebase.Timestamp

data class User (
    val uNAME: String,
    val uEMAIL: String,
    val uMONTHLIMIT: Double
)

data class Category (
    val cNAME: String,
    val cCOLOR: String
)

data class Transaction (
    val tRECIPIENT: String,
    val tAMOUNT: Double,
    val tDATETIME: Timestamp,
    val cName: String
)
