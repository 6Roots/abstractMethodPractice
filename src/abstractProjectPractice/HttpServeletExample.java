package abstractProjectPractice;

public class HttpServeletExample {
	public static void main(String[] args) {
		
		LoginServlet newlogin = new LoginServlet();
		FileDownloadServlet newfiledown = new FileDownloadServlet();
		
		newlogin.service();
		newfiledown.service();
		// 1��. child method ���� �� child method ���� ���� �޼ҵ� ȣ��
		
		HttpServlet newhttp = null;
		newhttp = new LoginServlet();
		newhttp.service();
		newhttp = new FileDownloadServlet();
		newhttp.service();
		// 2��. abstract method ���� ��, child method�� �ڵ���ü��ȯ �� �޼ҵ� ȣ��
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
		// 3��. �޼ҵ� �Ű������� abstract method ���� �� child method�� �Ű������� �����Ͽ� �ڵ���ü��ȯ�Ͽ� �޼ҵ� ȣ��	
	}
		
	static void method (HttpServlet httpservlet) {
		httpservlet.service();
	}
	
}
