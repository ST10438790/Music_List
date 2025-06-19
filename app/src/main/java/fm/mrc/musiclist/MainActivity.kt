package fm.mrc.musiclist

import android.annotation.SuppressLint
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.lang.ref.Cleaner.create

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    //Parallel arrays
    companion object {
        val items = mutableListOf<String>()
        val categories = mutableListOf<String>()
        val quantities = mutableListOf<Int>()
        val comments = mutableListOf<String>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnAdd.setOnClickListener {
            // Code to be executed when the button is clicked
            showAddDialog()
        }

        btnNext.setOnClickListener {
            //Code to be executed when the button is clicked
            startActivity(Intent(this, Music_Playlist::class.java))
        }

        btnExit.setOnClickListener {
            //Code to be executed when the button is clicked
            finish()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    private fun showAddDialog() {
        val layout = layoutInflater.inflate(R.layout.dialog_add, null)

        val dialog = AlertDialog.Builder(this)
            .setTitle("Add to Playlist")
            .setView(layout)
            .setPositiveButton("Add",null)
            .setNegativeButton("Cancel",null)
            .create()

        dialog.setOnShowListener {
            val btn = dialog.getButton(DialogInterface.BUTTON_POSITIVE)
            btn.setOnClickListener {

            val item = layout.findViewById<EditText>(R.id.inputitem).text.toString().trim()

            val cat = layout.findViewById<EditText>(R.id.inputcategory).text.toString().trim()

            val qtyText = layout.findViewById<EditText>(R.id.inputquantity).text.toString()

            val com = layout.findViewById<EditText>(R.id.inputcomment).text.toString().trim()


            //Error handling
            if (item.isEmpty() || cat.isEmpty()|| qtyText.isEmpty()){ Toast.makeText(this,"Please enter all fields", Toast.LENGTH_SHORT).show(); return@setOnClickListener}

            val qty = qtyText.toIntOrNull()
            if(qty == null || qty <= 1){ Toast.makeText(this,"Please enter a valid quantity", Toast.LENGTH_SHORT).show(); return@setOnClickListener}


            //Add to Arrays
            items.add(item)
            categories.add(cat)
            quantities.add(qty)
            comments.add(com)

            Log.d("Packing List", "Item added: $item ($qty)")

            dialog.dismiss()
        }
    }

    dialog.show()
    }
}