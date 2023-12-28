package com.shergill.shergilltoast

import android.content.Context
import android.widget.Toast

object SherGillToast {

    fun sGillToast(context: Context,msg:String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}