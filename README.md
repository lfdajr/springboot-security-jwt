# springboot-security-jwt

```
curl -X POST -H "X-Requested-With: XMLHttpRequest" -H "Content-Type: application/json" -H "Cache-Control: no-cache" -d '{  
    "username": "svlada@gmail.com",
    "password": "test1234"
}' "http://localhost:9966/api/auth/login"
```

Sequencia:

1. WebSecurityConfig
2. AjaxLoginProcessingFilter
3. AjaxAuthenticationProvider
