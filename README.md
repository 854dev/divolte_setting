## divolte_setting

# divolte 써보기

- 뭐하는 툴이고 왜 씀?
    - 클릭스트림 데이터 수집기 라고 함
    - 클릭스트림 분석을 왜 하느냐?
        - [https://stacktome.com/blog/a-guide-to-data-warehousing-clickstream-data](https://stacktome.com/blog/a-guide-to-data-warehousing-clickstream-data)
    - GA처럼 웹페이지에서의 사용자 행동 데이터를 축적하는 툴
    - 수집만 해줄 뿐이고 저장 분류 등 다른 기능은 파이프라인이 있어야 될듯
        
        ```jsx
        다만, 소스 마지막 업데이트가 깃허브 기준 3년전 (오픈소스 버전만 이렇게 된건가?)
        최근 글에서 디볼테를 쓰라는 글이 거의 없음
        ```
        
- 설치
    
    ```jsx
    Requirements
    Divolte Collector is written in pure Java and runs on any OS that supports the latest JVM. For best result, we recommend running on Linux.
    
    JDK, version 8 or above (Oracle’s JDK is recommended)
    At least 1GB available RAM; depending on configuration
    Hadoop 2.0 or above (optional, see below)
    Tested to work against: CDH, HDP and MapR
    Apache Kafka 0.10 or above (optional, see below)
    Load balancer with SSL offloading to support HTTPS
    ```
    
    - JDK 설치
        - [https://lee-jisoo.github.io/devlog/2018/09/18/linux-java-install/](https://lee-jisoo.github.io/devlog/2018/09/18/linux-java-install/)
    - SSL 오프로딩이란?
        - [https://minholee93.tistory.com/entry/SSL-offloading-이란-무엇일까](https://minholee93.tistory.com/entry/SSL-offloading-%EC%9D%B4%EB%9E%80-%EB%AC%B4%EC%97%87%EC%9D%BC%EA%B9%8C)
        
- 명령어 모음
    
    ```bash
    #로그 직접 보기
    	cd /tmp/
    	vi *.avro 파일 (sudo ls로 볼수있음)
    
    #디볼테 수집기 스타트
    	cd ~/divolte-collector-0.9.0
    	./bin/divolte-collector
    
    #로그 보기 (디볼테 툴 사용, 조회만 가능)
    find /tmp/ -name '*divolte-tracking-*.avro' | sort | tail -n1 | xargs ./bin/avro-tools tojson --pretty
    ```
    
- 데이터 수집
    - 수집기가 켜져 있는 동안 /tmp/ 에 로그가 쌓인다
    - 프로세스 종료시 쌓여있는 로그가 파일로 볼수있도록 업데이트됨
- 데이터 스키마
    - 
- 커스텀 이벤트 설정
    - 리액트 앱, 디볼테 스크립트 로드 완료시 window.divolte 로 접근 가능
    - divolte.signal() 로 커스텀 이벤트를 생성해서 보낼수 있음
        - 이벤트를 뭘 쓸까?
        
- 볼만한 링크
    - 디볼테 공홈
        [http://divolte-releases.s3-website-eu-west-1.amazonaws.com/divolte-collector/0.9.0/userdoc/html/index.html#](http://divolte-releases.s3-website-eu-west-1.amazonaws.com/divolte-collector/0.9.0/userdoc/html/index.html#)