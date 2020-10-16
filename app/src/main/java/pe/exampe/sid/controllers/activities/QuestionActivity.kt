package pe.exampe.sid.controllers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_question.*
import pe.exampe.sid.R
import pe.exampe.sid.adapters.ItemGenericAdapter
import pe.exampe.sid.mock.questionsItems
import pe.exampe.sid.models.Item

class QuestionActivity : AppCompatActivity() {

    private lateinit var adapter : ItemGenericAdapter
    private var items: List<Item> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        getItems()
        rvQuestions.layoutManager = LinearLayoutManager(this)

    }

    private fun getItems(){
        items= questionsItems
        adapter = ItemGenericAdapter(items,this)
        rvQuestions.adapter = adapter
    }

}