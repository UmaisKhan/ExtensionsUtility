package com.example.extensionslibrary

import android.content.Context
import android.widget.Toast

class Toaster {
    
    public fun showToast(c: Context, message: String) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

}