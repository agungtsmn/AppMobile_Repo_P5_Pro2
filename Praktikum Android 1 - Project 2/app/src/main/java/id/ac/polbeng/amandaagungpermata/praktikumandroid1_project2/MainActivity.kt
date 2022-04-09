package id.ac.polbeng.amandaagungpermata.praktikumandroid1_project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDisplayMessage.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Hello World",
                Toast.LENGTH_SHORT
            ).show()
        }

        btnDisplayMessage.setOnLongClickListener {
            Snackbar.make(
                root_layout,
                "Long Click",
                Snackbar.LENGTH_SHORT
            ).show()
            true
        }
    }
}