package org.d3if1071.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import org.d3if1071.myapplication.data.DataFilm
import org.d3if1071.myapplication.data.listDataFilm

class FilmViewModel :ViewModel() {

    private val _data = MutableLiveData<List<DataFilm>>()


    init {
        _data.value= listDataFilm
    }
    val data : LiveData<List<DataFilm>>
        get() = _data





}