package com.droid.code.demos.application_receiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droid.code.databinding.ActivityDynamicRecieverBinding
import com.droid.code.demos.application_receiver.reciever.ApplicationReceiverBroadcastReceiver
import com.droid.code.demos.dynamic_receiver.reciever.CustomDynamicBroadcastReceiver

class ApplicationReceiverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDynamicRecieverBinding

    lateinit var receiver : ApplicationReceiverBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDynamicRecieverBinding.inflate(layoutInflater)
        setContentView(binding.root)
        registerReceiver()
    }

    override fun onDestroy() {
        super.onDestroy()
        unRegisterReceiver()
    }


    private fun registerReceiver() {
        receiver = ApplicationReceiverBroadcastReceiver()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also { registerReceiver(receiver,it) }
    }

    private fun unRegisterReceiver() {
        unregisterReceiver(receiver)
    }

}

/**
 // ---> Sender code to be place in another app - <SENDER>
 val intent = Intent("com.droid.code.ACTION_SEND")
 intent.putExtra("com.droid.code.EXTRA_DATA","sender send data")
 sendBroadcast(intent)
 }
 */