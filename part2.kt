fun main() {


    //엘비스 연산자
    //엘비스 연산자(Elvis operator)는 코틀린에서 널(null) 값 처리를 간편하게 하기 위해 도입된 연산자입니다.
// 엘비스 연산자는 ?:로 표기되며, 왼쪽의 표현식이 null이 아니면 그 값을 반환하고, null이면 오른쪽의 값을 반환합니다.


fun find(str:String):Int{

    return str.length ?:0
}



//Any
    // 이름처럼, 아무거나 할 수 있는것.
    var str2="abc";
   // str2=12  ->에러뜸!

// Kotlin에서는 변수는  초기화된 값의 타입에 따라 변수의 타입이 확정됩니다. Kotlin은 정적 타입 언어이기 때문에, 변수의 타입이 한 번 정해지면 그 타입은 변경할 수 없습니다.

    var str3: Any="abc";
     str3=12
    println(str3)


//Kotlin의 Any 타입은 Java의 Object와 유사하며, 모든 클래스의 최상위 타입입니다. 즉, 모든 타입은 Any 타입을 상속받습니다.
// Any 타입을 사용하면 어떤 타입의 값이든 변수에 할당할 수 있습니다.Any클래스가 있으면 타입을 물려주는게 아니고 해당 클래스 안의 메서드를 물려주는거!! ㅇㅇ



    //is는연산자는 Kotlin에서 변수의 타입을 검사하는 데 사용됩니다. is 연산자를 사용하면 변수가 특정 타입인지 확인할 수 있다.

    // Double 값 할당
 var  myVariable :Any = 2
    if (myVariable is Double) {
        // myVariable은 Double 타입으로
        println("Double value: ${myVariable * 2}")
    }else{
        println("아님")
    }


   // when 표현식은 숫자뿐만 아니라 다양한 타입과 조건을 검사할 수 있습니다.
    //타입 검사 - is로 진행함. is 로 진행한다.
    val obj: Any = "Hello"

    when (obj) {
        is String -> println("obj is a String of length ${obj.length}")
        is Int -> println("obj is an Int with value $obj")
        is Double -> println("obj is a Double with value $obj")
        else -> println("obj is of unknown type")
    }





    //as 키워드는 객체를 명시적으로 다른 타입으로 변환할 때 사용됩니다.
    // 타입 캐스팅이 실패하면 ClassCastException이 발생합니다.

    val obj1: Any = "Hello, World!"
    val str: String = obj1 as String
    println(str.length) // 출력: 13



//    //에러 발생!! ANY타입의 실제 값은 INT형인데 이걸 String으로 바꾸려고 하니까 오류!
       val obj2: Any = 123
     // val obj2: String = obj2 as String
//    println(obj2) // 출력: null


    //※ Any 타입은 모든 타입의 값을 담을 수는 있지만, 명시적으로 다른 타입으로 캐스팅할 때는 실제 값의 타입과 일치해야 합니다※







    //List가공하기

val testList2= mutableListOf<Int>()
    testList2.add(1)
    testList2.add(2)
    testList2.add(3)
    testList2.add(4)
    testList2.add(5)
    testList2.add(6)

    println(testList2.distinct()) // 리스트 중 중복 제거한다.
    println(testList2.maxOrNull())//제일 큰 값 가져옴
    println(testList2.minOrNull())//제일 작은 값 가져옴
    println(testList2.average())//평균값도 가져올 수 있음.



    val testList3= listOf("gdsn","jat","sdf","asdf","Gr")
val result= testList3.filter{it.startsWith("j")}

println(result)
    //원래 할려면 for in 으로 다 저장하고 리스트 갯수가져와서 나눠줘야하는데 이렇게 바로바로 가능하니 엄청 편하다. 제일 작은 값 가져오는것도


    ////////////////////////필터링    특정 조건을 만족하는 값을 가져온다!!!! //////////////////
    val testList4= listOf(1,2,3,4)
    val result2 =testList4.filter { it%2==0 }
    println(result2)


//groupBy 함수를 사용하여 리스트의 요소들을 그룹화하는 예제입니다.
// groupBy 함수는 주어진 조건에 따라 컬렉션의 요소들을 그룹으로 나누고, 그 결과를 맵으로 반환합니다.

val testList5= listOf("a","aa","aaa")
    val result4=testList5.groupBy {

        it.length>2

    }
println(result4)//{false=[a, aa], true=[aaa]} //Map형태로 반환

//{ it.length > 2 } 이게 람다식이라고 한다.  ㅇㅇ



    val testList = listOf("a", "aa", "aaa", "b", "bb", "bbb")
    val groupedByLength = testList.groupBy { it.length }
    println(groupedByLength)
// 출력: {1=[a, b], 2=[aa, bb], 3=[aaa, bbb]} 위와 마찬가지로 키,값 형태로 반환함.



    val testList6 = listOf("a", "aa", "aaa", "b", "bb", "bbb")
    val groupedByLength2 = testList6.groupBy { it.length }

// 각 그룹의 키와 값을 출력
    for ((key, value) in groupedByLength2) {
        println("Key: $key, Value: $value")
    }
// 출력:
// Key: 1, Value: [a, b]
// Key: 2, Value: [aa, bb]
// Key: 3, Value: [aaa, bbb]




//오버로딩

    //코틀린에서 오버로딩(Overloading)은 같은 이름의 함수를 여러 개 정의하되,
    // 각 함수나 메서드의 매개변수의 개수나 타입이 달라야 합니다. 자바와 같다.


    fun print(value: Int) {
        println("Printing integer: $value")
    }

    fun print(value: String) {
        println("Printing string: $value")
    }

    fun print(value: Double) {
        println("Printing double: $value")
    }




    //상속
    //코틀린에서 클래스는 기본적으로 상속이 금지되어 있으며, 상속을 허용하려면 open 키워드를 사용해야 합니다.
    //또한, 상속받은 클래스에서 상위 클래스의 메서드를 오버라이드하려면 override 키워드를 사용합니다.
// 메서드를 오버라이드하려면 상위 클래스에서 해당 메서드에 open 키워드를 붙여야 합니다.


    open class All() {

        init {
            println("마케팅을 합니다")
        }

      open fun over(){
          println("상속하려는 함수 및 오버라이드 함")

      }
    }

    //상속받음! all()클래스를
class Job1() :All(){

    init {
        println("마케팅고수")
    }

        override fun over(){
            super.over()//부모 클래스 메서드 호출.  super연산자.
          println (" 오버라이드 완료 ")
        }

}

    val classho=Job1()
    classho.over()//이러면 오버라이드된 메서드 출력됨





    //추상 클래스-> 내용이 비어있고 이걸 만드는것이다. +일반 메서드도 정의할수 있다.
// 공통적인 기능들을 구현해야 할 때 좋다. 추상 클래스 상속시 추상 메서드 반드시 구현해야해서 안전하게 꼭 다 적어줄 수 있다.

    abstract class Shape {
        // 추상 메서드
        abstract fun calculateArea(): Double
        fun nita(){println("출력")}



    }



    // Circle 클래스가 Shape 클래스를 상속
    class Circle(private val radius: Double) : Shape() {
        // 추상 메서드 구현
        override fun calculateArea(): Double {
            println(":Double 이 있는이유는 부모쪽에서 명시해준것+ 아래 리턴타입이 존재하기 때문")
            return Math.PI * radius * radius
        }
    }





    //Data Class : 데이터 클래스 : 이름처럼 데이터를 넣어놓는 클래스이다. -> 주로 서버에서 데이터 받아온걸 넣어놨을때 사용한다고 한다..(잘 모르겠음 아직까진)



    class JustDog(var name: String, var age: Int){
//name과 age속성에 객체를 생성할 때 전달된 값들이 저장된다
         //※주 생성자로 초기화된 속성들은 객체가 생성될 때 한 번 설정되고, 객체가 사라질 때까지 유지됩니다. ※
        val nita="클래스 내 메서드는 fun을 써야됨."
    }



    val justDog=JustDog("파트라슈",21)
    println(justDog.name)
    println(justDog.age)






//데이터 클래스(Data Class)는 코틀린에서 제공하는 특별한 클래스로, 데이터를 담는 목적으로 설계된 클래스입니다 //객체 분해(Decomposition) 지원 등..

//데이터 클래스 선언
    data class Justdata(var name: String, var age: Int)

    val justDog1=Justdata("파트라슈",21)
    println(justDog1) //이렇게 내부에 뭐가 있는지 다 볼 수 있다.




    //중첩 클래스, 내부 클래스




























/////////////////////           클래스              ///////////////////////

//1.코틀린에서는 변수가 클래스의 멤버로 선언될 때 항상 프로퍼티로 취급됩니다. 일단 프로퍼티로 부른다까지만 알자.!!!!
//2.main 함수 안에 변수를 선언하면, 그 변수는 클래스의 멤버가 아니라 로컬 변수(local variable)가 됩니다.

// 3.Kotlin에서 클래스를 어디에 선언하든지 그 클래스의 인스턴스를 생성하고 사용하는 방법은 동일합니다.


    class Person() {
        // 클래스 내부에는 변수들과 메서드들이 정의됩니다.
        var name: String = "123"
        var age: Int = 0

        fun speak() {
            println("Hello, my name is $name and I am $age years old.")
        }
    }


    val class1= Person()//객체 생성!! 자바에선 new Person()으로 해주는거다.
    //여기서 class1 이 객체참조변수라고 보면 된다.

    println(class1.name)
    println(class1.age)
    println(class1.speak())
    //로 호출해주는것이다.



}








