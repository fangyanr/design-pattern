package filter;

public class MsgProcess {
	private String msg;
	FilterChain fc;
	// Filter[] filters = { new HtmlFilter(), new FaceFilter(), new
	// SensitivityFilter() };

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String process() {
		return fc.doFilter(msg);
		
		/*for (Filter f : filters) {
			msg = f.doFilter(msg);
		}*/

		
		/*
		 * msg=new HtmlFilter().doFilter(msg); msg=new FaceFilter().doFilter(msg);
		 * msg=new SensitivityFilter().doFilter(msg);
		 */

		
		/*
		 * //注意:replace和replaceAll的方法参数是不同的，前者是字符串，后者是正则。 // htmlFilter msg =
		 * msg.replace("<", "【").replace(">", "】"); // faceFilter msg =
		 * msg.replace("*^*", "$^$"); // sensitivityFilter msg = msg.replace("敏感",
		 * "不敏感");
		 */
		
		//return msg;
	}
}
