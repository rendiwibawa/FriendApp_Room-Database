# FriendApp_Room-Database
> ROM adalah singkatan dari Read Only Memory, dalam kasus Smartphone Android ROM ini menrujuk kepada media penyimpanan internal (Internal Storage) dimana firmware dan aplikasi bawaan tersimpan. ...

## Gimana Prosesnya 

Penyimpanan (database) local atau Room, perlu menambahkan plugin 'kotlin-kapt' pada build.gradle (module: app). Kemudian,
menambahkan library Room di dalam dependencies
apply plugin: 'kotlin-kapt'

....

    implementation 'android.arch.persistence.room:runtime:1.1.1'
    kapt 'android.arch.persistence.room:compiler:1.1.1'

## Lalu

Sebuah database berbasis table memerlukan sekumpulan perintah khusus untuk
mengakses data yang disebut dengan SQL (Structured Query Language). Pada database Room,
perlu dibuat sebuah interface berisi SQL yang disebut DAO. Sebuah DAO dapat diisi dengan
perintah SQL untuk menambahkan (insert), mengubah (update), menghapus (delete), dan
mengambil (get) data.

    MyFriendDao.kt

    @Dao
    interface MyFriendDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun tambahTeman(friend: MyFriend)
    @Query("SELECT * FROM MyFriend")
    fun ambilSemuaTeman(): LiveData<List<MyFriend>>
    } 
  
## Nampilinya ?

Untuk menampilkan data list pada RecyclerView, setidaknya ada 3 hal yang perlu dilakukan yaitu :
- [x] membuat data class untuk menampung data list item
- [x] membuat class RecyclerView
- [x] Adapter untuk menampilkan data per item
- [x] dan menampilkan data list pada RecyclerView.

# Itulah konsep penggunaan database lokal atau ROOM dan inilah hasil dari Praktikum kali ini :)

![Alt text]()
![Alt text]()
![Alt text]()


