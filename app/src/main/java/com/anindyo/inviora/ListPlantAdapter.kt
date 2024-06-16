package com.anindyo.inviora

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlantAdapter(private val listPlant: ArrayList<Plant>) : RecyclerView.Adapter<ListPlantAdapter.LIstViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Plant)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LIstViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_plant, parent, false)
        return LIstViewHolder(view)
    }

    override fun onBindViewHolder(holder: LIstViewHolder, position: Int) {
        val plant = listPlant[position]

        Glide.with(holder.itemView.context)
            .load(plant.photo)
            .apply(RequestOptions().override(500,500))
            .into(holder.imgPlant)

        holder.tvName.text = plant.name
        holder.tvNameSci.text = plant.name_sci
        holder.tvDetail.text = plant.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPlant[holder.adapterPosition])

            val movePlantDetail = Intent(holder.itemView.context, PlantDetailActivity::class.java)

            movePlantDetail.putExtra(PlantDetailActivity.EXTRA_NAME, plant.name)
            movePlantDetail.putExtra(PlantDetailActivity.EXTRA_NAME_SCI, plant.name_sci)
            movePlantDetail.putExtra(PlantDetailActivity.EXTRA_ORIGIN, plant.place_origin)
            movePlantDetail.putExtra(PlantDetailActivity.EXTRA_DETAIL, plant.detail)
            movePlantDetail.putExtra(PlantDetailActivity.EXTRA_BIBLIOGRAPHY, plant.bibliography)
            movePlantDetail.putExtra(PlantDetailActivity.EXTRA_IMAGE, plant.photo)

            holder.itemView.context.startActivity(movePlantDetail)
        }
    }

    override fun getItemCount(): Int {
        return listPlant.size
    }

    inner class LIstViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_item_plant_name)
        var tvNameSci : TextView = itemView.findViewById(R.id.tv_item_plant_name_sci)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_plant_detail)
        var imgPlant : ImageView = itemView.findViewById(R.id.img_item_plant_photo)
    }
}