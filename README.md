<br>



## <img width="3.5%" src="https://user-images.githubusercontent.com/31702431/150622201-292d1990-b10e-4483-a8f1-a6e9b6ef2514.png"> 오부리



<br>

## 목차

* [앱 소개](#앱-소개) 
* [오부리 주요 기술 스택](#오부리-주요-기술-스택)
* [처음 적용해본 경험들](#처음-적용해본-경험들)
* [현재 코드의 문제점](#현재-코드의-문제점)
* [그 외 앱 이미지](#그-외-앱-이미지)

<br>

## 앱 소개

<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/149659365-0ec6be6a-8a83-4b5d-bfd5-df59c2b9ce67.png">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/149661162-92a474e5-5aac-4157-a7ec-835cc2108d19.png">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/149659380-3ad6d644-6add-4c52-bf3e-b3620c3796d7.png">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/149659383-a2019189-c34b-4e5a-9759-cfd41737e3bb.png">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/149659386-41c2f986-1033-45ac-8c97-b548b9661d04.png">
</div>
<br>

- 기간 : 2021.01 ~ 2021.06
- 팀 구성 : android 1명
- 역할 : 기획, 디자인, Android 앱 개발
- 내용 : 음악인들을 위한 구인/구직 앱

<br>
<br>

## 오부리 주요 기술 스택
- Kotlin
- MVVM
- Hilt
- AAC
- Retrofit2
- Clean Architecture
- Room
- SharedPreferences
- DataBinding
- Coroutine 

<br>
<br>

## 처음 적용해본 경험들
- ViewHolder에 ViewModel을 전달
  - ViewModel의 코드를 바로바로 호출하면 되기 때문에 기존의 recyclerView의 이벤트 전달이 수월해짐
- Camera Permission
  - 버전이 변경되면서 Android11부터 Camera Permission이 변경되었는데, 이 프로젝트를 통해 경험할 수 있었습니다.
- 채팅화면 키보드 컨테이너 구현
  - 채팅할 때 파일첨부하는 컨테이너와 키드와 번갈아가며 사용할 수 있도록 구현
- 기획과 디자인
  - 처음으로 플랫폼규모의 사이즈를 기획과 디자인을 해 봄
  - 처음이라 무슨 아이콘을 써야할지, 어떤 방식으로 구현해야할지, 상황에 따른 처리 등 여러가지를 생각해봐야 해서 어려웠지만 재미있었습니다.
  - 개발하랴 기획하랴 디자인하랴 힘들긴했지만 좋은 경험을 했고, 앞으로도 이런 경험을 계속 쌓을 예정입니다.
<br>
<br>

## 현재 코드의 문제점
- Adapter를 ViewModel에서 생성하고 처리하고 있다.
  - 의문점 : 어느 OTT회사의 면접에서 Adapter는 View인가, Model인가 라는 질문을 받았다. 정답은 없지만 제 생각에는 View라고 판단을 했기 때문에, ViewModel에 있는 것보다는 View에 보여주는게 맞다 생각해 서 개선하기로 함.
  - 개선사항 : Adapter를 ViewModel에서 관리하지 않고, View에서 관리하도록 변경
- 비슷한 레이아웃같은 경우 중복코드가 많이 생성됨.
  - 같은 기능, 같은 레이아웃인데 다른 화면에서 나오는 곳일 경우 ViewModel에 게속 같은 기능을 처리하는 코드와 레이아웃으로 구현되어 있어 유지보수하기가 힘들고 중복코드가 많이 생성됨.
  - 개선사항 : 상속으로 처리하여 중복코드를 최대한 제거

개선사항이 적용된 프로젝트 [동네잡일] (https://github.com/lakue119/TownChores)

<br>
<br>


## 그 외 앱 이미지

### 스플레쉬 / 로그인
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237086-0af32b47-f4d9-4fec-91fb-e67daf4ed206.jpeg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237222-9f6abf14-8163-4fb9-b903-166f60930ef1.jpeg">
</div>
<br>

### 리스트 / 상세 
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237280-2d4ae2c3-0fba-4a86-917b-f122f5efa277.jpeg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237247-160478cf-5235-447f-9d29-9e744fe72dc7.jpeg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237252-0ab9ebfb-9b78-452e-834a-9d64e360485f.jpeg">
</div>
<br>

### 검색
<br>
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237191-da5ebdd6-6939-4672-8b88-7ed482791704.jpeg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237096-3bdd7547-3d6f-484d-81e7-7639db7b2322.jpeg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237127-f50b41dd-b3c9-4f98-9948-d163996eed71.jpeg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237107-92c1bdce-2de6-46b2-84e4-e37ea545a6fb.jpeg">
</div>
<br>

### 업로드
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237269-bc72c43a-1dd8-4cab-988c-5e299b9b71b7.jpeg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237274-48dec851-440d-46a4-8581-ab8962f24cc9.jpeg">
</div>

### 알림 
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237195-08d1d61b-4814-4abc-9773-ba4ef3eb27f1.jpeg">
</div>
<br>

### 마이페이지
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237202-4c311cf2-95cb-46d2-87a7-ee2cb39663bb.jpeg">
</div>






