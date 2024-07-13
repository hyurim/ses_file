// javascript 작성

const submit = () => {
  const [subArray, score] = array();
  isValid(subArray, score);
  const resultScore = scoreCheck(score);
  resultText(resultScore);
  const averScore = aver(resultScore);
  const failNumber = failSubject(resultScore);
  passFail(averScore, failNumber);
};

const array = () => {
  const sub1 = document.querySelector("#fir");
  const sub2 = document.querySelector("#sec");
  const sub3 = document.querySelector("#thr");
  const sub4 = document.querySelector("#four");
  const sub5 = document.querySelector("#five");
  const subArray = [sub1, sub2, sub3, sub4, sub5];
  const firValue = sub1.value;
  const secValue = sub2.value;
  const thrValue = sub3.value;
  const fourValue = sub4.value;
  const fiveValue = sub5.value;
  return [subArray, [firValue, secValue, thrValue, fourValue, fiveValue]];
};

const isValid = (subArray, score) => {
  return score.forEach((value, index) => {
    caseCheck(value, index, subArray);
  });
};

const caseCheck = (value, index, subArray) => {
  if (value > 20) {
    alert("각 과목당 맞춘 문제수(0~20)를 입력하세요");
    subArray[index].value = "";
    document.querySelector("#result").style.display = "none";
  }
};

const scoreCheck = (score) => {
  const resultScore = score.map((value) => {
    return Number(value) * 5;
  });
  return resultScore;
};

const resultText = (resultScore) => {
  first(resultScore[0]);
  sec(resultScore[1]);
  thr(resultScore[2]);
  four(resultScore[3]);
  five(resultScore[4]);
};

const first = (score) => {
  const firstscreen = document.querySelector("#firstResult");
  if (score <= 100) {
    let str = "[예상 점수]";
    str += score;
    str += "점";
    firstscreen.innerHTML = str;
    firstscreen.style.color = "blue";
  } else {
    firstscreen.innerHTML = "";
  }
};

const sec = (score) => {
  const secscreen = document.querySelector("#secResult");
  if (score <= 100) {
    let str = "[예상 점수]";
    str += score;
    str += "점";
    secscreen.innerHTML = str;
    secscreen.style.color = "blue";
  } else {
    secscreen.innerHTML = "";
  }
};

const thr = (score) => {
  const thrscreen = document.querySelector("#thrResult");
  if (score <= 100) {
    let str = "[예상 점수]";
    str += score;
    str += "점";
    thrscreen.innerHTML = str;
    thrscreen.style.color = "blue";
  } else {
    thrscreen.innerHTML = "";
  }
};
const four = (score) => {
  const fourscreen = document.querySelector("#fourResult");
  if (score <= 100) {
    let str = "[예상 점수]";
    str += score;
    str += "점";
    fourscreen.innerHTML = str;
    fourscreen.style.color = "blue";
  } else {
    fourscreen.innerHTML = "";
  }
};

const five = (score) => {
  const fivescreen = document.querySelector("#fiveResult");
  if (score <= 100) {
    let str = "[예상 점수] ";
    str += score;
    str += "점";
    fivescreen.innerHTML = str;
    fivescreen.style.color = "blue";
  } else {
    fivescreen.innerHTML = "";
  }
};

const aver = (score) => {
  let overScore = 0;
  score.forEach((value) => {
    if (value > 100) {
      overScore++;
    }
  });
  if (overScore > 0) {
    document.querySelector("#result").style.display = "none";
  } else {
    document.querySelector("#result").style.display = "block";
  }
  const average = document.querySelector("#average");
  const averageScore = score.reduce((a, b) => Number(a) + Number(b)) / 5;
  average.innerHTML = "평균 : " + averageScore + " 점";
  return averageScore;
};

const failSubject = (score) => {
  let failNum = 0;
  score.forEach((value) => {
    if (value < 40) {
      failNum++;
    }
  });
  const fail = document.querySelector("#failSubject");
  fail.innerHTML = "과락된 과목 수 : " + failNum + " 과목";
  return failNum;
};

const passFail = (averageScore, failNum) => {
  const passFailDiv = document.querySelector("#passFail");
  if (averageScore < 60 || failNum != 0) {
    passFailDiv.innerHTML = "불합격";
  } else passFailDiv.innerHTML = "합격";
};
