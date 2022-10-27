package com.larsorbegozo.salami.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.larsorbegozo.salami.R
import com.larsorbegozo.salami.adapter.LanguagesAdapter
import com.larsorbegozo.salami.databinding.FragmentMenuBinding
import com.larsorbegozo.salami.model.LanguagesProvider

class MenuFragment : Fragment(R.layout.fragment_menu) {

    companion object{
        fun randomNumber(): Int {
            //TODO: Remove hardcoded "2" for size of hashmap
            return (0..2).random()
        }
    }

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initRecyclerView()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initRecyclerView() {
        binding.recyclerViewMenu.layoutManager = LinearLayoutManager(this.context)
        binding.recyclerViewMenu.adapter = LanguagesAdapter(LanguagesProvider.languagesList)
    }
}