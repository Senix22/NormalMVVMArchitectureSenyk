package com.senix22.normalmvvmarchitecture.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.senix22.normalmvvmarchitecture.R
import com.senix22.normalmvvmarchitecture.adapter.holder.PostViewHolder
import com.senix22.normalmvvmarchitecture.api.model.PostModel
import kotlinx.android.synthetic.main.view_posts.view.*

class PostRecyclerAdapter(private val postList: List<PostModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PostViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_posts, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as PostViewHolder
        viewHolder.bind(postList[position])
        when (postList[position].userId){
            7-> {
                holder.itemView.content.setBackgroundColor(Color.RED)
                holder.itemView.content.text = "Тут міг бути пост юзера ${postList[position].userId}, але він забанений"
            }
            3,4 ->{
                holder.itemView.id_user.text ="${postList[position].userId} with WARNINNG"
                holder.itemView.content.setBackgroundColor(Color.GRAY)
            }
            else -> {
                holder.itemView.content.setBackgroundColor(Color.WHITE)
            }

        }
    }

    override fun getItemCount(): Int {
        return postList.size
    }
}