package com.droid.code.demos.dynamic_receiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droid.code.R
import com.droid.code.databinding.ActivityDynamicRecieverBinding
import com.droid.code.databinding.ActivitySelectionBinding

class DynamicReceiverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDynamicRecieverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDynamicRecieverBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}