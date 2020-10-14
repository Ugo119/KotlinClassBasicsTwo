fun main() {
    val myFirstWolf = Wolf()
    val hippo = Hippo()
    myFirstWolf.makeNoise()
    myFirstWolf.roam()
    myFirstWolf.sleep()

    val animals = arrayOf(Hippo(), Wolf(), Lion(), Cheetah(), Lynx(), Fox())
    for (animal in animals) {
        animal.makeNoise()
    }

    var vet = Vet()
    vet.giveShot(myFirstWolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Lynx(), Vehicle())
    for (item in roamables) {
        item.roam()
        if (item is Animal) {
            item.sleep()
            item.eat()
        }
    }

}
