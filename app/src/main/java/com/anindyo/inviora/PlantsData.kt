package com.anindyo.inviora

object PlantsData {
    private val plantNames = arrayOf(
        "English Sundew",
        "Pinus Brazil",
        "Muehlbergella",
        "Dwarf Ebony",
        "Diospyros egrettarum",
        "Three Kings kaikōmako",
        "Sea Marigold",
        "Kaktus Aguirreanum",
        "Iris Pantai",
        "Jahe Spiral",
    )

    private val plantNameSci = arrayOf(
        "Drosera anglica",
        "Araucaria angustifolia",
        "Muehlbergella oweriniana",
        "Trochetiopsis ebenus",
        "Diospyros egrettarum",
        "Pennantia baylisiana",
        "Calendula maritima",
        "Acharagma aguirreanum",
        "Iris atropurpurea",
        "Costus barbatus",
    )

    private val plantDetails = arrayOf(
        "English Sundew adalah tanaman karnivora perenial yang biasa ditemukan di padang rumput basah dan rawa-rawa. Spesies ini dapat berhibridisasi dengan Drosera rotundifolia. Tanaman ini menyebar di Belahan Bumi Utara.  Pada umumnya, tanaman ini tumbuh di dataran rendah, tetapi dapat tumbuh di dataran tinggi hingga 915 meter. D. anglica dahulu dipakai sebagai obat homeopati untuk batuk oleh penduduk Jerman, tetapi penggunaannya menurun karena ancaman kepunahannya. Tanaman ini sudah punah di Kroasia dan Hongaria, serta beberapa tempat di Belgia. Namun, tanaman ini masih sering ditemukan di Swedia dan Norwegia.",
        "Pinus Brazil adalah sebuah spesies tanaman konifer yang terancam punah yang berasal dari Brazil Selatan. Walaupun disebut dengan nama Pinus Brazil, tanaman ini tidak termasuk dalam genus pinus. Tanaman ini kehilangan 97% habitatnya diakibatkan dengan addanya penebangan pohon untuk pembukaan lahan. Biji dari pohon ini mirip dengan buah pohon pinus yang bisa dimakan dan diolah menjadi snack yang biasa dimakan pada musim dingin. Kayu dari pohon ini juga dimanfaatkan dalam produksi perabotan. Selain itu, daun-daunnya juga sering dimanfaatkan dalam pembuatan obat-obatan tradisional.",
        "Muehlbergella adalah tanaman yang terancam punah yang mana hanya memiliki satu genus dan tergabung dalam keluarga tanaman berbunga. Tanaman ini dideskripsikan di dalam buku karya ahli botani asal Swiss, Heinrich Feer, dengan judul buku Botanische Jahrbücher für Systematik, Pflanzengeschichte und Pflanzengeographie Vol.12 (Issue 5) halaman 615–616 pada tahun 1890. Penamaan Muehlbergella pada tanaman ini merupakan penghormatan kepada seorang geolog Swiss yang pernah menjadi guru dari Albert Einstein, Friedrich Mühlberg. Nama oweriniana sendiri merujuk kepada pengoleksi asli dari tanaman ini, yakni Alexander Pavlovic Owerin, seorang topografer militer Rusia, dan ahli botani yang mengumpulkan tanaman-tanaman dari kawasan Dagestan, Kaukasus.",
        "Dwarf Ebony adalah sebuah spesies dari tanaman berbunga yang menjadi tanaman endemik pulau Saint Helena di Samudra Atlantik Selatan. Tanaman ini juga termasuk ke dalam keluarga tanaman Malva. Tanaman ini terancam punah dan dulunya sering ditemukan di area tebing-tebingan. Tanaman ini dimanfaatkan kayunya sebgai campuran bahan dalam pembuatan kerajinan penting di Saint Helena. Tanaman ini memiliki spesies terkait yang sudah punah, Trochetiopsis melanoxylon.",
        "Diospyros egrettarum adalah spesies endemik pohon di Mauritius dan pernah menjadi spesies dominan di seluruh hutan kering dan pesisir. Karena maraknya aktivitas panen untuk kayu dan kayu bakar di masa lalu, spesies ini berkurang menjadi kurang dari 10 individu di daratan utama. Populasi subur dari tanaman ini berada di sebuah pulau koral di pesisir timur, yakni  Île aux Aigrettes, yang menjadi inspirasi dari penamaan dari tanaman ini.",
        "Three Kings kaikōmako adalah spesies tumbuhan yang tergabung dalam keluarga Pennantiaceae. Tanaman ini endemik di Manawatāwhi / Three Kings Islands, sekitar 55 kilometer barat laut Cape Reinga, Selandia Baru. Tanaman ini ditemukan pertama kiali pada tahun 1945, yang mana hanya berjumlah 1 pohon. Tanaman ini mulai dikembangbiakkan pada tahun 1950-an dengan metode pemotongan, dan metode penyerbukan diri pada tahun 1985. Tanaman ini memiliki daun yang berbentuk seperti telur, bunga berwarna hijau muda, dan buah berbentuk elips dengan biji di dalamnya.",
        "Sea Marigold adalah spesies yang sangat langka dari keluarga Asteraceae. Beberapa ilmuwan menganggapnya sebagai Calendula suffruticosa subspesies maritima. Tanaman ini adalah tanaman endemik dari bagian pesisir barat Sisilia. Sejak 2012, tanaman ini masih bisa ditemukan di 5 kota kecil di Sisilia Timur. Batang tanaman ini dapat dengan mudah mengalami lignifikasi di bagian bawah dan daunnya ditutupi dengan rambut lengket pendek. Batang muda ini pada awalnya tegak, tetapi kemudian mereka mulai menggantung dan menyebar di tanah. Daunnya berisi dan memiliki aroma yang kuat. Tanaman ini mekar pada bulan Mei-Juni.",
        "Acharagma aguirreanum adalah kaktus mikroendemik yang terancam punah. Kaktus ini tumbuh di jangkauan sekitar satu kilometer persegi di semi-gurun berkapur Sierra de la Paila di Coahuila, Meksiko. Populasinya diperkirakan kurang dari 1000 individu. Satu-satunya ancaman utama dari keberadaan kaktus langka ini adalah kolektor ilegal.",
        "Iris Pantai adalah sebuah spesies tanaman dalam genus Iris yang bersifat rhizoma perennial berasal dari Timur Tengah. Antara Februari dan Maret, tanaman ini memiliki antara 1 dan 2 bunga, dalam nuansa gelap dari merah-coklat, merah anggur, ungu tua hingga ungu kehitaman. Mereka memiliki motif sinyal yang lebih gelap dan janggut kuning berujung ungu. Tanaman ini jarang dibudidayakan sebagai tanaman hias di daerah beriklim sedang, karena membutuhkan kondisi yang sangat kering.",
        "Jahe Spiral adalah tanaman tahunan dengan perbungaan merah. Ini adalah salah satu spesies Costus yang paling umum dibudidayakan. Dedaunan dari tanaman jahe ini berwana hijau tua dan berbulu halus di bawahnya. Perbungaan merah panjang dilengkapi dengan bunga tabung kuning cerah. Rumpun menyebar dengan mudah dan menghasilkan tanaman yang biasanya mencapai tinggi enam kaki. Tanaman ini berasal dari Kosta Rika. Penyerbukan bunga dari tanaman ini dilakukan oleh burung kolibri dan bunga tersebut cukup populer untuk dijadikan sebagai bunga potong.",

    )

