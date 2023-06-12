package id.infinitelearning.KotlinSubmission.exercise5

import id.infinitelearning.KotlinSubmission.exercise1.myProfile

class Hero {
    private var name: String = ""
    private var age: Int = 0
    private var height: Double = 0.0

    fun setProfile(name: String, age: Int, height: Double) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun jalan() {
        println("$name sedang jalan.")
    }

    fun lari() {
        println("$name sedang lari.")
    }

    fun makan() {
        println("$name sedang makan.")
    }

    fun minum() {
        println("$name sedang minum.")
    }

    fun lompat() {
        println("$name sedang lompat.")
    }

    fun duduk() {
        println("$name sedang duduk.")
    }

    fun profile() {
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
    }
}

fun main() {
    val hero = Hero()
    hero.setProfile("Naruto", 25, 180.0)

    val activities = arrayOf(
        "jalan", "lari", "makan", "minum", "lompat", "duduk"
    )
    val groups = arrayOf(
        arrayOf(5, 2, 3, 1, 3, 1),
        arrayOf(2, 2, 1, 3, 1, 2),
        arrayOf(3, 1, 5, 1, 5, 3),
        arrayOf(5, 4, 4, 4, 3, 2),
        arrayOf(4, 1, 3, 5, 5, 3),
        arrayOf(2, 4, 2, 2, 7, 4)
    )

    val groupNumber = 6
    val groupIndex = groupNumber - 1

    println("Aktivitas Group $groupNumber:")
    for (i in activities.indices) {
        val activity = activities[i]
        val count = groups[groupIndex][i]

        for (j in 1..count) {
            when (activity) {
                "jalan" -> hero.jalan()
                "lari" -> hero.lari()
                "makan" -> hero.makan()
                "minum" -> hero.minum()
                "lompat" -> hero.lompat()
                "duduk" -> hero.duduk()
            }
        }
    }

    hero.profile()
}
 */



/**
Challenge:
Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
 **/

/**
 * Latihan 4
 * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
 *
 */




/**
 * Latihan 5
 * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
 *
 */