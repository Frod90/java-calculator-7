# java-calculator-precourse

---

## 문자열 덧셈 계산기

구분자와 양수로 구성된 문자열에서 숫자를 추출하여 더하는 계산기

---

## 기능 목록

### Output

+ [ ] 문자열을 입력 받는 메세지를 출력하는 기능
+ [ ] 연산 결과를 출력하는 기능

### Input

+ [ ] 문자열을 입력하는 기능
    + [ ] null이 입력된 경우, 예외가 발생하는 기능

### Domain

+ [ ] 구분자를 이용해 숫자를 분리하는 기능
  + [x] 문자 형식의 숫자를 숫자 형식으로 변환하는 기능
    + [ ] 입력한 숫자가 너무 큰 경우, 예외가 발생하는 기능
    + [x] 문자를 숫자로 변환할 경우, 예외가 발생하는 기능
  + [ ] 지정된 구분자나 커스텀 구분자 외의 문자를 구분자로 사용할 경우, 예외가 발생하는 기능
  + [ ] 첫 자리에 구분자를 사용하는 경우, 예외가 발생하는 기능
  + [ ] 마지막 자리에 구분자를 사용하는 경우, 예외가 발생하는 기능
  + [ ] 연속된 구분자를 사용한 경우, 예외가 발생하는 기능
  + [ ] 구분자와 숫자의 비율이 맞지 않는 경우, 예외가 발생하는 기능
  + [ ] 음수 입력시 예외가 발생하는 기능

+ [ ] 커스텀 구분자를 추출하는 기능
  + [x] 잘못된 형식으로 커스텀 구분자를 입력할 경우, 예외가 발생하는 기능
  + [x] 커스텀 구분자 입력을 위한 문자를 커스텀 구분자로 입력할 경우, 예외가 발생하는 기능
  + [x] 숫자를 커스텀 구분자로 사용할 경우, 예외가 발생하는 기능
  + [x] 빈 문자열을 커스텀 구분자로 사용할 경우, 예외가 발생하는 기능

+ [ ] 커스텀 구분자가 존재하는지 확인하는 기능

+ [x] 덧셈 기능
  + [ ] 계산 결과가 너무 큰 경우, 예외가 발생하는 기능

+ [x] 사용자가 입력한 문자열 중 커스텀 구분자 영역과 숫자 영역을 분리하는 기능