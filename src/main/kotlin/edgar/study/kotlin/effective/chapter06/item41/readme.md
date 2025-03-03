# 아이템41. hashCode의 규약을 지켜라

오버라이드 할 수 있는 Any의 메서드로 hashCode가 있습니다.<br>
hashCode 함수는 수많은 컬렉션과 알고리즘에서 사용되는 자료구조인 해시 테이블(hash table)을 구축할 때 사용됩니다.


## 해시 테이블
컬렉션에 요소를 빠르게 추가하고, 컬렉션에서 요소를 빠르게 추출해야 한다고 할때 사용할수 있는 컬렉션으로는 세트와 맵이 있습니다.<br>
이들은 중복을 허용하지 않습니다. 따라서 요소를 추가할때 동일한 요소가 이미 들어있는지 확인해야 합니다.

배열 또는 링크드 리스트를 기반으로 만들어진 컬렉션은 요소가 포함되어있는지 확인하는 성능이 좋지 않습니다.<br>
요소가 포함되어 있는지 확인할 때 하나하나 모든 요소와 비교해야하기 때문입니다.<br>
수백만개의 요소를 선형으로 비교한다면 꽤 오랜시간이 걸릴것입니다.

성능을 좋게 만드는 해결 방법이 바로 해시 테이블입니다.<br>
해시 테이블은 각 요소에 숫자를 할당하는 함수가 필요합니다. 이 함수를 해시 함수라고 부르며 같은 요소라면 항상 같은 숫자를 리턴합니다.

해시함수의 특징
- 빠르다
- 충돌이 적다(다른값이라면 최대한 다른 숫자를 리턴한다는 의미)

해시함수는 각각의 요소에 특정한 숫자를 할당하고 이를 기반으로 요소를 다른 버킷에 넣습니다.<br>
또한 해시함수는 같은 요소는 항상 동일한 버킷에 넣게 됩니다.<br>
버킷은 버킷 수와 같은 크기의 배열인 해시 테이블에 보관합니다.


## 가변성과 관련된 문제
요소가 추가될 때만 해시 코드를 계산합니다.<br>
요소가 변경되어도 해시 코드는 계산되지 않으며 버킷 재배치도 이루어지지 않습니다.<br>
그래서 기본적인 LinkedHashSet와 LinkedHashMap의 키는 한번 추가되면 변경할수 없습니다.

해시등의 'mutable 프로퍼티로 요소를 조합하는 자료구조'에서는 mutable 객체가 사용되지 않습니다.<br>
세트와 맵의 key로 mutable 요소를 사용하면 안되며 사용하더라도 요소를 변경해서는 안됩니다.<br>
이러한 이유로 immutable 객체를 많이 사용합니다.


## hashCode의 규약
명확한 규약이 있습니다.
- 어떤 객체를 변경하지 않았다면(equals에서 비교에 사용된 정보가 수정되지 않는 이상) hashCode는 여러번 호출해도 그 결과가 항상 같아야 합니다.
- equals 메서드의 실행 결과로 두 객체가 같다고 나온다면, hashCode메서드의 호출 결과도 같다고 나와야 합니다.

첫번째 요구사항은 일관성 유지를 위해서 hashCode가 필요하다는것입니다.<br>
두번째 요구사항은 만은 개발자가 자주 잊어버리는 것들중 하나이므로 강조되어야 합니다.<br>
hashCode는 equals와 같이 일관성 있는 동작을 해야합니다.<br>
즉 같은 요소는 반드시 같은 해시코드를 가져야 한다는 의미입니다.

코틀린은 equals 구현을 오버라이드 할 때 hashCode도 함께 오버라이드 하는 것을 추천합니다.

필수 요구사항은 아니지만 제대로 사용하려면 지켜야 하는 요구사항이 있습니다.<br>
바로 hashCode는 최대한 요소를 넓게 퍼트려야 한다는 것입니다. 다른 요소라면 최대한 다른 해시값을 갖는 것이 좋습니다.


## hashCode 구현하기
일반적으로 data 한정자를 붙이면 코틀린이 알아서 적당한 equals와 hashCode를 정의해준다.<br>
하지만 equals를 따로 정의했다면 반드시 hashCode도 함께 정의해줘야 합니다.<br>
equals를 따로 정의하지 않았다면 hashCode를 따로 정의하지 않는 것이 좋습니다.<br>
equals로 같은 요소라고 판정되는 요소는 hashCode가 만드시 같은 값을 리턴해야 합니다.

해시코드로 유용한 함수로는 코틀린/JVM의 Objects.hashCode 가 있습니다.<br>
코틀린 stdlib에는 이러한 함수가 따로 없습니다.<br>
코틀린 stdlib이 hashCode 관련 함수를 기본적으로 제공하지 않는 이유는 사실 hashCode를 직접 구현할 일이 거의 없기 때문입니다.<br>
equals와 hashCode를 직접 구현하지 않아도 data 한정자를 붙이기만 하면 됩니다.

hashCode를 구현할때 가장 중요한 규칙은 `언제나 equals와 일관된 결과가 나와야 한다`입니다. 같은 객체라면 언제나 같은 값을 리턴하게 만들어주세요.




## 정리
