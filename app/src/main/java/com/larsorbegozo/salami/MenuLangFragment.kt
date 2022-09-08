package com.larsorbegozo.salami

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.larsorbegozo.salami.adapter.LanguagesAdapter
import com.larsorbegozo.salami.databinding.FragmentMenuLangBinding
import com.larsorbegozo.salami.model.LanguagesProvider

private lateinit var binding: FragmentMenuLangBinding

class MenuLangFragment : Fragment(R.layout.fragment_menu_lang) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMenuLangBinding.inflate(layoutInflater, container, false)
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        binding.recyclerViewMenu.adapter = LanguagesAdapter(LanguagesProvider.languagesList)
        binding.recyclerViewMenu.layoutManager = LinearLayoutManager(this.context)
    }
}