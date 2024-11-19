package edgar.study.kotlin.effective.chapter02.item17

//val view = linearLayout {
//    text("Click below")
//    button({}, {})
//}

//val view = linearLayout {
//    text("Click below")
//    button(onClick = {}) {
//
//    }
//}

fun cell(before: () -> Unit = {}, after: () -> Unit = {}) {
    before()
    println("Middle")
    after()
}

//이름 붙이기 전
//call({println("CALL")})
//call {println("CALL")}

//이름 붙여서 사용
//call(before = {println("CALL") })
//call(fater = {println("CALL") })

//Java
//observable.getUsers()
//        .subscribe((List<User> users) -> {
//            //onNext
//        }, (Throwable throwable) -> {
//            //onError
//        }, () -> {
//            //onCompleted
//        })

//Kotlin
//observable.getUsers()
//        .subscribeBy(
//            onNext = { users: List<User> ->
//                //onNext
//            },
//            onError = { throwable: Throwable ->
//                //onError
//            },
//            onComplete = {
//                //onCompleted
//            }
//        )
