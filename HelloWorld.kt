fun main(args: Array<String>) {
    println("Hello World")
    println("123" + 123)
    //자바스크립트랑 동일함
    println(123);
    val a = 12; //초기화 후 값 변경 불가능 =val 즉 변수는 상자라고 보면 됨 ㅇㅇ  값 초기화, 변수 선언 다른거고 ㅇㅇ
    var b = 123;


//탭(띄우기), 쉬프트 탭시 정렬 깔끔하게 됨. 여러개 잡고 진행하면 됨.


//자료형 ->int ,롱 더블 float 문자=String , 불값-> val, var로 선언하면 다 같음

//형 변환
    val test = 123.123
    println(test::class.java.simpleName)//double값 출력됨

    val test2: Int = 1234 //이렇게 자료형을 지정해줄수"도" 있다. but 형변환 외 값이 다른게 들어가면 에러뜸
    val test4: Long = 1234 //이렇게 가능하다 형변환이 ㅇㅇ 큰거에서 작은거 담는거


    val test5 = 1234
    val test6 = test5.toString()//이렇게 숫자를 문자로 바꿀수도 있다 ㅇㅇ 데이터타입 변경
    println(test6)
    println(test6::class.java.simpleName)//String출력됨


    val test7 = Integer.parseInt(test6) //int로 변환
    println(test7::class.java.simpleName) //형변환 int로 출력됨

    val test10 = "" //빈 "문자열"이고
    val test11 = null //아무것도 없는것이다. 즉 null이 출력된다. 자료형이 없다는 것이다.

    val test12: String? = null//스트링일수도 있고 널 일수도 있다고 해서 ? 를 붙이는 것이다.


    //////////////////////////////////////////////////////////////////////
    //조건문 - if else when

    val a1 = 100
    if (a1 > 30) {
        println("Gg")
    } else if (a1 >= 50) {
        println("출력하시오")
    } else {
        println("굿굿")
    }

//when  ->자바의 switch문과 유사함. 더욱 좋음

    var score = 100

    when (score) {
        100 -> {
            println(100)
        }

        90 -> {
            println(40)
        }

        else -> {
            println(30)
        }

    }


    //리스트

    val testList = ArrayList<String>() //어레이리스트 string값만 받겠따는것임

    testList.add("a")
    testList.add("b")
    testList.add("c");
    testList.add("d");

    println(testList)
    println(testList[0])
    println(testList[1])


    val testList2 = listOf("a", "b", "c")
    println(testList2)
    //listOf 함수는 불변 리스트를 생성합니다. 한 번 생성된 리스트는 수정할 수 없습니다(추가, 삭제, 수정 등이 불가능).

    val testList3 = mutableListOf("a", "b", "c")
    println(testList3)
//mutableListOf 함수는 가변 리스트를 생성합니다. 가변 리스트는 요소를 추가, 삭제, 수정할 수 있습니다.

    testList3.add("d")

    val testList4 = listOf("student1", "student2", "student3", "student4", "teacher1", "student5")
    println(testList4)
    println(testList4.filter { it.startsWith("s") })
//filter{} 함수는 주어진 조건에 맞는 요소들을 선택하는 함수입니다.
//it.startsWith("s")는 각 요소에 대해 해당 요소가 's'로 시작하는지 여부를 검사하는 조건입니다.
//여기서 it은 일반적으로 Kotlin에서 람다식은 {}로 둘러싸인 코드 블록으로 표현됩니다. 람다식 내에서
// 매개변수를 명시적으로 선언할 수도 있지만, 명시적으로 선언하지 않고 사용되는 경우 Kotlin은 암묵적인 매개변수인 it을 제공합니다.
//가장 최근에 언급된 대상을 말 하는 것이다 it은 ( 사진에 놔뒀다)

//!!는 null이 아닌 값을 말하는 것이다

//for in 으로 반복문 돌릴수 있다. for each도 존재한다!->사진 첨부했음


    for (i in 2..9) {
        println(i)
        println("$i * $i")//이렇게 js와 같이 문자열 템플릿을 사용해 줄 수 있다. 문자열 내에 변수를 포함해서 출력할 수 있다는 말이다.

    }


//List Map  Set


//List는 중복된 요소를 허용하고 순서가 있는 컬렉션입니다.
//    특징: 불변 리스트를 생성합니다.
//    용도: 요소의 추가, 삭제, 변경이 필요하지 않은 경우 사용합니다.

    // 아래와 같은 작업은 불가능합니다.
// immutableList.add("date") // 컴파일 오류
// immutableList.remove("banana") // 컴파일 오류
// immutableList[0] = "apricot" // 컴파일 오류

    val list = listOf("apple", "banana", "cherry", "apple")
    // List 출력
    list.forEach {
        println(it)
        println(list[2]) //부분 출력은 어디서나 가능
    }


//    mutableListOf
//    특징: 가변 리스트를 생성합니다.
//    용도: 요소의 추가, 삭제, 변경이 필요한 경우 사용합니다.
//    예시:


    val mutableList = mutableListOf("apple", "banana", "cherry")
    println(mutableList) // [apple, banana, cherry]

    mutableList.add("date")
    println(mutableList) // [apple, banana, cherry, date]

    mutableList.remove("banana")
    println(mutableList) // [apple, cherry, date]

    mutableList[0] = "apricot"
    println(mutableList) // [apricot, cherry, date]


    val mutableList2 = mutableListOf<String>("apple", "banana", "cherry")

//이렇게 <> 로 자료형 지정 가능 아래 둘다stirng이라는 자료형만 담을 수 있는 것이다. ->제네릭 특성 이용.
    val stringList: List<String> = listOf("apple", "banana", "cherry")
    val mutableList3 = mutableListOf<String>("apple", "banana", "cherry")


//indexOf는 Kotlin에서 리스트나 배열에서 특정 요소의 인덱스를 찾는 함수입니다.

    val fruits = listOf("apple", "banana", "cherry", "banana", "apple")

    val index1 = fruits.indexOf("banana")
    println("First index of 'banana': $index1") // 출력: First index of 'banana': 1


//Map은 키-값 쌍을 저장하는 컬렉션으로, 키는 중복될 수 없습니다.  그리고 순서가 없다. 또한 수정이나 삭제 불가능하다.
// 한번 넣으면 끝이다. 수정하고싶으면 아래 가변(mutable) 을 쓰면 된다./
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    // Map 출력
    map.forEach { (key, value) ->
        println("Key: $key, Value: $value")
    }


    val map2 = mutableMapOf<Int, String>(1 to "nita", 2 to "헤헤")
    map2.put(5, "유리") //map 은 put으로 넣어준다!
    println(map2[5])
    map2.remove(5)//키값으로 삭제한다.


    //Set은 중복된 요소를 허용하지 않고 순서가 없는 컬렉션입니다. 즉 출력할때 동일하게 출력되지 않을수도 있다.
    // 하나의 보이지 않는 주머니라고 생각하면 된다.
    //이것도 Set 역시 Kotlin에서 기본적으로 불변(immutable)입니다
    val set = setOf("apple", "banana", "cherry", "apple", "apple1", "apple2")

    // Set 출력
    set.forEach {
        println(it)
    }


    //만약 요소를 추가하거나 제거해야 한다면, 가변(mutable) Set을 사용해야 합니다.
// Kotlin에서는 mutableSetOf 함수를 사용하여 가변 Set을 생성하고, 이를 통해 요소를 자유롭게 추가하거나 제거할 수 있습니다.

    val mutableSet = mutableSetOf("apple", "banana", "cherry")

    mutableSet.add("date") // 요소 추가
    mutableSet.remove("banana") // 요소 제거

    println(mutableSet) // 출력: [apple, cherry, date]


    //Kotlin에서 mutable은 "가변"을 의미합니다. mutable 컬렉션은 요소를 추가, 제거 또는 변경할 수 있는 컬렉션을 나타냅니다.
//Kotlin에서 "컬렉션"이란 데이터의 그룹을 저장하고 관리하기 위한 구조를 의미합니다. 컬렉션은 여러 요소들을 한 곳에 모아서 처리할 수 있도록 도와줍니다.
// Kotlin은 다양한 종류의 컬렉션을 제공하며, 주요 컬렉션 타입으로는 리스트(List), 집합(Set), 맵(Map)이 있습니다.->Kotlin 표준 라이브러리에 내장됨


//while, List Map, Iterator


    val mutableMap = mutableMapOf(
        1 to "apple",
        2 to "banana",
        3 to "cherry"
    )

    // 새로운 요소 추가 (방법 1)
    mutableMap[4] = "date"

    // 새로운 요소 추가 (방법 2)
    mutableMap.put(25, "유리")

    // 기존 요소 업데이트
    mutableMap[1] = "apricot" // 방법 1
    mutableMap.put(2, "blueberry") // 방법 2
//Kotlin의 Map에서는 키는 불변입니다 키에 대한 값을 바꾸는거지 키를 바꿀수는 없다. "제거" 만이 있을 뿐


    // 요소 제거
    mutableMap.remove(2)
    // 요소 변경
    mutableMap[1] = "apricot"

    // 요소 접근
    val value = mutableMap[3]
    println("Value for key 3: $value") // 출력: Value for key 3: cherry
    // 맵의 모든 키와 값을 출력
    for ((key, value) in mutableMap) {
        println("Key: $key, Value: $value")
    }


    //Iterator는 컬렉션의 요소들을 순차적으로 접근할 수 있는 객체입니다. Kotlin에서 Iterator는
// next()와 hasNext() 메서드를 제공하여 컬렉션의 요소들을 하나씩 가져오고, 다음 요소가 있는지 여부를 확인할 수 있게 합니다. 이를 통해 컬렉션을 반복(iterate)할 수 있습니다

    val list3 = listOf("apple", "banana", "cherry")

    // 리스트의 iterator 생성
    val iterator = list3.iterator()


    // hasNext()와 next() 메서드는 Iterator 인터페이스에 정의된 기본적인 메서드입니다.
    // 이 메서드들은 컬렉션의 다음 요소를 순차적으로 접근하고 반환하기 위해 Iterator 객체 내에 구현되어야 합니다.
//    hasNext(): 컬렉션에 다음 요소가 있으면 true, 없으면 false를 반환합니다.
//    next(): 컬렉션의 다음 요소를 반환합니다.

    // Iterator는 컬렉션의 요소들을 순차적으로 접근하고 순회할 수 있는 도구입니다->근데 for in이나 for each로도 가능함
    // iterator를 왜 쓰냐하면 "안전하게" 삭제하려고 하는것이다.


    while (iterator.hasNext()) {
        val element = iterator.next()
        println(element)
    }
    // 출력:
    // apple
    // banana
    // cherry

    val list4 = mutableListOf(1, 2, 3, 4, 5)
    val iterator1 = list4.iterator()
    while (iterator1.hasNext()) {
        val element = iterator1.next()
        if (element % 2 == 0) {
            iterator1.remove() // 짝수인 요소를 안전하게 삭제

        }
    }
    println(list) // [1, 3, 5]


    for (a in list4){
        if(a%2==0){
            list4.remove(a) //인덱스가 아니라 "해당 값" 이들어감
            list4.removeAt(1) // 인덱스 1의 요소인를 제거

        }
    }

    /////////////////// 값이 50이상인 것만 출력하기.

    val map1 = mapOf(
        "apple" to 30,
        "banana" to 55,
        "cherry" to 40,
        "date" to 70
    )

    for (i in map1) {
        if (i.value>50 ) {
            println(i)
        }
    }
    //만약 키가 apple이면 출력.
    for (i in map1) {
        if (i.key=="apple") {
            println(i)
        }
    }




/////////////함수 fun!!!!! (자바의 메서드와 같다)

    //아래는 자바 코드임.  차이점은 코틀린은 fun으로 함수를 시작하며 매개변수와 중괄호{} 사이에 반환타입을 적어준다.
    //public void greet(String name) {
      //  System.out.println("좋아");
    //}

    fun sum(num1: Int, num2 : Int){
        println(num1+num2)
    }


    fun sum1(num1: Int, num2 : Int) :Int{
        println(num1+num2)
    return num1+num2
    }//리턴까지 해줌 반환타입 매개변수와 {} 사이에 :반환타입으로!



    // Kotlin에서 함수나 메서드의 매개변수에는 반드시 타입이 명시되어야 합니다.
// 이는 Kotlin의 정적 타입 지정(statically-typed) 언어로서, 컴파일 시점에서 타입 검사를 수행하기 때문입니다

    fun greet(name: String) {
        println("Hello, $name!")
    }




//length는 Kotlin에서 문자열(String) 클래스의 내장된 멤버 함수입니다. 이 함수는 문자열의 길이를 반환합니다

    val str = "Hello, Kotlin!"
    val len = str.length  // len 변수에는 13이 저장됨






//split함수

//    split(",") 함수 호출을 통해 String 문자열을 () 기준으로 분리하고, 각 부분 문자열을 리스트로 반환합니다. 결과적으로 parts 리스트에는 ["apple", "banana", "cherry"]가 저장됩니다.


    val str123 = "apple,banana,cherry"
    val parts = str123.split(",") // 쉼표(,)를 기준으로 문자열을 분리하여 parts에 저장
    println(parts) // 출력: [apple, banana, cherry]
//println(parts[0],parts[2]) ->오류뜸 list는 안된다!개별적으로 요소에 접근할 때는 인덱스가 유효하지 않을 수 있습니다
    println(parts[0])
    println(parts[1])

//    str 변수는 "apple,banana,cherry" 문자열을 가지고 있습니다.

//substring은 문자열에서 부분 문자열(substring)을 추출하는 함수입니다. Kotlin과 Java 모두에서 사용할 수 있는 문자열 관련 함수입니다.
//Kotlin에서의 substring 사용법

// 인덱스 7부터 13까지의 부분 문자열을 추출
    val strgg = "Hello, Kotlin!"

    val substring2 = strgg.substring(7, 13) //인덱스가 들어간다!
    println(substring2) // 출력: "Kotlin"
println(substring2.length)
    //로 문자열의 길이까지 확인할수 있다 length로


    //replace로 문자열 중간 바꾸기 //해당하는 값들이 전부 바뀐다. 바뀔 값, 바꿀 값으로 된다.

val nita= strgg.replace("l","하하");
    println(nita)
}

//mutableListOf나 ArrayList나 같다고 보면 된다 .요소의 추가(add()), 삭제(remove()), 수정(set())



