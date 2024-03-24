package com.ifs21005.dinopedia

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AllDinosaurus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_all_dinosaurus)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listDinosaurus : ArrayList<Dinosaurus> = ArrayList()

        val tyrannosaurusRex = Dinosaurus(
            R.drawable.tyran,
            "Tyrannosaurus Rex",
            resources.getString(R.string.deskripsi_tyrannosaurus_rex),
            resources.getString(R.string.karakteristik_tyrannosaurus_rex),
            resources.getString(R.string.kelompok_tyrannosaurus_rex),
            resources.getString(R.string.habitat_tyrannosaurus_rex),
            resources.getString(R.string.makanan_tyrannosaurus_rex),
            resources.getString(R.string.panjang_tyrannosaurus_rex),
            resources.getString(R.string.tinggi_tyrannosaurus_rex),
            resources.getString(R.string.bobot_tyrannosaurus_rex),
            resources.getString(R.string.kelemahan_tyrannosaurus_rex)
        )

        val velociraptor = Dinosaurus (
            R.drawable.velociraptor,
            "Velociraptor",
            resources.getString(R.string.deskripsi_velociraptor),
            resources.getString(R.string.karakteristik_velociraptor),
            resources.getString(R.string.kelompok_velociraptor),
            resources.getString(R.string.habitat_velociraptor),
            resources.getString(R.string.makanan_velociraptor),
            resources.getString(R.string.panjang_velociraptor),
            resources.getString(R.string.tinggi_velociraptor),
            resources.getString(R.string.bobot_velociraptor),
            resources.getString(R.string.kelemahan_velociraptor)
        )

        val diplodocus = Dinosaurus(
            R.drawable.diplodocus,
            "Diplodocus",
            resources.getString(R.string.deskripsi_diplodocus),
            resources.getString(R.string.karakteristik_diplodocus),
            resources.getString(R.string.kelompok_diplodocus),
            resources.getString(R.string.habitat_diplodocus),
            resources.getString(R.string.makanan_diplodocus),
            resources.getString(R.string.panjang_diplodocus),
            resources.getString(R.string.tinggi_diplodocus),
            resources.getString(R.string.bobot_diplodocus),
            resources.getString(R.string.kelemahan_diplodocus)
        )

        val brachiosaurus = Dinosaurus (
            R.drawable.brachiosaurus,
            "Brachisaurus",
            resources.getString(R.string.deskripsi_brachiosaurus),
            resources.getString(R.string.karakteristik_brachiosaurus),
            resources.getString(R.string.kelompok_brachiosaurus),
            resources.getString(R.string.habitat_brachiosaurus),
            resources.getString(R.string.makanan_brachiosaurus),
            resources.getString(R.string.panjang_brachiosaurus),
            resources.getString(R.string.tinggi_brachiosaurus),
            resources.getString(R.string.bobot_brachiosaurus),
            resources.getString(R.string.kelemahan_brachiosaurus)
        )

        val triceraptos = Dinosaurus(
            R.drawable.triceratops,
            "Triceraptos",
            resources.getString(R.string.deskripsi_triceratops),
            resources.getString(R.string.karakteristik_triceratops),
            resources.getString(R.string.kelompok_triceratops),
            resources.getString(R.string.habitat_triceratops),
            resources.getString(R.string.makanan_triceratops),
            resources.getString(R.string.panjang_triceratops),
            resources.getString(R.string.tinggi_triceratops),
            resources.getString(R.string.bobot_triceratops),
            resources.getString(R.string.kelemahan_triceratops)
        )

        val stegosaurus = Dinosaurus (
            R.drawable.stegosaurus,
            "Stegosaurus",
            resources.getString(R.string.deskripsi_stegosaurus),
            resources.getString(R.string.karakteristik_stegosaurus),
            resources.getString(R.string.kelompok_stegosaurus),
            resources.getString(R.string.habitat_stegosaurus),
            resources.getString(R.string.makanan_stegosaurus),
            resources.getString(R.string.panjang_stegosaurus),
            resources.getString(R.string.tinggi_stegosaurus),
            resources.getString(R.string.bobot_stegosaurus),
            resources.getString(R.string.kelemahan_stegosaurus)
        )

        val chasmosaurus = Dinosaurus(
            R.drawable.chasmosaurus,
            "Chasmosauruus",
            resources.getString(R.string.deskripsi_chasmosaurus),
            resources.getString(R.string.karakteristik_chasmosaurus),
            resources.getString(R.string.kelompok_chasmosaurus),
            resources.getString(R.string.habitat_chasmosaurus),
            resources.getString(R.string.makanan_chasmosaurus),
            resources.getString(R.string.panjang_chasmosaurus),
            resources.getString(R.string.tinggi_chasmosaurus),
            resources.getString(R.string.bobot_chasmosaurus),
            resources.getString(R.string.kelemahan_chasmosaurus)
        )

        val styracosaurus = Dinosaurus (
            R.drawable.styracosaurus,
            "Styracosaurus",
            resources.getString(R.string.deskripsi_styracosaurus),
            resources.getString(R.string.karakteristik_styracosaurus),
            resources.getString(R.string.kelompok_styracosaurus),
            resources.getString(R.string.habitat_styracosaurus),
            resources.getString(R.string.makanan_styracosaurus),
            resources.getString(R.string.panjang_styracosaurus),
            resources.getString(R.string.tinggi_styracosaurus),
            resources.getString(R.string.bobot_styracosaurus),
            resources.getString(R.string.kelemahan_styracosaurus)
        )

        val parasaurolophus = Dinosaurus(
            R.drawable.parasaurolophus,
            "Parasaurolophus",
            resources.getString(R.string.deskripsi_parasaurolophus),
            resources.getString(R.string.karakteristik_parasaurolophus),
            resources.getString(R.string.kelompok_parasaurolophus),
            resources.getString(R.string.habitat_parasaurolophus),
            resources.getString(R.string.makanan_parasaurolophus),
            resources.getString(R.string.panjang_parasaurolophus),
            resources.getString(R.string.tinggi_parasaurolophus),
            resources.getString(R.string.bobot_parasaurolophus),
            resources.getString(R.string.kelemahan_parasaurolophus)
        )

        val  edmontosaurus = Dinosaurus (
            R.drawable.edmontosaurus,
            "Edmontosaurus",
            resources.getString(R.string.deskripsi_edmontosaurus),
            resources.getString(R.string.karakteristik_edmontosaurus),
            resources.getString(R.string.kelompok_edmontosaurus),
            resources.getString(R.string.habitat_edmontosaurus),
            resources.getString(R.string.makanan_edmontosaurus),
            resources.getString(R.string.panjang_edmontosaurus),
            resources.getString(R.string.tinggi_edmontosaurus),
            resources.getString(R.string.bobot_edmontosaurus),
            resources.getString(R.string.kelemahan_edmontosaurus)
        )

        val apatosaurus = Dinosaurus(
            R.drawable.apatosaurus,
            "Apatosaurus",
            resources.getString(R.string.deskripsi_apatosaurus),
            resources.getString(R.string.karakteristik_apatosaurus),
            resources.getString(R.string.kelompok_apatosaurus),
            resources.getString(R.string.habitat_apatosaurus),
            resources.getString(R.string.makanan_apatosaurus),
            resources.getString(R.string.panjang_apatosaurus),
            resources.getString(R.string.tinggi_apatosaurus),
            resources.getString(R.string.bobot_apatosaurus),
            resources.getString(R.string.kelemahan_apatosaurus)
        )

        val  mamenchisaurus = Dinosaurus (
            R.drawable.mamenchisaurus,
            "Mamenchisaurus",
            resources.getString(R.string.deskripsi_mamenchisaurus),
            resources.getString(R.string.karakteristik_mamenchisaurus),
            resources.getString(R.string.kelompok_mamenchisaurus),
            resources.getString(R.string.habitat_mamenchisaurus),
            resources.getString(R.string.makanan_mamenchisaurus),
            resources.getString(R.string.panjang_mamenchisaurus),
            resources.getString(R.string.tinggi_mamenchisaurus),
            resources.getString(R.string.bobot_mamenchisaurus),
            resources.getString(R.string.kelemahan_mamenchisaurus)
        )

        val allosaurus = Dinosaurus(
            R.drawable.allosaurus,
            "Allosaurus",
            resources.getString(R.string.deskripsi_allosaurus),
            resources.getString(R.string.karakteristik_allosaurus),
            resources.getString(R.string.kelompok_allosaurus),
            resources.getString(R.string.habitat_allosaurus),
            resources.getString(R.string.makanan_allosaurus),
            resources.getString(R.string.panjang_allosaurus),
            resources.getString(R.string.tinggi_allosaurus),
            resources.getString(R.string.bobot_allosaurus),
            resources.getString(R.string.kelemahan_allosaurus)
        )

        val  spinosaurus = Dinosaurus (
            R.drawable.spinosaurus,
            "Spinosaurus",
            resources.getString(R.string.deskripsi_spinosaurus),
            resources.getString(R.string.karakteristik_spinosaurus),
            resources.getString(R.string.kelompok_spinosaurus),
            resources.getString(R.string.habitat_spinosaurus),
            resources.getString(R.string.makanan_spinosaurus),
            resources.getString(R.string.panjang_spinosaurus),
            resources.getString(R.string.tinggi_spinosaurus),
            resources.getString(R.string.bobot_spinosaurus),
            resources.getString(R.string.kelemahan_spinosaurus)
        )

        val ankylosaurus= Dinosaurus(
            R.drawable.ankylosaurus,
            "Ankylosaurus",
            resources.getString(R.string.deskripsi_ankylosaurus),
            resources.getString(R.string.karakteristik_ankylosaurus),
            resources.getString(R.string.kelompok_ankylosaurus),
            resources.getString(R.string.habitat_ankylosaurus),
            resources.getString(R.string.makanan_ankylosaurus),
            resources.getString(R.string.panjang_ankylosaurus),
            resources.getString(R.string.tinggi_ankylosaurus),
            resources.getString(R.string.bobot_ankylosaurus),
            resources.getString(R.string.kelemahan_ankylosaurus)
        )

        val  euoplocephalus = Dinosaurus (
            R.drawable.euoplocephalus,
            "Euoplocephalus",
            resources.getString(R.string.deskripsi_euoplocephalus),
            resources.getString(R.string.karakteristik_euoplocephalus),
            resources.getString(R.string.kelompok_euoplocephalus),
            resources.getString(R.string.habitat_euoplocephalus),
            resources.getString(R.string.makanan_euoplocephalus),
            resources.getString(R.string.panjang_euoplocephalus),
            resources.getString(R.string.tinggi_euoplocephalus),
            resources.getString(R.string.bobot_euoplocephalus),
            resources.getString(R.string.kelemahan_euoplocephalus)
        )

        listDinosaurus.add(tyrannosaurusRex)
        listDinosaurus.add(velociraptor)
        listDinosaurus.add(diplodocus)
        listDinosaurus.add(brachiosaurus)
        listDinosaurus.add(triceraptos)
        listDinosaurus.add(stegosaurus)
        listDinosaurus.add(chasmosaurus)
        listDinosaurus.add(styracosaurus)
        listDinosaurus.add(parasaurolophus)
        listDinosaurus.add(edmontosaurus)
        listDinosaurus.add(apatosaurus)
        listDinosaurus.add(mamenchisaurus)
        listDinosaurus.add(allosaurus)
        listDinosaurus.add(spinosaurus)
        listDinosaurus.add(ankylosaurus)
        listDinosaurus.add(euoplocephalus)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview_all_dinosaurus)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        val adapter = DinosaurusItemAdapter(listDinosaurus)
        recyclerView.adapter = adapter

        val tombolBack : ImageView = findViewById(R.id.tombol_back_all_dinosaurus)

        tombolBack.setOnClickListener {
            finish()
        }
    }

}