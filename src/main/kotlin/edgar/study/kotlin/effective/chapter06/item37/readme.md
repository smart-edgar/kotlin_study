# 아이템37. 데이터 집합 표현에 data 한정자를 사용하라
데이터를 한번에 전달해야할 때 객체를 생성하여 전달하는데 이때 data 한정자를 사용하면 자동으로 함수가 생성됩니다.
- toString
  - 클래스명 기본생성자 형태로 모든 프로퍼티 값을 출력
  - 로그/디버깅 시에 유용
- equals와 hashCode
  - equals 는 기본 생성자의 프로퍼티가 같으지 확인
  - hashCode 는 equals 와 같은 결과
- copy
  - immutable 데이터 클래스를 만들때 편리
  - 기본 생성자 프로퍼티가 같은 새로운 객체로 복제
  - 얕은 복사이지만 immutable 일 경우 상관 없음(immutable 은 깊은 복사가 필요 없음) 
- componentN(component1, component2 등)
  - 위치 기반으로 객체를 해제


## 튜플 대신 데이터 클래스 사용하기
데이터 클래스는 튜플보다 많은 것을 제공합니다.<br>
코틀린의 튜틀은 Serializable을 기반으로 만들어지며 toString을 사용할 수 있는 제네릭 데이터 클래스 입니다.

Pair와 Triple은 코틀린에 남아 있는 마지막 튜플입니다.<br>
튜플은 (Int, String, String, Long)처럼 괄호와 타입 지저을 통해 원하는 형태의 튜플을 정의할 수 있었습니다.<br>
튜플은 데이터 클래스와 같은 역활을 하지만 훨씬 가독성이 나빴습니다.<br>
튜플은 좋아보이지만 언제나 데이터 클래스를 사용하는 것이 더 좋았기 때문에 점차 없어진것입니다.<br>
Pair와 triple은 몇가지 지역적인 목적으로 인해 남아있을 뿐입니다.
- 값에 간단하게 이름을 붙일 때
- 표준 라이브러리에서 볼 수 있는 것처럼 미리 알수 없는 aggregation을 표현할때

위 경우를 제외하고 데이터 클레스를 사용하는 것이 좋습니다.

이름을 정의할때 `Pair<String, String>`으로 정의하면 name, surname 이 어떤값인지 알기 어렵습니다.
위 예시를 데이터 클래스로 작성할때 추가 비용은 거의 들지 않으며 오히려 명확하게 만들어 줍니다.
- 함수의 리턴타입이 더 명확해짐
- 리턴 타입이 더 짧아지며 전달하기 쉬워짐
- 사용자가 데이터 클래스에 적혀있는 것과 다른 이름을 활용해 변수를 해제하면 경고가 출력
