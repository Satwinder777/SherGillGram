package com.shergill.sgillgram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shergill.sadak.SherGillSadak
import com.shergill.shergilltoast.SherGillToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SherGillToast.sGillToast(this,"Sher gill Library Works")
        Log.e("Satta123", "onCreate: ${SherGillSadak.number}", )
    }
}