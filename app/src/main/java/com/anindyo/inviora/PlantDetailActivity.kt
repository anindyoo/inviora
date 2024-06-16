package com.anindyo.inviora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class PlantDetailActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_NAME_SCI = "extra_name_sci"
        const val EXTRA_ORIGIN = "extra_origin"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_BIBLIOGRAPHY = "extra_bibliography"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_detail)

        // buat back
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val tvNameReceiver : TextView = findViewById(R.id.tv_name_received)
        val tvNameSciReceiver : TextView = findViewById(R.id.tv_name_sci_received)
        val tvOriginReceiver : TextView = findViewById(R.id.tv_received_origin)
        val tvDetailReceiver : TextView = findViewById(R.id.tv_received_detail)
        val tvBibliographyReceiver : TextView = findViewById(R.id.tv_received_bibliography)
        val imgReceiver : ImageView = findViewById(R.id.image_received)

        tvNameReceiver.text = intent.getStringExtra(EXTRA_NAME)
        tvNameSciReceiver.text = intent.getStringExtra(EXTRA_NAME_SCI)
        tvOriginReceiver.text = intent.getStringExtra(EXTRA_ORIGIN)
        tvDetailReceiver.text = intent.getStringExtra(EXTRA_DETAIL)
        tvBibliographyReceiver.text = intent.getStringExtra(EXTRA_BIBLIOGRAPHY)

        val imgPlant : Int = intent.getIntExtra(EXTRA_IMAGE, 0)

        Glide.with(this)
            .load(imgPlant)
            .apply(RequestOptions().override(DEFAULT_BUFFER_SIZE))
            .into(imgReceiver)

        val btnShare : Button = findViewById(R.id.btn_set_share)
        btnShare.setOnClickListener(this)

        val btnFav : Button = findViewById(R.id.btn_set_fav)
        btnFav.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.btn_set_share -> {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT,
                        "Ayo cari tahu tentang tanaman langka ini yaaa: " +
                                intent.getStringExtra(EXTRA_NAME) +
                                " (" + intent.getStringExtra(EXTRA_NAME_SCI) + ") - "+
                                intent.getStringExtra(EXTRA_BIBLIOGRAPHY) + " | " +
                                "Retrieved from inviora app by anindyo."
                    )
                    type = "text/plain"
                }

                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)
            }

            R.id.btn_set_fav -> {
                Toast.makeText(this, "1 favorit untuk " + intent.getStringExtra(EXTRA_NAME) + "!!!!!!!!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}