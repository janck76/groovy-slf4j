package janck

// import org.slf4j.*
import groovy.util.logging.Slf4j
// import ch.qos.logback.core.*
// import ch.qos.logback.classic.encoder.*


// Use annotation to inject log field into the class.
@Slf4j
class Family {
    def loggerInfo() {
      println "Name: ${log.getName()}"
      println "LoggerContext: ${log.getLoggerContext()}"
    }

    def father() {
        log.debug 'car engine is hot'
        log.error 'my car is stuck'
    }

    def mother() {
        log.debug 'dont have a water in the kitchen'
        log.error 'Cant make a cake'
    }
}

def l = new Family()
l.loggerInfo()
println ''

l.father()
l.mother()
