package filter;

public class HtmlFilter implements Filter{
	public String doFilter(String msg) {
		msg = msg.replace("<", "【").replace(">", "】");
		return msg;
	}

	@Override
	public void doFilter(Request request, Response response) {
		request.requestStr=request.getRequestStr().replace("<", "【").replace(">", "】")+"---HtmlFilter";
		response.responseStr+=("---HtmlFilter");
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.requestStr=request.getRequestStr().replace("<", "【").replace(">", "】")+"---HtmlFilter";
		chain.doFilter(request, response, chain);
		response.responseStr+=("---HtmlFilter");
	}
}
