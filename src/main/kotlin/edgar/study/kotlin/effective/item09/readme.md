# 아이템09. use를 사용하여 리소스를 닫아라
AutoCloseable을 상속받은 Closeable 인터페이스를 구현핟고 있는 리소스
- InputStream / OutputStream
- java.sql.Connection
- java.io.Reader(FilReader, BufferedReader, CSSParser)
- java.new.Socket / java.util.Scanner

이러한 리소스는 최종적으로 리소스에 대한 레퍼런스가 없어질때 가비지 컬렉터가 처리<br>
하지만 굉장히 느리며 그동안 리소스를 유지하는 비용이 많이 들어갑니다.<br>
따라서 더 이상 필요하지 않다면 명시적으로 close 메서드를 호출해주는것이 좋습니다.<br>
전통적으로 try ~ finally 블록을 이용


## 정리
use를 이용하면 Closeable/AutoCloseable을 구현한 객체를 쉽고 안전하게 처리할 수 있습니다.
