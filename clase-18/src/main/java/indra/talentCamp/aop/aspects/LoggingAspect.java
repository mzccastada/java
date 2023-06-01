package indra.talentCamp.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.*;
import org.springframework.stereotype.Component;

@Component
public class LoggingAspect {

	@Before(value = "execution(* indra.talentCamp.aop.controllers.AopDemoController.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		Logger logger = LoggerFactory.getLogger(joinPoint.getThis().getClass());
		logger.info("Entrando al método " 
				+ joinPoint.getSignature().getName() 
				+ " de la clase " 
				+ joinPoint.getThis().getClass().getName());
	}

	@After(value = "execution(* )")
	public void logAfter(JoinPoint joinPoint) {
		Logger logger = LoggerFactory.getLogger(joinPoint.getThis().getClass());
		logger.info("Luego de ejecutar el método " 
		+ joinPoint.getSignature().getName());
	}
}