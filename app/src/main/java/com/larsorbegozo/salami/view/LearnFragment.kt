package com.larsorbegozo.salami.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.FragmentLearnBinding
import com.larsorbegozo.salami.model.SentencesProvider

class LearnFragment : Fragment(R.layout.fragment_learn) {
    companion object {
        // reference to the argument passed to LearnFragment
        const val LANGID = "langID"
    }

    private var _binding: FragmentLearnBinding? = null
    private val binding get() = _binding!!
    private lateinit var langId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            // Get the argument passed for MenuLangFragment (the LangName.text)
            langId = it.getInt(LANGID).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLearnBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chooseLanguage(langId.toInt())

        //binding.tvTest.text = langId
    }

    private fun chooseLanguage(x: Int) {
        binding.wordEng.text = SentencesProvider.sentencesList[x].wordLang1.toString()
        binding.wordSpa.text = SentencesProvider.sentencesList[x].wordSpa1.toString()
    }
}