package com.example.findmeastreamingplatform.search.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.findmeastreamingplatform.MyApplication
import com.example.findmeastreamingplatform.R
import com.example.findmeastreamingplatform.search.injection.SearchModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var viewModel: SearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        MyApplication.getComponent(this)
            .plus(SearchModule(this))
            .inject(this)
    }

}
