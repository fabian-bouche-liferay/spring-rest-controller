# Sample Liferay REST Controller

Question: Is it possible to expose a Spring REST controller as a Liferay Application?

This sample provides a working proof of concept.

To test:

```
$curl --header "Accept: application/json" http://localhost:8080/o/service/api/user/123
{"userId":123,"firstName":"John","lastName":"Doe"}
```

Credits to: https://github.com/rfranchi/sample-rest-api
Adapted to run with Liferay DXP 7.4