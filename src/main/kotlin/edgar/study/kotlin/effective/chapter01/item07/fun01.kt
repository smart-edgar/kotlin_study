package edgar.study.kotlin.effective.chapter01.item07

//inline fun <reified T> String.readObjectOrNull(): T? {
//    if (incorrectSign) {
//        return null
//    }
//
//    return result
//}
//
//inline fun <reified T> String.readObject(): Result<T>? {
//    if(incorrectSign) {
//        return Failure(JsonParsingException())
//    }
//    return Success(result)
//}
//
//sealed class Result<out T>
//class Success<out T>(val result: T) : Result<T>()
//class Failure(val throwable: Throwable) : Result<Nothing>()
//
//class JsonParsingException: Exception()
