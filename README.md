함수형 인터페이스 (Functional Interface)  


추상 메소드를 딱 하나만 가지고 있는 인터페이스

SAM (Single Abstract Method) 인터페이스

@FuncationInterface 애노테이션을 가지고 있는 인터페이스

+ static, default 메소드는 공존할 수 있다.
+ 람다함수로 함수형인터페이스를 구현 할 수 있다.

Function<T, R> =
T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스


BiFunction<T, U, R> = 
T,U 받아서 R 리턴

Consumer<T> = 
T 타입을 받고, 리턴 없음

Supplier<T> = 
인풋 없이 T 타입 리턴

Predicate<T> = 
T 타입받아서 boolean 리턴


UnaryOperator<T>  = 
Function<T, T>

BinaryOperator<T> = 
BiFunction<T, T, T> 

람다 =  (인자 리스트) -> {바디}
1. **캡처된 변수**: 람다 표현식이나 익명 내부 클래스에서 외부의 지역 변수를 사용할 때, 해당 변수는 "캡처된 변수"가 된다.
2. **불변성(effective final)**: 캡처된 변수는 암묵적으로 final로 간주되어, 람다 또는 익명 클래스 내부에서 값을 변경할 수 없다.
3. **유효 범위**: 캡처된 변수는 람다 또는 익명 클래스의 생명주기 동안 접근 가능하지만, 해당 변수의 유효 범위는 원래의 유효 범위를 벗어나지 않다.


람다가 기존 메소드 또는 생성자를 호출하는 거라면, 메소드 레퍼런스를 사용해서 표현 가능
<img width="661" alt="스크린샷 2024-06-13 오후 9 42 11" src="https://github.com/dorameme/java8/assets/68580993/b41a3d2d-0703-4b78-ad4f-ee06366e9975">



