package com.arsinde.ankobottomnavbar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arsinde.ankobottomnavbar.fragments.ui.DetailsUI
import org.jetbrains.anko.AnkoContext

class DetailsFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            DetailsUI().createView(AnkoContext.create(inflater.context, this, false))
}