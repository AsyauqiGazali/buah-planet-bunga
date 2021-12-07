package com.example.buah_planet_bunga;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.buah_planet_bunga.model.Buah;
import com.example.buah_planet_bunga.model.Bunga;
import com.example.buah_planet_bunga.model.Planet;
import com.example.buah_planet_bunga.model.Semesta;


public class DataProvider {
    private static List<Semesta>   semestas     = new ArrayList<>();

    private static List<Buah> iniDataBuah(Context ctx) {
        List<Buah> buahs = new ArrayList<>();
        buahs.add(new Buah("Apel", "Asia Tenggara",
                "Manfaat buah apel dalam kesehatan tubuh yaitu; melindungi fungsi jantung,menjaga kesehatan otak,sifat anti-inflamasi,perawatan kulit,membantu menurunkan berat badan,mengontrol diabetes,dll.", R.drawable.apel));
        buahs.add(new Buah("Anggur", "Timur Tengah-Mesir",
                "Manfaat buah anggur bagi kesehatan yaitu; mencegah kanker,melawan panuan dini,menjaga kesehatan otak,meredakan gejala alergi dan peradangan,menurunkan kadar kolestrol,menjaga kesehatan mata,dll.", R.drawable.anggur));
        buahs.add(new Buah("Jeruk", "Asia Tenggara",
                "Manfaat buah jeruk yaitu; melancarkan pencernaan,mengatur teganan darah tinggi,mencegah kanker,mencegah penyakit jantung,meninggkatkan kekebalan tubuh,memurnikan darah,memperkuat gigi,memperkuat tulang,dll.", R.drawable.jeruk));
        buahs.add(new Buah("Kurma", "Timur Tengah",
                "Manfaart buah kurma yaitu; bebas dari masalah konstipasi,gangguan pencernaan,,masalah jantung,anemia,disfungsi seksual,diare,kanker abdomen,dll.", R.drawable.kurma));
        buahs.add(new Buah("Pepaya", "Meksiko Selatan",
                "Manfaat buah pepaya yaitu; mengurangi resiko penyakit jantung,meningkatkan efek kolestrol baik,melancarkan pencernaan,sistem imun semakin perima,menyehatkan kulit dan rambut,menyembuhkan luka pada lapisan perut.", R.drawable.pepaya));
        buahs.add(new Buah("Tamarind", "Afrika",
                "Manfaat buah asam/tamarind yaitu; membantu menjaga kesehatan sistem pencernaan,menjaga kesehatan jantung,membantu mengontrol gula darah,menurunkan berat badan,melindungi organ hati.", R.drawable.tamarin));
        return buahs;

    }

    private static List<Planet> iniDataPlanet(Context ctx) {
        List<Planet>planets = new ArrayList<>();
        planets.add(new Planet("Bumi", "Tata Surya",
                "Bumi adalah planet ketiga dari Matahari yang merupakan planet terpadat dan terbesar kelima dari delapan planet dalam Tata Surya. Bumi juga merupakan planet terbesar dari empat planet kebumian Tata Surya. Bumi terkadang disebut dengan dunia atau Planet Biru", R.drawable.bumi));
        planets.add(new Planet("Jupiter", "Tata Surya",
                "Jupiter atau Yupiter adalah planet terdekat kelima dari Matahari setelah Merkurius, Venus, Bumi, dan Mars. Planet ini juga merupakan planet terbesar di Tata Surya", R.drawable.jupiter));
        planets.add(new Planet("Venus", "Tata Surya",
                "Venus adalah planet terdekat kedua dari Matahari setelah Merkurius. Planet ini mengorbit Matahari selama 224,7 hari Bumi.", R.drawable.venus));
        planets.add(new Planet("Saturnus", "Tata Surya",
                "Saturnus adalah planet keenam dari Matahari dan merupakan planet terbesar kedua di Tata Surya setelah Jupiter. Saturnus juga merupakan sebuah raksasa gas yang memiliki radius rata-rata sekitar 9 kali radius rata-rata Bumi", R.drawable.saturnus));
        planets.add(new Planet("Mercurius", "Tata Surya",
                "Merkurius adalah planet terkecil di Tata Surya sekaligus yang terdekat dari Matahari. Periode revolusi planet ini merupakan yang terpendek dari semua planet di Tata Surya, yakni 87,79 hari", R.drawable.mercury));
        planets.add(new Planet("Mars", "Tata Surya",
                "Mars adalah planet terdekat keempat dari Matahari. Namanya diambil dari dewa perang Romawi, Mars. Planet ini sering dijuluki sebagai \"planet merah\" karena tampak dari jauh berwarna kemerah-kemerahan", R.drawable.mars));
        return planets;
    }


