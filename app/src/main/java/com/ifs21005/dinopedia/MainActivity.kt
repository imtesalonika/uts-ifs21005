package com.ifs21005.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        val listDinosaurusTheropoda : ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusTheropoda.add(tyrannosaurusRex)
        listDinosaurusTheropoda.add (velociraptor)

        val theropoda = MyObjects(
            R.drawable.family1,
            "Theropoda",
            resources.getString(R.string.deskripsi_theropoda),
            resources.getString(R.string.periode_hidup_theropoda),
            resources.getString(R.string.karakteristik_fisik_theropoda),
            resources.getString(R.string.habitat_dan_lingkungan_theropoda),
            resources.getString(R.string.perilaku_theropoda),
            resources.getString(R.string.klasifikasi_theropoda),
            listDinosaurusTheropoda
        )

        val listDinosaurusSauropodomorpha : ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusSauropodomorpha.add(diplodocus)
        listDinosaurusSauropodomorpha.add(brachiosaurus)

        val sauropodomorpha = MyObjects(
            R.drawable.family2,
            "Sauropodomorpha",
            resources.getString(R.string.deskripsi_sauropodomorpha),
            resources.getString(R.string.periode_hidup_sauropodomorpha),
            resources.getString(R.string.karakteristik_fisik_sauropodomorpha),
            resources.getString(R.string.habitat_dan_lingkungan_sauropodomorpha),
            resources.getString(R.string.perilaku_sauropodomorpha),
            resources.getString(R.string.klasifikasi_sauropodomorpha),
            listDinosaurusSauropodomorpha
        )

        val listDinosaurusOrnithischia: ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusOrnithischia.add(triceraptos)
        listDinosaurusOrnithischia.add(stegosaurus)

        val ornithischia = MyObjects(
            R.drawable.family3,
            "Ornithischia",
            resources.getString(R.string.deskripsi_ornithischia),
            resources.getString(R.string.periode_hidup_ornithischia),
            resources.getString(R.string.karakteristik_fisik_ornithischia),
            resources.getString(R.string.habitat_dan_lingkungan_ornithischia),
            resources.getString(R.string.perilaku_ornithischia),
            resources.getString(R.string.klasifikasi_ornithischia),
            listDinosaurusOrnithischia
        )

        val listDinosaurusCeratopsidae: ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusCeratopsidae.add(chasmosaurus)
        listDinosaurusCeratopsidae.add(styracosaurus)

        val ceratopsidae = MyObjects(
            R.drawable.family4,
            "Ceratopsidae",
            resources.getString(R.string.deskripsi_ceratopsidae),
            resources.getString(R.string.periode_hidup_ceratopsidae),
            resources.getString(R.string.karakteristik_fisik_ceratopsidae),
            resources.getString(R.string.habitat_dan_lingkungan_ceratopsidae),
            resources.getString(R.string.perilaku_ceratopsidae),
            resources.getString(R.string.klasifikasi_ceratopsidae),
            listDinosaurusCeratopsidae
        )

        val listDinosaurusHadrosauridae: ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusHadrosauridae.add(parasaurolophus)
        listDinosaurusHadrosauridae.add(edmontosaurus)

        val  hadrosauridae = MyObjects(
            R.drawable.family5,
            "Hadrosauridae",
            resources.getString(R.string.deskripsi_hadrosauridae),
            resources.getString(R.string.periode_hidup_hadrosauridae),
            resources.getString(R.string.karakteristik_fisik_hadrosauridae),
            resources.getString(R.string.habitat_dan_lingkungan_hadrosauridae),
            resources.getString(R.string.perilaku_hadrosauridae),
            resources.getString(R.string.klasifikasi_hadrosauridae),
            listDinosaurusHadrosauridae
        )

        val listDinosaurusSauropoda: ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusSauropoda.add(apatosaurus)
        listDinosaurusSauropoda.add(mamenchisaurus)

        val sauropoda = MyObjects(
            R.drawable.family6,
            "Sauropoda",
            resources.getString(R.string.deskripsi_sauropoda),
            resources.getString(R.string.periode_hidup_sauropoda),
            resources.getString(R.string.karakteristik_fisik_sauropoda),
            resources.getString(R.string.habitat_dan_lingkungan_sauropoda),
            resources.getString(R.string.perilaku_sauropoda),
            resources.getString(R.string.klasifikasi_sauropoda),
            listDinosaurusSauropoda
        )

        val listDinosaurusCarnosauria: ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusCarnosauria.add(allosaurus)
        listDinosaurusCarnosauria.add(spinosaurus)

        val listDinosaurusAnkylosauria: ArrayList<Dinosaurus> = ArrayList()

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

        listDinosaurusAnkylosauria.add(ankylosaurus)
        listDinosaurusAnkylosauria.add(euoplocephalus)

        val carnosauria = MyObjects(
            R.drawable.family7,
            "Carnosauria",
            resources.getString(R.string.deskripsi_carnosauria),
            resources.getString(R.string.periode_hidup_carnosauria),
            resources.getString(R.string.karakteristik_fisik_carnosauria),
            resources.getString(R.string.habitat_dan_lingkungan_carnosauria),
            resources.getString(R.string.perilaku_carnosauria),
            resources.getString(R.string.klasifikasi_carnosauria),
            listDinosaurusCarnosauria
        )

        val ankylosauria= MyObjects(
            R.drawable.family8,
            "Ankylosauria",
            resources.getString(R.string.deskripsi_ankylosauria),
            resources.getString(R.string.periode_hidup_ankylosauria),
            resources.getString(R.string.karakteristik_fisik_ankylosauria),
            resources.getString(R.string.habitat_dan_lingkungan_ankylosauria),
            resources.getString(R.string.perilaku_ankylosauria),
            resources.getString(R.string.klasifikasi_ankylosauria),
            listDinosaurusAnkylosauria

        )

        listObjects.add(theropoda)
        listObjects.add(sauropodomorpha)
        listObjects.add(ornithischia)
        listObjects.add(ceratopsidae)
        listObjects.add(hadrosauridae)
        listObjects.add(sauropoda)
        listObjects.add(carnosauria)
        listObjects.add(ankylosauria)

        val adapter = MyAdapter(listObjects)

        recyclerView.adapter = adapter
    }
}