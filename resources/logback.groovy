def USER_HOME = System.getProperty("user.home");
println "*** logback.groovy loaded ***"

appender("FILE", FileAppender) {
  file = "${USER_HOME}/git/groovy-slf4j/test.log"
  encoder(PatternLayoutEncoder) {
    // pattern = "%d{yyyy-MM-dd HH:mm:ss.SSS} %msg%n"
    pattern = "%d %level %msg%n"
  }
}

appender("STDOUT", ConsoleAppender) {
  encoder(PatternLayoutEncoder) {
    pattern = "%d %level %msg%n"
  }
}

root(INFO, ["STDOUT"])
logger("janck.Family", DEBUG, ["FILE"])

