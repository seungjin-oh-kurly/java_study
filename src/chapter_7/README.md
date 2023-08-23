# Chapter 7  상속

## 상속

- 객체 지향 프로그램에서 상속은 **이미 잘 개발된 클래스를 재사용**해서 새로운 클래스를 만드는 것으로 **중복되는 코드를 줄여 개발시간을 단축시킨다.**
- 또한, ******************************************************************************************************클래스 수정을 최소화******************************************************************************************************할 수 있다는 것으로 부모 클래스를 수정하면 모든 자식클래스에 수정효과를 가져온다.

> JAVA 에서는 모호함을 방지하기 위해 **다중 상속이 허용되지 않는다.**
예를들어, ClassA가 ClassB와 ClassC를 상속받고, ClassB와 ClassC가 모두 동일한 메서드를 갖는다면, 어떤 메서드를 선택해야할지 모르기 때문이다..
> 

---

## 상속 과정

- 자식 객체를 생성하고자 한다면, 부모 객체가 먼저 생성된 뒤, 자식 객체가 생성된다.
    - 하지만, 모든 객체는 생성자를 호출해야 힙 영역에 공간이 할당되고, 해당 공간에 객체가 생성된다.
    - 부모 객체가 생성될, 자식 객체 생성자에 숨겨져있는 `super()`에 의해 호출된다.
        - `super()`는 코드에서 생략되더라도, 컴파일 단계에서 부모 객체의 기본 생성자를 자동 추가 한다.
        - `기본 생성자`는 매개변수가 없는 생성자다. (`Lombok`에서 `@NoArgsConstructor`)
            - `기본 생성자`가 없다면, 다른 생성자의 매개변수 형식과 동일한 생성자를  `super` 통해 호출해주어야한다.

---

## 메서드  오버라이딩

- 메서드를 재정의하는 것으로, 부모 객체에서 선언된 메서드의 선언부(반환 타입, 이름, 매개변수)가 같은 메서드를 자식 객체에서 다시 정의하는 것이다.
- 이때, 해당 메서드를 객체를 통해 호출한다면, 부모 객체의 메서드는 숨겨지고, **자식 메서드만 호출된다.**
    - 다만, 자식 객체의 메서드에서 메서드에 대한 접근제한을 더 강화할 수 없으며, 새로운 예외 또한 발생시킬 수 없다.
- `@Override` 어노테이션을 통해서 컴파일러가 오버라이딩 조건이 잘 충족되었는지 확인할 수 있도록 한다.
- 자식 메서드에서 부모 메서드를 호출하고자 한다면, `super.[메서드](...)`를 통해 호출 할 수 있다.

---

### Final 클래스와 메서드

1. `Final Class`: 해당 클래스를 더 이상 상속할 수 없다. 즉, 자식을 가질 수 없는 클래스다.
    1. 상속한 것과 같이 비슷하게 사용하고 싶다면, composite를 통해 사용할 수 있다.
2. `Final Method`: 자식에서 호출은 가능하지만, 매서드 재정의 즉, 오버라이딩 할 수 없는 메서드다.

---

## Protected 접근제한자

- 접근 제한자 중 `protected`는  상속과 관련이 있다.
    - `public` 과 `default`의 중간쯤 해당하는 접근 제한을 한다.
    - `field`, `method`, `constructor`에 접근 제한할 수 있고, 같은 패키지(하위 패키지도 안됨)거나 자식 객체에서 만 사용이 가능하다.
- 질문: JPA에서 HibernateORM이 lazyloading 를 위해 엔틴티 클래스를 상속받아 프록시 객체를 생성할 때, 기존 엔티티 클래스의 private field에 어떻게 값을 넣어주는가? reflection을 사용해서  아래와 같이 하는가?
    
    ```java
    package chapter_7.sec11;
    
    import java.lang.reflect.Field;
    import java.lang.reflect.InvocationTargetException;
    
    class Temp {
    
        private String name;
        private String temp;
        protected Temp(){
        }
        @Override
        public String toString() {
            return "Temp{" +
                    "name='" + name + '\'' +
                    ", temp='" + temp + '\'' +
                    '}';
        }
        
    }
    public class TempProxy extends Temp {
    
        public TempProxy() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            Field[] declaredFields = Temp.class.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                declaredField.set(this, "바꾼 " + declaredField.getName());
            }
    
        }
    
        public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
            Temp temp = new TempProxy();
            System.out.println(temp);
        }
    }
    ```
    

 

---

## 타입변환

- `Promotion` : 자동 타입변환
    - `부모타입` 변수이름  = `자식타입객체`
    - 실제로는 `자식 타입 객체`의 주소를 가리키는 변수지만, 해당 변수가 사용할 수 있는 메서드는 `부모타입`에 정의된 멤버 메서드 뿐이다.  해당 변수가 `부모타입`으로 선언되었기 때문이다.
    - 하지만, 자식 클래스에서 오버라이딩 된 메서드가 있다면 부모 메서드 대신 오버라이팅 된 메서드가 호출된다.
