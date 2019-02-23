package com.arsinde.ankobottomnavbar.fragments.ui

import android.view.View
import com.arsinde.ankobottomnavbar.R
import com.arsinde.ankobottomnavbar.fragments.UsersFragment
import org.jetbrains.anko.*

class UsersUI: AnkoComponent<UsersFragment>{
    override fun createView(ui: AnkoContext<UsersFragment>): View = with(ui) {
        relativeLayout {
            with(resources) {
                textView {
                    text = getString(R.string.fr_users_title)
                    textColor = getColor(R.color.colorPrimaryDark)
                    textSize = 20f
                }.lparams { centerInParent() }
            }
        }
    }
}