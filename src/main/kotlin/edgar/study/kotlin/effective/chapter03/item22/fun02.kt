package edgar.study.kotlin.effective.chapter03.item22

//fun <T : Comparable<T>> Iterable<T>.sorted(): List<T> {
//    // ...
//}
//
//fun <T, C : MutableCollection<in T>> Iterable<T>.toCollection(destination: C): C {
//    // ...
//}
//
//class ListAdapter<T: ItemAdapter>(/*..*/) {
//    // ...
//}

//inline fun <T, R : Any> Iterable<T>.mapNotNull(
//    transform: (T) -> R?
//): List<R> {
//    return mapNotNullTo(ArrayList<R>(), transform)
//}
//
//fun <T: Animal> pet(animal: T) where T: GoodTempered {
//    // ...
//}
//
//fun <T> pet(animal: T) where T: Animal, T: GoodTempered {
//    // ...
//}
