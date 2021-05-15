package Assignment01

object Assignment01 {

  def farenhite(celcius:Double):Double={
    var fara:Double=0
    fara=celcius*1.8+32
    return fara
  }

  def volume(radius:Int):Double=4.0/3.0*22.0/7.0*radius*radius*radius

  def cost(books:Int):Double={
    var cos:Double=0
    cos=books*24.95*40.0/100.0 + 3.0
    if(books>50)
      cos+=(books-50)*0.75
    return cos
  }

  def main(args: Array[String]): Unit = {
    println("35 C = "+ farenhite(31) + " F")
    println("Volume of a sphere with radius 5 = " + volume(5))
    println("Total wholesale cost for 60 copies = Rs. " +  cost(60))
  }

}
