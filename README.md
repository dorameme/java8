
---

# Java 함수형 프로그래밍

## 목차
1. [함수형 인터페이스 (Functional Interface)](#함수형-인터페이스-functional-interface)
2. [람다 표현식 (Lambda Expressions)](#람다-표현식-lambda-expressions)
3. [변수 캡처 (Variable Capture)](#변수-캡처-variable-capture)
4. [메소드 레퍼런스 (Method References)](#메소드-레퍼런스-method-references)

## 함수형 인터페이스 (Functional Interface)

- **함수형 인터페이스**: 추상 메소드를 딱 하나만 가지고 있는 인터페이스.
- **SAM (Single Abstract Method) 인터페이스**: 단일 추상 메소드만을 가진 인터페이스.
- **@FunctionalInterface 애노테이션**: 함수형 인터페이스임을 명시.
- **static, default 메소드**: 함수형 인터페이스 내에 공존할 수 있음.
- **람다함수**: 함수형 인터페이스를 구현할 수 있음.

### 주요 함수형 인터페이스

- **Function<T, R>**: T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스.
- **BiFunction<T, U, R>**: T, U 타입을 받아서 R 타입을 리턴하는 함수 인터페이스.
- **Consumer<T>**: T 타입을 받고, 리턴 없음.
- **Supplier<T>**: 인풋 없이 T 타입을 리턴.
- **Predicate<T>**: T 타입을 받아서 boolean을 리턴.
- **UnaryOperator<T>**: Function<T, T>와 동일.
- **BinaryOperator<T>**: BiFunction<T, T, T>와 동일.

## 람다 표현식 (Lambda Expressions)

- **기본 형식**: `(인자 리스트) -> {바디}`

## 변수 캡처 (Variable Capture)

- **캡처된 변수**: 람다 표현식이나 익명 내부 클래스에서 외부의 지역 변수를 사용할 때, 해당 변수는 "캡처된 변수"가 됨.
- **불변성 (effective final)**: 캡처된 변수는 암묵적으로 `final`로 간주되어, 람다 또는 익명 클래스 내부에서 값을 변경할 수 없음.
- **유효 범위**: 캡처된 변수는 람다 또는 익명 클래스의 생명주기 동안 접근 가능하지만, 해당 변수의 유효 범위는 원래의 유효 범위를 벗어나지 않음.

## 메소드 레퍼런스 (Method References)

- **기본 개념**: 람다가 기존 메소드 또는 생성자를 호출하는 거라면, 메소드 레퍼런스를 사용해서 표현 가능.

![img.png](img.png)
---