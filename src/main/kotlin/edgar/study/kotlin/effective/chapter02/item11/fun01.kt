package edgar.study.kotlin.effective.chapter02.item11

// 구현A
//if (person != null && person.isAdult) {
//    view.showPerson(person)
//} else {
//    view.showError()
//}

// 구현B
//person?.takeIf { it.isAdult }
//    ?.let(view::showPerson)
//    ?: view::showError()


// 구현A(기존 코드에서 기능 추가)
//if (person != null && person.isAdult) {
//    view.showPerson(person)
//    view.hideProgressWithSuccess()
//} else {
//    view.showError()
//    view.hideProgress()
//}

// 구현B(기존 코드에서 기능 추가)
//person?.takeIf { it.isAdult }
//    ?.let {
//        view.showPerson(it)
//        view.hideProgressWithSuccess()
//    }
//    ?: run {
//        view.showError()
//        view.hideProgress()
//    }
