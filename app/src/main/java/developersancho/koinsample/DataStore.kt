package developersancho.koinsample

import android.content.Context
import android.widget.Toast

class DataStore(val context: Context) {
    fun displayToast() {
        Toast.makeText(context, "Datastore component injected", Toast.LENGTH_LONG).show()
    }
}