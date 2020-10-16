package pe.exampe.sid.controllers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_law.*
import pe.exampe.sid.R
import pe.exampe.sid.adapters.LawAdapter
import pe.exampe.sid.mock.lawItems
import pe.exampe.sid.models.Item

class LawActivity : AppCompatActivity() {

    private lateinit var adapter : LawAdapter
    private var items: List<Item> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_law)

        getItems()
        rvLaw.layoutManager = LinearLayoutManager(this)

    }

    private fun getItems(){

        items= lawItems
        adapter = LawAdapter(items,this)
        rvLaw.adapter = adapter

    }

}