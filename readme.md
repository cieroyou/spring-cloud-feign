# 의존성 추가

- 의존성을 제대로 추가해 주지 않으면, `@EnableFeignClients` 를 찾지 못한다.
- gradle 인 경우, manageDependency 에 spring-cloud-dependencies 를 함께 적어줘야 한다.
- spring-cloud-dependencies 의 버전은 SpringBoot 버전에 맞는 버전으로 지정해주어야 한다.
- spring cloud dependencies 버전 확인은 [다음 사이트](https://spring.io/projects/spring-cloud)에서 확인이 가능하다.
    - SpringBoot 버전이 `2.6.7` 이므로 그에 맞는 `2021.0.x` 로 버전 설정을 하였다.
```groovy
ext {
    set('springCloudVersion', "2021.0.2")
}
dependencies {
    implementation "org.springframework.cloud:spring-cloud-starter-openfeign"
}
dependencyManagement {
    imports {
        mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
    }
}
```

# 외부 API 를 호출하는 API 작성
([https://jsonplaceholder.typicode.com](https://jsonplaceholder.typicode.com/posts)/posts)
## api request url

- [http://localhost:8080/v1/jsonplaceholer/posts](http://localhost:8080/v1/jsonplaceholer/posts/2)
- [http://localhost:8080/v1/jsonplaceholer/posts/](http://localhost:8080/v1/jsonplaceholer/posts/2)1

## 간단한 구현

- `@FeignClient` 를 이용하여 FeignClient Interface 를 정의(`JSONPlaceHolderClient`)하고
- `JSONPlaceHolderService` 에서 `JSONPlaceHolderClient` 를 호출하여, `JSONPlaceHolderController` 에서 서비스를 등록한다.

