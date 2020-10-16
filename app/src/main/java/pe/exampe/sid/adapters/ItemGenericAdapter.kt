package pe.exampe.sid.adapters

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_help.view.*
import pe.exampe.sid.R
import pe.exampe.sid.models.Item
import pe.exampe.sid.util.showDialog

class ItemGenericAdapter(var items: List<Item>, var context: Context) : RecyclerView.Adapter<ItemGenericAdapter.ItemViewHolder>(){

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtDescription = itemView.itemTxtDescription
        val maximize = itemView.itemImage

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        fun bindTo(item: Item){
            txtDescription.text = item.description
            maximize.setOnClickListener {
                showDialog(context)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_help,parent,false))
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bindTo(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }


}