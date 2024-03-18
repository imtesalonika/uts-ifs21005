package com.ifs21005.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ifs21005.myrecycleview.R

class IsiFamily : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        val buttonAbout : ImageButton = findViewById(R.id.button_profile)

        buttonAbout.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        val listObjects: ArrayList<MyObjects> = ArrayList()

        val type_one_one = MyObjects(
            R.drawable.family1,
            "Tyrannosauridae",
            "Kelompok ini mencakup dinosaurus raksasa seperti Tyrannosaurus rex, yang merupakan salah satu predator darat terbesar yang pernah hidup.",
            R.string.detail_family1
        )

        val type_two_two = MyObjects(
            R.drawable.family2,
            "Sauropodomorpha",
            "Ini adalah kelompok dinosaurus herbivora besar dengan leher panjang dan ekor yang sering kali juga panjang. Brachiosaurus dan Diplodocus adalah contoh-contoh terkenal.",
            R.string.detail_family2
        )
        // object object planet yang sudah kita buat sebelumnya akan kita masukkan ke dalam list
        // satu per satu pada bagian ini
        listObjects.add(type_one_one)
        listObjects.add(type_two_two)

        val adapter = MyAdapter(listObjects)

        // pada bagian ini kita memasukkan list planet yang ada tadi ke dalam class MyAdapter tadi
        // untuk diolah sehingga dapat menampilkan list item yang ada pada recycleview
        recyclerView.adapter = adapter
    }
}