    private val plantOrigins = arrayOf(
        "Belahan Bumi Utara & Hawaii",
        "Brazil Selatan",
        "Kaukasus Utara",
        "Pulau Saint Helena, Samudra Atlantik",
        "Mauritius, Samudra Hindia",
        "Manawatāwhi / Three Kings Islands",
        "Sisilia, Italia",
        "Coahuila, Meksiko",
        "Timur Tengah",
        "Kosta Rika",
    )

    private val plantBibliographies = arrayOf(
        "https://id.wikipedia.org/wiki/Drosera_anglica",
        "https://en.wikipedia.org/wiki/Araucaria_angustifolia",
        "https://en.wikipedia.org/wiki/Muehlbergella",
        "https://en.wikipedia.org/wiki/Trochetiopsis_ebenus",
        "https://en.wikipedia.org/wiki/Diospyros_egrettarum",
        "https://en.wikipedia.org/wiki/Pennantia_baylisiana",
        "https://en.wikipedia.org/wiki/Calendula_maritima",
        "https://en.wikipedia.org/wiki/Acharagma_aguirreanum",
        "https://en.wikipedia.org/wiki/Iris_atropurpurea",
        "https://en.wikipedia.org/wiki/Costus_barbatus",
    )

    private val plantImages = intArrayOf(
        R.drawable.drosera_anglica_kauai,
        R.drawable.araucaria_angustifolia,
        R.drawable.edraianthus_owerinianus,
        R.drawable.trochetiopsis_ebenus,
        R.drawable.diospyros_egrettarum,
        R.drawable.pennantia_baylisiana_kz3,
        R.drawable.sea_marigold,
        R.drawable.acharagma_aguirreanum,
        R.drawable.iris_atropurpurea,
        R.drawable.spiral_ginger,
    )

    val listData : ArrayList<Plant>
        get() {
            val list = arrayListOf<Plant>()
            for (position in plantNames.indices) {
                val plant = Plant()
                plant.name = plantNames[position]
                plant.name_sci = plantNameSci[position]
                plant.detail = plantDetails[position]
                plant.place_origin = plantOrigins[position]
                plant.bibliography = plantBibliographies[position]
                plant.photo = plantImages[position]
                list.add(plant)
            }
            return list
        }
}