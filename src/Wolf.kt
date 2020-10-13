class Wolf : Canine() {
    override val image = "Wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"
    init {
        hunger = 90
    }

    override fun makeNoise() {
        println("hooooooooowl!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }

//    override fun roam() {
//        println("The Canine is prowling")
//    }
}