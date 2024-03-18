package com.ifs21005.dinopedia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ifs21005.myrecycleview.R

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

        // gambar planet yang dari intent di MyAdapter masuk ke sini
        val gambarObject = intent.getIntExtra("gambarObject", 0)

        // nama planet yang dari intent di MyAdapter masuk ke sini
        val namaObject = intent.getStringExtra("namaObject")

        // detail planet yang dari intent di MyAdapter masuk ke sini
        val detailObject = intent.getIntExtra("detailObject", 0)

        // deskripso planet yang dari intent di MyAdapter masuk ke sini
        val deskripsiObject = intent.getStringExtra("deskripsiObject")

        // pada bagian ini kita menyimpan view view yang ada di activity_detail_planet ke dalam
        // variable
        val gambarObjectImageView : ImageView = findViewById(R.id.gambar_object_detail)
        val namaObjectTextView : TextView = findViewById(R.id.nama_object_detail)
        val detailObjectTextView : TextView = findViewById(R.id.detail_planet)

        // pada bagian di bawah ini kita memasukkan data yang dikirimkan dari intent tadi
        // ke dalam view view yang ada pada activity_detail_planet
        findViewById<TextView>(R.id.nama_object_toolbar).text = namaObject
        gambarObjectImageView.setImageResource(gambarObject)
        namaObjectTextView.text = namaObject
        detailObjectTextView.setText(detailObject)

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
            intent.putExtra(Intent.EXTRA_TEXT, "${namaObjectTextView.text}\n\n${detailObjectTextView.text}")
            startActivity(Intent.createChooser(intent, "Bagikan melalui"))
        }
    }

}