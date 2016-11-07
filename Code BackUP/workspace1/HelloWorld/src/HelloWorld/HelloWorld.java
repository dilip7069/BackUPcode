package HelloWorld;
import javax.jws.WebService;
import javax.jws.WebMethod;


@WebService(name="newname")
public class HelloWorld {

	public void constructor()
	{}
	@WebMethod(action="sample", operationName="name",exclude)
	public String Hello(String s)
	{
		return "Hello" + s;
	}
}
