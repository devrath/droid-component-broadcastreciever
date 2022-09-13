package com.droid.code.demos.static_receiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droid.code.R
import com.droid.code.databinding.ActivitySelectionBinding
import com.droid.code.databinding.ActivityStaticRecieverBinding

class StaticReceiverActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStaticRecieverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStaticRecieverBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}