# Code Explaination (Korean)

src/main/java/com 패키지 안에

CreateTableExample: 테이블 생성하는 클래스

InsertQueryExample: 테이블에 쿼리를 삽입하는 클래스

SelectQueryExample: 테이블에 저장된 튜플을 검색하는 클래스
가 저장되어 있습니다.

각 클래스 안에 main 이 들어가 있기 때문에, 위의 3가지 작업을 할 때마다
실행해주면 됩니다. (총 3번 실행)

mysql.auth는 design_proj 스키마를 위한 DB 접속정보 파일입니다.

이때, design_proj는 한글을 사용하기 때문에 utf-8 characterset, utf8_bin collation으로 세팅되었습니다.
