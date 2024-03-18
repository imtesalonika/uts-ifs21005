package com.ifs21005.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ifs21005.myrecycleview.R

class MainActivity : AppCompatActivity() {
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

        val type_one = MyObjects(
            R.drawable.family1,
            "Theropoda",
            " Kelompok ini mencakup dinosaurus karnivora bipedal yang termasuk Tyrannosaurus rex, Velociraptor, dan juga nenek moyang burung modern. Mereka memiliki gigi runcing dan cakar yang kuat.",
            R.string.detail_family1
        )

        val type_two = MyObjects(
            R.drawable.family2,
            "Sauropodomorpha",
            "Ini adalah kelompok dinosaurus herbivora besar dengan leher panjang dan ekor yang sering kali juga panjang. Brachiosaurus dan Diplodocus adalah contoh-contoh terkenal.",
            R.string.detail_family2
        )
        val type_three= MyObjects(
            R.drawable.family3,
            "Ornithischia",
            "Kelompok ini mencakup dinosaurus herbivora dengan beragam bentuk tubuh dan mulut. Contohnya termasuk Triceratops, Stegosaurus, dan Ankylosaurus.",
            R.string.detail_family3
        )
        val type_four = MyObjects(
            R.drawable.family4,
            "Ceratopsidae",
            " Ini adalah subkelompok Ornithischia yang mencakup dinosaurus herbivora besar dengan tanduk dan kerah di kepala mereka, yang paling terkenal adalah Triceratops.",
            R.string.detail_family4
        )
        val type_five = MyObjects(
            R.drawable.family5,
            "Hadrosauridae",
            "Dikenal juga sebagai dinosaurus bebek, kelompok ini memiliki mulut yang mirip paruh bebek dan sering kali hidup dalam kelompok besar. Contoh terkenalnya adalah Parasaurolophus dan Edmontosaurus.",
            R.string.detail_family5
        )
        val type_six= MyObjects(
            R.drawable.family6,
            "Sauropoda",
            "Kelompok ini mencakup dinosaurus herbivora raksasa dengan leher panjang dan tubuh besar seperti Brachiosaurus dan Apatosaurus.",
            R.string.detail_family6
        )
        val type_seven = MyObjects(
            R.drawable.family7,
            "Carnosauria",
            "Ini adalah subkelompok Theropoda yang mencakup dinosaurus karnivora besar seperti Allosaurus dan Giganotosaurus.",
            R.string.detail_family7
        )
        val type_eight= MyObjects(
            R.drawable.family8,
            "Ceratosauria",
            "Subkelompok Theropoda lainnya, mencakup dinosaurus karnivora seperti Ceratosaurus yang memiliki ciri khas tanduk pada hidungnya.",
            R.string.detail_family8
        )

        // object object planet yang sudah kita buat sebelumnya akan kita masukkan ke dalam list
        // satu per satu pada bagian ini
        listObjects.add(type_one)
        listObjects.add(type_two)
        listObjects.add(type_three)
        listObjects.add(type_four)
        listObjects.add(type_five)
        listObjects.add(type_six)
        listObjects.add(type_seven)
        listObjects.add(type_eight)

        val adapter = MyAdapter(listObjects)

        // pada bagian ini kita memasukkan list planet yang ada tadi ke dalam class MyAdapter tadi
        // untuk diolah sehingga dapat menampilkan list item yang ada pada recycleview
        recyclerView.adapter = adapter
    }
}