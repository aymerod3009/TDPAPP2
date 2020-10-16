package pe.exampe.sid.controllers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_help.*
import pe.exampe.sid.R
import pe.exampe.sid.adapters.HelpAdapter
import pe.exampe.sid.mock.helpItems
import pe.exampe.sid.models.Item

class HelpActivity : AppCompatActivity() {


    private lateinit var adapter : HelpAdapter
    private var items: List<Item> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        getItems()
        rvHelp.layoutManager = LinearLayoutManager(this)
    }

    private fun getItems(){
        items= helpItems
        adapter = HelpAdapter(items,this)
        rvHelp.adapter = adapter
    }
}