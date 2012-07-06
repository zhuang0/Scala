class Person(val firstName: String, val lastName: String){
    private var position: String = _
    println("Creating " + toString())
    def this(firstName: String, lastName: String, positionHeld: String){
        this(firstName, lastName)
        position = positionHeld
    }
    override def toString(): String = {
        firstName + " " + lastName + " holds " + position + " position "
    }
}

val john = new Person("John", "Smith", "Analyst")
println(john)
val bill = new Person("Bill", "Walker")
println(bill)
