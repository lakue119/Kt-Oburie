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

### 로그인
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/144237222-9f6abf14-8163-4fb9-b903-166f60930ef1.jpeg">
</div>
<br>


### 홈, 구인 카테고리 리스트 / 구인 상세 / 상대페이지
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150676650-ab547ae8-5265-4f5a-a255-44346fe4525e.jpg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677527-c1bc3060-fa5e-44b3-9e15-04c99c01029a.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677322-34a137fb-b413-4fb1-9f93-03c54eabbe0f.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677355-4ef21b2f-d4c2-4e7e-9e8b-88b2e786f3d9.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677387-2d88f435-ba21-4d28-ae3c-16f12b8e4aa4.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677454-1c4bea30-77e1-49cc-a87d-7428c02dd60c.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677481-25457ce1-3a01-4fa7-a255-6cd617e0e919.jpg">
</div>
<br>

### 검색
<br>
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677551-c5ce2445-fd0f-4492-b85e-29bc73405788.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677585-c3ad0cd8-bbb4-44fe-962c-cec3ca6eb20c.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677717-e242bc0c-91b5-4022-82f8-56e75124d2a3.jpg"> 
</div>
<br>

### 구직 리스트 / 구직 상세
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677622-50e0bc31-b682-4b73-a3bf-fe22f872028e.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677648-0147bddb-10ce-43aa-8bbc-1b23b95bab50.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150680532-e40e3b4a-4792-49f5-b249-1fd59a02ad27.jpg"> 
</div>

### 채팅
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677742-b1bf7335-fee2-45ca-95d1-df6f5896cf9e.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677748-2713bdd6-414c-4ff5-8498-c9dcfb292487.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150677999-da68d685-8db5-4287-ad84-dfc99d93585a.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678004-45087baf-9757-4515-bcdc-00e3131d7b22.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678062-b6da4cfd-d75f-40ee-87c8-81f669398669.jpg"> 
</div>
<br>

### 마이페이지
<br>
<div>
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678081-4b64a726-644c-4111-902b-17d8ae1e0624.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678103-9ac91d6f-78b2-4d93-b3aa-d3fe0dedc19a.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678122-5ec3eae3-faa3-409f-8f61-51602aed1d77.jpg">
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678156-69ffbf33-09e7-46ca-b1ae-b5fb5033109d.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678158-34e728c8-963e-4815-a191-9eb34c5f5e49.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678162-7a3da76a-0fad-47a4-b020-03b42a892a62.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150678214-b6147fb5-ee5a-4d2d-947e-7f10de148dfd.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150679813-17e304fc-5c3a-46c7-83ea-3dbdd23c521a.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150679829-c2033c79-5ab3-4096-b981-c18c2358c92c.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150679897-37da6f19-0354-4cbe-9a94-fbc0727e7218.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150679911-1b4123c6-d14f-4f4a-a49f-b6c327e2ead6.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150679935-5647623a-e469-44b0-90cf-84025faa88fa.jpg"> 
<img width="18%" src="https://user-images.githubusercontent.com/31702431/150679938-fd4aaf46-99a0-4064-b096-5b5f37946d11.jpg"> 
</div>






