# 아이템29. 외부 API를 랩(wrap)해서 사용하라
외부에서 제공하는 API는 불안정 할 수 있기 때문에 직접 결합시키지 않는것이 좋습니다.<br>
이런 경우 랩(wrap)해서 사용합니다.

장점(자유와 안정성)
- 문제가 있다면 래퍼(warpper)만 변경하면 되므로 API 변경에 쉽게 대응 할 수 있습니다.
- 프로젝트의 스타일에 맞춰서 API의 형태를 조정할 수 있습니다.
- 특정 라이브러리에서 문제가 발생하면 래퍼를 수정해서 다른 라이브러리로 변경할 수 있습니다.
- 필요한 경우 쉽게 동작을 추가하거나 수정할 수 있습니다.

단점
- 래퍼를 따로 정의해야 합니다.
- 다른 개발자가 프로젝트를 다룰때 어떤 래퍼들이 있는지 따로 확인해야 합니다.
- 래퍼들은 프로젝트 내부에서만 유효하므로 문제가 생겨도 질문 할 수 없습니다.

