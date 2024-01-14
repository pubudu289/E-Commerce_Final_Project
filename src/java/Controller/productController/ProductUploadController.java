/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.productController;

import DAO.AdminDAO.AdminLoginDAO;
import DAO.ProductDAO.LoadCategoryDAO;
import DAO.ProductDAO.ProductDAO;
import DTO.AdminDTO.AdminLoginDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modal.Admin;
import modal.Brand;
import modal.Category;
import modal.MainCategory;
import modal.Product;
import modal.SubCategory;

/**
 *
 * @author Pubudu Kasun
 */



@WebServlet(name = "ProductUploadController", urlPatterns = {"/ProductUploadController"})
public class ProductUploadController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter outx = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            try {
                String productId = request.getParameter("productId");
                String productName = request.getParameter("productName");
                String mainCategory = request.getParameter("mainCategory");
                String subcategory = request.getParameter("subcategory");
                String category = request.getParameter("category");
                String brand = request.getParameter("brand");
                String unit = request.getParameter("unit");
                String qty = request.getParameter("qty");
                String filethumb = request.getParameter("file");
                String imageone = request.getParameter("imageone");
                String imagetwo = request.getParameter("imagetwo");
                String imagethree = request.getParameter("imagethree");
                String imagefour = request.getParameter("imagefour");
                String description = request.getParameter("description");
                String unitprice = request.getParameter("unitprice");
                String purchasePrice = request.getParameter("purchasePrice");
                String discount = request.getParameter("discount");
                String shipping_status = request.getParameter("shipping_status");
                String quantity_warning = request.getParameter("quantity_warning");
                String visibility = request.getParameter("visibility");
                String shipping_days = request.getParameter("shipping_days");
                String txtflatrate = request.getParameter("txtflatrate");
                 String shortdes = request.getParameter("shortdes");
         
                
                LoadCategoryDAO loadCategory = new LoadCategoryDAO();
                MainCategory mcatid = loadCategory.searchMainListByName(mainCategory);
                int mainc = mcatid.getMId();
                
                SubCategory subCategory = loadCategory.searhIdBySubName(subcategory);
                int subc = subCategory.getSId();
                
                Category category1 = loadCategory.searchCategoryByCategoryName(category);
                int catid = category1.getId();
                
                Brand brand1 = loadCategory.searchBrandByBrandName(brand);
                int bid = brand1.getId();
                
                ProductDAO pdao = new ProductDAO();
                List<Product> pList = pdao.searchProductList();
                int sortkey = pList.size() + 1;
                
                AdminLoginDTO dto = (AdminLoginDTO) request.getSession().getAttribute("UserData");
                int adminid = dto.getId();
               
                AdminLoginDAO adminDAO = new AdminLoginDAO();
                Admin admin = adminDAO.searchByID(adminid);
                
                Product pr = new Product();
                pr.setProductId(productId);
                pr.setName(productName);
                pr.setUnit(unit);
                pr.setQty(Integer.parseInt(qty));
                
                String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                pr.setAddtoby(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date));;
                
                pr.setAdmin(admin);
                pr.setUnitPrice(Double.parseDouble(unitprice));
                pr.setPurchasePrice(Double.parseDouble(purchasePrice));
                pr.setDiscount(Integer.parseInt(discount));
                
                double purprice = Double.parseDouble(purchasePrice);
                double dis = Double.parseDouble(discount);
                double discountprice = purprice - (purprice * dis) / 100;
                DecimalFormat df = new DecimalFormat("#.##");
                String dd = df.format(discountprice);
                
                pr.setDiscountPrice(Double.parseDouble(dd));

//           Enter the uploading file path
//                String uploadPath = "C:\\Users\\Pubudu Kasun\\Desktop\\New folderOne";
//                File file = new File(uploadPath);
//                if (!file.exists()) {
//                    file.mkdirs();
//                }
//                Part part = request.getPart("file");
//                String original = getFileName(part);
//
//                //Extract the extention from the file name
//                String extention = ".jpg";
//                int index = original.lastIndexOf('.');
//                if (index > 0) {
//                    extention = original.substring(index + 1);
//                }
//                String fileName = "ITEM" + productId + "." + extention;
//                String filePath = uploadPath + File.separator + fileName;
//                
//                try (OutputStream out = new FileOutputStream(new File(filePath));
//                        InputStream in = part.getInputStream()) {
//                    int read;
//                    final byte[] bytes = new byte[1024];
//                    while ((read = in.read(bytes)) != -1) {
//                        out.write(bytes, 0, read);
//                    }
//                    System.out.println(filePath);
////                    pr.setThumbImg(filePath);
//                    
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
                
                pr.setMainCategory(mcatid);
                pr.setSubCategory(subCategory);
                pr.setCategory(category1);
                pr.setBrand(brand1);
                pr.setSortId(sortkey);
                pr.setPublishUnpublishId(Boolean.TRUE);
                pr.setDescription(description);
                pr.setShippingDays(shipping_days);
                pr.setShippingStatus(Integer.parseInt(shipping_status));
                pr.setLowStockWarning(Integer.parseInt(quantity_warning));
                pr.setStatus(Boolean.TRUE);
                pr.setShortdes(shortdes);

               String p =  pdao.saveProduct(pr);
               
                if (p!="") {
                     outx.write("success");
                }


            } catch (java.lang.NullPointerException | org.hibernate.NonUniqueResultException ex) {
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

//    private String getFileName(Part part) {
//        for (String cd : part.getHeader("content-disposition").split(";")) {
//            if (cd.trim().startsWith("filename")) {
//                String fileName = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
//                return fileName.substring(fileName.lastIndexOf('/') + 1).substring(fileName.lastIndexOf('\\') + 1); // MSIE fix.
//            }
//        }
//        return null;
//        
//    }
    
}
