class Lynx : Feline() {
    override val image = "Lynx.jpg"
    override val food = "meat"
    override val habitat = "forests"
    init {
        hunger = 90
    }

    override fun makeNoise() {
        println("Zooaoooooaaarrr!")
    }

    override fun eat() {
        println("The lynx is eating $food")
    }
}