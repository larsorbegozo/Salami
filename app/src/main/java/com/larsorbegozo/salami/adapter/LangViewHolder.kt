package com.larsorbegozo.salami.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.larsorbegozo.salami.databinding.ViewSampleRvBinding
import com.larsorbegozo.salami.model.Languages

class LangViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ViewSampleRvBinding.bind(view)

    fun render(langModel: Languages){
        binding.tvLangName.text = langModel.langName
        Glide.with(binding.ivCountryFlag.context).load(langModel.countryFlag).into(binding.ivCountryFlag)
    }
}