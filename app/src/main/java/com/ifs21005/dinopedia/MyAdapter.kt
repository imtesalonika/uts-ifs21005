package com.ifs21005.dinopedia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ifs21005.myrecycleview.R

class MyAdapter (val listObject : ArrayList<MyObjects>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> () {
    inner class MyViewHolder (objectView : View) : RecyclerView.ViewHolder(objectView),
        View.OnClickListener {
        var gambarObjects : ImageView
        var namaObjects : TextView
        var deskripsiObjects : TextView

        init {
            gambarObjects = objectView.findViewById(R.id.imageView)
            namaObjects = objectView.findViewById(R.id.nama_objects)
            deskripsiObjects = objectView.findViewById(R.id.deskripsi)
            objectView.setOnClickListener (this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val intent = Intent(v!!.context, DetailObjectActivity::class.java).apply {
                putExtra("gambarObject", listObject[position].gambarObject)
                putExtra("namaObject", listObject[position].namaObject)
                putExtra("deskripsiObject", listObject[position].deskripsiObject)
                putExtra("detailObject", listObject[position].detailObject)
            }
            v.context.startActivity(intent)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.object_item, parent, false)

        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listObject.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namaObjects.setText(listObject[position].namaObject)
        holder.deskripsiObjects.setText(listObject[position].deskripsiObject)
        holder.gambarObjects.setImageResource(listObject[position].gambarObject)
    }
}
