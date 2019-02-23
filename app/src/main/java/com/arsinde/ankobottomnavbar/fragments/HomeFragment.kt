package com.arsinde.ankobottomnavbar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arsinde.ankobottomnavbar.fragments.ui.HomeUI
import org.jetbrains.anko.AnkoContext

class HomeFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        HomeUI().createView(AnkoContext.create(inflater.context, this, false))
}