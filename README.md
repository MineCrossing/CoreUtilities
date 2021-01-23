# CoreUtilities
Centralised core API and utility manager for MineCrossing Java programs

## Maven Repository
To use RedisAPI run the following commands:
```shell script
git clone https://github.com/MineCrossing/CoreUtilities.git
cd CoreUtilities
mvn install
```
Then add this into your dependencies section in your pom.xml
```xml
<dependency>
    <groupId>xyz.minecrossing</groupId>
    <artifactId>CoreUtilities</artifactId>
    <version>1.0.0</version>
</dependency>
```

#### Available Features
`Logger` - Output information with prefixes depending on state and severity

`Tasks` - Run asynchronous and delayed tasks via `CoreUtilities#getTaskManager()`

Misc classes `ConnectionDetails`, `ConnectionManager`, `PropertyLoader`...