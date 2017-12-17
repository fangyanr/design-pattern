package filter;

public class Test {
	
	public static void main(String[] args) {
		String msg = "大家好*^*，这是<script>代码，这是敏感字段!";
		FilterChain fc = new FilterChain();
		fc.addFilter(new HtmlFilter()).addFilter(new FaceFilter());
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new SensitivityFilter());
		Request request=new Request();
		request.setRequestStr(msg);
		Response response=new Response();
		response.setResponseStr("response");
		
		/* FilterChain实现了Filter接口，是Filter的子类后，
		 * addFilter(Filter f)方法的参数才可以传FilterChain，父类引用指向子类对象*/
		fc.addFilter(fc2); 
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
/*		打印结果：
		大家好$^$，这是【script】代码，这是不敏感字段!---HtmlFilter---FaceFilter---SensitivityFilter
		response---SensitivityFilter---FaceFilter---HtmlFilter*/
		
		
/*		fc.doFilter(request, response);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
		打印结果：
		大家好$^$，这是【script】代码，这是不敏感字段!---HtmlFilter---FaceFilter---SensitivityFilter
		response---HtmlFilter---FaceFilter---SensitivityFilter*/
		
		
/*		MsgProcess pro = new MsgProcess();
		pro.setMsg(msg);
		pro.setFc(fc);
		msg = pro.process();
		System.out.println(msg);
		打印结果：大家好$^$，这是【script】代码，这是不敏感字段!
		*/
		
		
	}
}
