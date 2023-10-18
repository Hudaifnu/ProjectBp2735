package com.example.bp2735

object ListBuku {
    //Array and return the Arraylist
    fun getDataBuku():ArrayList<BukuModel>{
        val ListBuku=ArrayList<BukuModel>()

        val buku1=(BukuModel(R.drawable.buku1, "Anak kreativ",
            "Lorem Ipsum Sit AMet Lorem Ipsum Sit Amet"))
        ListBuku.add(buku1)

        val buku2=(BukuModel(R.drawable.buku2, "Dongeng anak",
            "Lorem Ipsum Sit AMet Lorem Ipsum Sit Amet"))
        ListBuku.add(buku2)

        val buku3=(BukuModel(R.drawable.buku3, "Kisah Pembentuk Karakter",
            "Lorem Ipsum Sit AMet Lorem Ipsum Sit Amet"))
        ListBuku.add(buku3)

        val buku4=(BukuModel(R.drawable.buku4, "Mahir Berbahasa Indonesia",
            "Lorem Ipsum Sit AMet Lorem Ipsum Sit Amet"))
        ListBuku.add(buku4)

        val buku5=(BukuModel(R.drawable.buku4, "Sains",
            "Lorem Ipsum Sit AMet Lorem Ipsum Sit Amet"))
        ListBuku.add(buku5)

        val buku6=(BukuModel(R.drawable.buku6, "Siap Masuk TK",
            "Lorem Ipsum Sit AMet Lorem Ipsum Sit Amet"))
        ListBuku.add(buku6)

        return ListBuku.size
    }
}