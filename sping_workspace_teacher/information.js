// 이메일 주소를 검사하는 정규표현식 패턴
const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;

// 이메일을 검사하는 함수
function isValidEmail(email) {
  return emailPattern.test(email);
}

// 예제 이메일 주소
const email = "example@example.com";

// 조건문을 사용하여 이메일 유효성 검사
if (isValidEmail(email)) {
  console.log("유효한 이메일 주소입니다.");
} else {
  console.log("유효하지 않은 이메일 주소입니다.");
}