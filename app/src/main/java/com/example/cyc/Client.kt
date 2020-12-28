@file:Suppress("DEPRECATION")

package com.example.cyc

import android.os.AsyncTask
import android.util.Log
import java.io.DataOutputStream
import java.io.IOException
import java.net.Socket

class Client(private var type:String="") : AsyncTask<Void, Void, Void>() {
    private var IP_Address = "192.168.43.117"
    override fun doInBackground(vararg p0: Void?): Void? {
        if (type!=""){
            try {
                val cli = Socket(IP_Address, 9999)
                val toServer = cli.getOutputStream()
                val dataOutputStream = DataOutputStream(toServer)
                dataOutputStream.writeBytes(type)
            }catch (e: IOException){
                e.printStackTrace()
            }
        }else{
            Log.i("TAGS","ERRRRR")
        }
        return null
    }
}