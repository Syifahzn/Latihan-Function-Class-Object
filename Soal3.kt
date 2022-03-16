class Barang(val nama: String, var harga: Int, var jumlah: Int, var diskon: Int) {
    val namaBarang = nama
    var hargaBarang = harga
    var jumlahBarang = jumlah
    var diskonBarang = diskon

    fun tampil(){
        println("Nama : $namaBarang" )
        println("Harga : $hargaBarang")
        println("Jumlah : $jumlahBarang")
        println("Diskon : $diskonBarang%")
    }
    fun hitungTotal(){
        var total = hargaBarang * jumlahBarang * diskonBarang
        println("Total : $total")
    }
}

fun main(args: Array<String>){
    val chitato = Barang("Chitato", 5000, 2, 10)
    chitato.tampil()
    chitato.hitungTotal()
}
