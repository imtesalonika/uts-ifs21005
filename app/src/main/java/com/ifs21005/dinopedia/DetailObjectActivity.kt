package com.ifs21005.dinopedia

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailObjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_object)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nama = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("deskripsi")
        val periode = intent.getStringExtra("periodeHidup")
        val karakteristikFisik = intent.getStringExtra("karakteristikFisik")
        val habitatDanLingkungan = intent.getStringExtra("habitatDanLingkungan")
        val perilaku = intent.getStringExtra("perilaku")
        val klasifikasi = intent.getStringExtra("klasifikasi")
        val gambar = intent.getIntExtra("gambarObject", 0)
        val listDinosaurus = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableArrayListExtra("listDinosaurus", Dinosaurus::class.java)
        } else {
            intent.getParcelableArrayListExtra("listDinosaurus")
        }


        val gambarImageView : ImageView = findViewById(R.id.gambar_object_detail)
        val namaFamiliTextView : TextView = findViewById(R.id.nama_famili)
        val isiDeskripsiFamiliTextView : TextView = findViewById(R.id.isi_deskripsi)
        val isiPeriodeHidupTextView : TextView = findViewById(R.id.isi_periode_hidup)
        val isiKarakteristikFisikTextView : TextView = findViewById(R.id.isi_karakteristik_fisik)
        val isiHabitatLingkunganTextView : TextView = findViewById(R.id.isi_habitat_lingkungan)
        val isiPerilakuTextView : TextView = findViewById(R.id.isi_perilaku)
        val isiKlasifikasiTextView : TextView = findViewById(R.id.isi_klasifikasi)

        findViewById<TextView>(R.id.nama_object_toolbar).text = nama
        gambarImageView.setImageResource(gambar)
        namaFamiliTextView.text = nama
        isiDeskripsiFamiliTextView.text =deskripsi
        isiPerilakuTextView.text = perilaku
        isiPeriodeHidupTextView.text = periode
        isiKarakteristikFisikTextView.text = karakteristikFisik
        isiHabitatLingkunganTextView.text = habitatDanLingkungan
        isiKlasifikasiTextView.text = klasifikasi


        // mendefenisikan tombol back dan tombol share dari view yang ada pada activity_detail_planet
        val tombolBack : ImageView = findViewById(R.id.tombol_back_about)
        val tombolShare : ImageView = findViewById(R.id.tombol_share)

        // ketika tombol back ditekan, maka tampilan detail activity akan berakher dan kembali
        // ke main activity
        tombolBack.setOnClickListener {
            finish()
        }

        // disini kita mengimplementasikan tombol share yang ada pada activity_detail_planet
        tombolShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
//            intent.putExtra(Intent.EXTRA_TEXT, "${namaObjectTextView.text}\n\n${deskripsiObject}")
            intent.putExtra(Intent.EXTRA_TEXT, "${nama}\n\n${deskripsi}")
            startActivity(Intent.createChooser(intent, "Bagikan melalui"))
        }

        val recyclerView: RecyclerView = findViewById(R.id.dinosaurus_recycleview)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        val adapter = listDinosaurus?.let { DinosaurusItemAdapter(it) }

        recyclerView.adapter = adapter
        val tombolSeeMore : Button = findViewById(R.id.tombol_see_more)
        tombolSeeMore.setOnClickListener{
            val intent = Intent(this, AllDinosaurus::class.java)
            startActivity(intent)
        }
    }

}