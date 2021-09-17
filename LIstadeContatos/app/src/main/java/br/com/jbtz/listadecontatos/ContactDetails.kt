package br.com.jbtz.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ContactDetails : AppCompatActivity() {
    private var contact: Contact? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        initToolbar()
        get_extras()
        bindViews()
    }

    private fun initToolbar(){
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun bindViews(){
        findViewById<TextView>(R.id.name).text = contact?.name
        findViewById<TextView>(R.id.phone).text = contact?.phone
    }

    private fun get_extras(){
        contact = intent.getParcelableExtra(EXTRA_CONTACT)
    }

    companion object{
        const val EXTRA_CONTACT: String = "EXTRA CONTACT"
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}