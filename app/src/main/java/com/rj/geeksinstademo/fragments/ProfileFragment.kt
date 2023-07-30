package com.rj.geeksinstademo.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rj.geeksinstademo.OthersActivity
import com.rj.geeksinstademo.R
import com.rj.geeksinstademo.databinding.FragmentHomeBinding
import com.rj.geeksinstademo.databinding.FragmentProfileBinding
import com.rj.geeksinstademo.databinding.FragmentSearchBinding

class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        binding.options.setOnClickListener(){
            startActivity(Intent(requireActivity(),OthersActivity::class.java))
        }
        return view

    }

}