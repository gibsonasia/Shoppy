package com.truhbelstudios.shoppy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductAdapter(private val products: ArrayList<Product>) : RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ProductAdapter.ViewHolder, position: Int) {
        holder.title.text = products[position].title
        Picasso.get().load(products[position].photoUrl).into(holder.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount() = products.size


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.photo_product)
        val title: TextView = itemView.findViewById(R.id.title_tv)
    }
}
