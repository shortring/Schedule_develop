[API 명세서 9ecbf85eb9dd4b619274cf735d5a84e0.csv](https://github.com/user-attachments/files/23641651/API.9ecbf85eb9dd4b619274cf735d5a84e0.csv)
기능,Error,Method,URL,request,response,상태코드
일정 생성,"NOT_FOUND , 없는 유저입니다.",POST,http://localhost:8080/users/%7BuserId%7D/schedule_develops,"path : userId

요청 body
{
""title"": ""제목"",
""content"":""내용""
}","등록 정보
{
”ScheduleId"": 아이디,
""title"": ""제목"",
""content"": ""내용"",
""userId"": ""유저 아이디"",
”userName”: “유저 이름”,
”userEmail”: “유저 이메일”
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: OK
일정 선택 조회,"NOT_FOUND, 없는 일정입니다",GET,http://localhost:8080/users/%7BuserId%7D/schedule_developshttp://localhost:8080/schedule_develops/{scheduleId},Path : scheduleId,"단건 응답 정보
{
""id"": 아이디,
""title"": ""제목"",
""content"": ""내용"",
""userId"": ""작성 유저 아이디"",
""userName"": ""작성 유저 이름"",
""userEmail"": ""작성 유저 이메일"",
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: OK
일정 수정,"NOT_FOUND, 없는 일정입니다
UNAUTHORIZED, 잘못된 비밀번호입니다",PUT,http://localhost:8080/users/%7BuserId%7D/schedule_developshttp://localhost:8080/schedule_develops/%7BscheduleId%7D,"path : ""scheduleId"": 아이디

요청 body
{
""title"": ""제목"",
""content"": ""내용"",
""password"": ""비밀번호""
}","수정 정보

{
""id"": 아이디,
""title"": ""제목"",
""content"": ""내용"",
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: OK
일정 삭제,"NOT_FOUND, 없는 일정입니다
UNAUTHORIZED, 잘못된 비밀번호입니다",DELETE,http://localhost:8080/users/%7BuserId%7D/schedule_developshttp://localhost:8080/schedule_develops/%7BscheduleId%7D,"path : scheduleId

요청 body
{
""password"": ""비밀번호""
}",-,200: NO_CONTENT
일정 목록 조회,"NOT_FOUND, 없는 유저입니다",GET,http://localhost:8080/users/%7BuserId%7D/schedule_develops,"path : userId ","다건 응답 정보
List
{
""id"": 아이디,
""title"": ""제목"",
""content"": ""내용"",
""userName"": ""작성 유저명"",
""userEmail"": ""작성 유저 이메일"",
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: OK
유저 선택 조회,"NOT_FOUND , 없는 유저입니다",GET,http://localhost:8080/schedule_develops/%7BscheduleId%7D,path : userId,"응답 정보
{
""userId"": 유저 아이디,
""name"": ""유저명"",
""email"": ""유저 이메일"",
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: OK
유저 생성,BAD_REQUEST 이미 사용 중인 이메일입니다.,POST,http://localhost:8080/users,"요청 body
{
""name"": ""유저명"",
”email"":""이메일""
”password"":""비밀번호""
}","등록 정보
{
""name"": ""유저명"",
”email"":""이메일"",
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: 정상 등록
유저 수정,"NOT_FOUND , 없는 유저입니다.",PATCH,http://localhost:8080/schedule_develops/%7BscheduleId%7D,"session에서 받아올 정보
{
""id"": ""아이디"",
”name"": ""이름""
}

요청 body
{
""name"": ""이름"",
”email"": ""이메일""
}","수정 정보

{
""id"": 유저 아이디,
""name"": “이름"",
”password”: “이메일”,
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: OK
유저 삭제,"NOT_FOUND , 없는 유저입니다",DELETE,http://localhost:8080/schedule_develops/%7BscheduleId%7D,"session에서 받아올 정보
{
""id"": ""아이디"",
”name"": ""이름""
}",void,200: NO_CONTENT
유저 전부 조회,,GET,http://localhost:8080/schedule_develops/%7BscheduleId%7D,-,"응답 정보
List
{
""userId"": 유저 아이디,
""name"": ""유저명"",
""email"": ""유저 이메일"",
""createdAt"": ""생성일"",
""modifiedAt"": ""수정일""
}",200: OK
로그인,"UNAUTHORIZED , 잘못된 이메일, 혹은 비밀번호입니다.",POST,http://localhost:8080/login,"요청 body
{
”email"":""이메일""
”password"":""비밀번호""
}
session 생성",void,200: OK
