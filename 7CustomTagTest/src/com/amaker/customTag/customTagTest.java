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
		//修改测试git本地到远程分支 commit and push 
		//commit 只能提交整个项目,然后需要选中项目-右键-remote-push
		//commit and push 能提交单个文件  test conflict from local
		
		//测试　ｆｒｏｍ　ｇｉｔ　ｔｏ　ｌｏｃａｌ　用team-remote-pull 
		
		//输出tagg
		JspWriter jw=pct.getOut();//要先获取【在setPageContext中先从参数获取】
		//执行标签时，会自动从页面把当前pagecontext传递过来，要想传给外卖，先声明变量，然后再setpagecontext中赋值
		try {
			jw.print("tagg:"+tagg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.EVAL_PAGE;//eval-page标签用完之后 下面还有内容被执行，被计算,skip_page用完之后下面
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
