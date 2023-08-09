import mte._
import scala.language.postfixOps
import scala.annotation.unused

@main
def main(): Unit = {
  구구단2()
  팩토리얼()

  val vd: TestValidator = TestValidator()
  vd.validate(test1)
  vd.validate(test2)
  vd.validate(test3)
  vd.validate(test4)
  vd.validate(test5)
  vd.validate(test6)
  vd.validate(test7)
}

def ㄴ찍기(): Unit = {
  춘잣! (
    아니세상에 자기가 "케인" 이라는사람인데 개입 을 했대,
    ("케인" 조이고 4수) {
      ("케인"수) {
        리액션 (스키비야, "@")
      } 리액션 "\n"
    },
    ("케인"수) {
      ("케인" 조이고 5수) {
        리액션 (스키비야, "@")
      } 리액션 "\n"
    }
  )
}

def test3(): Unit = {
  춘잣! {
    아니세상에 자기가 "함수" 라는사람인데 {
      묶음!!("x", "y", "z")는 ("x" 배 "y" 코 "z")다 게이조이고
    } 를 했대
  } 케바바바밥줘 {
    정품 맞어 {
      "함수"야 묶음!!(1, 2, 3) 먹어라?? 꼽표~~
    }
  }
}

def test2(): Unit = {
  춘잣! {
    아니세상에 자기가 "함수" 라는사람인데 {
      "변수"는 ("변수" 배 뭉탱뭉)이다 게이조이고
    } 를 했대
  } 케바바바밥줘 {
    "함수"야 뭉탱뭉 먹어라??
  }
}

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

def test5(): Unit = {
  춘잣! (
    아~! ("소수판별", "n")은 묶음!!!! (
      아니세상에 자기가 "결과" 라는사람인데 (뭉 발행 NFT) 를 했대,
      (2 달려가 ("n" 반제곱 방어부스터 배 뭉)) ("i") {
        (유링게슝한?) ("n" 코가커요 "i" 돈 탱 원에?? 꼽표~~) {
          "결과" 게 그런 사람이 탱 힐 순없는지
        } 안유링게슝 스키비야
      },
      "결과"
    ) 가 참 좋구나~!,
    정품 맞어 (
      "소수판별"아 뭉뭉뭉 먹어라??,
      "소수판별"아 뭉탱탱.탱뭉 먹어라??,
      "소수판별"아 뭉뭉탱 먹어라?? 꼽표~~
    )
  )
}

def test6(): Unit = {
  춘잣! (
    아니세상에 자기가 "케인님 코 크기" 라는사람인데 3100 를 했대,
    아니세상에 자기가 "에라토스테네스" 라는사람인데 (왕한줄서기("케인님 코 크기", 뭉) 발행 NFT) 를 했대,
    "에라토스테네스" 게 그런 사람이 ("에라토스테네스" 갖고와 탱 할게 한판마안~~!! 탱) 힐 순없는지,
    "에라토스테네스" 게 그런 사람이 ("에라토스테네스" 갖고와 뭉 할게 한판마안~~!! 탱) 힐 순없는지,
    (뭉탱 달려가 "케인님 코 크기") ("뭉") {
      묶음!!!! (
        아니세상에 자기가 "탱" 이라는사람인데 ("뭉" 발행 NFT) 를 했대,
        강제연결 ("뭉" 조이고 "탱" 돈 "케인님 코 크기" 원에=?? 꼽표~~) (
          "에라토스테네스" 게 그런 사람이 ("에라토스테네스" 갖고와 ("뭉" 화면을 확대하셨군요!! "탱") 할게 한판마안~~!! 탱) 힐 순없는지,
          "탱" 게 그런 사람이 ("탱" 배 뭉) 힐 순없는지
        )
      )
    },
    (탱 달려가 "케인님 코 크기") ("뭉") {
      (유링게슝한?) ("에라토스테네스" 갖고와 임마!! "뭉") {
        "뭉" 리액션 "%s\t"
      } 안유링게슝 스키비야
    },
    스키비야 리액션 "\n"
  )
}

def test7(): Unit = {
  춘잣! (
    아니세상에 자기가 "함수" 라는사람인데 (
      묶음!!("뭉", "탱") 은 ("뭉" 조이고 "탱")이다 게이조이고
    ) 를 했대,
    "함수"야 묶음!!(6, 9) 먹어라?? 리액션 "%s\n"
  )
}

def 구구단(): Unit = {
  춘잣! {
    (11수) ("i") {
      (11수) ("j") {
        "i" 조이고 "j" 리액션 "%s\t"
      } 리액션 "\n"
    }
  }
}

def 구구단2(): Unit = {
  춘잣! {
    (1 달려가 10) ("i") {
      (1 달려가 10) ("j") {
        "i" 조이고 "j" 리액션 "%s\t"
      } 리액션 "\n"
    }
  }
}

def test1(): Unit = {
  춘잣! {
    정품 맞어 {
      주제넘은? {
        뭉 아 뭉탱 먹어라??
      } 꼽표~~
    }
  }
}

def test4(): Unit = {
  춘잣! {
    한줄서기(0, 1, 2, 3, 4) 갖고와 임마!! 3 배 7 리액션 "%s\n"
  } 케바바바밥줘 {
    한줄서기(0, 1, 2, 3) 조이는 한줄서기(4, 5, 6, 7) 리액션 "%s\n"
  }
}

class TestValidator(var n: Int = 1) {
  def validate(f: () => Unit): Unit = {
    f()
    println("test %d validated".format(n))
    n += 1
  }
}