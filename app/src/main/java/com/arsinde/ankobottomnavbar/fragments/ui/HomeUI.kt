package com.arsinde.ankobottomnavbar.fragments.ui

import android.view.View
import com.arsinde.ankobottomnavbar.R
import com.arsinde.ankobottomnavbar.fragments.HomeFragment
import org.jetbrains.anko.*

class HomeUI: AnkoComponent<HomeFragment> {
    override fun createView(ui: AnkoContext<HomeFragment>): View = with(ui) {
        relativeLayout {
            with(resources) {
                textView {
                    text = getString(R.string.fr_home_title)
                    textColor = getColor(R.color.colorPrimaryDark)
                    textSize = 20f
                }.lparams { centerInParent() }
            }
        }
    }
}