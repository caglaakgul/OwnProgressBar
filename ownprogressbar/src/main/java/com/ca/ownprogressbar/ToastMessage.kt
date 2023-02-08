package com.ca.ownprogressbar

import android.content.Context
import android.widget.Toast

class ToastMessage(context: Context) {
    init {
        Toast.makeText(context, "Hello World!", Toast.LENGTH_LONG).show()
    }
}