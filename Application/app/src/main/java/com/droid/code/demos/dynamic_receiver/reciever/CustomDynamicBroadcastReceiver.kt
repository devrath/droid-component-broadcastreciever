package com.droid.code.demos.dynamic_receiver.reciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

const val KEY_AIRPLANE_MODE = "state"

class CustomDynamicBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent) {
        val isTheAirplaneModeEnabled = intent?.getBooleanExtra(KEY_AIRPLANE_MODE,false) ?: return
        if (isTheAirplaneModeEnabled) {
            Toast.makeText(context, "Airplane mode enabled", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Airplane mode disabled", Toast.LENGTH_SHORT).show()
        }
    }
}