package cn.dfhe.com.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
	@RequestMapping("/itemList")
	public ModelAndView itemList() throws Exception{
		List<Item>itemList = new ArrayList<Item>();
		
		//商品列表
		Item items_1 = new Item();
		items_1.setName("联想笔记本_3");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
		items_1.setCreatetime(new Date());
		
		Item items_2 = new Item();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		items_2.setCreatetime(new Date());
		
		itemList.add(items_1);
		itemList.add(items_2);

		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject(itemList);
		modelAndView.setViewName("itemList");
		
		
		return modelAndView;
	}
}
