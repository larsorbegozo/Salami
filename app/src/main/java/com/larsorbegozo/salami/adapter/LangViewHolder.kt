package com.larsorbegozo.salami.adapter

import android.util.Log
import android.view.Menu
import android.view.View
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.ViewSampleRvBinding
import com.larsorbegozo.salami.model.Languages
import com.larsorbegozo.salami.view.MainActivity
import com.larsorbegozo.salami.view.MenuFragment
import com.larsorbegozo.salami.view.MenuFragmentDirections

class LangViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ViewSampleRvBinding.bind(view)

    fun render(langModel: Languages){
        binding.tvLangName.text = langModel.langName

        // Load images from internet with Glide
        Glide
            .with(binding.ivCountryFlag.context)
            .load(langModel.countryFlag)
            .error(R.drawable.ic_baseline_error_24)
            .into(binding.ivCountryFlag)

        binding.cardView.setOnClickListener {
            // Randomize a number for access a different hashmap index each time that a language is chosen
            val randomizedNumber: Int = MenuFragment.randomNumber()
            // Navigate to next Fragment passing the LangName.text and randomizedNumber as argument to pass data between them
            val action = MenuFragmentDirections.actionMenuFragmentToWordsFragment(langModel.langID, randomizedNumber, langModel.langName)
            binding.button.findNavController().navigate(action)
        }
    }
}