### In Swagger UI, you can include headers, including authorization tokens, when making requests. 

**Ensure that your Swagger configuration includes the necessary security schemes. For example, if you are using JWT for authentication, you might have something like this in your `SwaggerConfig`:**

```java
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("your.package.name"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo())
                .securitySchemes(Arrays.asList(apiKey()))
                .securityContexts(Collections.singletonList(securityContext()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Your API Title")
                .description("Your API Description")
                .version("1.0.0")
                .build();
    }

    private ApiKey apiKey() {
        return new ApiKey("JWT", HttpHeaders.AUTHORIZATION, In.HEADER.toValue());
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .build();
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope
                = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Collections.singletonList(
                new SecurityReference("JWT", authorizationScopes));
    }
}
```

In this example, we're setting up a security scheme named "JWT" to be included in the Authorization header.

**2. Annotate Endpoints with Security Requirements:**

If your API has specific endpoints that require authentication, annotate those endpoints with `@SecurityRequirement`:

```java
@RestController
@RequestMapping("/api")
public class YourController {

    @GetMapping("/secured-endpoint")
    @SecurityRequirement(name = "JWT")
    public ResponseEntity<String> securedEndpoint() {
        // Your secured endpoint logic
        return ResponseEntity.ok("Secured endpoint accessed successfully");
    }
}
```

This ensures that Swagger UI knows which endpoints require the specified security scheme.

**3. Access Swagger UI:**

Run your Spring Boot application and access Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

**4. Authorize and Pass Token:**

1. Click on the "Authorize" button.
2. In the dialog that appears, enter your token in the "Value" field.
3. Click "Authorize."

Now, when you make requests using Swagger UI, the token will be included in the Authorization header.
