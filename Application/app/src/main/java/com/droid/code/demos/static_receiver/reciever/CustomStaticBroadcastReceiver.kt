package com.droid.code.demos.static_receiver.reciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast


class CustomStaticBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION == intent.action) {
            Toast.makeText(context, "Connectivity changed", Toast.LENGTH_SHORT).show()
        }
    }

}