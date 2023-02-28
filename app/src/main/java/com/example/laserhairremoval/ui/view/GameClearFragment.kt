package com.example.laserhairremoval.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.laserhairremoval.databinding.FragmentGameBinding
import com.example.laserhairremoval.databinding.FragmentGameClearBinding

class GameClearFragment: Fragment() {
    private var _binding: FragmentGameClearBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameClearBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }
}