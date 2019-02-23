package com.arsinde.ankobottomnavbar.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.arsinde.ankobottomnavbar.fragments.ui.UsersUI
import org.jetbrains.anko.AnkoContext

class UsersFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        UsersUI().createView(AnkoContext.create(inflater.context, this, false))
}