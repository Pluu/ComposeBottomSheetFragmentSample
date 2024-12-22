package com.pluu.sample.compose.bottomsheetfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.pluu.sample.compose.bottomsheetfragment.databinding.FragmentViewItemListDialogListDialogBinding
import com.pluu.sample.compose.bottomsheetfragment.databinding.FragmentViewItemListDialogListDialogItemBinding

class ViewItemListDialogFragment : BottomSheetDialogFragment() {

    private var _binding: FragmentViewItemListDialogListDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewItemListDialogListDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.list.layoutManager = LinearLayoutManager(context)
        binding.list.adapter = ItemAdapter(100)
    }

    private inner class ViewHolder(
        binding: FragmentViewItemListDialogListDialogItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        val text: TextView = binding.text
    }

    private inner class ItemAdapter(
        private val mItemCount: Int
    ) : RecyclerView.Adapter<ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            return ViewHolder(
                FragmentViewItemListDialogListDialogItemBinding.inflate(
                    LayoutInflater.from(
                        parent.context
                    ), parent, false
                )
            )

        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.text.text = position.toString()
        }

        override fun getItemCount(): Int {
            return mItemCount
        }
    }

    companion object {
        fun newInstance(): ViewItemListDialogFragment = ViewItemListDialogFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}