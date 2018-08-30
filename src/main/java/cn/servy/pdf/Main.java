package cn.servy.pdf;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;
import org.aspectj.weaver.ast.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/10 11:17</pre>
 * <pre>作者: xueshun</pre>
 */
public class Main {

    public static void main(String[] args) {
        createDoc();
        toPdf();
    }

    private static void createDoc(){
        Calendar calendar=Calendar.getInstance();

        /*模拟数据，真实数据从接口中查询*/

        MDoc mDoc = new MDoc();
        mDoc.createDoc(null,"D:/tmp/demo/write.doc");
    }


    private static boolean getLicense() {
        boolean result = false;
        try {
            InputStream is = Test.class.getClassLoader().getResourceAsStream("\\license.xml");
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private static void toPdf(){
        /*if(!getLicense()){
            return;
        }*/
        try {
            /*生成pdf的路径*/
            File file = new File("D:/tmp/demo/write.pdf");
            FileOutputStream os = new FileOutputStream(file);
            /**
             * 可以生成pdf的文件类型
             *  DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF, EPUB, XPS, SWF
             */
            /*模板路径*/
            Document doc = new Document("D:/tmp/demo/write.doc");
            doc.save(os, SaveFormat.PDF);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
