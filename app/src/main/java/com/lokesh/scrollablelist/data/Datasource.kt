package com.lokesh.scrollablelist.data

import com.lokesh.scrollablelist.R
import com.lokesh.scrollablelist.model.Affirmation

class Datasource {

    fun loadAffirmation() : List<Affirmation>{

        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1,R.drawable.dice_1),
            Affirmation(R.string.affirmation2,R.drawable.dice_2),
            Affirmation(R.string.affirmation3,R.drawable.dice_3),
            Affirmation(R.string.affirmation4,R.drawable.dice_4),
            Affirmation(R.string.affirmation5,R.drawable.dice_5),
            Affirmation(R.string.affirmation6,R.drawable.dice_6),
            Affirmation(R.string.affirmation7,R.drawable.dice_1),
            Affirmation(R.string.affirmation8,R.drawable.dice_2),
            Affirmation(R.string.affirmation9,R.drawable.dice_3),
        )

    }
}