

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.somadedoisnumeros.R
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        lbResultado.text = intent.getDoubleExtra("resultado", 0.0).toString()

    }
}