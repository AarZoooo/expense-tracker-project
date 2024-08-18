package com.aarzoo.expensetracker.backend

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore

class FirebaseManager {

    // Initialize Firebase Auth and Firestore
    private val auth: FirebaseAuth = Firebase.auth
    private val db: FirebaseFirestore = Firebase.firestore

    // New User Registration
    fun addUser(user: User, completion: (Boolean, String?) -> Unit) {
        // Create a new user document in the "users" collection
        db.collection("Users").document(user.uid).set(user)
            .addOnSuccessListener {
                completion(true, null)
            }
            .addOnFailureListener { exception ->
                completion(false, exception.localizedMessage)
            }
    }
}
