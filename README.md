# CoLang

CoLang(코언어)은 케인인님의 언어를 컴퓨터가 이해할 수 있도록 만드는 프로젝트다 맨이야.

### 예제

#### 구구단 출력하기

```scala
import mte._
import scala.language.postfixOps

def 구구단2(): Unit = {
  춘잣! {
    (1 달려가 10) ("i") {
      (1 달려가 10) ("j") {
        "i" 조이고 "j" 리액션 "%s\t"
      } 리액션 "\n"
    }
  }
}
```

#### 백준 23803. [ㄴ 찍기](https://www.acmicpc.net/problem/23803)

안타깝게도 백준은 스칼라 2까지만 지원하기 때문에 백준에 제출할 수는 없다 맨이야.
~~지금 몇 신데 아직도 지원을 안 해!! 아 미친 주문이 아직 안 됐네~~

```scala
import mte._
import scala.language.postfixOps

def ㄴ찍기(): Unit = {
  춘잣! {
    아니세상에 자기가 "케인" 이라는사람인데 개입 을 했대
  } 케바바바밥줘 {
    ("케인" 조이고 4수) ("i") {
      ("케인"수) ("j") {
        리액션 (스키비야, "@")
      } 리액션 "\n"
    }
  } 케바바바밥줘 {
    ("케인"수) ("i") {
      ("케인" 조이고 5수) ("j") {
        리액션 (스키비야, "@")
      } 리액션 "\n"
    }
  }
}
```

#### 팩토리얼 계산하기 (재귀함수)

```scala
import mte._
import scala.language.postfixOps

def 팩토리얼(): Unit = {
  춘잣! {
    아~! ("팩토리얼", "x")는 {
      (유링게슝한?) ("x" 돈 탱 원에??) {
        "팩토리얼"아 ("x" 코 뭉) 먹어라?? 조이고 "x"
      } 안유링게슝 {
        뭉
      }
    } 가 참 좋구나~!
  } 케바바바밥줘 {
    (11수) ("영양제") {
      "팩토리얼"아 "영양제" 먹어라?? 리액션 "%s\n"
    }
  }
}
```

#### 소수 판별 (O(sqrtN))

```scala
import mte._
import scala.language.postfixOps

def test5(): Unit = {
  춘잣! (
    아~! ("소수판별", "n")은 묶음!!!! (
      아니세상에 자기가 "결과" 라는사람인데 (뭉 발행 NFT) 를 했대,
      (유링게슝한?) ("n" 돈 뭉 원에??) (
        (뭉탱 달려가 ("n" 반제곱 방어부스터 배 뭉))("i") {
          (유링게슝한?) ("n" 코가커요 "i" 돈 탱 원에?? 꼽표~~) {
            "결과" 게 그런 사람이 탱 힐 순없는지
          } 안유링게슝 스키비야
        }
      ) 안유링게슝 (
        "결과" 게 그런 사람이 탱 힐 순없는지
        ),
      "결과"
    ) 가 참 좋구나~!,
    정품 맞어 (
      "소수판별"아 뭉뭉뭉 먹어라??, // 7은 소수
      "소수판별"아 뭉++뭉뭉뭉 먹어라??, // 17은 소수
      "소수판별"아 뭉뭉탱 먹어라?? 꼽표~~ // 6은 소수가 아님
    )
  )
}
```

## 자료형

* 일급 자료형
  * 스키비야
  * 유리계수
  * 한줄서기
  * 뭉탱이
  * 코객체
* 일급이 아닌 자료형
  * NFT
  * 언젠가

### 일급 자료형

#### 스키비야

C에서 void라는 게 있잖아요 그런데 우리가 C한테 져서는 안 되잖아?? 그래서 **스키비야**라는 
키워드를 준비를 했어요~ **스킵이야**라고 쓰는 것도 가능하단다.

#### 유리계수
분모가 1인 모든 유리계수 를! 사용할 수 있단다. ~~아아아이 그냥 정수라고 하면 되는 걸 그냥!~~

#### ~~부동소수~~
~~부동소수 그딴 게 어딨어 임마! 그런 거 함부로 쓰면 오차도 많고 별로 좋지도 아네.~~

#### 한줄서기
어우 뭔 느낌인지 알죠? 지금처럼 이케 잘 돼 있어 버정 이렇게 있으면 딱 이렇게
해 가지고 vector 앞에. vector 앞에. 쯥. 그냥 한줄서기로 있단 말야 그래서 내가 만약에 n번째로 들어온 원소다
그러면 그냥 n번째 원소에 접근하면 되거든?? 근데 걔는

![m](img/he-does-like-this.png)

이러면서 한다??

#### 뭉탱이
어우 뭔 느낌인지 알죠? 지금처럼 이케 잘 돼 있지 않아 딱 한줄서기 그런 게 아니고 hashMap
앞에. hashMap 앞에. 쯥. 그냥 뭉탱이로 있단 말이야 그러면 hashKey 눈치를 봐야
해 이케 Key("44번 버스")가 온다 그러면은? 

![m](img/he-does-like-this.png)

이러면서 한다??

#### 코객체 (구현 중)

**코객체**를 써서 CoLang에서 객체 지향 프로그래밍을 구현할 수 있다 맨이야.

### 일급이 아닌 자료형

#### NFT

기본적으로 모든 값은 **불변**(const)이에요~ 불변 변수를 갖고 프로그래밍하는 게 요즘 트렌드다 
맨이야. 근데 불변 변수만 갖고 프로그래밍하는 건 좀 힘들잖어 그치? 그래서 C의 동적 할당
포인터 비슷하게 **NFT**라는 걸 준비를 했어요. NFT를 발급하면, NFT 자체는 불변이지만
NFT가 가리키는 변수는 바뀔 수 있어서 가변 변수가 된다 맨이야.

NFT 자료형은 한 가지 경우를 제외하고는 항상 그 NFT가 기리키는 값으로 decay되게 되어
있어요~~ 그 경우가 뭐냐면 NFT 자료형인 변수를 수정할 때다 맨이야.

#### 언젠가

방송 시간 지키는 것도 귀찮은 코괴물을 위해서 CoLang은 **지연 평가**를 지원한다 맨이야.
계산하기 귀찮은 expression이 있으면 **언젠가** 키워드로 감싸도록 해요~ 코괴물이
최대한 계산을 늦춰 주실 거란다.

### 문법

