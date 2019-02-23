package com.arsinde.ankobottomnavbar

import android.view.View
import androidx.constraintlayout.widget.ConstraintSet.PARENT_ID
import com.arsinde.ankobottomnavbar.utils.bottomNavigation
import org.jetbrains.anko.*
import org.jetbrains.anko.constraint.layout.ConstraintSetBuilder.Side.*
import org.jetbrains.anko.constraint.layout.applyConstraintSet
import org.jetbrains.anko.constraint.layout.constraintLayout
import org.jetbrains.anko.constraint.layout.matchConstraint

class MainActivityUI: AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        constraintLayout {
            val fragmentContainer = frameLayout {
                id = R.id.fragment_container
            }.lparams {
                width = matchParent
                height = matchConstraint
            }

            val bottomNavigation = bottomNavigation {
                id = R.id.bottom_nav_view
                inflateMenu(R.menu.bottom_nav_menu)
            }

            applyConstraintSet {
                fragmentContainer {
                    connect(
                        START to START of PARENT_ID,
                        END to END of PARENT_ID,
                        TOP to TOP of PARENT_ID,
                        BOTTOM to TOP of R.id.bottom_nav_view
                    )
                }

                bottomNavigation {
                    connect(
                        START to START of PARENT_ID,
                        END to END of PARENT_ID,
                        TOP to BOTTOM of R.id.fragment_container,
                        BOTTOM to BOTTOM of PARENT_ID
                    )
                }
            }
        }
    }
}
