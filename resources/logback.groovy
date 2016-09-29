def USER_HOME = System.getProperty("user.home");
println "*** logback.grooCY loaded ***"
// no.kommune.bergen.omi.notification

appender("FILE", FileAppender) {
  // println "Setting [file] property to [${USER_HOME}/myApp.log]"
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