//코틀린 클래스는 주 생성자와 부 생성자를 가질 수 있습니다.
// 주 생성자는 클래스 선언 부분에서 바로 선언되는 생성자로, 클래스 이름 뒤에 파라미터를 정의하는 형태입니다 부 생성자는 constructor라고 따로 있다고 한다 추후에 보자
//init 블록은 주 생성자와 함께 사용되며, 객체가 생성될 때 실행되는 초기화 블록이다.
//init 블록에서는 객체가 생성될 때 초기화할 로직을 작성합니다.

//※※ but init 블록은 초기화 블록으로, 매개변수를 직접적으로 받아들이지 않습니다.
// init 블록은 클래스의 주 생성자(Primary Constructor)와 함께 사용되어,
// 주로 객체가 생성될 때 초기화해야 하는 코드를 포함합니다. ※※※

class Pergood(val name: String, var age: Int) {
    init {
        println("Person 객체가 생성되었습니다.")
        println("이름: $name, 나이: $age")
    }

    fun speak() {
        println("Hello, my name is $name and I am $age years old.")
    }

}






//인터페이스 interface : -> 추상클래스가 큼지막한 것들을
//자바에서 추상클래스와 인터페이스의 차이점은  추상 클래스는 클래스와 비슷하지만 인스턴스화할 수 없고(이건 인터페이스도 동일) 구현을 통해 확장되며, 일반 메서드를 포함할 수 있습니다.
// ※반면 인터페이스는 구현을 강제하며  ※※다중 구현 (상속)※※이 가능하며※, default 메서드와 static 메서드를 가질 수 있습니다
interface Car4 {
    // 추상 메서드 선언
    fun wheel2()
    fun engine1()
    fun engine3(){
        println("간다")}

}
interface Car5 {
    // 추상 메서드 선언
    fun wheel3()
}

