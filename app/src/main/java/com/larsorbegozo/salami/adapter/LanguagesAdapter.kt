package com.larsorbegozo.salami.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.liveData
import androidx.recyclerview.widget.RecyclerView
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.model.Languages

class LanguagesAdapter(private val langList: List<Languages>) : RecyclerView.Adapter<LangViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LangViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LangViewHolder(layoutInflater.inflate(R.layout.view_sample_rv, parent, false))
    }

    override fun onBindViewHolder(holder: LangViewHolder, position: Int) {
        val item = langList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return langList.size
    }
}