/**  
* @Title: NewlyIncreased.java  
* @Package controler.administrator.productmanager  
* @Description: TODO(用一句话描述该文件做什么)  
* @author SongKaikai  
* @date 2019年3月8日  
* @version V1.0  
*/ 
package controler.administrator.productmanager;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.apache.tomcat.util.http.fileupload.servlet.ServletRequestContext;

import entity.Product;
import entity.Product_administrator;

/**
 * @author SongKaikai
 *
 */
@MultipartConfig
public class NewlyIncreased extends HttpServlet{

	/**  
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	
	
    // 上传文件存储目录
    private static final String UPLOAD_DIRECTORY = "image";
 
    // 上传配置
    private static final int MEMORY_THRESHOLD   = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE      = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE   = 1024 * 1024 * 50; // 50MB
 
	
	
	
	
	
	
	/**
	* <p>Title: doGet</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	/**
	* <p>Title: doPost</p>  
	* <p>Description: </p>  
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException  
	* @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)  
	*/ 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Product_administrator administrator = new Product_administrator((Admin)req.getSession().getAttribute("admin"));
		String cpu =null;
        String des = null;
        String pixelString = null;
        String memString = null;
        String nameString = null;
        String priceString = null;;
        String butteryString = null;
        String serieString = null;
        String dbPath = null;
//        System.out.println(priceString);
		
		
		
		 // 检测是否为多媒体上传
        if (!ServletFileUpload.isMultipartContent(req)) {
            // 如果不是则停止
            PrintWriter writer = resp.getWriter();
            writer.println("Error: 表单必须包含 enctype=multipart/form-data");
            writer.flush();
            writer.close();
            return;
        }
 
        // 配置上传参数
        DiskFileItemFactory factory = new DiskFileItemFactory();
        // 设置内存临界值 - 超过后将产生临时文件并存储于临时目录中
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        // 设置临时存储目录
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
 
        ServletFileUpload upload = new ServletFileUpload(factory);
         
        // 设置最大文件上传值
        upload.setFileSizeMax(MAX_FILE_SIZE);
         
        // 设置最大请求值 (包含文件和表单数据)
        upload.setSizeMax(MAX_REQUEST_SIZE);

        // 中文处理
        upload.setHeaderEncoding("UTF-8"); 

        // 构造临时路径来存储上传的文件
        // 这个路径相对当前应用的目录
        System.out.println("servletcontent----"+req.getServletContext().getRealPath("./"));
        String uploadPath = req.getServletContext().getRealPath("./") + File.separator + UPLOAD_DIRECTORY;
         
        // 如果目录不存在则创建
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }
        
        try {
            // 解析请求的内容提取文件数据
            List<FileItem> formItems = upload.parseRequest(new ServletRequestContext(req));
            String fileName=null;
            
            if (formItems != null && formItems.size() > 0) {
                // 迭代表单数据
            	
                for (FileItem item : formItems) {
                    // 处理不在表单中的字段
                    if (!item.isFormField()) {
                    	
                  
                        fileName = new File(item.getName()).getName();
                     
                        if (!fileName.substring(fileName.length()-3).equals("png")
                        		&&
                        		!fileName.substring(fileName.length()-3).equals("jpg")
                        		&&
                        		!fileName.substring(fileName.length()-3).equals("gif")
                        		) {
                        	req.setAttribute("message",
                                    "请上传一张图片!");
                        	req.getServletContext().getRequestDispatcher("/administrator/productmanager/tmp.jsp").forward(
                                    req, resp);
                        	return;
							
						}
                        String filePath = uploadPath + "/" + fileName;
                        File storeFile = new File(filePath);
                        // 在控制台输出文件的上传路径
                        System.out.println(filePath);
                        // 保存文件到硬盘
                        item.write(storeFile);
                        req.setAttribute("message",
                            "图片上传成功!");
                        dbPath = "image"+ "/" +fileName;
                        
                    }else {
						switch (item.getFieldName()) {
						case "pixel":
							pixelString = item.getString();
							break;
						case "cpu":
							cpu = item.getString();
							break;
						case "mem":
							memString = item.getString();
							break;
						case "buttery":
							butteryString = item.getString();
							break;
						case "price":
							priceString = item.getString();
							break;
						case "name":
							nameString = item.getString();
							break;
						case "des":
							des = item.getString();
							break;
						case "series":
							serieString = item.getString();
							break;

						default:
							break;
						}
					}
                }
                Product product = new Product(Integer.parseInt(priceString),
                		nameString, dbPath, null, null, null, null, null, null, des, null,
                		null, null, null, null, serieString, 
                		Integer.parseInt(memString),
                		Integer.parseInt(pixelString),
                		Integer.parseInt(butteryString), cpu);
                if(new Product_administrator().addProduct(product))
                {
                	req.setAttribute("smessage",
                			"成功新增一件产品!");
                }
            }
            System.out.println("没有执行");
            
        } catch (Exception ex) {
            req.setAttribute("message",
                    "错误信息: " + ex.getMessage());
            req.setAttribute("smessage",
                    "新增失败");
            System.out.println("没有执行----");
            ex.printStackTrace();
        }
        // 跳转到 message.jsp
        req.getServletContext().getRequestDispatcher("/administrator/productmanager/tmp.jsp").forward(
                req, resp);
		
		
		
		
		
	}

}
