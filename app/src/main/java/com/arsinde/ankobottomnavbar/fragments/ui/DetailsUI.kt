package com.arsinde.ankobottomnavbar.fragments.ui

import android.view.View
import com.arsinde.ankobottomnavbar.R
import com.arsinde.ankobottomnavbar.fragments.DetailsFragment
import org.jetbrains.anko.*

class DetailsUI: AnkoComponent<DetailsFragment> {
    override fun createView(ui: AnkoContext<DetailsFragment>): View = with(ui) {
        relativeLayout {
            with(resources) {
                textView {
                    text = getString(R.string.fr_details_title)
                    textColor = getColor(R.color.colorPrimaryDark)
                    textSize = 20f
                }.lparams { centerInParent() }
            }
        }
    }
}