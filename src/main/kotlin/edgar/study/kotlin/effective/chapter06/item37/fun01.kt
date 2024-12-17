package edgar.study.kotlin.effective.chapter06.item37

data class Player(
    val id: Int,
    val name: String,
    val points: Int,
)



fun ex37_01() {
    val player = Player(0, "edgar", 9999)
//    val (id, name, points) = player
//    val id: Int = player.component1()
//    val name: String = player.component2()
//    val points: Int = player.component3()
}
