# 아이템13. Unit?을 리턴하지 말라
Boolean이 true 또는 false를 갖는것 처럼 Unit?은 Unit 또는 null이라는 값을 가질수 있습니다.<br>
따라서 Boolean과 Unit? 타입은 서로 바꿔서 사용할 수 있습니다.<br>

Unit?을 쉽게 읽을수 있는 경우는 거의 보지 못하기 때문에 오해를 불러 일으키기 쉽습니다.<br>
따라서 Boolean을 사용하는 형태로 변경하는 것이 좋습니다.
