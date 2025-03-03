# 아이템19. knowledge를 반복하여 사용하지 말라
`프로젝트에서 이미 있던 코드를 복사해서 붙여놓고 있다면, 무언가가 잘못된 것이다.`

## knowledge
프로젝트를 진행할때 정의한 모든것이 knowledge이며 이는 코드, 설정, 템플릿 등으로 표현할수 있습니다.<br>

프로그램에서 중요한 knowledge를 크게 두가지로 뽑는다면 다음과 같습니다.
- 로직(logic) : 프로그램이 어떠한 식으로 동작하는지와 프로그램이 어떻게 보이는지
- 공통 알고리즘(common algorithm) : 원하는 동작을 하기 위한 알고리즘

둘의 큰차이는 시간에 따른 변화입니다.<br>
비지니스 로직은 시간이 지나면서 계속해서 변핮만, 공통 알골즘은 한번 정의된 이후에는 크게 변하지 않습니다.<br>
물론 공통 알고리즘을 최적화를 하거나 같은 카테고리의 더 빠른 알고리즘으로 바꿀수도 있지만 동작은 크게 변하지 않습니다.

## 모든것은 변화한다
프로젝트의 konwledge도 계속해서 변화합니다.
- 회사가 사용자의 요구 또는 습관을 더 많이 알게 되었다.
- 디자인 표준이 변화했다.
- 플랫폼, 라이브러리, 도구 등이 변화해서 이에 대응해야 한다.

## 언제 코드를 반복해도 될까?
`함께 변경될 가능성이 높은가? 따로 변경될 가능성이 높은가?` 라는 질문으로 결정 할 수 있습니다.<br>
코드를 추출하는 이유는 쉽게 만들기 위함이므로 이 질문은 가장 근본적인 질문이라고 할 수 있습니다.


## 단일 책임 원칙
코드를 추출해도 되는지 확인 할 수 있는 원칙으로 SOLID 원칙 중 하나인 `단일 책임 원칙`이 있습니다.
다.<br>
`단일 책임 원칙이란 클래스를 변경하는 이유는 단 한가지여야 한다`라는 의미입니다.<br>
두 액터가 같은 클래스를 변경하는 일은 없어야 한다라고 표현하였는데 여기서 액터는 변화를 만들어 내는 존재를 의미합니다.<br>
액터는 서로의 업무와 분야에 대해서 잘 모르는 개발자들로 비유됩니다. 이러한 개발자들이 같은 코드를 변경하는 것은 굉장히 위험한 일입니다.


## 정리
모든 것은 변화합니다.<br>
따라서 공통 knowledge가 있다면 이를 추출해서 이러한 변화에 대비해야 합니다.<br>
극단적인 것은 언제나 좋지 않습니다. 항상 균형이 중요합니다.<br>
어떠한것을 추출해야할지 결정하기 어려울수 있기 때문에 수많은 시간과 많은 연습이 필요합니다.
