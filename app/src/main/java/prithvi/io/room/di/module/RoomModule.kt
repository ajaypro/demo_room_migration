package prithvi.io.room.di.module

import android.app.Application
import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.migration.Migration
import android.content.ContentValues
import android.database.sqlite.SQLiteException
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import prithvi.io.room.data.persistence.Database
import timber.log.Timber
import java.lang.Exception
import javax.inject.Singleton

@Module
class RoomModule {

    @Provides
    @Singleton
    fun provideDatabase(
            application: Application
    ): Database {
        return Room.databaseBuilder(application, Database::class.java, "room.db")
                .build()
    }


}
