# 아이템24. 제네릭 타입과 variance 한정자를 활용하라

제네릭 클래스에 타입 파라미터 T는 variance 한정자(out 또는 in)가 없으므로, 기본적으로 invariant(불공변성)입니다.<br>
invariance는 제네릭 타입으로 만들어지는 타입들이 서로 관련성이 없다는 의미입니다.

## 함수 타입
타이핑 시스템 계층에서 파라미터 타입이 더 높은 타입으로 이동하고, 리턴 타입은 계층 구조의 더 낮은 타입으로 이동합니다.<br>
코틀린 함수 타입의 모든 파라미터 타입은 contravariant 입니다. 또한 모든 리턴타입은 covariant 입니다.<br>
함수 타입을 사용할때는 자동으로 variance 한정자가 사용됩니다. 코틀린에서 자주 사용되는것으로 covariant(out 한정자)를 가진 List가 있습니다.
이는 variance 한정자가 붙지 않는 MutableList와 다릅니다.


## variance 한정자의 안정성
자바의 배열은 covariant입니다. 이는 배열을 기반으로 제네릭 연산자는 정렬 함수 등을 만들기 위해서 라고 이야기 합니다.<br>
covariant 타입 파라미터(out 한정자)가 in 한정자 위치에 있다면 covariant와 업캐스팅을 연결해서 우리가 원하는 타입으로 전달할 수 있습니다.

다른 좋은 예로 Response가 있습니다.
- Response<T>라면 T의 모든 서브타입이 허용됩니다.
- Response<T1, T2>라면 T1과 T2의 모든 서브타입이 허용됩니다.
- Failure<T>라면, T의 모든 서브타입 Failure가 허용됩니다.
- covariant와 Nothing 타입으로 인해서 Failure는 오류타입을 지정하지 않아도 되고 Success는 잠재적인 값을 지정하지 않아도 됩니다.


## variance 한정자의 위치
variance 한정자는 크게 두 위치에 사용할 수 있습니다.
- 선언 부문
  - 일반적으로 이 위치에서 사용
  - 클래스와 인터펭스 선언에 한정자가 적용
  - 따라서 클래스와 인터페이스가 사용되는 모든곳에 영향을 줍니다.
- 클래스와 인터페이스를 활용하는 위치
  - 특정한 변수에만 variance 한정자가 적용됩니다.

## 정리
코틀린 타입 아규먼트의 관계에 제약을 걸 수 있는 굉장히 강력한 제네릭 기능을 제공합니다.
- 타입 파라미터의 기본적인 variance의 동작은 invariant입니다.
- out 한정자는 타입 파라미터를 covariant하게 만듭니다.
- in 한정자는 타입 파라미터를 contravariant하게 만듭니다.

코틀린에서는 
- list와 set이 타입 파라미터는 convariant(out 한정자)입니다.
- 함수 타입의 파라미터 타입은 contravariant(in 한정자)입니다.
- 리턴만 되는 타입에는 covariant(out 한정자)를 사용합니다.
- 허용만 되는 타입에는 contravariant(in 한정자)를 사용합니다.
- 
