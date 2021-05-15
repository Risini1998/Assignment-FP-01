package Assignment01

object Assignment01 {
  def volume(radius:Int):Double={
    var vol:Double=0
    val pi=(22).toDouble/(7):Double
    vol=pi/2
    return vol
  }
  def main(args: Array[String]): Unit = {
    println(volume(5))
  }
}
