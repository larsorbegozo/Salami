package com.larsorbegozo.salami.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.FragmentSentenceBinding
import com.larsorbegozo.salami.model.SentencesProvider

class SentenceFragment : Fragment(R.layout.fragment_sentence) {

    private var _binding: FragmentSentenceBinding? = null
    private val binding get() = _binding!!

    private lateinit var langID: String
    private var position: Int = 0
    private lateinit var langName: String

    private var isSecondImage = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            langID = it.getString(WordsFragment.LANGID).toString()
            position = it.getInt(WordsFragment.POSITION)
            langName = it.getString(WordsFragment.LANGNAME).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSentenceBinding.inflate(layoutInflater, container, false)

        // Upload first image to guess
        Glide
            .with(binding.image.context)
            .load(SentencesProvider.sentenceProvider(langName, position).Image1)
            .error(R.drawable.ic_baseline_error_24)
            .into(binding.image)

        binding.button.setOnClickListener {
            if (SentencesProvider.sentenceProvider(langName, position).wordLang1
                    .equals(binding.textInputEditText.text.toString(), true)
                && !isSecondImage) {
                Toast.makeText(context, "CORRECTO", Toast.LENGTH_SHORT).show()
                // Upload second image to guess
                Glide
                    .with(binding.image.context)
                    .load(SentencesProvider.sentenceProvider(langName, position).Image2)
                    .error(R.drawable.ic_baseline_error_24)
                    .into(binding.image)
                // Change state into "SecondImage"
                isSecondImage = !isSecondImage
                // Leave in blank the text field
                binding.textInputEditText.text = null
            }
            else if (SentencesProvider.sentenceProvider(langName, position).wordLang2
                    .equals(binding.textInputEditText.text.toString(), true)
                && isSecondImage) {
                Toast.makeText(context, "GANASTE", Toast.LENGTH_LONG).show()
                binding.textInputEditText.text = null
            }
            else {
                Toast.makeText(context, "INCORRECTO", Toast.LENGTH_SHORT).show()
                binding.textInputEditText.text = null
            }
        }
        return binding.root
    }
}