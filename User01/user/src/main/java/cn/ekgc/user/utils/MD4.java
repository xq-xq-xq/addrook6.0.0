package cn.ekgc.user.utils;

import java.util.Random;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-14 21:48
 * @program: User01
 **/
public class MD4 {

	public static String md4add(String id){
		String key= "";
		Random r = new Random();
		for (int i=0;i<10;i++){
			int i1 = r.nextInt(10);
			key += i1;
		}
		return key+id;
	}
}
