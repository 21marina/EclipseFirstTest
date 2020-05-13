package com.amaker.customTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 因为实现接口比较复杂【先定义完成后台处理类，然后配置tld文件，再jsp页面调用】
 * 所以通过继承tagsupport类，写出doendtag方法,然后在tld文件中添加一个新的tag 然后不需要再声明pageContext
 * @author 86257
 *
 */
public class customTagTest2 extends TagSupport{
	
@Override
public int doEndTag() throws JspException {
	// TODO Auto-generated method stub
	String aa="helloWorld2";
	JspWriter jw=pageContext.getOut();
	try {
		jw.print("helloword2:"+aa);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return super.doEndTag();
}

}
