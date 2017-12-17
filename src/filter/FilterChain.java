package filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	List<Filter> filters = new ArrayList<>();
	int index = 0;

	public FilterChain addFilter(Filter f) {
		filters.add(f);
		return this;
	}

	/*
	 * public void addFilter(Filter f) { filters.add(f); }
	 */

	public String doFilter(String msg) {
		for (Filter f : filters) {
			msg = f.doFilter(msg);
		}
		return msg;
	}

	@Override
	public void doFilter(Request request, Response response) {
		for (Filter f : filters) {
			f.doFilter(request, response);
		}
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		if (index == filters.size())
			return;
		Filter f = filters.get(index);
		index++;
		f.doFilter(request, response, chain);  
		/*责任链：使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。
		将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。*/
	}
}
