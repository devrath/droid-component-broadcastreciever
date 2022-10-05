package com.droid.code.demos.local_broadcast

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.droid.code.databinding.ActivityLocalBroadcastBinding
import com.droid.code.demos.local_broadcast.reciever.CUSTOM_ACTION
import com.droid.code.demos.local_broadcast.reciever.CustomLocalBroadcastReceiver


class LocalBroadcastActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLocalBroadcastBinding

    private var receiver : CustomLocalBroadcastReceiver = CustomLocalBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocalBroadcastBinding.inflate(layoutInflater)
        setContentView(binding.root)
        registerReciever()
        binding.btnTriggerId.setOnClickListener {
            val customIntent = Intent(CUSTOM_ACTION).putExtra("message", "CUSTOM-VALUE")
            val localBroadcastManager = LocalBroadcastManager.getInstance(this@LocalBroadcastActivity)
            localBroadcastManager.sendBroadcast(customIntent);
        }
    }

    private fun registerReciever() {
        val localBroadcastManager = LocalBroadcastManager.getInstance(this@LocalBroadcastActivity)
        localBroadcastManager.registerReceiver(receiver, IntentFilter(CUSTOM_ACTION))
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReciever()
    }

    private fun unregisterReciever() {
        val localBroadcastManager = LocalBroadcastManager.getInstance(this@LocalBroadcastActivity)
        localBroadcastManager.unregisterReceiver(receiver)
    }
}