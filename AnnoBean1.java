package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //similar to calling XML
public class AnnoBean1 {
	@Bean(name="SpringAnnoBean")
	public AnnoBean callbean(){
		return  new AnnoBean();
	}

}
