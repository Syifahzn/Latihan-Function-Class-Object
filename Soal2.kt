fun pangkat(angka: Int, bilPangkat : Int): Double {
    return Math.pow(angka.toDouble(), bilPangkat.toDouble())
}
fun main(args : Array<String>){
    println("4 pangkat 3 = ${pangkat(4,3)}")
}
