# JavaProgramming
- Java 프로그래밍 응용 수업 실습 코드입니다.
-----------------------------
## Week02
- GUI Basics - awt, swing
-------------------------------
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
### BorderLayoutEx  
<img width="412" alt="BorderLayout" src="https://github.com/suucong/JavaProgramming/assets/109707230/fc5fc93e-9d4f-43ef-b2e3-7eb02c3afbe9">

### FlowLayoutEx  
<img width="412" alt="FlowLayout" src="https://github.com/suucong/JavaProgramming/assets/109707230/d0119d72-c1aa-453c-b82a-ab1c418f33d5">

### GridLayoutEx  
<img width="412" alt="gridLayout" src="https://github.com/suucong/JavaProgramming/assets/109707230/f757b830-448b-4afd-bf87-04665c86336e">

### NullContainerEx  
<img width="412" alt="nullContainer" src="https://github.com/suucong/JavaProgramming/assets/109707230/56bc6f59-7d2a-4842-9bd6-1bdf1fb0f166">

### Text01Ex  
<img width="412" alt="Test01Ex" src="https://github.com/suucong/JavaProgramming/assets/109707230/0277bc6e-4390-4a8e-bb4f-728fb86c39e4">

### Test02Ex  
<img width="412" alt="Test02Ex" src="https://github.com/suucong/JavaProgramming/assets/109707230/39afac22-41c5-4d6c-8b54-78beb1d064c3">
