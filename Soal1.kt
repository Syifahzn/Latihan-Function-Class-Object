fun Hitung_jarak(x1: Int, x2: Int, y1: Int, y2: Int){
    val jarak = ((x2 - x1)*(x2 - x1)) + ((y2 - y1)*(y2 - y1))
    val hasil = Math.sqrt(jarak.toDouble())
    println("Jarak antara dua buah titik adalah %.2f".format(hasil) + " satuan")
}
fun main(args: Array<String>){
    Hitung_jarak(2,8,3,7)
    Hitung_jarak(5,-8,3,-4)
}
