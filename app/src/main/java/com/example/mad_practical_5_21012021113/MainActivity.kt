package com.example.mad_practical_5_21012021113

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun weburl(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also{startActivity(it)}
    }
    fun call(call : String)
    {
        Intent(Intent.ACTION_VIEW).setType(call.calls.CONTENT_TYPE).also{startActivity(it)}
    }
    fun CallLog()
    {
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also {startActivity(it)
        }
    fun gallary()
    {
        Intent(Intent.ACTION_VIEW).setType("image/*").also{startActivity(it)}
    }
    fun camera()
    {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }
    }
    fun alarm()
    {
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also {startActivity(it) }
    }

}