package com.example.secondlab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.secondlab.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    lateinit var binding: FragmentFirstBinding

    lateinit var adapter: AnimalAdapter

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


        adapter = AnimalAdapter { foodData ->
            findNavController().navigate(
                FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                    foodData
                )
            )
        }
        adapter.setNewData(CreateAnimals())
        binding.RV1.adapter = adapter

    }

    fun CreateAnimals(): List<FoodData> {
        return listOf(
            (FoodData(
                "Олів'є",
                "Новорічний смак",
                "1.Картоплю і моркву зварити \"в мундирах\". Зварити яйця.\n" +
                        "\n" +
                        "2. Тим часом ковбасу і огірки нарізати дрібними кубиками.\n" +
                        "\n" +
                        "3. Готові овочі та яйця почистити та також нарізати кубиками.\n" +
                        "\n" +
                        "4. Дрібно нарізати цибулю.\n" +
                        "\n" +
                        "5. Всі інгредієнти змішати, додати горошок і заправити майонезом.\n" +
                        "\n" +
                        "6. Прикрасити зеленню.",
                "https://fayni-recepty.com.ua/wp-content/uploads/2020/08/olivie.jpg"
            )),
            (FoodData(
                "Крабовий салат",
                "Головний на столі",
                "Відварити яйця.\n" +
                        "\n" +
                        "Крабові палички і яйця порізати кубиками, додати кукурудзу, мілко нарізану зелень петрушки.\n" +
                        "\n" +
                        "Перемішати, посолити і заправити майонезом. Перед подачею додати пачку сухариків.",
                "https://img1.russianfood.com/dycontent/images_upl/365/big_364385.jpg"
            )),
            (FoodData(
                "Грецький салат",
                "Смак Європи",
                "У невеликій банці змішайте оливкову олію, лимонний сок, нарізаний часник, сіль, перець і орегано. Закрийте кришкою і гарно потрясіть, щоб все перемішалося." +
                        "\n" + "У велику миску покладіть нарізані невеликими дольками помідори, нарізаний полукругами шматочки огірка, нарізанний тонкими кільцями красну цибулю, нарізанний тонкими полосками зелений перець, нарізану кубиками фету і маслини"
                        + "\n" + "Перед подачею полийте заправкою, акуратно перемішайте и посипте зверху свіжемолотим чорним перцем.",
                "https://fayni-recepty.com.ua/wp-content/uploads/2020/02/hretskyi-salat.jpg"
            )),
        )
    }
}