# 아이템44. 멤버 확장 함수의 사용을 피하라

클래스에 대한 확장 함수를 정의할 때 이를 멤버로 추가하는 것은 좋지 않습니다.<br>
확장 함수는 첫번째 아규먼트로 리시버를 받는 단순한 일반 함수로 컴파일 됩니다.<br>
단순하게 변환되는 것이므로 확장 함수를 클래스 멤버로 정의할수도 있고 인터페이스 내부에 정의할 수 도 있습니다.<br>
하지만 DSL을 만들 때를 제외하면 이를 사용하지 않는것이 좋습니다.<br>
특히 가시성 제한을 위해 확장 함수를 멤버로 정의하는 것은 굉장히 좋지 않습니다.
한가지 큰 이유는 가시성을 제한하지 못한다는 것입니다. 이는 단순하게 확장 함수를 사용하는 형태를 어렵게 만들 뿐입니다.

확장 함수의 가시성을 제한하고 싶다면 멤버로 만들지 말고 가시성 한정자(private)를 붙여주면 됩니다.

멤버 확장을 피해야 하는 몇가지 타당한 이유
- 레퍼런스를 지원하지 않습니다.
- 암묵적 접근을 할 때 두 리시버 중에 어떤 리시버가 선택될지 혼동됩니다.
- 확장 함수가 외부에 있는 다른 클래스를 리시버로 받을 때 해당 함수가 어떤 동작을 하는지 명확하지 않습니다.
- 경험이 적은 개발자의 경우 확장 함수를 보면 직관적이지 않거나 심지어 보기만 해도 겁먹을 수 도 있습니다.


멤버 확장 함수를 사용하는 것이 의미가 있는 경우에는 사용해도 괜찮습니다.<br>
하지만 일반적으로는 그 단점을 인지하고 사용하지 않는것이 좋습니다.<br>
가시성을 제한하려면 가시성과 관련된 한정자를 사용하세요.<br>
클래스 내부에 확장 함수를 배치한다고 외부에서 해당 함수를 사용하지 못하게 제한되는 것이 아닙니다.
