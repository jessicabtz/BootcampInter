package br.com.jbtz.cartaodevisita.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.jbtz.cartaodevisita.databinding.ActivityAddBusinessCardBinding

class addBusinessCardActivity : AppCompatActivity() {
    private val binding by lazy{ ActivityAddBusinessCardBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners(){
        binding.btnClose.setOnClickListener {
            finish()
        }
        binding.btnSave.setOnClickListener {

        }
        binding.btnAltCor.setOnClickListener{
            
        }
    }
}