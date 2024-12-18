# 아이템43. API의 필수적이지 않은 부분을 확장 함수로 추출하라

클래스의 메서드를 정의할 때는 메서드를 멤버로 정의할 것인지 아니면 확장 함수로 정의할것인지 결정해야 합니다.<br>

두가지 방법은 거의 비슷합니다.<br>
호출하는 방법도 비슷하고 리플렉션으로 레퍼런싱 하는 방법도 비슷합니다.

두 방식중에 어떤 방식이 우월하다고 할 수 없습니다.

멤버와 확장의 가장큰 차이점은 확장은 따로 가져와서 사용해야 한다는 것입니다.<br>
일반적으로 확장은 다른 패키지에 위치합니다.<br>
확장은 우리가 직접 멤버를 추가 할 수 없는 경우 데이터와 행위를 분리하도록 설계된 프로젝트에서 사용됩니다.<br>
필드가 있는 프로퍼티는 클래스에 있어야 하지만 메서드는 클래스의 public API만 활용한다면 어디에 위치해도 상관없습니다.
임포트 해서 사용한다는 특징 덕분에 확장은 같은 타입에 같은 이름으로 여러개 만들수도 있습니다.<br>
여러 라이브러리에서 여러 메서드를 받을 수도 있고 충돌이 발생하지도 않는 다는 장점이 생깁니다.<br>
하지만 같은 이름으로 다른 동작을 하는 확장이 있다는것은 위험할 수 있습니다.<br>
위험 가능성이 있다면 멤버 함수로 만들어서 사용하는 것이 좋습니다.<br>
그렇게 하면 컴파일러가 항상 확장 대신 멤버 함수를 호출할 것 입니다.

또다른 차이점은 확장은 가상이 아니라는 것입니다.<br>
즉 파생 클레스에서 오버라이드 할 수 없습니다.<br>
확장 함수는 컴파일 시점에 정적으로 선택됩니다.<br>
확장 함수는 가상 멤버 함수와 다르게 동작합니다.<br>
상속을 목적으로 설계된 요소는 확장 함수로 만들면 안됩니다.

이러한 차이는 확장함수가 '첫 번째 아규먼트로 리시버가 들어가는 일반 함수'로 컴파일되기에 발생하는 결과입니다.<br>
추가로 확장 함수는 클래스가 아닌 타입에 정의하는 것 입니다. 그래서 nullable 또는 구체적인 제네릭 타입에도 확장 함수를 정의할수 있습니다.<br>
마지막으로 중요한 차이는 확장은 클래스 레퍼런스에서 멤버로 표시되지 않습니다. 그래서 확장 함수는 어노테이션 프로세서가 따로 처리하지 않습니다. 필수적이지 않은 요소를 확장함수로 추출하면 어노테이션 프로세스로 부터 숨겨집니다. 확장함수가 클래스 내부에 있는것이 아니기 때문입니다. 


## 정리
멤버와 확장 함수의 차이 비교
- 확장 함수는 읽어 들여야 합니다.
- 확장 함수는 virtual이 아닙니다.
- 멤버는 높은 우선 순위를 갖습니다.
- 확장 함수는 클래스 위가 아니라 타입 위에 만들어집니다.
- 확장 함수는 클래스 레퍼런스에 나오지 않습니다.

확장함수는 우리에게 더 많은 자유와 유연성을 줍니다.<br>
확장 함수는 상속, 어노테이션 처리 등을 지원하지 않고 클래스 내부에 없으므로 약간 혼동을 줄 수도 있습니다.<br>
API의 필수적인 부분은 멤버로 두는것이 좋지만 필수적이지 않은 부분은 확장 함수로 만드는것이 여러모로 좋습니다.