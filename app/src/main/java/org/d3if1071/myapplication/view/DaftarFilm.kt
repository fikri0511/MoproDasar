package org.d3if1071.myapplication.view

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import org.d3if1071.myapplication.MainActivity
import org.d3if1071.myapplication.R
import org.d3if1071.myapplication.RecyclerViewClickListener
import org.d3if1071.myapplication.data.DataFilm
import org.d3if1071.myapplication.data.listDataFilm
import org.d3if1071.myapplication.databinding.FragmentDaftarFilmBinding
import org.d3if1071.myapplication.recyleradapter.DaftarFilmAdapter
import org.d3if1071.myapplication.viewmodel.FilmViewModel

/**
 * A simple [Fragment] subclass.
 */
class DaftarFilm : Fragment(), RecyclerViewClickListener {
    lateinit var binding:FragmentDaftarFilmBinding
    private lateinit var viewModel:FilmViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_daftar_film,container,false)
        //judul
        val getActivity = activity!! as MainActivity
        getActivity.supportActionBar?.title = "DAFTAR FILM"


        //viewmodel
        viewModel = ViewModelProviders.of(this).get(FilmViewModel::class.java)

        //observenyadipakaikan viewmodel

        viewModel.data.observe(viewLifecycleOwner, Observer{
            val adapter=DaftarFilmAdapter(listDataFilm)

            //setonClick
            adapter.listener=this

            //membuat rv daftar filmnya
            binding.rvDaftarfilm.apply {
                this.adapter = adapter
                this.layoutManager=LinearLayoutManager(this@DaftarFilm.context)
            }
        })




        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return  NavigationUI.onNavDestinationSelected(item!!,view!!.findNavController())
                ||super.onOptionsItemSelected(item)

    }

    //onClicked

    override fun onItemFilmClick(view: View, dataFilm: DataFilm) {

                val bundle = Bundle()
        bundle.putString("dataFilm",dataFilm.judulFilm)
        view.findNavController().navigate(R.id.action_daftarFilm_to_detailFilm,bundle)
    }




}
