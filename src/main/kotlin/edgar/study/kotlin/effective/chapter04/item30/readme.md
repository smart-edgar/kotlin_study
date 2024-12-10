# 아이템30. 요소의 가시성을 최소화하라
작은 인터페이스는 배우기 쉽고 유지하기 쉽습니다.<br>
기능이 많은 클래스보다는 적은 클래스를 이해햐는 것이 쉽습니다.<br>

보이는 요소 자체가 적다면, 유지보수도하고 테스트 할 것이 적습니다.<br>


## 가시성 한정자 사용하기
클래스 멤버 가시성 한정자
- public(디폴트) : 어디서나 볼 수 있습니다.
- private : 클래스 내부에서만 볼 수 있습니다.
- protected : 클래스와 서브클래스 내부에서만 볼 수 있습니다.
- internal : 모듈 내부에서만 볼 수 있습니다.

톱레벨 요소 가시성 한정자
- public(디폴트) : 어디서나 볼 수 있습니다.
- private : 같은 파일 내부에서만 볼 수 있습니다.
- internal : 모듈 내부에서만 볼 수 있습니다.


가시성 한정자는 DTO(데이터를 저장하도록 설계된 클래스)에서는 적용하지 않는 것이 좋습니다.<br>
데이터를 저장하도록 설계된 클래스는 숨길 이유가 없기 때문입니다.

가시성 한정자를 사용하는것의 한가지 큰 제한은 API를 상속할 때 오버라이드해서 가시성을 제한 할 수는 없다는것입니다.<br>
서브클래스가 슈퍼클래스로도 사용될 수 있기 때문입니다. 이것이 상속보다 컴포지션을 선호하는 대표적인 이유입니다.

## 정리
가시성은 최대한 제한적인 것이 좋습니다.
- 인터페이스가 작을 수록 이를 공부하고 유지하는 것이 쉽습니다.
- 최대한 제한이 되어 있어야 변경하기 쉽습니다.
- 클래스의 상태를 나타내는 프로퍼티가 노출되어 있다면 클래스가 자신의 상태를 책임질 수 없습니다.
- 가시성이 제한되면 API의 변경을 쉽게 추적할 수 있습니다.