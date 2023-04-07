package com.example.secondlab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondlab.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding


    var adapter = AnimalAdapter {
        findNavController().navigate(
            FirstFragmentDirections.actionFirstFragmentToSecondFragment("fdsadasd")
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.RV1.adapter = adapter
        binding.RV1.layoutManager = LinearLayoutManager(context)
        adapter.setNewData(CreateAnimals())


    }

    fun CreateAnimals(): List<Animal> {
        return listOf(
            (Dog(
                "Олів'є",
                "Новорічний смак",
                "https://fayni-recepty.com.ua/wp-content/uploads/2020/08/olivie.jpg"
            )),
            (Dog(
                "Крабовий салат",
                "Головний на столі",
                "https://img1.russianfood.com/dycontent/images_upl/365/big_364385.jpg"
            )),
            (Dog(
                "Грецький салат",
                "Смак Європи",
                "https://fayni-recepty.com.ua/wp-content/uploads/2020/02/hretskyi-salat.jpg"
            )),
        )
    }
}