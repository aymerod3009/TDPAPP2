package pe.exampe.sid.controllers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_report.*
import pe.exampe.sid.R
import pe.exampe.sid.util.showToast

class ReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        reportBtnNext.setOnClickListener {
            val intent= Intent(this,ReportStepsActivity::class.java)
            startActivity(intent)
        }
        setValuesInSpinner(reportSpnViolenceType)
        setValuesInSpinner(reportSpnViolenceForm)
        setValuesInSpinner(reportSpnAggressor)

    }

    private fun setValuesInSpinner(spinner: Spinner){
        val languages = resources.getStringArray(R.array.languages)

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item, languages)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
                //showToast(this@ReportActivity,languages[position])
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }

        }
    }



}