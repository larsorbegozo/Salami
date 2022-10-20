package com.larsorbegozo.salami.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.FragmentLearnBinding

class LearnFragment : Fragment(R.layout.fragment_learn) {
    companion object {
        // reference to the argument passed to LearnFragment
        const val LANG = "langname"
    }

    private lateinit var binding: FragmentLearnBinding
    private lateinit var langId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            // Get the argument passed for MenuLangFragment (the LangName.text)
            langId = it.getString(LANG).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLearnBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTest.text = langId
    }
}