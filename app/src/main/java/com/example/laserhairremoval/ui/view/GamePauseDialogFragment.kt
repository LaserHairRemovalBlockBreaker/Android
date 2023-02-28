package com.example.laserhairremoval.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.laserhairremoval.R
import com.example.laserhairremoval.databinding.FragmentGamePauseDialogBinding

class GamePauseDialogFragment: DialogFragment() {
    private var _binding: FragmentGamePauseDialogBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGamePauseDialogBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // viewの取得
        val btResume: ImageView = binding.btResume
        val btRestart: ImageView = binding.btRestart
        val btHome: ImageView = binding.btHome

        btResume.setOnClickListener {
            dialog?.dismiss()
        }
        btRestart.setOnClickListener {
            findNavController().navigate(R.id.navigation_game)
            dialog?.dismiss()
        }
        btHome.setOnClickListener {
            findNavController().navigate(R.id.navigation_title)
            dialog?.dismiss()
        }

        return root
    }
}