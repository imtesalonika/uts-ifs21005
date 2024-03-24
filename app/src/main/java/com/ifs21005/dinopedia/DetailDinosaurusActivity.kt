package com.ifs21005.dinopedia

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailDinosaurusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_dinosaurus)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val gambarDinosaurus : Int = intent.getIntExtra("gambarDinosaurus", 0)
        val namaDinosaurus : String? = intent.getStringExtra("namaDinosaurus")
        val deskripsiDinosaurus : String? = intent.getStringExtra("deskripsiDinosaurus")
        val karakteristikDinosaurus :String? = intent.getStringExtra("karakteristikDinosaurus")
        val kelompokDinosaurus : String? = intent.getStringExtra("kelompokDinosaurus")
        val habitatDinosaurus : String? = intent.getStringExtra("habitatDinosaurus")
        val makananDinosaurus : String? = intent.getStringExtra("makananDinosaurus")
        val panjangDinosaurus : String? = intent.getStringExtra("panjangDinosaurus")
        val tinggiDinosaurus : String? = intent.getStringExtra("tinggiDinosaurus")
        val bobotDinosaurus : String? = intent.getStringExtra("bobotDinosaurus")
        val kelemahanDinosaurus : String? = intent.getStringExtra("kelemahanDinosaurus")

        val gambarDinosaurusImageView : ImageView = findViewById(R.id.gambar_dinosaurus)
        val namaDinosaururTextView : TextView = findViewById(R.id.nama_dinosaurus)
        val deskripsiDinosaurusTextView : TextView = findViewById(R.id.isi_deskripsi_dinosaurus)
        val karakteristikDinosaurusTextView : TextView = findViewById(R.id.isi_karakteristik)
        val kelompokDinosaurusTextView : TextView = findViewById(R.id.isi_kelompok_dinosaurus)
        val habitatDinosaurusTextView : TextView = findViewById(R.id.isi_habitat_dinosaurus)
        val makananDinosaurusTextView : TextView = findViewById(R.id.isi_makanan_dinosaurus)
        val panjangDinosaurusTextView : TextView = findViewById(R.id.isi_panjang_dinosaurus)
        val tinggiDinosaurusTextView : TextView = findViewById(R.id.isi_tinggi_dinosaurus)
        val bobotDinosaurusTextView : TextView = findViewById(R.id.isi_bobot_dinosaurus)
        val kelemahanDinosaurusTextView : TextView = findViewById(R.id.isi_kelemahan_dinosaurus)
        val namaDinosaurusToolbarTextView : TextView = findViewById(R.id.nama_dinosaurus_toolbar)
        val tombolBack : ImageView = findViewById(R.id.tombol_back_about)

        gambarDinosaurusImageView.setImageResource(gambarDinosaurus)
        namaDinosaururTextView.text = namaDinosaurus
        deskripsiDinosaurusTextView.text = deskripsiDinosaurus
        karakteristikDinosaurusTextView.text = karakteristikDinosaurus
        kelompokDinosaurusTextView.text = kelompokDinosaurus
        habitatDinosaurusTextView.text = habitatDinosaurus
        makananDinosaurusTextView.text = makananDinosaurus
        panjangDinosaurusTextView.text = panjangDinosaurus
        tinggiDinosaurusTextView.text = tinggiDinosaurus
        bobotDinosaurusTextView.text = bobotDinosaurus
        kelemahanDinosaurusTextView.text = kelemahanDinosaurus
        namaDinosaurusToolbarTextView.text = namaDinosaurus

        val tombolShare : ImageView = findViewById(R.id.tombol_share)
        tombolShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "${namaDinosaurus}\n\n${deskripsiDinosaurus}")
            startActivity(Intent.createChooser(intent, "Bagikan melalui"))
        }

        tombolBack.setOnClickListener {
            finish()
        }
    }
}
