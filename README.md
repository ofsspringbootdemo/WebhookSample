# WebhookSample
Webhook Sample Service

Basic Steps:
- Create a projet
- Add project to Git

1. Download and install Heroku CLI
2. Go to project directory and execute
- $ heroku create (create app with random name and mapped to current working project)
- $ git push heroku master
- $ heroku ps:scale web=1
- $ heroku open

Note: Instead of `heroku create` can use "heroku git:remote -a omnibot-ws" (omnibot-ws - new app created in heroku by browser)

3. create a file name `procfile` in project root directory and add below line
web: java -jar target/my-drink-ws-1.0-SNAPSHOT.jar


Create Feign client to all one of Registed microservice to get value
http://javamicro.com/ref-card/Spring/Feign-Client-Example-with-Spring-boot

- Openfeign client (https://cloud.spring.io/spring-cloud-openfeign/)

	<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Finchley.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

		<dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-openfeign</artifactId>
        </dependency>

    -- Add `@EnableFeignClients` to `Application.java`
    -- Add `@FeignClient(name="my-drink-service-client", url="https://my-drink-service.herokuapp.com")` to interface client
- Service registry & service disovery
- Hystrix circuit breakdown

		<dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
        </dependency>
	`feign.hystrix.enabled=true` to application.properties

	-- add ClientFallback with default value and add `fallbackFactory` property to @FeignClient

https://omnibot-ws.herokuapp.com/omnibot/webhook
https://my-drink-service.herokuapp.com/drink?drinkName=coke&drinkType=cold&drinkSize=large