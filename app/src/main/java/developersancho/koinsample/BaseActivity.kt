package developersancho.koinsample

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.ext.android.inject

open class BaseActivity: AppCompatActivity() {

    // lazy inject DataStore into property
    val dataStore: DataStore by inject()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

}