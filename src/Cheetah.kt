class Cheetah : Feline() {
    override val image = "Cheetah.jpg"
    override val food = "meat"
    override val habitat = "forests"
    init {
        hunger = 90
    }

    override fun makeNoise() {
        println("Shreeiiiiikkk!")
    }

    override fun eat() {
        println("The cheetah is eating $food")
    }
}