package com.amaker.customTag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * ��Ϊʵ�ֽӿڱȽϸ��ӡ��ȶ�����ɺ�̨�����࣬Ȼ������tld�ļ�����jspҳ����á�
 * ����ͨ���̳�tagsupport�࣬д��doendtag����,Ȼ����tld�ļ������һ���µ�tag Ȼ����Ҫ������pageContext
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
