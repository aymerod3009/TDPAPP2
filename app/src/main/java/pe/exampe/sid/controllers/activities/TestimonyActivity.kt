package pe.exampe.sid.controllers.activities

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_testimony.*
import pe.exampe.sid.R
import pe.exampe.sid.adapters.TestimonyAdapter
import pe.exampe.sid.mock.testimonyItems
import pe.exampe.sid.models.Testimony
import pe.exampe.sid.util.showToast

class TestimonyActivity : AppCompatActivity() {


    private lateinit var adapter : TestimonyAdapter
    private var testimonies: List<Testimony> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testimony)


        getItems()
        rvTestimony.layoutManager = LinearLayoutManager(this)

        testimonyBtnAddTestimony.setOnClickListener {
            showDialogTestimony(this)
        }

    }
//
    private fun getItems(){
        testimonies= testimonyItems
        adapter = TestimonyAdapter(testimonies,this)
        rvTestimony.adapter = adapter
    }


    private fun showDialogTestimony(context: Context) {

        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.dialog_testimony)

        val dialogImage = dialog.findViewById(R.id.testimonyDialogImage) as ImageView
        val radioGroup=dialog.findViewById(R.id.testimonyRadioGroup)as RadioGroup

        dialogImage.setOnClickListener {
            dialog.dismiss()
        }

        radioGroup.setOnCheckedChangeListener{ group, checkedId ->

            if(checkedId == R.id.testimonyRbtnYes){
                showToast(context,"Si")
            }

            if(checkedId == R.id.testimonyRbtnNo){
                showToast(context,"No")
            }

        }

        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()

    }

}