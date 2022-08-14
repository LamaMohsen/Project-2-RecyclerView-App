package com.example.project_2_recyclerview_app.data

import com.example.project_2_recyclerview_app.R
import com.example.project_2_recyclerview_app.model.App

class Datasource {
    fun loadMyApp(): List<App>{
        return listOf(
            App(R.string.app2,R.drawable.image2),
            App(R.string.app1,R.drawable.image1),
            App(R.string.app3,R.drawable.image3),
            App(R.string.app5,R.drawable.image_5),
            App(R.string.app7, R.drawable.image7),
            App(R.string.app4,R.drawable.image4),
            App(R.string.app6, R.drawable.image6)

        )
    }
}