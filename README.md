# Spring Cloud Workshop

## About
Spring Cloud의 사내 교육용으로 만든 소스입니다.
Hystrix, Ribbon, Eureka의 기본 개념을 이해하고 적용해 보도록 되어있습니다.

실습 과정은 아래의 링크에서 프리젠테이션 파일을 다운로드 받을 수 있습니다.
[Presentation Download](https://www.slideshare.net/balladofgale/spring-cloud-workshop)

## 주요 단계별 Tag 설명

- `step-0` : 실습 시작
- `step-1-hystrix-basic` : Hystrix 기본 적용
- `step-1-hystrix-fallback` : Hystrix Fallback 적용
- `step-1-hystrix-fallback2` : Hystrix Fallback에서 Throwable 받기
- `step-1-hystrix-fallback2` : Hystrix Timeout 실습
- `step-1-hystrix-circuit-open` : Hystrix Circuit Open 실험
- `step-1-hystrix-command-key` : Hystrix Command 에 command key 부여하기
- `step-2-baseline` : Ribbon 실습 초기 상태
- `step-2-ribbon-loadbalanced` : @LoadBalanced RestTemplate 사용하기
- `step-2-ribbon-retry` : Ribbon retry 설정 및 실험
- `step-3-baseline` : Eureka 실습 초기 상 - Eureka Server 추가되어 있음
- `step-3-eureka-product` : Product 서버에 Eureka Client 추가
- `step-3-eureka-display` : Display 서버에 Eureka Client 추가
- `step-3-eureka-addresses` : Eureka Client에 Eureka Server 주소 명시적 설정
- `step-3-eureka-completed` : Eureka 실제 적용
- `step-4-baseline` : Feign 실습 초기 상태
- `step-4-feign-url` : URL과 함께 Feign 사용하기
- `step-4-feign-eureka` : Feign을 Eureka + Ribbon과 함께 사용하기
- `step-4-feign-hystrix` : Feign에 Hystrix 적용하기 (Fallback 포함)
- `step-4-feign-hystrix-properties` : Feign의 Hystrix에 Properties 추가하는 법
- `step-ended` : 실습 완료

## license

`spring-cloud-workshiop` is Open Source software released under the [Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0.html)
