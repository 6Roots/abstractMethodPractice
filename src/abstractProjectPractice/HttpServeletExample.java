package abstractProjectPractice;

public class HttpServeletExample {
	public static void main(String[] args) {
		
		LoginServlet newlogin = new LoginServlet();
		FileDownloadServlet newfiledown = new FileDownloadServlet();
		
		newlogin.service();
		newfiledown.service();
		// 1번. child method 생성 후 child method 통해 직접 메소드 호출
		
		HttpServlet newhttp = null;
		newhttp = new LoginServlet();
		newhttp.service();
		newhttp = new FileDownloadServlet();
		newhttp.service();
		// 2번. abstract method 생성 후, child method로 자동객체변환 후 메소드 호출
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
		// 3번. 메소드 매개변수로 abstract method 설정 후 child method를 매개변수에 대입하여 자동객체변환하여 메소드 호출	
	}
		
	static void method (HttpServlet httpservlet) {
		httpservlet.service();
	}
	
}
