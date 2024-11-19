package edgar.study.kotlin.effective.chapter02.item17

//아규먼트 안넣은 코드
val text = (1..10).joinToString("|")
//아규먼트 명을 넣어주자
val text2 = (1..10).joinToString(separator = "|")
//아규먼트 대신 변수를 활용
val separator = "|"
val text3 = (1..10).joinToString(separator)
//아규먼트와 변수를 둘다 사용
val text4 = (1..10).joinToString(separator = separator)

//sleep(100)
//sleep(timeMillis = 100)
//sleep(Millis(100))
//sleep(100.ms)
