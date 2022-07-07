/hello-spring/src/main/java/hello/hellospring/controller/HelloController.java에 "hello-string", "hello-api"추가
***
api 방식은 객체 반환시 유용하다!         
템플릿 엔진과 api의 차이: view 등이 존재하지 않는다. 요청한 클라이언트에게 다이렉트로 넘어간다.      
스프링은 객체를 반환하고 @Responsebody가 설정되어 있으면 JSON({key:value})형식으로 데이터를 만들어 http 응답에 반응이 default         
객체 -> Json변환 라이브러리: Jackson, GSON 이 두개가 대표적일듯 / spring은 Jackson을 기본으로 채택!
***
<img src="https://user-images.githubusercontent.com/103197599/177812563-77b5172f-a93e-4553-a0ab-a91cb55855b7.jpg"/>

