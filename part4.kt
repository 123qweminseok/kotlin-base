//지연 초기화
//lateinit/lazy

fun main(){

    lateinit var test1:String
    //서버에서 받아온 데이터를 넣어두는 일이 생기는데 미리 변수를 선언해놓고, 나중에 서버에서 값을 받아와서 넣어줄 때 사용된다.
    test1="변경된 스트링"

    //lazy - 메모리 절약하려고 사용, val로 선언해야함(변경 불가능), 변수 호출해줘야 중괄호 블록 초기화됨.(함수의 경우 이미 정의될때 중괄호 내부가 초기화됨)

    val lazyString: String by lazy {
        println("이 친구가 만들어짐")
        "Lazy Initialized String" }

    println(lazyString)
//println(lazyString)를 통해 lazyString에 접근할 때, lazy 블록이 실행됩니다. 즉 lazyString이 사용되기 전까지 { } 이 중괄호 값이 할당되지 않는다.
    //즉 lazy사용하는 경우 변수에 접근하기 전까지 { } 이 중괄호 내부는 메모리상에 존재하지 않는다.
//사용이유: 메모리 절약 가능.





    //infix 키워드 -> 함수를 중위 표기법으로 호출해 줄 수 있다 .. 이정도. 가독성이 향상된다고 한다. 근데 걍 나는 두개 더하는 함수 만들랜다.
infix fun String.sum1(abc:String):String=this+abc

    println("apple" sum1 "포토") //이렇게 하면 두개를 합쳐준다고 한다.. 일단 알고만 있는다..









//Scope function
    //let /with/run/apply/also -> 남의 코드를 볼때 자주 보인다.
    // let->null이 아닐때 실행됨. . with->컨텍스트 내부에서 함수 호출할때 사용
    //run->객체 초기화와 리턴값 계산이 필요할 때 주로 사용
    //apply ->값 반환하지 않고 객체 구성에 대해 주로 사용할때
    // also->객체에 대해 추가적인 작업



    val str: String="hihi"

    println(str.length)

    //str.let { ... }: let 함수를 사용하여 str이 null이 아닐 때에만 실행할 코드 블록을 정의합니다.
//let 함수를 사용하면 해당 값이 null이 아닐 때에만 람다 함수를 실행할 수 있습니다.
    //str.let { ... } 블록에서 ※ ※※ let 함수의 람다 표현식은 마지막 표현식의 결과를 반환합니다.※※※
    val length2= str.let{
        println(it) //hi출력  it은 str 변수를 가리키는 람다 함수의 인자입니다. .

        it.length
        "123333" //
    }
println(length2) //4출력







//(여기서부터 아 이런게 있다~ 정도만)

//with -with 함수를 사용하여 numbers라는 컬렉션(가정)에서 첫 번째와 마지막 요소를 문자열로 합쳐서 출력하는 예제입니다
    //따라서 객체의 이름을 반복해서 사용하지 않아도 되며, 코드가 간결해지기 때문에 사용한다.
val numbers= mutableListOf("a","b","c","d")

    println(numbers.first()) //a출력

    println(numbers.last()) //b출력


val firstAndLast=with(numbers){
    "${first()} ${last()}"
}
println(firstAndLast)


//////////////////////////
    data class Person(
        var name : String,
        var age : Int = 0,
        var city : String = ""
    )


    //apply를 객체를 더 간편하게 다뤄줄 수 있다. 내부에 있는 값들을 바꿔준다는 것이다 . ㅇㅇ
    val tester1 = Person("Tester1")
    println(tester1)

    tester1.age = 20
    tester1.city = "Seoul"

    println(tester1)

        //아래와 같이 apply를 사용해 값을 바꿀 수 있다.
    val tester2 = Person("Tester2").apply{
        age = 21
        city = "Busan"
    }

    println(tester2)



    // also: also 함수는 객체를 받아서 람다 함수를 실행한 후 그 객체를 반환합니다.
    //그냥 객체에 대해 람다함수 안에서 작업해주는거다.

    val numbers1 = mutableListOf(1,2,3,4)
    println("$numbers1 여기에서 5를 추가합니다.")
    numbers1.add(5)
    println(numbers1)

//즉 아래와 같이 also를 이용해 추가적인 작업이 가능하다.
    val numbers2 = mutableListOf(1,2,3,4)
  numbers2.also {
        println("$numbers2 여기에서 5를 추가합니다.")
        it.add(6)
    }.add(5)

    println(numbers2)
//also 함수는 객체의 상태를 변경할 수 있지만, 객체 자체의 참조는 변경할 수 없습니다.
// 즉, it을 사용하여 해당 객체의 프로퍼티나 메서드에 접근 및 수정할 수 있지만, 다른 객체로의 참조 변경은 불가능합니다
}



//열거형! 뭐 이런것들이 있다
//열거형 내부에서 정의된 각각의 값들을 말합니다.
//각 상수는 열거형 클래스를 구성하는 객체이며, 콤마(,)로 구분됩니다.
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun colorName(): String {
        return when (this) {
            RED -> "Red"
            GREEN -> "Green"
            BLUE -> "Blue"
        }
    }
}

//   println(Color.RED.rgb) // 출력: 16711680 //  원래 객체 생성은 Cplor().ㅇ이런식으로 가는게 맞는데  괄호 사용해주지 않는다.
//    println(Color.GREEN.colorName()) // 출력: "Green"

//Color 열거형 클래스는 RED, GREEN, BLUE 세 가지 열거형 상수를 정의합니다.
//각 상수는 rgb라는 프로퍼티를 가지고 있으며, 이는 각 색깔의 RGB 값입니다.
//colorName() 메서드는 각 상수의 이름을 반환하는 함수입니다.



