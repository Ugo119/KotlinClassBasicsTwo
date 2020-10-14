interface Roamable {
    var velocilty : Int
        get() = 20
        set(value) {
            println("Unable to update velocity")
        }

    fun roam()
}