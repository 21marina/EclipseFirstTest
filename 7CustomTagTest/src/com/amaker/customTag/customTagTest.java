package com.amaker.customTag;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class customTagTest implements Tag{
	private PageContext pct;
	private Tag tag;

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		String tagg="Helloworld";
		//�޸Ĳ���git���ص�Զ�̷�֧ commit and push 
		//commit ֻ���ύ������Ŀ,Ȼ����Ҫѡ����Ŀ-�Ҽ�-remote-push
		//commit and push ���ύ�����ļ� 
		//���tagg
		JspWriter jw=pct.getOut();//Ҫ�Ȼ�ȡ����setPageContext���ȴӲ�����ȡ��
		//ִ�б�ǩʱ�����Զ���ҳ��ѵ�ǰpagecontext���ݹ�����Ҫ�봫��������������������Ȼ����setpagecontext�и�ֵ
		try {
			jw.print("tagg:"+tagg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.EVAL_PAGE;//eval-page��ǩ����֮�� ���滹�����ݱ�ִ�У�������,skip_page����֮������
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return SKIP_BODY;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return tag;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPageContext(PageContext page) {
		// TODO Auto-generated method stub
		this.pct =page;
		
	}

	@Override
	public void setParent(Tag tag) {
		// TODO Auto-generated method stub
		this.tag=tag;
	}

}
