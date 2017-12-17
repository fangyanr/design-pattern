package filter;

public interface Filter {
	/*
	 * 处理msg
	 */
	public String doFilter(String msg);

	/*
	 * 处理req和res，先进先出-队列
	 */
	public void doFilter(Request request, Response response);

	/*
	 * 处理req和res，先进后出-栈 (模拟Web的请求和响应过滤)
	 */
	public void doFilter(Request request, Response response, FilterChain chain);
}
