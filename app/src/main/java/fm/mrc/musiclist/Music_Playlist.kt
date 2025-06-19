package fm.mrc.musiclist

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Music_Playlist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music_playlist)

        val txtList = findViewById<TextView>(R.id.txtList)

        val btnAll = findViewById<Button>(R.id.btnShowAll)

        val btnFilter = findViewById<Button>(R.id.btnShowMany)

        val btnBack = findViewById<Button>(R.id.btnBack)

        btnAll.setOnClickListener {
            txtList.text = ""; for (i in MainActivity.items.indices) {
            txtList.append("${MainActivity.items[i]} - ${MainActivity.categories[i]} - ${MainActivity.quantities[i]}\nComment: ${MainActivity.comments[i]}\n\n")
        }
        }

        btnFilter.setOnClickListener {
            txtList.text = ""; for (i in MainActivity.quantities.indices) {
            if (MainActivity.quantities[i] >= 0) {
                txtList.append("${MainActivity.items[i]} (${MainActivity.quantities[i]})\n")
            }
        }
        }

        btnBack.setOnClickListener { finish() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
}