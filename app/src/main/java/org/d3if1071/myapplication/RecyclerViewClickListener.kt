package org.d3if1071.myapplication

import android.view.View
import org.d3if1071.myapplication.data.DataFilm

interface RecyclerViewClickListener {
    fun onItemFilmClick(view : View, dataFilm: DataFilm)

}