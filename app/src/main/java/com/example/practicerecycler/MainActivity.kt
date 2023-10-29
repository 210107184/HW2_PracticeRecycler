package com.example.practicerecycler

import SushiAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practicerecycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var foodList: ArrayList<Model>
    private lateinit var foodAdapter: SushiAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        foodList = ArrayList()
        foodAdapter = SushiAdapter(foodList)
        foodListItems()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = foodAdapter
    }
v
    private fun foodListItems() {
        foodList.add(Model(R.drawable.sushi1, "ALASKA ROLL"))
        foodList.add(Model(R.drawable.sushi2, "DRAGON ROLL"))
        foodList.add(Model(R.drawable.sushi3, "TEMPURA ROLL"))
        foodList.add(Model(R.drawable.sushi4, "POWAY ROLL"))
        foodList.add(Model(R.drawable.sushi5, "TIGER ROLL"))
        foodList.add(Model(R.drawable.sushi6, "TOMMY ROLL"))
        foodList.add(Model(R.drawable.sushi7, "VOLCANO ROLL"))
        foodList.add(Model(R.drawable.sushi8, "ZARIGANI ROLL"))

    }
}

