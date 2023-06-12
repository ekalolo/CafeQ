package id.infinitelearning.KotlinSubmission.exercise5

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
    hero.setProfile("Melisyah", 21, 160.0)

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