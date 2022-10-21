package com.larsorbegozo.salami.adapter

import android.view.View
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.larsorbegozo.salami.view.MenuLangFragmentDirections
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.databinding.ViewSampleRvBinding
import com.larsorbegozo.salami.model.Languages

class LangViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ViewSampleRvBinding.bind(view)

    fun render(langModel: Languages){
        binding.tvLangName.text = langModel.langName
        // Load internet images with Glide
        Glide.with(binding.ivCountryFlag.context).load(langModel.countryFlag).error(R.drawable.ic_launcher_foreground).into(binding.ivCountryFlag)
        binding.cardView.setOnClickListener {
            // Navigate to next Fragment passing the LangName.text as argument to pass data between them
            val action = MenuLangFragmentDirections.actionMenuLangFragmentToLearnFragment(langModel.langID.toInt())
            binding.button.findNavController().navigate(action)
        }
    }
}