package com.example.laserhairremoval.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.laserhairremoval.databinding.FragmentGameBinding

class GameFragment: Fragment() {
    private var _binding: FragmentGameBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGameBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }
}