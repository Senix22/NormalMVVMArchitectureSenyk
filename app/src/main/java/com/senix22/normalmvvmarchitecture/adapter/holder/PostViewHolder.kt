package com.senix22.normalmvvmarchitecture.adapter.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.senix22.normalmvvmarchitecture.api.model.PostModel
import kotlinx.android.synthetic.main.view_posts.view.*

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(postModel: PostModel) {
        itemView.name.text = postModel.title
        itemView.content.text = postModel.body
        itemView.id_user.text = postModel.userId.toString()
    }
}
