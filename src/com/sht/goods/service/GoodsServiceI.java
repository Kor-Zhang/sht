package com.sht.goods.service;


import java.util.List;

import com.sht.goods.po.GClazzs;
import com.sht.goods.po.GFiles;
import com.sht.goods.po.GGoods;
import com.sht.goods.po.GGoodsImgs;
import com.sht.goods.po.GMessages;
import com.sht.po.Clazzs;

/**
 * Title:GoodsServiceI
 * <p>
 * Description:本模块业务接口
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月12日 上午11:25:06
 * @version 1.0
 */
public interface GoodsServiceI {
	
	/**
	 * 
	 * Title:displayGoodsInfo
	 * <p>
	 * Description:Display the goods' first page information
	 
	 */
	public List<GGoods> dispalyGoodsInfo(GGoods goods) throws Exception;
	
	/**
	 * 
	 * Title:selectGoodsAllNum
	 * <p>
	 * Description:query the total number of all goods
	 
	 */
	public double selectGoodsAllNum(GGoods goods) throws Exception;
	
	/**
	 * 
	 * createGoodsInfo
	 * <p>
	 * Description:insert goods info
	 */
	public String createGoodsInfo(GGoods goods) throws Exception;
	
	
	/**
	 * 
	 * selectGoodsDetailInfo
	 * <p>
	 * Description:select goods detail info
	 */
	public GGoods selectGoodsDetailInfo(String id) throws Exception;

	/**
	 * 
	 * selectGoodsImgs
	 * <p>
	 * Description:select goods imgs
	 */
	public String selectGoodsImgs(String id)throws Exception;

	
	
}
