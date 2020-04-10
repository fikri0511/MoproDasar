package org.d3if1071.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navKontrol = this.findNavController(R.id.myHostFreagment)


        NavigationUI.setupActionBarWithNavController(this,navKontrol)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navKontrol = this.findNavController(R.id.myHostFreagment)
        return navKontrol.navigateUp()
    }
}
