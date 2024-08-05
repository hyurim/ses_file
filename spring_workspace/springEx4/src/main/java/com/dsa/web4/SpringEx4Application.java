package com.dsa.web4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// JPA Auditing 기능을 활성화
/* JPA Auditing 
자동 생성 시간 기록
엔티티가 처음 데이터베이스에 저장될 때 자동으로 현재 시간을 기록

자동 수정 시간 기록:
엔티티가 수정될 때마다 현재 시간을 자동으로 기록

생성자 및 수정자 기록 (선택적):
엔티티의 생성자와 수정자를 자동으로 기록 가능
*/
// @CreatedDate와 @LastModifiedDate 등의 어노테이션을 사용할 수 있게 해줌 
@EnableJpaAuditing
@SpringBootApplication
public class SpringEx4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEx4Application.class, args);
	}

}
