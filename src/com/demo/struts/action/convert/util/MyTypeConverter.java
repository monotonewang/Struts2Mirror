package com.demo.struts.action.convert.util;

import org.apache.struts2.util.StrutsTypeConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


/**
 * Created by 7 on 2017/1/11.
 */
//自定义转换器 不推荐实现接口
//对date类型格式处理
public class MyTypeConverter extends StrutsTypeConverter {

	/**
	 * 接收页面传递的数据
	 *
	 * @param map
	 * @param strings
	 * @param aClass
	 * @return
	 */
	@Override
	public Object convertFromString(Map map, String[] strings, Class aClass) {
//		System.out.println(map.toString());//ognl
//		System.out.println(Arrays.toString(strings));//获取到birthday
//		System.out.println(aClass.toString());//获取对象参数
		//根据simpleDateFormat实现自定义类型装换
		String value = strings[0];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;

		try {
			date = sdf.parse(value);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;
	}

	@Override
	public String convertToString(Map map, Object o) {
		return null;
	}
}
