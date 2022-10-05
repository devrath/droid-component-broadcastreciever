package com.droid.code.demos.local_broadcast.reciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

const val CUSTOM_ACTION = "custom-action-local-broadcast"

class CustomLocalBroadcastReciever : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent) {
        val data = intent.getStringExtra("message")
        Toast.makeText(context, data, Toast.LENGTH_LONG).show()
    }

}