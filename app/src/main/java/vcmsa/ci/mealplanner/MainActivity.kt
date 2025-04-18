package vcmsa.ci.mealplanner

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    // decalaring variables
    val txtOutput = findViewById<TextView>(R.id.txtOutput)
    val txtInput = findViewById<EditText>(R.id.txtInput)
    val btnClick = findViewById<Button>(R.id.btnClick)
    val btnReset = findViewById<Button>(R.id.btnReset)



    if(txtInput = " Morning:Breakfast")

    btnReset.setOnClickListener{
        txtInput.text.clear()
        txtOutput.text=""
    }



}