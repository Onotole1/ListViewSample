package com.spitchenko.listviewsample

import android.content.Context
import android.widget.TextView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter


class CatsAdapter(context: Context, cats: ArrayList<Cat>) : ArrayAdapter<Cat>(context, 0, cats) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val currentView = convertView
            ?: LayoutInflater.from(context).inflate(R.layout.item_cat, parent, false)

        currentView as TextView

        val cat = requireNotNull(getItem(position))

        currentView.text = cat.name
        currentView.setCompoundDrawablesRelativeWithIntrinsicBounds(
            0,
            cat.image,
            0,
            0
        )

        return currentView
    }
}