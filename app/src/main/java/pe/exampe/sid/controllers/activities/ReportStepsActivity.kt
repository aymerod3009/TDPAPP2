package pe.exampe.sid.controllers.activities

import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.shuhart.stepview.StepView
import kotlinx.android.synthetic.main.activity_report_steps.*
import kotlinx.android.synthetic.main.report_step_four.*
import kotlinx.android.synthetic.main.report_step_one.*
import kotlinx.android.synthetic.main.report_step_three.*
import kotlinx.android.synthetic.main.report_step_two.*
import pe.exampe.sid.R


class ReportStepsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report_steps)

        reportStepView.state
            .selectedTextColor(ContextCompat.getColor(this, R.color.colorAccent))
            .animationType(StepView.ANIMATION_CIRCLE)
            .selectedCircleColor(ContextCompat.getColor(this, R.color.colorAccent))
            .selectedStepNumberColor(
                ContextCompat.getColor(
                    this,
                    R.color.colorPrimary
                )
            ) // You should specify only stepsNumber or steps array of strings.
            // In case you specify both steps array is chosen.
            .steps(object : ArrayList<String?>() {
                init {
                    add("Antecedentes")
                    add("Amenazas")
                    add("Control")
                    add("Agravantes")
                }
            }) // You should specify only steps number or steps array of strings.
            // In case you specify both steps array is chosen.
            .stepsNumber(4).commit()

        reportStepOneBtnChange.setOnClickListener {
            reportStepView.go(1, true);
            reportStepTwo.visibility= View.VISIBLE
            reportStepOne.visibility=View.GONE
        }

        reportStepTwoBtnChange.setOnClickListener {
            reportStepView.go(2, true);
            reportStepThree.visibility= View.VISIBLE
            reportStepTwo.visibility=View.GONE
        }

        reportStepThreeBtnChange.setOnClickListener {
            reportStepView.go(3, true);
            reportStepFour.visibility= View.VISIBLE
            reportStepThree.visibility=View.GONE
        }

        setValuesInSpinner(reportStepFourSpnHaveWeapon)
        setValuesInSpinner(reportStepFourSpnReaction)
        setValuesInSpinner(reportStepFourSpnUseWeapon)
        setValuesInSpinner(reportStepOneSpnFrecuency)
        setValuesInSpinner(reportStepOneSpnLesionType)
        setValuesInSpinner(reportStepOneSpnLesionType)
        setValuesInSpinner(reportStepOneSpnPast)
        setValuesInSpinner(reportStepThreeSpnBullying)
        setValuesInSpinner(reportStepThreeSpnControl)
        setValuesInSpinner(reportStepThreeSpnDeception)
        setValuesInSpinner(reportStepTwoSpnThreaten)

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