# 아이템32. 추상화 규약을 지켜라

규약은 개발자들의 단순한 합의입니다. 따라서 한쪽에서 규약을 위반할 수도 있습니다.<br>
규약은 보증(warranty)와 같습니다. 규약을 위반하면 코드가 작동을 멈췄을 때 문제가 됩니다.

## 상속된 규약
클래스를 상속하거나, 다른 라이브러리의 인터페이스를 구현할 때는 규약을 반디시 지켜야 합니다.


## 정리
프로그램을 안정적으로 유지하고 싶다면 규약을 지키세요.<br>
규약을 깰 수밖에 없다면, 이를 잘 문서화 하세요.<br>
이런 정보는 코드를 유지하고 관리하는 사람에게 큰 도움이 됩니다.<br>