//※클래스는 중첩 클래스 또는 로컬 클래스로 함수 내부에 정의될 수 있지만, 인터페이스는 재사용성과 모듈성을 높이기 위해 함수 내부에서 정의될 수 없습니다.
// 이는 인터페이스가 주로 여러 클래스 간의 계약을 정의하는 데 사용되기 때문입니다.


class  mainCar()   : Car4,Car5{
    // 이렇게 인터페이스는 다중 "구현" 상속x 가능하다.그리고 클래스 상속은 Car4()지만 인터페이스니 Car4로 해준다.

    //이렇게 하면  추상클래스같은것은 큼지막하게 공통된것(큼지막한 틀), ※인터페이스는 이제 작게작게 필수적으로 구현해줘야 할 것※들로 이제 설계를 해주면 된다. (작은 틀)
//추상클래스로 큼지막하게 공통된 기능들 적고, 인터페이스로 부분부분 다르게 구현해주면  된다. 근데.. Q. 추상클래스도 오버라이팅을 해줘야 하고 인터페이스도 그런데
    //그러면 추상클래스 안쓰고 인터페이스로 전부 해줘도 되는거 아닌가?.. 짜피 구현 다 해줘야 하고. 구현이나 상속이나 기본 구현을 포함한 일반 메서드 가질 수 있고..
    //그냥

    override fun wheel2() {
    println("인터페이스 구현")
    }

    override fun engine1() {
        println("인터페이스 구현")

    }

    override fun wheel3() {
        TODO("Not yet implemented")
    }

}




//여러 클래스가 공통된 구현이나 상태를 공유해야 한다면 추상 클래스를 사용합니다.
//클래스가 여러 다른 행동을 구현해야 하고, 다중 구현의 이점(안전하게 꼭 구현을 해야하는)을 활용하고자 한다면 인터페이스를 사용합니다.








// 코틀린은 클래스 내에 중첩 클래스,내붙 클래스를 정의할 수 있지만, 함수나 블록 내에서는 직접적으로 클래스를 정의할 수 없습니다. 이는 코틀린의 언어 설계상의 제한 사항입니다.


//중첩 클래스-객체지향 , 캡슐화
//내부 클래스: ->리사이클러뷰
//둘의 차이점은  안에있는 클래스가 밖 클래스의 값을 쓸수 있냐 없냐로 나뉨!



//중첩 클래스다. -> 외부에 있는 값들을 가져와 쓸 수 없다!
class Test1{
    val test1="간다"

    class Test3{
        fun testgood(){
            println("testesa")
         //   println(test1)//엘러ㅌ뜸

        }

    }

}
//호출은 Test1().Test3().testgood() 으로

//내부 클래스->외부에 있는 값들을 내부에서 쓸 수 있다!!
class Test2{

    val test1="간다"
    inner class testInnerClass{
        fun testFun2(){
            println("innerclass")
        println(test1)//출력 됨
        }
    }


//호출은 Test2().testInnerClass().testFun2() 으로

}
























