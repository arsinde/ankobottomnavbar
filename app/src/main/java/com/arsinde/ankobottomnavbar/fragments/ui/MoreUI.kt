package com.arsinde.ankobottomnavbar.fragments.ui

import android.view.View
import com.arsinde.ankobottomnavbar.R
import com.arsinde.ankobottomnavbar.fragments.MoreFragment
import org.jetbrains.anko.*

class MoreUI: AnkoComponent<MoreFragment> {
    override fun createView(ui: AnkoContext<MoreFragment>): View = with(ui) {
        relativeLayout {
            with(resources) {
                textView {
                    text = getString(R.string.fr_more_title)
                    textColor = getColor(R.color.colorPrimaryDark)
                    textSize = 20f
                }.lparams { centerInParent() }
            }
        }
    }
}