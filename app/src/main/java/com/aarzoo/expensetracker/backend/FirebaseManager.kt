package com.aarzoo.expensetracker.backend

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirebaseManager {

    // Initialize Firebase Auth and Firestore
    private val auth: FirebaseAuth = Firebase.auth
    private val db: FirebaseFirestore = Firebase.firestore

    // --- User Management ---

    // Check if User already exists with email
    fun checkIfEmailExists(email: String, callback: (Boolean) -> Unit) {
        db.collection("Users")
            .whereEqualTo("uEMAIL", email)
            .get()
            .addOnSuccessListener { document ->
                callback(document.isEmpty.not())
            }
            .addOnFailureListener { exception ->
                Log.w("CheckIfEmailExists", "Error checking email existence", exception)
                callback(false)
            }
    }

    // New User Registration
    fun createUser(user: User, completion: (Boolean, String?) -> Unit) {
        db.collection("Users")
            .add(user)
            .addOnSuccessListener { document ->
                Log.w("AddUser", "User added successfully; ID: ${document.id}")
            }
            .addOnFailureListener { exception ->
                Log.w("AddUser", "Error adding user", exception)
            }
    }

    fun emailVerification(user: User, callback: (Boolean) -> Unit) {

    }
}
