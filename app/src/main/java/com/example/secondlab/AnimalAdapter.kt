package com.example.secondlab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.secondlab.databinding.ItemAnimalBinding

class AnimalAdapter(val nextFragment: () -> Unit) :
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    private val list = ArrayList<Animal>()


    inner class AnimalViewHolder(val binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindItem(animal: Animal, position: Int) {
            binding.tvnamecat.text = animal.name
            binding.tvdesccat.text = animal.desc
            binding.btncat.setOnClickListener {
                nextFragment()
            }

            Glide.with(binding.imgcat.context)
                .load(animal.imageURL)
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

    fun setNewData(newList: List<Animal>) {
        list.clear()
        list.addAll(newList)
        notifyDataSetChanged()

    }

}

