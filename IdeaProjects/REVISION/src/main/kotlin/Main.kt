import java.sql.CallableStatement

fun main() {
  var name ="Yvonne"
  var age = 22
  var idNumber= 4566545
    var weight = 45.0
    var citizen ="Kenya"
    var iskenyan=true
    println(name)
    println(age)
    println(idNumber)
    println(weight)
    println(citizen)
    println(iskenyan)
  mystr("yvonne")
  println(mynew(98,34))
  println(mynums(6,8,9,6))
  fact("I love apples")
  myString("akirachix")
  println(mytxt("yvonne",32))
  println(myword("hello"))
  println(myword("yvonne"))
}
fun mystr(name: String){
  println("hello $name")
}
fun mynew(num1:Int,num2: Int):Int{
  return num1%num2
}
fun mynums(num3:Int,num4:Int,num5:Int,num6:Int):Int{
  return (num3+num4+num5+num6)
}
fun fact(text:String){
  println(text)
}
fun myString(statement:String){
  println(statement[0]+""+statement[2]+""+statement[3])
}
fun mytxt(name:String,age:Int):String{
  return "hi my name is $name and i am $age years old"
}
fun myword(word:String):Int{
  return word.length
}
fun myname(name:String){
  if (name=="yvonne"){
    println("that's me!")
  }
  else {
    println("i do not know who that is")
  }

}



