# 7장 비용 줄이기

- [아이템45. 불필요한 객체 생성을 피하라](item45/readme.md)
- [아이템46. 함수 타입 파라미터를 갖는 함수에 inline 한정자를 붙여라](item46/readme.md)
- [아이템47. 인라인 클래스의 사용을 고려하라](item47/readme.md)
- [아이템48. 더 이상 사용하지 않는 객체의 레퍼런스를 제거하라](item48/readme.md)



### 7장 핵심 : 가독성과 성능 사이에 트레이드 오프가 발생할때 개발하는 컴포넌트에서 무엇이 더 중요한지 스스로 답할 수 있어야 합니다.
가독성과 확장성을 우선시 하되 라이브러리는 메모리와 성능을 우선시 할수 있다.<br>
inline 한정자를 사용하면 code가 복사되어 온다 (재귀 호출하면 망함)
