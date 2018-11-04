package developersancho.koinsample

import android.app.Application
import org.koin.android.ext.android.startKoin

class KoinApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin(this, listOf(AppModule.myModule))
    }
}