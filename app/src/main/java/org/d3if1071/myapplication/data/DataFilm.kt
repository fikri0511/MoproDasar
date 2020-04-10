package org.d3if1071.myapplication.data

import org.d3if1071.myapplication.R

data class DataFilm(
    val judulFilm : String,
    val deskripsiFilm : String,
    val image:Int
)
//tambahkan data diDataFilm
val listDataFilm = listOf<DataFilm>(
    DataFilm("Parasite","DeskripsiKeluarga Ki-taek beranggotakan empat orang pengangguran dengan masa depan suram menanti mereka. Suatu hari Ki-woo anak laki-laki tertua direkomendasikan oleh sahabatnya yang merupakan seorang mahasiswa dari universitas bergengsi agar Ki-woo menjadi guru les yang dibayar mahal dan membuka secercah harapan penghasilan tetap. Dengan penuh restu serta harapan besar dari keluarga, Ki-woo menuju ke rumah keluarga Park untuk wawancara. Setibanya di rumah Mr. Park pemilik perusahaan IT global, Ki-woo bertemu dengan Yeon-kyo, wanita muda yang cantik di rumah itu. Setelah pertemuan itu, serangkaian kejadian dimulai.",
        R.drawable.parasite),
    DataFilm("The End of the F***ing Workd SE2","The End of The F***ing World kembali dengan season 2 di Netflix sejak 5 November lalu. Season pertama diadaptasi dari komik remaja dengan judul yang sama karya Charles Forsman. Kesuksesan pada season pertama pun membuat Netflix memproduksi season kedua dengan kisah original yang tidak ada dalam versi komiknya. The End of The F***ing World season 2 sempat menimbulkan berbagai tanggapan skeptikal tentang proyek serial yang komersial saja."
            ,R.drawable.theend),
    DataFilm("Sex Education","DeskripsiSex Education adalah serial televisi komedi-drama asal Inggris dibuat oleh Laurie Nunn, ditayangkan perdana pada 11 Januari 2019 di Netflix. Serial ini dibintangi oleh Gillian Anderson, Asa Butterfield, Emma Mackey dan Ncuti Gatwa",
        R.drawable.education),
    DataFilm("Kucumbu Tubuh Indahku","DeskripsiKisah perjalanan hidup Juno, sejak kecil hingga dewasa menjadi penari, di sebuah desa di Jawa, yang terkenal sebagai desa penari lengger lanang, jenis tarian perempuan yang dibawakan penari laki - laki. Kehidupan Juno kecil adalah kehidupan peleburan tubuh maskulin dan feminin yang terbentuk alami oleh kehidupan desa dan keluarganya, namun perjalanan hidupnya selanjutnya adalah perjalanan kehidupan penuh trauma kekerasan tubuh. Trauma kekerasan politk yang dialami Ayahnya menjadikan Juno hidup sendiri . Kehidupan masa kecil Juno serba sendiri di desa miskin menjadikan dirinya menjadi ibu dan bapak bagi kehidupannya. Juno dalam kesendirian melihat banyak kekerasan yang muncul di sekitarnya",
        R.drawable.kucumbu),
    DataFilm("Gundala","DeskripsiSancaka hidup di jalanan sejak ditinggal ayah dan ibunya. Menghadapi hidup yang keras, Sancaka belajar untuk bertahan hidup dengan tidak peduli dengan orang lain dan hanya mencoba untuk mendapatkan tempat yang aman bagi dirinya sendiri. Ketika situasi kota semakin tidak aman dan ketidakadilan merajalela di seluruh negeri, Sancaka harus buat keputusan yang berat, tetap hidup di zona amannya, atau keluar sebagai Gundala untuk membela orang-orang yang ditindas.",
        R.drawable.gundala)

)
