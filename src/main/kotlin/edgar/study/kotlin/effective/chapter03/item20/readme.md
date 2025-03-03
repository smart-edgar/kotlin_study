# 아이템20. 일반적인 알고리즘을 반복해서 구현하지 말라
비지니스로직이 아닌 수학적인 연서느 수집 처리처럼 별도의 모듈 또는 라이브러리로 분리할수 있는것은 라이브러리를 활용하라
- 코드 작성 속도가 빨라집니다. 호출을 한번 하는 것이 알고리즘을 만드는 것보다 빠릅니다.
- 구현을 따로 읽지 않아도 함수의 이름 등만 보고도 무엇을 하는지 확실하게 알수 있습니다.
- 직접 구현할 때 발생할 수 있는 실수를 줄일 수 있습니다.


## 표준 라이브러리 살펴보기
대표적인 라이브러리는 표준 라이브러리인 stdlib 입니다.<br>
확장 함수를 활용해서 만들어진 굉장히 거대한 유틸리티 라이브러리입니다.


## 나만의 유틸리티 구현하기
표준라이브러리에 없는 알고리즘이 필요한 경우 `범용 유틸리티 함수(universal utility function)loll`로 정의하는것이 좋습니다.

확장함수의 장점
- 함수는 상태를 유지하지 않으므로 행위를 나타내기 좋습니다. 특히 부가작용(side-effect)이 없는 경우에는 더 좋습니다.
- 톱레벨 함수와 비교해서 확장 함수는 구체적인 타입이 있는 객체에만 사용을 제한할 수 있으므로 좋습니다.
- 수정할 객체를 아규먼트로 전달받아 사용하는 것보다 확장 리시버로 사용하는 것이 가독성 측면에서 좋습니다.
- 확장 함수는 객체에 정의한 함수보다 객체를 사용할 때, 자동 완성 기능 등으로 제안이 이루어지므로 쉽게 찾을 수 있습니다.

## 정리
일반적인 알고리즘을 반복해서 만들지 말아 주세요. 대부분 stdlib에 있을 가능성이 높습니다.<br>
일반적인 알고리즘은 확장 함수로 정의하는 것이 좋습니다.
