package com.larsorbegozo.salami.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.adapter.LanguagesAdapter
import com.larsorbegozo.salami.databinding.FragmentMenuBinding
import com.larsorbegozo.salami.model.LanguagesProvider

class MenuFragment : Fragment(R.layout.fragment_menu) {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        binding.recyclerViewMenu.adapter = LanguagesAdapter(LanguagesProvider.languagesList)
        binding.recyclerViewMenu.layoutManager = LinearLayoutManager(this.context)
    }
}