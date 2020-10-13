class Fox : Canine() {
    override val image = "Fox.jpg"
    override val food = "meat"
    override val habitat = "forests"
    init {
        hunger = 90
    }

    override fun makeNoise() {
        println("AAaaarrr!")
    }

    override fun eat() {
        println("The fox is eating $food")
    }
}