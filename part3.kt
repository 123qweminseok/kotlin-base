
fun main() {

//단일 표현식 함수:함수의 본문이 단 하나의 표현식으로 구성될 때 사용할 수 있는 간결한 함수 정의 방법입니다
//-이 경우 중괄호 {}를 생략하고 = 뒤에 표현식을 작성합니다.
fun b() = 12
//b 함수는 Int 타입의 값을 반환하며, 함수의 본문은 단순히 숫자 12를 반환하는 표현식으로 구성되어 있습니다

//아래와  동일함.
fun b1() :Int {

    return 12

}

    //// 아래 두 함수는 같다.
fun sum(a:Int, b:Int) :Int{
    return a+b
}

    //람다식임.
val sumNumber ={ a: Int, b:Int ->a+b }

    val sumTypeNumberNull:(Int,Int)-> Int= {a,b ->a+b}

    //: (Int, Int) -> Int는 함수 타입을 나타냅니다. 이 함수는 두 개의 Int 파라미터를 받고, Int 타입을 반환합니다.
    //-> a와 b는 람다 표현식의 매개변수입니다. 이 경우 Int 타입입니다.

println(sumNumber(1,2))

println(sumTypeNumberNull(3,5))

val sumString1={a:String, b:String ->"string1 $a string2: $b"} //코틀린의 타입 추록 기능때매 반환 타입 선언 안해도 된다. 컴파일러가 추론해줌.
    val sumString2: (String,String) ->String ={a,b ->"string1 :$a string2: $b"}
//명시적으로 함수 타입 선언 ㅇㅇ
    
    println(sumString1("테","스트"))


    println(sumString2("테","스트"))










//고차함수 (Higher-Order Function)
    //f(x)= x-> f(f(x))=x ->함수 안에 함수가 들어가는것이다... 뭐 일단 이정도 개념만 알고있자.





    //Unit 반환 타입 :함수가 어떤 값을 반환하지 않고 단순히 실행을 마치면, 그 함수의 반환 타입은 Unit입니다.
    fun doSomething(): Unit {
        println("Doing something")
    }

    fun test4() : Unit{
        println("abc3")
        return Unit
    } //위의 함수랑 동일한 표현이다. 생략 가능하다.

    fun test5() {
        println("abc3")
    }




//주생성자에 변수 초기화시 이야기..

    //※ 현재 매개변수에 변수선언 키워드와 함께 초기화되었으니 메모리상에 유지가 되는거다.
    class Box(var test :Int){

    }
val box1=Box(10)
    println(box1.test)

    class Box1( test :Int){

    }
    val box2=Box1(10)
  //  println(box2.test) //에러뜬다는 말이다 ㅇㅇ




    // 제네릭: 컴파일시에 타입 체크를 할 수 있다.
    //타입 캐스팅이 필요없다
//제네릭을 사용하면 하나의 클래스나 함수를 여러 데이터 타입에 대해 재사용할 수 있습니다


class rox1(test:Int){
    var value=test

}


    class rox2(test:String){
        var value=test

    }

val ab=rox1(10)
    println(ab.value)


    val ab2=rox2("숫자10")
    println(ab2.value)


    val ab_1=rox1("10".toInt())//문자열을 int형으로 바꿈
    println(ab_1.value)


//Box3 클래스는 <T>라는 타입 매개변수를 가지고 있습니다. 이는 클래스 내에서 사용될 데이터 타입을 나타냅니다.
    class Box3<T> (test:T){
        var value=test
    }
    //즉 제네릭을 사용하면 하나의 클래스나 함수를 여러 데이터 타입에 대해 재사용할 수 있어서 용이하다!

val test =Box3(102)
println(test.value)


    val test2 =Box3("GD")
    println(test.value)




//    class nini3(test11){
//
//        var test3=test11
//    }
// 주 생성자 즉 =매개변수 정의할때 반드시 타입을 지정해줘야 한다.



//제네릭 함수이다.
    fun <T> printItem( item: T) {
        println(item)
    }
    printItem(10) // Int 타입
    printItem("Hello") // String 타입

    fun <G> printItem2():String {
        println("하이")
        return "바이"
    }//앞에 문자는 뭐가 붙든 상관 X! 두개가 같으면 된다!

    println(printItem2<String>())

    fun <G> printItem2(item:G) {
        println("하이")
    }//앞에 문자는 뭐가 붙든 상관 X! 두개가 같으면 된다!

//★ 즉 함수를 호출해줄때나 클래스를 호출해줄때 매개값에 어떤 타입이 들어오든 수용하기 위함! -Any와 비슷한데
    //타입 안정성에서 차이가 있다고 한다 제네릭을 사용하면 컴파일 시점에 타입 체크가 가능하므로 타입 안정성을 보장받을 수 있습니다.
// 반면 Any를 사용하면 컴파일 시점에 타입 체크가 이루어지지 않아 제네릭을 권장한다고 한다... Q. 이건 근데 추후에 다시 확인해봐야한다.


    // 클래스나 함수 앞에 붙는 T는 제네릭 타입 매개변수(Type Parameter)를 나타냅니다. 이는 해당 클래스나 함수가 사용될 때 실제로 사용될 데이터 타입을 나타내는데 사용됩니다
        //클래스 앞, 함수 앞, 인자에도 동일하게 붙는 규칙이다!




//object->싱글톤 패턴: 객체를 한개만 생성하도록 함-디자인 패턴 즉 코드를 어떻게 짜는게 더 좋고 어떤 방식으로 구성해야 유지보수가 좋은지에 대한 패턴.
//싱글톤 패턴은 클래스의 인스턴스가 단 하나만 존재하도록 보장하는 디자인 패턴입니다. Kotlin에서는 object 키워드를 사용하여 쉽게 싱글톤 객체를 만들 수 있습니다.
//싱글톤 객체 (object):
//1.하나의 인스턴스만 존재합니다. -여러 객체를 만들어도 결과는 하나임.
//2.전역적으로 접근 가능합니다.
//3.주로 상태를 공유하거나, 유틸리티 메서드를 제공하는 데 사용됩니다


 val tata1=TestClass()
    val tata2=testObject
    val tata3=testObject//이렇게 init으로 인해 출력이 두번되어야하는데 object로 만들면 한번만 된다.

println(tata2.count)
    println(tata3.count)
  tata2.count=14
    println(tata2.count)

    println(tata3.count)//tata3은 다른 객체여야하는데 object로 해주니 전역 객체로 ,객체를 새로 만들더라도 하나의 주소값을 저장한다!

    println(tata2)
    println(tata3)//객체 참조변수 즉 주솟값 출력시 tata2와 주소값이 같은것을 볼 수 있다.
println(testObject.count) //전역으로 접근 가능 object붙은 클래스니까


    println(TestObjectClass.number) //자바의 static과 같다. 클래스명.내부 변수 호출
println(TestObjectClass.ppha())
}
object testObject{

    init {
        println("출력출력")
    }

    var count=12
}


class TestClass{
    init{
        println("testclass")
    }

}



class TestObjectClass{

     companion object {
        var number=0
     fun ppha(){
         println("전역메서드 출력방법")}
     } //companion object 내부의 멤버들은 클래스의 인스턴스 없이도 접근할 수 있습니다. (자바에서 static= companion object임. 객체 없이 호출 가능.)
//companion object는 클래스 내에 정의되지만 클래스의 모든 인스턴스가 공유하며, 클래스의 인스턴스가 없어도 접근할 수 있는 전역적인 특성을 갖습니다


    fun plus(){
        number++

    }

    fun minus(){number--}

}

