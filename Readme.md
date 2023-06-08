# JAVA

#### 객체란?
  물리적으로 존재하거나 추상적으로 생각 할 수 있는 것 중에서 정의 가능하고 식별 가능한것을 말한다.  
  자바에서 최소한의 프로그램 단위.  
  예) 물리적인 객체 - 사람, 모니터, 상품, 자동차 등 ..  
      추상적인 객체 - 주문, 생산정보, 회계장부 등 ..  
      
#### 객체의 구성요소
1) 속성(변수) 
2) 기능(메소드)

#### Class란
 - 객체를 만들기 위한 프로그램 코드로 이루어진 설계도.  
 - class에 작성된 코드를 읽어 -> 인스턴스화(객체화) 한다(메모리에 올린다)  
 - new 연산자로 인스턴스화 가능! ex) 타입(클래스명) 변수명 = new 클래스명();

#### 클래스 구조
```
(접근제한자) class 클래스명 (extends 상위클래스명) (implements 인터페이스명 { // 클래스 선언부
  (생성자) => 초기화
  변수(멤버변수, 멤버필드) => 속성
  메소드(멤버메소드) => 기능
}
```
> #### 가비지 컬렉터(Garbage Collector)  
> 자바에서 동적 할당된 메모리(Heap 영역) 중에서 더 이상 사용되지 않는 객체를 찾아 제거하는 프로세스.

#### 변수
- 타입  
  - 기본형(8개) - boolean, char, ,byte, short, int, long, float, double, => 실제 값을 가지고 있는 변수
  - 참조형 - 기본형 외 모든 변수 => 객체 주소값을 가지고 있는 변수 
- 선언위치
  - 전역변수 - 클래스에 종속된 변수, 멤버변수, 멤버필드
    - 초기화 하지 않으면 default값이 들어간다.
    - boolean - false
    - 정수형 - 0
    - 실수형 - 0.0
    - char - '\u0000'
    - 참조형 - null
  - 지역변수 - 메소드 안에 선언. 메소드 종료시 같이 소멸
    - 초기화 하지 않으면 컴파일 에러 발생! 사용불가!!
- 정적(static) - static이 선언된 변수 

#### 메소드
  프로그래밍에서 메소드는 하나의 특별한 목적의 작업을 수행하기위해 설계된 코드 집합.
  객체에서 기능역할을 한다.  
#### 메소드 구조
```
(접근제한자) (static) 반환타입 메소드이름(매개변수타입 매개변수명) { // 메소드 선언부
  실행할 코드
  
  (return 반환값)
}
```
#### 오버로딩(Overloading)
>  클래스 내에서 같은 이름을 가진 메소드를 여러개 정의하는 것을 말한다.  
>  매개변수 개수 또는 타입이 다르면 가능하다.  
  
#### 생성자(Constructor)
  인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메소드' 이다. (하지만 메소드는 아님)  
  - 멤버필드 초기화 용으로 사용  
  - 메소드와 차이점은 리턴이 없다.  
  - 오버로딩 가능하다.  

#### 상속
  부모클래스 (상위클래스)와 자식클래스(하위클래스)가 있으며,  
  자식클래스는 부모클래스를 선택해서 그 부모의 멤버를 상속받아  
  사용이 가능하다.  
  
```
class 자식클래스명 extends 부모클래스명{
}
```


#### 다형성
  같은 인터페이스 또는 부모를 공유(상속)하는 객체가 여러 유형의 타입을 가질 수 있는 것을 말한다.  
  - instanceof 연산자 - 객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부 확인

