# dasarathi-junit6-examples

### Run Maven Command To Execute Tests

- All Test
``` 
mvn clean test
```

- Quick Test Tag
```
mvn test -Dgroups=QUICK
```

- Slow Test Tag
```
mvn test -Dgroups=SLOW
```

- Integration Test Tag
```
mvn test -Dgroups=INTEGRATION
```

- Regression Test Tag
```
mvn test -Dgroups=REGRESSION
```
mvn clean test
mvn allure:report
mvn allure:serve
