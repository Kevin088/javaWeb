package cn.dfhe.com.service;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dfhe.com.dao.ItemDao;
import cn.dfhe.com.pojo.Item;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getItemList() {
		return itemDao.getItemList();
	}
	@Override
	public List<Item> searchItemList(Item item) {
		return itemDao.searchItemList(item);
	}
	@Override
	public Item findItemById(Item item) {
		return itemDao.findItemById(item);
	}
	@Override
	public void updateItem(Item item) {
		itemDao.updateItem(item);
	}
	@Override
	public void deleteItem(Item item) {
		itemDao.deleteItem(item);
	}
	@Override
	public void addItem(Item item) {
		itemDao.insertItem(item);
	}
	/**
	 * 报表
	 */
	@Override
	public void exportItem() {
		List<Item>items=itemDao.getItemList();
	      // 第一步，创建一个webbook，对应一个Excel文件  
        HSSFWorkbook wb = new HSSFWorkbook();  
        // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet  
        HSSFSheet sheet = wb.createSheet("学生表一");  
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short  
        HSSFRow row = sheet.createRow((int) 0);  
        // 第四步，创建单元格，并设置值表头 设置表头居中  
        HSSFCellStyle style = wb.createCellStyle();  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式  
  
        HSSFCell cell = row.createCell((short) 0);  
        cell.setCellValue("姓名");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 1);  
        cell.setCellValue("价格");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 2);  
        cell.setCellValue("详情");  
        cell.setCellStyle(style);  
        cell = row.createCell((short) 3);  
        cell.setCellValue("时间");  
        cell.setCellStyle(style);  
  
        // 第五步，写入实体数据 实际应用中这些数据从数据库得到，    
        for (int i = 0; i < items.size(); i++)  
        {  
            row = sheet.createRow((int) i + 1);  
            Item stu = items.get(i);  
            // 第四步，创建单元格，并设置值  
            row.createCell((short) 0).setCellValue(stu.getName());  
            row.createCell((short) 1).setCellValue(stu.getPrice());  
            row.createCell((short) 2).setCellValue(stu.getDetail());  
            cell = row.createCell((short) 3);  
            cell.setCellValue(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(stu.getCreatetime()));  
        }  
        // 第六步，将文件存到指定位置  
        try  
        {  
        	Date date=new Date();

            FileOutputStream fout = new FileOutputStream("E:/students"+System.currentTimeMillis()+".xls");  
            wb.write(fout);  
            fout.close();  
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
        }  
		
		
	}
}
