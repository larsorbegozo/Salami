package com.larsorbegozo.salami.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.larsorbegozo.salami.databinding.ViewSampleRvBinding
import com.larsorbegozo.salami.model.Languages

class LangViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ViewSampleRvBinding.bind(view)

    fun render(langModel: Languages){
        binding.tvLangName.text = langModel.langName
    }
}