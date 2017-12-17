package filter;

public class SensitivityFilter implements Filter {
	public String doFilter(String msg) {
		msg = msg.replace("敏感", "不敏感");
		return msg;
	}

	@Override
	public void doFilter(Request request, Response response) {
		request.requestStr = request.getRequestStr().replace("敏感", "不敏感") + "---SensitivityFilter";
		response.responseStr += ("---SensitivityFilter");
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.requestStr = request.getRequestStr().replace("敏感", "不敏感") + "---SensitivityFilter";
		chain.doFilter(request, response, chain);
		response.responseStr += ("---SensitivityFilter");
	}
}
