package edgar.study.kotlin.starter.lec03

fun main() {

}

fun type() {
    val iNum = 3 //Int 3
    val lNum = 3L //Long 3
    val fNum = 3.0F //Float 3
    val dNum = 3.0 //Double 3
}

fun convertType() {
    val iNum: Int = 3
    val lNum: Long = iNum.toLong() //java에서는 lNum = iNum 하였을때 자동으로 Long형으로 변경되지만
                                   //kotlin에서는 toLong()을 안붙여주면 에러 발
    val num1 = 3
    val num2 = 10
    val num3 = num1 / num2.toDouble() // 나누기 할때 소수점 까지 확인하려면 toDouble을 붙여줘야함

    val num4: Int? = 3
    val num5: Long? = num4?.toLong() ?: 0 //num4가 null이 올수 있기에 toLong 할때도 elvis 연산자 처리해줘야함
}

fun convertObjectType(obj: Any) { //Object가 아닌 Any
    if (obj is Person) { //java의 instanceof가 아니라 is로 사용
        var person: Person = obj as Person // java의 (Person) obj 가 아니라 as Person을 사용
//        obj.name //위의 변환을 안하고 바로 obj에서 사용도 가능
    }
//    obj.name //위 if문 안에서는 name을 가져올수 있으나 if문 밖에서는 name을 가져올수 없음
               //위 if문 안에서는 obj가 Person이라는 것을 알수 있지만(스마트 캐스트) if문 밖에서는 어떤 타입인지 알수가 없음

//    if (obj !is Person) // (obj is Person)의 부정형(반대)
}

fun convertNullableObjectType(obj: Any?) {
    var person: Person? = obj as? Person //obj가 null이 아닐경우 Person 타입으로 변환하고 null일 경우 null로 리턴
                                         //: Person?는 생략 가능
    person?.name ?: null //person이 null일 경우 null로 리턴
}

fun onlyKotlinType() {
    var any: Any //Java의 Object와 같은 최상위 객체
    var unit: Unit //Java의 void와 같음, Unit은 자체로 타입인자로 사용가능(제네릭 때 다시 설명..)
    var nothing: Nothing //정상적으로 끝나지 않음 표시, 무조건 예외를 던지는 함수 또는 무한루프 함수등..
}

fun stringInterpolation() {
    var person = Person("AA", "BB")
    //Java
    var java = String.format("%s - %s", person.name, person.title)
    //Kotlin
    val kotlin = "${person.name} - $person.title" //String에 변수를 넣을때 ${변수명} 또는 $변수명 으로 넣을수 있음
                                                  //하지만 ${변수명}을 사용 권장(가독성, 일괄변환, 정규식활용)

//    StringBuffer sb = new StringBuffer()
//    sb.append(person.name).append(" - ").append(person.title)

    var multiLine = """
        가나다라
        마바사
        ${person.name} - ${person.title}
    """.trimIndent() //멀티 라인을 작성할때 따옴표 3개를 이용해서 사용한다.
}

fun stringIndex() {
    //Java
    //String s1 = "Java"
    //s1.charAt(1)

    //Kotlin
    var s2 = "Kotlin"
    s2[1] //배열로 처리
}

class Person (name: String, title: String) {
    val name = name
    var title = title
}