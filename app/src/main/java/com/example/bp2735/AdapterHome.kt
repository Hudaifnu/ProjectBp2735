package com.example.bp2735

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterHome(private val listBuku:List<BukuModel>)
    : RecyclerView.Adapter<AdapterHome.ViewHolder>() {

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val image:ImageView = itemView.findViewById(R.id.imageViewBuku1)
        val title:textView = itemView.findViewById(R.id.textViewtitle)
        val desc:TextView = itemView.findViewById(R.id.textviewDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHome.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AdapterHome.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}