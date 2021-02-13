package com.senix22.normalmvvmarchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.senix22.normalmvvmarchitecture.adapter.PostRecyclerAdapter
import com.senix22.normalmvvmarchitecture.api.model.PostModel
import com.senix22.normalmvvmarchitecture.viewmodel.PostViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = ViewModelProviders.of(this).get(PostViewModel::class.java!!)
        model.getPosts()!!.observe(this,
                Observer<List<PostModel>> {
                    val adapter = PostRecyclerAdapter(it)
                    recyclerView.adapter = adapter
                })
    }
}