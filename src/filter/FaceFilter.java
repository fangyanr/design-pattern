package filter;

public class FaceFilter implements Filter {
	public String doFilter(String msg) {
		msg = msg.replace("*^*", "$^$");
		return msg;
	}

	@Override
	public void doFilter(Request request, Response response) {
		request.requestStr = request.getRequestStr().replace("*^*", "$^$") + "---FaceFilter";
		response.responseStr += ("---FaceFilter");
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.requestStr = request.getRequestStr().replace("*^*", "$^$") + "---FaceFilter";
		chain.doFilter(request, response, chain);
		response.responseStr += ("---FaceFilter");
	}
}
