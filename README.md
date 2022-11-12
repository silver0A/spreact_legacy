# 빌드 관련

### 🔥 공통 주의사항
* pom.xml에서 tomcat.localDirectory 설정 확인해볼 것
    + 빌드 파일 생성되는 경로
    + 본인 로컬 톰캣 경로에 맞게 수정

### 🔥 개발

* back-end
    1. root 폴더로 이동
    2. 명령어 실행
    ```
    mvn clean package
    ```
    3. tomcat.localDirectory 경로에 war파일 생성 확인
    4. 톰캣 실행
* front-end
    1. frontend 폴더로 이동
    2. 명령어 실행
    ```
    yarn start
    ```

### 🔥 운영
1. root 폴더로 이동
2. 명령어 실행
```
mvn clean package -P prod
```
3. tomcat.localDirectory 경로에 war파일 생성 확인
4. 톰캣 실행
