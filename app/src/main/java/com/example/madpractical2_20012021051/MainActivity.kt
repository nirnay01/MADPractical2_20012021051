package com.example.madpractical2_20012021051

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate:OnCreate method is called ")
        Toast.makeText(this,"onCreate:OnCreate method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            R.string.id,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart:OnStart method is called ")
        Toast.makeText(this,"onStart:OnStart method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            R.string.id,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart:OnRestart method is called ")
        Toast.makeText(this,"OnRestart:OnRestart method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            R.string.id,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume:onResume method is called ")
        Toast.makeText(this,"onResume:onResume method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            R.string.id,
            Snackbar.LENGTH_SHORT
        ).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy:onDestroy method is called ")
        Toast.makeText(this,"onDestroy:onDestroy method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(
            findViewById(R.id.myCoordinatorLayout),
            R.string.id,
            Snackbar.LENGTH_SHORT
        ).show()
    }

}