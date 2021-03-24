
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.somadedoisnumeros.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSomar.setOnClickListener { _: View? ->
            if (camposValidos()) {
                val n1 = txtNumber1.text.toString().toDouble()
                val n2 = txtNumber2.text.toString().toDouble()
                var soma = soma(n1, n2)
                //lbRes.text = soma.toString()

                var interntResultado = Intent(this, ResultadoActivity::class.java)
                interntResultado.putExtra("resultado", soma)
                startActivity(interntResultado)

            }

        }
    }
    fun camposValidos() : Boolean {
        var msg = ""
        if(txtNumber1.text.trim().isEmpty()){
            msg = "Informe o primeiro número"
        }else if(txtNumber2.text.trim().isEmpty()){
            msg = "Informe o segundo numero"
        }

        if(msg.equals("")){
            return true;
        }else{
            return false;
        }
    }

    fun soma( n1 : Double,  n2 : Double) : Double{
        return n1 + n2;
    }
}