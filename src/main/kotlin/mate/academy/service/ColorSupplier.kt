package mate.academy.service

import mate.academy.model.Color
import kotlin.random.Random

class ColorSupplier : ColorProvider{
    override fun getRandomColor(): Color {
        return Color.values()[Random.nextInt(Color.values().size)]
    }
}
