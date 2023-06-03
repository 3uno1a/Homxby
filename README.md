# Homxby
Smart Home Application 

app --> src --> main 안의 폴더들만 있음
용량이 커서 zip파일도 업로드 불가

--------------------------------------------------------------------------------------------------------------------

홈 화면 - 현재 시간, 온도, 습도, 밝기, 문 열림 상태, 커튼 상태 등을 보여줌

smart cam - 실시간으로 문 앞의 상황을 촬영, 방문자가 20cm이내로 가까이 오면 사진을 촬영하고 서버에 업로드
            버튼을 누르면 촬영된 사진 리스트를 보여주고 하나하나 누를 수 있도록 함
            
smart door lock - 원격 도어락 시스템으로 버튼을 길게 눌러 서보 모터의 각도를 변경하여 문을 열고 닫음
                  실시간 문 열림 상태를 api에서 받아와 화면에 출력
               
온습도 제어 - 스마트 제어 버튼을 눌러 실시간으로 받아지는 온도와 습도 데이터를 이용하여 설정한 기존 온도와 습도에 따라 에어컨, 히터, 제습기, 가습기를 on/off 시켜줌
             스마트 제어를 off로 하면 수동으로 에어컨, 히터, 제습기, 가습기를 컨트롤 할 수 있음
             
스마트 커튼 제어 - 원격으로 커튼을 제어하고 커튼의 개폐 상태를 알려줌


![image](https://github.com/eunjijen/Homxby/assets/75493219/05ae85f5-1e2c-4a92-9b29-44ca529f855f)
![image](https://github.com/eunjijen/Homxby/assets/75493219/03e794a7-1178-493d-b607-06db513c9c8f)
![image](https://github.com/eunjijen/Homxby/assets/75493219/6e8cdfd7-cd96-43d4-8fb5-75c52f4ce577)
![image](https://github.com/eunjijen/Homxby/assets/75493219/684968b7-9a67-4112-861b-82f36cf11197)
![image](https://github.com/eunjijen/Homxby/assets/75493219/cedac6f1-8831-4734-a4c0-925cdd9dc193)
![image](https://github.com/eunjijen/Homxby/assets/75493219/ab0f415a-15c8-4ea9-9ce3-5b145c826b03)
![image](https://github.com/eunjijen/Homxby/assets/75493219/81f299b2-f1e0-4831-b480-e0ef27f4614d)
![image](https://github.com/eunjijen/Homxby/assets/75493219/d66c75b6-9860-4d6c-8a1e-a72e80aa4061)
