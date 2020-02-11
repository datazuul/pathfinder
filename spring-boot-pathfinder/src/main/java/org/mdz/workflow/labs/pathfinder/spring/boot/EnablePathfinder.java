package org.mdz.workflow.labs.pathfinder.spring.boot;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Spring Boot Starter Annotation to enable autoloading for Pathfidner configuration from <code>
 * application.yml</code>.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(PathfinderConfig.class)
@Configuration
public @interface EnablePathfinder {}
