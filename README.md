# LV.1


## 화면전환 후 데이터를 가져온 로직
### 사전 내용 정의
1. 비동기 처리 : 요청을 보낸 후 응답에 관계 없이 다음 동작을 실행 (cf_동기 : 요청을 보낸 후 해당 응답을 받아야 다음 동작을 실행)
2. 콜백 : 비동기처리에서 함수가 꼬이는 문제가 생기 때문에 함수가 끝나고 나서 원하는 시점에서 실행되는 함수, 다른 코드가 특정 코드가 마무리 되기 전에 실행되지 않도록, 비동기 처리를 위한 방법
3. 레지스터 : cpu가 요청을 처리하는데 필요한 데이터를 일시적으로 저장하는 기억장치


### 결과 및 설명
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114144725-991a4080-9950-11eb-8881-c838a92d0110.png"/>
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114146513-a46e6b80-9952-11eb-9614-d1b77a62893a.gif"/>
registerForActivityResult 메소드를 통해 signUpActivityLauncher을 만든다. 
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114146964-28285800-9953-11eb-8bfc-76e2ad552106.png"/>
SignUpActivity로 넘어가면서 signUpActivityLauncher를 함께 실행시킨다
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114147143-5b6ae700-9953-11eb-8704-b69bbec84c00.png"/>
인텐트에 넘길 값을 넣고, 넘길 값이 있을 때는 startActivity가 아닌 SetResult로 rquestCode와 인텐트 정보를 넣어준다
그 정보들은 signUpActivityLaucher안의 register에 담겨있다. 만약 런쳐 안에 정보를 가지고 가공할 함수가 담겨있다면 받아온 정보를 바탕으로 함수가 실행되게 된다


## 생명주기
1. SignInActivity를 처음 실행했을 때
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114147728-f5cb2a80-9953-11eb-8e0c-48d3360d63f9.png"/>
2. SignUpActivity에 들어갔을 때
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114147992-43479780-9954-11eb-85c0-2c4396e9f1f5.png"/>
3. SignInActivity로 다시 나왔을 때
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114148265-86096f80-9954-11eb-834b-c18683d2e615.png"/>
4. HomeActivity로 들어갔을 때 
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114148391-a76a5b80-9954-11eb-8618-3f435453f96a.png"/>

## 이번 과제를 통해 배운 점
열심히 공부해야 겠다

# LV.2
## 변수이름 체크
ok

## 스크롤뷰
<img width="80%" src="https://user-images.githubusercontent.com/42573282/114148810-25c6fd80-9955-11eb-9f85-3f9066549194.png"/>









