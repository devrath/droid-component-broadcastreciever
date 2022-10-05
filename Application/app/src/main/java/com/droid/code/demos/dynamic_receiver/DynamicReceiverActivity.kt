package com.droid.code.demos.dynamic_receiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droid.code.databinding.ActivityDynamicRecieverBinding
import com.droid.code.demos.dynamic_receiver.reciever.CustomDynamicBroadcastReceiver

class DynamicReceiverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDynamicRecieverBinding

    lateinit var receiver : CustomDynamicBroadcastReceiver

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
        receiver = CustomDynamicBroadcastReceiver()
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also { registerReceiver(receiver,it) }
    }

    private fun unRegisterReceiver() {
        unregisterReceiver(receiver)
    }

}