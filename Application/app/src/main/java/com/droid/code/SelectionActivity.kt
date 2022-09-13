package com.droid.code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.droid.code.databinding.ActivitySelectionBinding
import com.droid.code.demos.dynamic_receiver.DynamicReceiverActivity
import com.droid.code.demos.static_receiver.StaticReceiverActivity
import com.droid.code.utils.openActivity

class SelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnStaticReceiverId.setOnClickListener {
                openActivity(StaticReceiverActivity::class.java)
            }
            btnDynamicReceiverId.setOnClickListener {
                openActivity(DynamicReceiverActivity::class.java)
            }
        }
    }

}