        private static List<Bunga> iniDataBunga(Context ctx){
        List<Bunga>bungas = new ArrayList<>();
            bungas.add(new Bunga("Bunga Mawar", "Dataran Cina, Timur Tengah dan Eropa Timur.",
                    "Mawar merupakan tanaman bunga hias berupa herba dengan batang berduri. Mawar yang dikenal nama bunga ros atau Ratu Bunga merupakan simbol atau lambang kehidupan religi dalam peradaban manusia", R.drawable.mawar));
            bungas.add(new Bunga("Bunga Matahari", "Amerika",
                    "Bunga matahari (Helianthus annuus L.) adalah tumbuhan semusim dari suku kenikir-kenikiran (Asteraceae) yang populer, baik sebagai tanaman hias maupun tanaman penghasil minyak. Bunga tumbuhan ini sangat khas: besar, biasanya berwarna kuning terang, dengan kepala bunga yang besar (diameter bisa mencapai 30 cm)", R.drawable.matahari));
            bungas.add(new Bunga("Bunga Sepatu", "Asia Timur",
                    "Kembang sepatu (Kêmbang worawari; bahasa Latin: Hibiscus rosa-sinensis L.) adalah tanaman semak suku Malvaceae yang berasal dari Asia Timur dan banyak ditanam sebagai tanaman hias di daerah tropis dan subtropis.", R.drawable.bungasepatu));
            bungas.add(new Bunga("Bunga Anggrek", "Indonesia",
                    "uku anggrek-anggrekan (bahasa Latin: Orchidaceae) merupakan satu suku tumbuhan berbunga dengan anggota jenis terbanyak. Jenis-jenisnya tersebar luas dari daerah tropika basah hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya ditemukan di daerah tropika. Kebanyakan anggota suku ini hidup sebagai epifit, terutama yang berasal dari daerah tropika.", R.drawable.anggrek));
            bungas.add(new Bunga("Bunga Sedap malam", "Meksiko",
                    "Sedap malam (Polianthes tuberosa, bahasa Melayu: sundal malam) adalah tumbuhan hijau abadi dari suku asmat Minyak dari bunga ini digunakan dalam pembuatan parfum. Nama tuberosa menunjukkan bahwa tumbuhan ini memiliki umbi (tuber). Saat ini dikenal sekitar 12 spesies dari genus Polianthes.", R.drawable.sedapmalam));
            bungas.add(new Bunga("Bunga Jepun", "Amerika bagian tengah",
                    "bunga mentega atau bunga jepun (Nerium oleander) adalah tanaman perdu anggota keluarga Apocynaceae yang menghasilkan bunga sepanjang tahun. Bunga jepun berasal dari Afrika bagian utara, bagian timur Mediterania dan juga Asia Tenggara. Tanaman ini tumbuh dengan baik pada daerah kering beriklim hangat dan dapat dibudidayakan di berbagai daerah.", R.drawable.jepun));
            return bungas;
        }
         private static void iniAllSemestas(Context ctx){
        semestas.addAll(iniDataBuah(ctx));
        semestas.addAll(iniDataPlanet(ctx));
        semestas.addAll(iniDataBunga(ctx));
         }

        public static List<Semesta> getAllSemesta(Context ctx){
            if (semestas.size() == 0) {
                iniAllSemestas(ctx);
            }
            return semestas;
        }

        public static List<Semesta> getSemestasByTipe (Context ctx,String jenis){
        List<Semesta>semestasByType = new ArrayList<>();
            if (semestas.size() == 0) {
                iniAllSemestas(ctx);
            }
            for (Semesta h : semestas){
                if (h.getJenis().equals(jenis)){
                    semestasByType.add(h);
                }
            }
            return semestasByType;
        }

    }
