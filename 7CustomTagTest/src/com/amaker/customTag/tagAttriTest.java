package com.amaker.customTag;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * �����Եı�ǩ
 * @author 86257
 *
 */
public class tagAttriTest extends TagSupport {
	private int count;
	//����count���������Ҫ������set����ʱһ����Ҫ��,get��������

	public void setCount(int count) {
		this.count = count;
	}
	//�����ǩ����
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		String str="hello";
		for(int i=0;i<count;i++)
		{
//str+=count;			
			try { 
				pageContext.getOut().println("str.count"+str+"<br/>");
				//JspWriter jw=pct.getOut(); jw.print("tagg:"+tagg);
				//PrintWriter out=response.getWriter();	out.println("<!DOCTYPE html>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return super.doEndTag();
	}
	//ʧ�� û��ʾ���

}
