package test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SpringAnnotationNew")
public class SpringAnno_Component {
	//inject the value to the variable
	@Value("SpringFramework")
	String training;
	@Value("Chennai")
	String loc;
	public final String getTraining() {
		return training;
	}
	public final void setTraining(String training) {
		this.training = training;
	}
	public final String getLoc() {
		return loc;
	}
	public final void setLoc(String loc) {
		this.loc = loc;
	}
	

}
