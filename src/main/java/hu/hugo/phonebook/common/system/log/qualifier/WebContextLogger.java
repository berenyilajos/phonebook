package hu.hugo.phonebook.common.system.log.qualifier;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Deprecated
@Qualifier
@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface WebContextLogger {

}