- `Casting`: 강제 타입 변환
    - `자식타입` 변수이름 = (`자식타입`) `부모타입객체`
    - 자동 타입 변환으로 인하여, `부모타입`으로 선언된 객체에서 `자식타입` 의 멤버변수나 멤버 메서드를 사용하고 싶다면, 강제 타입 변환을 수행한 뒤, 사용할 수 있다.

---

## 다형성

- `다형성(polymorphism)` 은 사용 방법은 동일하지만, 실행 결과 혹은 실행 로직이 다른 성질을 의미한다.
- 즉, **객체 지향 관점에서 사용 방법이 동일하다는 의미는, 동일한 메서드를 가지고 있다는 뜻으로 해석할 수 있다.**
- 상속을 통해 다형성을 나타낼 수 있다.
    1. **필드의 다형성**
        - 같은 `부모타입`을  여러 객체가 상속을 한 뒤, 각 객체가 부모의 메서드를 전부 `**오버라이딩**` 한다.
        - 여러 개의 필드를 `부모타입`으로 선언하고, **`자동 타입변환`**을 통해 자식 타입 객체를 생성한다.
    2. **매개변수 다형성**
        - 같은 `부모타입`을  여러 객체가 상속을 한 뒤, 각 객체가 부모의 메서드를 전부 `**오버라이딩**` 한다.
        - 메서드의 매개변수를 `부모타입`으로 선언하고, **`자동 타입변환`**을 통해 메서드 호출 시, `자식타입` 객체를 전달한다.
            - 메서드 내부에서는 `부모 타입 객체.메서드(...)` 으로 호출되어 전달된 `자식타입` 객체에 따라서 다른 결과가 발생할 수 있다.

---

## 객체 타입 확인

- 아래와 같이 `instanceof` 연산자를 사용하여 타입을 확인할 수 있다.

```java
boolean result = 객체 instance 타입;
```

- 강제 타입 변환을 하기전에, 객체가 `자식타입`인지 확인하고자 할 때, 사용하기도 한다.

```java
public void method(Parent parent){
	if( parent instanceof Child){
		Child child = (Child) parent;
	}
}

/**
* JAVA 12 이상에서는 강제 타입 변환 없이 아래와 같이 사용할 수 있다.
**/

if(parent instanceof Child child){
	child.childMethod1(...)
}
```

---

## 추상 클래스와 추상 메서드

- `추상 클래스(abstract class)` 는 클래스 간 공통되는 특성을 추출한 것을 말한다. 말 그대로 추상적인 속성을 띄기 때문에, ************1) 공통적인 필드나 2) 공통적인 메서드를 추출한다.************
    - 다른 클래스는 추상 클래스를 통해서 공통 필드와 공통 메서드를 상속 받을 수 있다.
    - **일반 클래스와 다른 점은 추상클래스를 `new` 연산자를 통해 생성할 수 없다는 것이다.**
    - `public abstract class 클래스명` 과 같이 선언한다.
- `추상 메서드(abstract method)`는  별도로 자식 클래스 별로 선언부만 동일하고, 실행 내용은 달라야할 경우에 선언한다.
    - 메서드 선언부만 추상 클래스 내에서 선언하고, 구현부는 자식클래스에서 `오버라이딩`을 통해서 재정의한다.
    - `abstract <returnType> 메서드명(...)`  과 같이 선언한다.

---

## 봉인된 클래스

- 무분별한 자식 클래스 생성을 방지하기 위해 JAVA 15이상 부터는 봉인된 클래스(`sealed class`)를 지원한다.
    - `final class`는 다른 클래스의 부모가 될 수 없지만, `sealed class`는 특정 클래스만 상속을 가능하도록 허락한다.
        - `permits` 키워드를 통해 상속 가능한 클래스를 지정한다.
            - `Employee`, `Manager` 만 상속 가능한 `Person` 클래스임을 나타낸다.
        
        ```java
        public sealed class Person permits Employee, Manager { ... }
        ```
        
- 자식 클래스에서 `non-sealed`를 사용하면 봉인을 해제할 수 있다.
    
    ```java
    public non-sealed class Manager extends Person{
        @Override
        public void work() {
            System.out.println("생산 관리를 합니다.");
        }
    }
    
    class Director extends Manager{
        @Override
        public void work() {
            System.out.println("제품을 기획합니다.");
        }
    }
    ```
    

---

## 논의 사항

1. 왜 상속보다는 composite를 사용하는지.
2. 추상 메서드를 많이 사용하는지..
