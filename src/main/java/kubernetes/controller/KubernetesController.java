package kubernetes.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KubernetesController
{
	@GetMapping("/hello")
	public String helloWorld()
	{
		String
		helloWorld;
		
		
		
		helloWorld = "Hello world.";
		
		
		
		return helloWorld;
		
	}

}