package com.ifs21005.dinopedia

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DinosaurusItemAdapter (val listObject : ArrayList<Dinosaurus>) : RecyclerView.Adapter<DinosaurusItemAdapter.MyDinosaurusViewHolder> () {
    inner class MyDinosaurusViewHolder (dinosaurusView : View) : RecyclerView.ViewHolder(dinosaurusView),
        View.OnClickListener {
        val gambarDinosaurus : ImageView
        val namaDinosaurus : TextView
        val deskripsiDinosaurus : TextView

        init {
            gambarDinosaurus = dinosaurusView.findViewById(R.id.gambar_dinosaurus_item)
            namaDinosaurus = dinosaurusView.findViewById(R.id.nama_dinosaurus_item)
            deskripsiDinosaurus = dinosaurusView.findViewById(R.id.deskripsi_dinosaurus_item)
            dinosaurusView.setOnClickListener (this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val intent = Intent(v!!.context, DetailDinosaurusActivity::class.java).apply {
                putExtra("gambarDinosaurus", listObject[position].gambarDinosaurus)
                putExtra("namaDinosaurus", listObject[position].namaDinosaurus)
                putExtra("deskripsiDinosaurus", listObject[position].deskripsiDinosaurus)
                putExtra("karakteristikDinosaurus", listObject[position].karakteristikDinosaurus)
                putExtra("kelompokDinosaurus", listObject[position].kelompokDinosaurus)
                putExtra("habitatDinosaurus", listObject[position].habitatDinosaurus)
                putExtra("makananDinosaurus", listObject[position].makananDinosaurus)
                putExtra("panjangDinosaurus", listObject[position].panjangDinosaurus)
                putExtra("tinggiDinosaurus", listObject[position].tinggiDinosaurus)
                putExtra("bobotDinosaurus", listObject[position].bobotDinosaurus)
                putExtra("kelemahanDinosaurus", listObject[position].kelemahanDinosaurus)
            }
            v.context.startActivity(intent)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDinosaurusViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_dinosaurus, parent, false)

        return MyDinosaurusViewHolder(v)
    }

    override fun getItemCount(): Int {
        return listObject.size
    }

    override fun onBindViewHolder(holder: MyDinosaurusViewHolder, position: Int) {
        holder.namaDinosaurus.text = listObject[position].namaDinosaurus
        holder.deskripsiDinosaurus.text = listObject[position].deskripsiDinosaurus
        holder.gambarDinosaurus.setImageResource(listObject[position].gambarDinosaurus)
    }
}
