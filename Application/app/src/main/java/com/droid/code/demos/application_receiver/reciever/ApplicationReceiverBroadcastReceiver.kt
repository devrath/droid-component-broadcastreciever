package com.droid.code.demos.application_receiver.reciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

const val KEY_ACTION = "com.droid.code.ACTION_SEND"
const val KEY_DATA = "com.droid.code.EXTRA_DATA"

class ApplicationReceiverBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent) {
        when(intent?.action){
            KEY_ACTION ->{
                val string = intent.getStringExtra(KEY_DATA)
                Toast.makeText(context,"Data recieved is ${string}", Toast.LENGTH_LONG).show()
            }
        }
    }
}