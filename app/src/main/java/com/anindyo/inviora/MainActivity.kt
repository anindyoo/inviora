package com.anindyo.inviora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlants : RecyclerView
    private var list : ArrayList<Plant> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlants = findViewById(R.id.rv_plants)
        rvPlants.setHasFixedSize(true)

        list.addAll(PlantsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPlants.layoutManager = LinearLayoutManager(this)
        val listPlantAdapter = ListPlantAdapter(list)
        rvPlants.adapter = listPlantAdapter

        listPlantAdapter.setOnItemClickCallback(object : ListPlantAdapter.OnItemClickCallback {
            override fun onItemClicked(data : Plant) {
                showSelectedPlant(data)
            }
        })
    }

    private fun showSelectedPlant(plant: Plant) {
//        Toast.makeText(this, "Kamu memilih " + plant.name, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_to_about -> {
                val moveAbout = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveAbout)
            }
        }
    }
}