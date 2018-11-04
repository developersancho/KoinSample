package developersancho.koinsample

import org.koin.dsl.module.module

object AppModule {
    val myModule = module {
        single { DataStore(get()) }
    }
}