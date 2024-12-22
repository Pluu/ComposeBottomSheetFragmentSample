package com.pluu.sample.compose.bottomsheetfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.compose.content
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.pluu.sample.compose.bottomsheetfragment.ui.theme.SampleTheme

class ComposeItemListDialogFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = content {
        SampleTheme {
            Greeting((0..100).toList())
        }
    }

    companion object {
        fun newInstance(): ComposeItemListDialogFragment = ComposeItemListDialogFragment()
    }
}

