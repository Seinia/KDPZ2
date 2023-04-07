package com.example.secondlab

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.secondlab.databinding.FragmentSecondBinding


class SecondFragment : Fragment(R.layout.fragment_second) {


    val args: SecondFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentSecondBinding.bind(view)


        binding.btnback.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.tvdesccat2.text = args.foodData.desc2
        binding.tvnamecat2.text = args.foodData.name

        Glide.with(binding.imgcat2.context)
            .load(args.foodData.imageURL)
            .into(binding.imgcat2)


    }


}