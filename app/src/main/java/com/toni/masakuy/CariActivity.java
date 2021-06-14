package com.toni.masakuy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CariActivity extends AppCompatActivity {

    ActionBar actionBar;

    String names[] = {
            "\n"+"Bahan-bahan :\n" +
            "- 1 piring nasi\n" +
            "- 1 butir Telur\n" +
            "- 3 siung bawang merah\n" +
            "- 1 siung bawang putih\n" +
            "- 2 buah cabai merah\n" +
            "- garam secukupnya\n" +
            "- penyedap rasa secukupnya\n" +
            "- 1 buah kemiri \n" +
            "- kecap manis secukupnya\n" +
            "- sedikit terasi1 buah tomat\n" +
            "- 1 buah timun\n" +
            "- minyak goreng\n"+
            "\n"+"Cara Pembuatannya :\n" +
            "1. Haluskan bawang merah, bawang putih, cabai merah, kemiri, garam, kemiri dan terasi.\n" +
            "2. Panaskan minyak di wajan, kemudian masukkan satu butir telur. Orak arik telur hingga matang kemudian tiriskan.\n" +
            "3. Kemudian tumis bumbu yang sudah dihaluskan hingga harum.\n" +
            "4. Jika bumbu sudah tercium harum, tambahkan nasi, aduk aduk hingga tercampur rata.\n" +
            "5. Tambahkan telur yang sudha dimasak sebelumnya.\n" +
            "6. Kemudian masukkan kecap sedikit demi sedikit sesuai selera.\n" +
            "7. Jangan lupa tambahkan penyedap rasa agar lebih gurih.\n" +
            "8. Aduk-aduk hingga tercampur rata semuanya.\n" +
            "9. Angkat nasi goreng dari wajan, tambahkan irisan timun dan tomat agar semakin nikmat.\n",
            "\n"+ "Bahan-bahan :\n"+"-1/2 kilogram (kg) daging \n" +
                    "-Jahe sebesar ruas jempol\n" +
                    "-Laos sebesar ruas jempol,\n" +
                    "-2 daun salam\n" +
                    "-2 daun jeruk\n" +
                    "-Garam dan merica\n" +
                    "-Minyak goreng\n" +
                    "-Penyedap kaldu jamur\n" +
                    "-5 bawang merah\n" +
                    "-1 timun\n" +
                    "-2 potong tomat\n" +
                    "-Kecap sesuai selera\n" +
                    "-4 potong cabai rawit\n" +
                    "-2 cabai keriting\n"+"\n"+"Cara Pembuatnnya :\n" +
                    "1. Siapkan dan ulek semua bahan untuk bumbu halus.\n" +
                    "2. Rebus daging dan masukkan bumbu halus. Tambahkan daun salam, daun jeruk, garam, merica, jahe, dan laos. Masak dan aduk sedikit sampai empuk.\n" +
                    "3. Angkat daging dan beri minyak, totole (±1 sdm), dan kecap (±3 sdm). Aduk sampai rata.\n" +
                    "4. Masukkan daging ke dalam tusukan sate satu per satu.\n" +
                    "5. Bakar sate hingga mencapai tingkat kematangan yang diinginkan.\n" +
                    "6. Hidangkan sate dengan kecap yang sudah dicampur irisan bawang merah segar, timun, tomat, dan cabai rawit.\n",
            "\n"+"Bahan-bahan :\n" +
            "-Sekitar 500 g daging sapi giling\n" +
            "-6 bun burger\n" +
            "-1 kuning telur\n" +
            "-½ bawang bombay\n" +
            "-Saus tomat\n" +
            "-1 sendok saus Worcestershire\n" +
            "-1 sendok makan mustard\n" +
            "-1 sendok makan lada putih\n" +
            "-1 siung bawang putih\n" +
            "-Sedikit daun bumbu segar\n" +
            "-Lada dan garam\n" +
            "-2 tomat segar, iris tipis\n" +
            "-6 lembar keju\n" +
            "-Daun selada\n" +
            "-Saus tomat\n" +
            "-Mayonnaise\n"+
                    "\n"+"Cara Pembuatnnya :\n" +
            "1. Pilih daging yang tepat. Mintalah kepada tukang daging untuk menggiling daging sapi yang mengandung 15% lemak. Jika Anda menggunakan lebih banyak lemak, lemak ini hanya akan menetes dari daging dan menyebabkan api menjadi lebih bsar sehingga burger menjadi kering. Jika memungkinkan, belilah daging di hari saat Anda memasaknya.\n" +
            "2. Mintalah tukang daging untuk menggiling daging pilihan Anda dua kali. Satu kali dengan gilingan kasar dan kemudian dengan gilingian yang lebih halus.\n" +
            "3. Letakkan daging sapi giling di dalam mangkuk. Anda akan menambahkan bahan lain ke dalamnya setelah siap.\n" +
            "4. Cincang kasar bawang bombay dan bawang putih. Masukkan ke dalam mangkuk dan campurkan hingga rata.\n" +
            "5. Tambahkan bahan lain yang ingin Anda tambahkan ke dalam burger. Termasuk saus Worcestershire, saus tomat, mustard, atau irisan daun bumbu. Bahan-bahan ini bisa ditambahkan sesuai selera Anda, tapi bahan-bahan ini tentu bisa menambahkan rasa ke dalam burger buatan Anda.\n" +
            "6. Tambahkan telur kuning. Bumbui satu butir telur kuning dengan lada dan garam, campurkan hingga rata. Campurkan dengan sendok, lalu lanjutkan menggunakan tangan Anda yang sudah bersih hingga semua bahan tercampur rata.\n" +
            "7. Buat burger. Pegang daging sesedikit mungkin, agar cairan lemaknya tidak banyak keluar.\n" +
            "8. Bentuk burger menjadi 6 bola daging yang berukuran sama besar menggunakan tangan Anda.\n" +
            "9. Tekan bola daging ini ke bawah untuk membuatnya rata hingga setebal kurang lebih (1.27cm). Buat cekungan kecil di bagian tengah burger dengan ibu jari Anda. Hal ini akan membuat bagian tengah burger menggembung, sehingga burger masak tidak merata.\n" +
            "10. Letakkan burger di atas piring. Tutupi dengan plastik atau kertas minyak. Dinginkan selama 30 menit hingga beberapa jam untuk membuatnya lebih kaku sehingga lebih mudah dimasak. Daging burger paling bagus dimasak saat dingin.\n" +
            "11. Pilih cara memasak Anda. Burger buatan rumah bisa dimasak dengan panggangan, atau digoreng, atau dibakar. Pilih metode sesuai dengan peralatan yang Anda miliki serta rasa dan tekstur burger yang Anda inginkan. Apapun metode memasak yang Anda pilih, setelah mengeluarkan burger dari lemari es, semprotkan sedikit minyak atau sapukan sedikit butter yang telah dilelehkan sebelum memasaknya. Berikut ini adalah beberapa metode yang bisa Anda gunakan\n" +
            "12. Panggangan: Panaskan panggangan (bagian atas) hingga panas medium. Lapisi pinggan yang digunakan untuk memanggang dengan foil, agar lebih mudah dibersihkan setelah selesai. Letakkan burger ke dalam pinggan. Panggang selama 6 - 7 menit untuk setiap sisinya hingga masak merata.\n" +
            "13. Penggorengan: Tambahkan minyak atau butter ke dalam penggorengan dan gorenglah burger. Pastikan untuk menggunakan api kecil dan memasak lebih lama untuk memastikan burger masak seluruhnya.\n" +
            "14. Letakkan burger di bakaran barbecue. Masak seperti biasa Anda memasak hamburger dengan barbecue.\n" +
            "15. Panggang dengan oven: Letakkan burger di dalam oven pada suhu 350ºF/180ºC selama 15 hingga 30 menit, tergantung kepada ketebalannya. Balik burger Anda setelah masak setengahnya, dan memeriksa kematangannya beberapa waktu.\n" +
            "16. Sementara menunggu burger Anda matang, siapkan toppingnya. Anda bisa pilih topping apapun yang Anda suka, dan berikut ini adalah pilihan topping burger tradisional yang bisa Anda pertimbangkan: Cuci selada dan tomat, Bagi dua bun burger, dan iris tipis tomat. Siapkan saus tomat dan mayonaise di meja makan sesuai selera.\n" +
            "17. Hidangkan. Setelah burger matang sesuai selera, hidangkan burger. Letakkan topping di dalam bun burger dan hidangkan di meja makan."+"\n",
            "\n"+"Bahan-bahan :\n" +
            "- 2 genggam beras\n" +
            "- 2 genggam beras ketan\n" +
            "- 2 lembar nori/rumput laut\n" +
            "- 1 sendok makan kecap asing\n" +
            "- 1 sendok makan cuka beras\n" +
            "- 1 butir telur\n" +
            "- 1 buah timun\n" +
            "- 1/2 wortel\n" +
            "- 1 sosis bratwurst ukuran sedang\n" +
            "- 1 siung bawang putih cincang\n" +
            "- Mayones secukupnya\n" +
            "- Garam secukupnya\n" +
            "\n"+"Cara Pembuatnnya :\n" +
            "1. Siapkan penanak nasi.\n" +
            "2. Masak terlebih dahulu nasi sushinya, dengan mencampurkan beras biasa dan beras ketan dengan air sekitar 250 ml.\n" +
            "3. Gunakan api kecil dan masak nasi sampai setengah matang.\n" +
            "4. Selama menunggu, potong timun, wortel, dan sosis, dengan potongan memanjang.\n" +
            "5. Jika nasi sudah setengah matang, kukus kembali nasi bersama dengan sosis dan wortel yang sudah dipotong.\n" +
            "6. Biarkan hingga nasi matang dan pulen, pindahkan dalam wadah lain.\n" +
            "7. Tambahkan kecap asin dan cuka beras, aduk rata.\n" +
            "8. Goreng bawang putih hingga kecokelatan, angkat dan tiriskan.\n" +
            "9. Goreng telur dadar, jangan lupa tambahkan garam dan lada.\n" +
            "10. Potong telur dadar dengan memanjang.\n" +
            "11. Siapkan penggulung sushi, atau bisa juga dengan plastik segi empat.\n" +
            "12. Letakkan nori di paling bawah.\n" +
            "13. Selanjutnya nasi, ratakan di atas nori.\n" +
            "14. Susun sosis, wortel, dan telur di atasnya.\n" +
            "15. Taburkan bawang putih goreng.\n" +
            "16. Tambahkan mayones.\n" +
            "17. Gulung sushi dengan memberikan sedikit tekanan agar padat.\n" +
            "18 Potong seukuran 1,5 cm dengan pisau tajam.\n" +
            "19. Sushi roll siap disajikan."+"\n",
            "\n"+"Bahan-bahan :\n" +
            "-250 gram mie siap saji\n" +
            "-100 gram daging ayam \n" +
            "-2 bakso sapi siap saji\n" +
            "-2 bakso ikan siap saji\n" +
            "-2 udang besar sudah dikupas\n" +
            "-Sawi hijau sudah dipotong\n" +
            "-1 siung bawang putih\n" +
            "-2 sendok makan tepung maizena\n" +
            "-¼ sendok teh jahe yang dipatur\n" +
            "-350 ml air kaldu ayam\n" +
            "-1000 ml air untuk rebusan\n" +
            "-1 sendok teh kecap Jepang \n" +
            "-1 sendok teh kecap manis\n" +
            "-1 sendok makan saus thailand\n" +
            "-1 sendok makan minyak ikan\n" +
            "-½ sendok teh garam \n" +
            "-½ sendok teh gula pasir\n" +
            "\n"+"Cara Pembuatnnya :\n" +
            "1. Siapkan panci dan air untuk merebus mie, kemudian panaskan hingga mendidih.\n" +
            "2. Masukan mie ramen ke dalam panci dengan air yang sudah mendidih.\n" +
            "3. Tunggu hingga matang dan mie mengapung, kemudian angkat lalu tiriskan.\n" +
            "4. Siapkan panci penggorangan anda, masukan minyak ke dalamnya.\n" +
            "5. Tumis bawang putih bersama dengan jahe hingga tercium aroma yang harum.\n" +
            "6. Tambahkan air kaldu bumbu-bumbu seperti kecap jepang, kecap manis, saus sambal Thailand, minyak ikan, garam, dan gula pasir.\n" +
            "7. Jangan lupa juga tambahkan bakso dan sawi hijau, kemudian terus aduk hingga matang.\n" +
            "8. Masukan larutan maizena ke dalam tumisan kemudian aduk hingga mengental, namun jangan terlalu kental.\n" +
            "9. Siapkan mangkok saji anda.\n" +
            "10. Ambil kuahnya dan tempatkan dalam mangkok saji.\n" +
            "11. Ambil mie yang telah dibuat di awal, kemudian masukan mie anda ke dalam kuah tersebut.\n" +
            "12. Sajikan mie ramen ini selagi hangat kepada keluarga anda."+"\n"};
    String emails[] = {"Nasi Goreng","Sate Ayam","Burger","Sushi","Ramen"};
    int images[] = {R.drawable.nasigoreng, R.drawable.fotosateayam, R.drawable.fotoburger, R.drawable.fotosushi, R.drawable.fotoramenpng};
    //int video[] = {R.raw.nasigorengvideo,R.raw.sateayamvideo,R.raw.burgervideo,R.raw.sushivideo,R.raw.ramenvideo};

    List<ItemsModel> itemsModelList = new ArrayList<>();

    ListView listView;

    CustomAdapter customAdapter;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_cari);

        listView = findViewById(R.id.listview);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        for(int i = 0;i < names.length;i++){

            ItemsModel itemsModel = new ItemsModel(names[i],emails[i],images[i]);//,video[i]);

            itemsModelList.add(itemsModel);

        }

         customAdapter = new CustomAdapter(itemsModelList,this);

        listView.setAdapter(customAdapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.search_menu,menu);

        MenuItem menuItem = menu.findItem(R.id.searchView);

        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                Log.e("Main"," data search"+newText);

                customAdapter.getFilter().filter(newText);



                return true;
            }
        });


        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();


        if(id == R.id.searchView){

            return true;
        }



            return super.onOptionsItemSelected(item);
    }


    public class CustomAdapter extends BaseAdapter implements Filterable {

        private List<ItemsModel> itemsModelsl;
        private List<ItemsModel> itemsModelListFiltered;
        private Context context;

        public CustomAdapter(List<ItemsModel> itemsModelsl, Context context) {
            this.itemsModelsl = itemsModelsl;
            this.itemsModelListFiltered = itemsModelsl;
            this.context = context;
        }



        @Override
        public int getCount() {
            return itemsModelListFiltered.size();
        }

        @Override
        public Object getItem(int position) {
            return itemsModelListFiltered.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.row_items,null);


            TextView names = view.findViewById(R.id.name);
            TextView emails = view.findViewById(R.id.email);
            ImageView imageView = view.findViewById(R.id.images);

            names.setText(itemsModelListFiltered.get(position).getName());
            emails.setText(itemsModelListFiltered.get(position).getEmail());
            imageView.setImageResource(itemsModelListFiltered.get(position).getImages());


            //view.setOnClickListener(new View.OnClickListener() {
             //   @Override
              //  public void onClick(View v) {
               //     Log.e("main activity","item clicked");
               //     startActivity(new Intent(MainActivity.this,ItemsPreviewActivity.class).putExtra("items",itemsModelListFiltered.get(position)));

            //    }
           // });

            return view;
        }



        @Override
        public Filter getFilter() {
            Filter filter = new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {

                    FilterResults filterResults = new FilterResults();
                    if(constraint == null || constraint.length() == 0){
                        filterResults.count = itemsModelsl.size();
                        filterResults.values = itemsModelsl;

                    }else{
                        List<ItemsModel> resultsModel = new ArrayList<>();
                        String searchStr = constraint.toString().toLowerCase();

                        for(ItemsModel itemsModel:itemsModelsl){
                            if(itemsModel.getName().contains(searchStr) || itemsModel.getEmail().contains(searchStr)){
                                resultsModel.add(itemsModel);

                            }
                             filterResults.count = resultsModel.size();
                                filterResults.values = resultsModel;
                        }


                    }

                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {

                    itemsModelListFiltered = (List<ItemsModel>) results.values;
                    notifyDataSetChanged();

                }
            };
            return filter;
        }


    }
    @Override
    public  boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CariActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }



}
