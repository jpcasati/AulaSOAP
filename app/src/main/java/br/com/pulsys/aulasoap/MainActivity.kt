package br.com.pulsys.aulasoap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnEnviar).setOnClickListener {

//            val resp = ClienteWS().receberSaudacao("João")
//            Toast.makeText(this,  resp, Toast.LENGTH_LONG).show()

            val c = Carro(
                findViewById<EditText>(R.id.edtPlaca).text.toString(),
                findViewById<EditText>(R.id.edtMarca).text.toString(),
                findViewById<EditText>(R.id.edtModelo).text.toString(),
                findViewById<EditText>(R.id.edtAno).text.toString().toInt(),
            )

            ClienteWS().enviarCarro(c)

        }


    }

}