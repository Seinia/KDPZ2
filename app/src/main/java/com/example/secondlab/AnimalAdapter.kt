package com.example.secondlab

import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.secondlab.databinding.ItemAnimalBinding

class AnimalAdapter(val onClick: (model: FoodData) -> Unit) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    val list = ArrayList<FoodData>()


    inner class AnimalViewHolder(val binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(foodData: FoodData, position: Int) {

            val d1 = Html.fromHtml(foodData.desc, Html.FROM_HTML_MODE_COMPACT)
            binding.tvdesccat.text = d1
            binding.tvnamecat.text = foodData.name
            binding.btncat.setOnClickListener {
                onClick(foodData)
            }



            Glide.with(binding.imgcat.context)
                .load(foodData.imageURL)
                .centerInside()
                .into(binding.imgcat)


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val view = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(view)
    }


    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {

        holder.bindItem(list[position], position)

    }


    override fun getItemCount(): Int {
        return list.size
    }

    fun setNewData(newList: List<FoodData>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()

    }

}
