package br.com.jbtz.cartaodevisita

import android.app.Application
import br.com.jbtz.cartaodevisita.data.AppDatabase
import br.com.jbtz.cartaodevisita.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy{ BusinessCardRepository(database.businessDao())}
}