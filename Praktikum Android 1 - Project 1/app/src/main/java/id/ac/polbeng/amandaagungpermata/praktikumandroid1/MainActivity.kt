package id.ac.polbeng.amandaagungpermata.praktikumandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCouter.text = "1"
    }

    fun addNumber(v: View) {
        val currVal = tvCouter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCouter.text = nextVal.toString()
    }

    fun minNumber(v: View) {
        val currVal = tvCouter.text.toString().toInt()
        val nextVal = currVal - 1
        tvCouter.text = nextVal.toString()
    }
}