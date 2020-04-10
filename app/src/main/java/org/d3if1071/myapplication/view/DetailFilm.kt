package org.d3if1071.myapplication.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if1071.myapplication.MainActivity
import org.d3if1071.myapplication.R
import org.d3if1071.myapplication.data.listDataFilm
import org.d3if1071.myapplication.databinding.FragmentDetailFilmBinding

/**
 * A simple [Fragment] subclass.
 */
class DetailFilm : Fragment() {
    lateinit var binding : FragmentDetailFilmBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_detail_film,container,false)
        //judul
        val getActivity = activity!! as MainActivity
        getActivity.supportActionBar?.title = "DETAIL FILM"


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments!=null){
            val dataFilm = arguments?.getString("dataFilm")
            val list = listDataFilm
            for(i in list.indices){
                if (dataFilm?.equals(listDataFilm[i].judulFilm)!!){
                    binding.tvJudulDetail.text = list[i].judulFilm
                    binding.tvDeskripsiDetail.text = list[i].deskripsiFilm
                    binding.imageView2.setImageResource(list[i].image)
                }
            }




        }
    }

}
