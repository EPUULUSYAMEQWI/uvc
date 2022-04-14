fun main(){


    var currentAcc= CurrentAccount("09994","Equity",76800)
    //
    (String("cassava"))
}
open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Int){

    fun deposit(amount:Double){
        var total= balance+amount
        println(total.toString().toDouble())
    }
    open fun withdraw(amount:Double){
        var new =balance-amount
        println(new.toString().toDouble())
    }
    fun details(){
        var l =balance*2
        println(" Account number is $accountNumber with balance $balance")
    }
}
class SavingAccount(accountNumber: String,accountName: String,balance: Int):CurrentAccount(accountNumber,accountName,balance){



}

data class Product(var name:String,var weight:Int,var price:Int,var category:String)
fun takeProduct(): Product {
    var thing=Product("maa",2,100,"hygiene")
    var those =Product("spinach",2,77,"Hygiene")
    var that = Product("nyaks",3,400,"other")
    var all = mutableListOf<Product>(thing,those,that)
    when (that.category){
        "Eat"->println("Groceries")
        "Clean"-> println("Hygiene")
        "Nothing here"-> println("Other")
        else-> println("else")
    }
    return that
}
fun String(text:String):String{
    text.forEachIndexed { index, w ->
        if ((index%2)==0  ){
            println(w)
        }
    }
    return  text
}
