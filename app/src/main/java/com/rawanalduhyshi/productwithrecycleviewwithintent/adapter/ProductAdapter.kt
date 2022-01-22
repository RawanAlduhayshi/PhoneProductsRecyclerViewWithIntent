package com.rawanalduhyshi.productwithrecycleviewwithintent.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.rawanalduhyshi.productwithrecycleviewwithintent.PhoneActivity
import com.rawanalduhyshi.productwithrecycleviewwithintent.R
import com.rawanalduhyshi.productwithrecycleviewwithintent.data.DataSource
import android.os.Bundle
import android.util.Log


class ProductAdapter(private val context: Context?) : RecyclerView.Adapter
<ProductAdapter.ProductViewHolder>() {
    private val dataset = DataSource.ProductPhone
    private val mcon: Context? = null
    class ProductViewHolder(val view: View?) :
        RecyclerView.ViewHolder(view!!) {
        var productImage: ImageView? = view?.findViewById(R.id.product_image)
        val phonename: TextView? = view?.findViewById(R.id.product_name)
        val phoneprice: TextView? = view?.findViewById(R.id.product_price)
        val phonestarImage: ImageView? = view?.findViewById(R.id.star_image)
        val phonebutton: Button? = view?.findViewById(R.id.button)


    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductAdapter.ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(parent.context).inflate
                (R.layout.product_item, parent, false)
        )
    }


    override fun onBindViewHolder(holder: ProductAdapter.ProductViewHolder, position: Int) {
        val item = dataset[position]
        holder.productImage?.setImageResource(item.productImage)

        holder.phonename?.text = context?.getString(item.productName)
        holder.phoneprice?.text = item.productPrice
        if (item.isVip) {
            holder.phonestarImage?.visibility = View.VISIBLE
        }
        holder.phonebutton?.setOnClickListener {
            if (item.productQuantity < 0) {
                Toast.makeText(context, "The item is out of stock", Toast.LENGTH_SHORT).show()
            } else {
                if (item.productQuantity > 0) {

                        val b = Bundle()

                       val intent= Intent(context, PhoneActivity::class.java)
                        b.putString("name", holder.phonename?.text.toString())
                        b.putString("price", holder.phoneprice?.text.toString())
                        intent.putExtras(b)
                        context?.startActivity(intent)


                }
            }


        }


    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}