package com.amaker.customTag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.sun.org.apache.xpath.internal.compiler.OpCodes;

public class selectTagTest extends TagSupport{
@Override
public int doEndTag() throws JspException {
	// TODO Auto-generated method stub
	//�����ʾֻ�������� �Եú������� ����ֱ���ڽ�����д��
	//�����������ֵͨ�����ǹ̶��ģ����Դ����ݿ��ж�ȡ������д�����������
	//д��ǵ���tld�ļ�����ӱ�ǩ
//	String str="<select>";
//	str+="<option value=1>ceo</option>";
//	str+="<option value=2>cfo</option>";
//	str+="<option value=3>cgo</option>";
//	str+="</select>";
//	try {
//		pageContext.getOut().print("select str is:"+str);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return super.doEndTag();
	
	//ģ������ݿ���ȡ����
	List list=list();
	String str="<select>";
	//����list
	for(int i=0;i<list.size();i++) {
		//list�����ŵ�ʱ���� �Ȼ�ȡ�����ٻ�ȡ����ֵ
		Position p=(Position)list.get(i);
		String num=p.getNum();
		String name=p.getName();
		str+="<option value="+num+">"+name+"</option>";
		
	}
	try {
		pageContext.getOut().print("select db is:"+str);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//
	return super.doEndTag();
}

//�Ƚ�����ְλ �� ģ������ݿ���ȡ����
public static List list() {
	Position p1=new Position();
	p1.setNum("1");
	p1.setName("ceo");
	Position p2=new Position();
	p2.setNum("2");
	p2.setName("cfo");
	Position p3=new Position();
	p3.setNum("3");
	p3.setName("cgo0");
	List list=new ArrayList<>();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	return list;
	
	
}
}
