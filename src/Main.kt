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
}
