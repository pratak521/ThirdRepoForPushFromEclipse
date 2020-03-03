package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import com.pat.HelloWorld;
import com.pat.HelloWorldImpl;

@Configuration
public class HelloWorldConfig {
@Bean(name="helloWorlBean")
@Description("This is HelloWorld Bean")
public HelloWorld helloWorld()
{
	return new HelloWorldImpl();
}
}
