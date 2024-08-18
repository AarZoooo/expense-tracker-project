package com.aarzoo.expensetracker.backend

import com.google.firebase.Timestamp

data class User (
    val name: String,
    val email: String,
    val monthlyLimit: Double
)

data class Category (
    val name: String,
    val color: String
)

data class Transaction (
    val tid: String,
    val recipient: String,
    val amount: Double,
    val dateTime: Timestamp,
    val cName: String
)
