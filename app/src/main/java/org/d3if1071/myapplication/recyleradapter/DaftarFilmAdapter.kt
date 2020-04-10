package org.d3if1071.myapplication.recyleradapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_main.*
import org.d3if1071.myapplication.R
import org.d3if1071.myapplication.RecyclerViewClickListener
import org.d3if1071.myapplication.data.DataFilm
import org.d3if1071.myapplication.databinding.ListDaftarfilmBinding

class DaftarFilmAdapter (private val listFilm: List<DataFilm>):
    RecyclerView.Adapter<DaftarFilmAdapter.DaftarFilmViewHolder>() {
    //tambah clicked
    var listener:RecyclerViewClickListener?=null

    //fungsi binding di adapter
    inner class DaftarFilmViewHolder (
        val itemFilmBinding : ListDaftarfilmBinding
    ):RecyclerView.ViewHolder(itemFilmBinding.root)


    //untuk tampilan
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= DaftarFilmViewHolder (
        DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_daftarfilm,parent,false)
    )
    //untuk panjang list
    override fun getItemCount(): Int {
        return listFilm.size
    }
    //untuk data di listnya
    override fun onBindViewHolder(holder: DaftarFilmViewHolder, position: Int) {
        //list film
        holder.itemFilmBinding.tvDeskripsi.text=listFilm[position].deskripsiFilm
        holder.itemFilmBinding.tvJudul.text=listFilm[position].judulFilm
        Glide.with(holder.itemView.context).load(listFilm[position].image).apply(RequestOptions().override(300,500)).into(holder.itemFilmBinding.imFilm)

        //onclicker
        holder.itemFilmBinding.layoutFilm.setOnClickListener {
            listener?.onItemFilmClick(it,listFilm[position])
        }
    }
}

//intercafe onclick listener
//interface RecylerViewClickListener{
//}