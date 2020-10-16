package pe.exampe.sid.util

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.Editable
import android.view.Window
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import pe.exampe.sid.R


fun showToast(context: Context,message: Editable?) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun showToast(context: Context,message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}


/*fun setIntent(context: Context?, activity: Class<T:Class>){
    val intent = Intent(context, activity::class.java)
    context!!.startActivity(intent)
}*/

fun showDialog(context:Context) {

    val dialog = Dialog(context)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.setCancelable(false)
    dialog.setContentView(R.layout.dialog)
    val dialogImage = dialog.findViewById(R.id.dialogImage) as ImageView
    dialogImage.setOnClickListener {
        dialog.dismiss()
    }
    dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    dialog.show()

}

