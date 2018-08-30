package cn.servy.pdf;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.aspectj.weaver.ast.Test;

import java.io.*;
import java.util.Map;

public class MDoc {
	private Configuration configuration = null;
	public MDoc(){
		configuration = new Configuration();
		configuration.setDefaultEncoding("utf-8");
	}
	
	/**
	 * 
	 * @param dataMap 要填入模板的数据文件
	 * @param fileName
	 * 
	 * 设置模板装置方法和路径，FreeMarker支持多种模板加载方法，可以从servlet，classpath,数据库装载，
	 * 
	 */
	public void createDoc(Object dataMap, String fileName){
		String fileDirectory = this.getClass().getResource("/template").getPath();
		try {
			configuration.setDirectoryForTemplateLoading(new File(fileDirectory));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Template t =null;
		try {
			//order_export.ftl为要装载的模板
			t = configuration.getTemplate("test.ftl");
		} catch (IOException e) {
			e.printStackTrace();
		}
		//输出文档路径及名称
		File outFile = new File(fileName);
		Writer out = null;
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outFile);
			/*
			 * 这个地方对流的编码不可或缺，使用main()的方法单独调用是，应该可以，
			 * 但是如果是web请求导出是导出后word文档就会打不开。主要是编码格式不正确，无法解析
			 */
			OutputStreamWriter oWriter = new OutputStreamWriter(fos, "UTF-8");
			out = new BufferedWriter(oWriter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			t.process(dataMap, out);
			out.close();
			fos.close();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
