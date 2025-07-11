package com.gov.assignment.domain

import android.app.Application
import android.content.Context
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class Assignment: Application() {


    companion object {
        private lateinit var INSTANCE: Assignment
        fun applicationContext(): Context {
            return INSTANCE.applicationContext
        }

        fun getINSTANCE(): Assignment {
            return INSTANCE
        }
    }

    init {
        INSTANCE =this
    }
}