package com.larsorbegozo.salami.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.FragmentPhraseBinding

class PhraseFragment : Fragment(R.layout.fragment_phrase) {

    private var _binding: FragmentPhraseBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhraseBinding.inflate(layoutInflater, container, false)

        binding.testTv.text = "it's working"

        return binding.root
    }
}