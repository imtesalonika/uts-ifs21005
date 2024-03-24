package com.ifs21005.dinopedia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val listObject : ArrayList<MyObjects>) : RecyclerView.Adapter<MyAdapter.MyViewHolder> () {
    inner class MyViewHolder (objectView : View) : RecyclerView.ViewHolder(objectView),
        View.OnClickListener {
        val gambarObjectsView : ImageView
        val namaObjectsView : TextView
        val deskripsiObjectsView : TextView

        init {
            gambarObjectsView = objectView.findViewById(R.id.gambar_item_object)
            namaObjectsView = objectView.findViewById(R.id.nama_objects)
            deskripsiObjectsView = objectView.findViewById(R.id.deskripsi)
            objectView.setOnClickListener (this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val intent = Intent(v!!.context, DetailObjectActivity::class.java).apply {
                putExtra("nama", listObject[position].namaObjects)
                putExtra("deskripsi", listObject[position].deskripsiObjects)
                putExtra("periodeHidup", listObject[position].periodeHidupObjects)
                putExtra("karakteristikFisik", listObject[position].karakteristikObjects)
                putExtra("habitatDanLingkungan", listObject[position].habitatDanLingkunganObjects)
                putExtra("perilaku", listObject[position].perilakuObjects)
                putExtra("klasifikasi", listObject[position].klasifikasiObjects)
                putExtra("gambarObject", listObject[position].gambarObjects)
                putParcelableArrayListExtra("listDinosaurus", listObject[position].listDinosaurus)
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
        holder.namaObjectsView.text = listObject[position].namaObjects
        holder.deskripsiObjectsView.text = listObject[position].deskripsiObjects
        holder.gambarObjectsView.setImageResource(listObject[position].gambarObjects)
    }
}
