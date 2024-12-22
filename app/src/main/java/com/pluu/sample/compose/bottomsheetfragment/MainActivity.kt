package com.pluu.sample.compose.bottomsheetfragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity
import com.pluu.sample.compose.bottomsheetfragment.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnViewType.setOnClickListener {
            ViewItemListDialogFragment.newInstance()
                .show(supportFragmentManager, "viewDialog")
        }

        binding.btnComposeType.setOnClickListener {
            ComposeItemListDialogFragment.newInstance()
                .show(supportFragmentManager, "composeDialog")
        }
    }
}