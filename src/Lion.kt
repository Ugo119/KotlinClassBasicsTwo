class Lion : Feline() {
    override val image = "Lion.jpg"
    override val food = "meat"
    override val habitat = "forests"
    init {
        hunger = 90
    }

    override fun makeNoise() {
        println("Roooooaaarrr!")
    }

    override fun eat() {
        println("The lion is eating $food")
    }
}