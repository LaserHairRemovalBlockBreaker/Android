package com.example.laserhairremoval.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.laserhairremoval.R
import com.example.laserhairremoval.databinding.FragmentGameOverBinding
import com.example.laserhairremoval.databinding.FragmentTitleBinding

class TitleFragment: Fragment() {
    private var _binding: FragmentTitleBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTitleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // viewの取得
        val btStart: ImageView = binding.btStart

        btStart.setOnClickListener {
            findNavController().navigate(R.id.navigation_game)
        }

        return root
    }
}