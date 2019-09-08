package in.co.javacoder.springadvanced.autowiring.annotations.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class InstructorUdemy {
	
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id;
	
	@Value("#{''}")
	private String name;
	
	@Value("#{topics}")
	private List<String> topics;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "InstructorUdemy [id=" + id + ", name=" + name + ", topics=" + topics + "]";
	}

	
}
