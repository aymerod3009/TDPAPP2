package pe.exampe.sid.adapters

import android.app.AlertDialog
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_testimony.view.*
import pe.exampe.sid.R
import pe.exampe.sid.models.Testimony

class TestimonyAdapter(var testimonies: List<Testimony>, var context: Context) : RecyclerView.Adapter<TestimonyAdapter.ItemViewHolder>(){

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtFullName = itemView.testimonyTxtFullName
        val txtDescription = itemView.testimonyTxtDescription
        val image = itemView.testimonyImage

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        fun bindTo(testimony: Testimony){

            txtFullName.text=testimony.fullName
            txtDescription.text = testimony.description
            Glide
                .with(context)
                .load("https://upload.wikimedia.org/wikipedia/commons/a/a0/Pierre-Person.jpg")
                .centerCrop()
                .placeholder(R.drawable.ic_macchu_background)
                .into(image);

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_testimony,parent,false))
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindTo(testimonies[position])
    }

    override fun getItemCount(): Int {
        return testimonies.size
    }

}