# JavaProgramming
- Java 프로그래밍 응용 수업 실습 코드입니다.

## Week02
- GUI Basics - awt, swing

## Week03
GUI - 컨테이너와 배치관리자
- 컨테이너(ex. JFrame, JPannel ...)마다 하나의 배치관리자(ex. FlowLayout, BorderLayout ...)가 존재
- 배치관리자는 awt 패키지에 있다.
```
import java.awt.*;
```
- 컨테이너 생성시 디폴트 배치관리자가 설정된다. 한 컨테이너당 한 배치관리자밖에 설정할 수 없다.
  - 디폴트 배치관리자가 있지만 변경 가능하다.
  - but, 두개의 배치관리자를 놓고 싶다면? 한 배치관리자 위에 새로운 최상위 컨테이너를 둔다면 배치관리자 위에 배치관리자를 설정 가능.
- 배치관리자 없는 컨테이너
  - 응용 프로그램에서 컴포넌트의 절대 크기와 절대 위치를 지정한다
  - 필요한 경우
    1. 게임프로그램과 같이 시간이나 마우스 / 키보드의 입력에 따라 컴포넌트들의 위치와 크기가 수시로 변하는 경우
    2. 여러 컴포넌트들을 서로 겹쳐 출력하고자 하는 경우
  - 배치관리자 없애는 방법
    ```
    container.setLayout(null);
    ```
## Week4
GUI - 이벤트 기반 프로그래밍, 이벤트 객체, 이벤트 리스너
- 기억해야할 점: 이벤트 소스(=컴포넌트)가 이벤트객체를 발생시키고, 이벤트리스너가 이벤트를 처리한다.
- 그중에서도 keyEvent와 KeyListener, MouseEvent와 MouseListener를 사용해보았다.
- 추가적으로 implements와 extends의 차이에 대해서도 알아보았다.(정리한 것: https://suucong.tistory.com/30)
