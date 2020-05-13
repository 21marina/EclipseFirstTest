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
	//结果显示只有下拉框 显得毫无意义 不如直接在界面上写，
	//但是下拉框的值通常不是固定的，可以从数据库中读取，这样写就是有意义的
	//写完记得在tld文件中添加标签
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
	
	//模拟从数据库中取数据
	List list=list();
	String str="<select>";
	//遍历list
	for(int i=0;i<list.size();i++) {
		//list里面存放的时对象 先获取对象，再获取属性值
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

//先建对象职位 类 模拟从数据库中取数据
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
