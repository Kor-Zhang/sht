package com.sht.util;

/**
 * Title:Static
 * <p>
 * Description:存放全局静态常量;
 * <p>
 * @author Kor_Zhang
 * @date 2017年9月11日 下午3:12:24
 * @version 1.0
 */
public interface Static {
	/**
	 * request返回信息的字段名
	 */
	public static final String FIELD_REQUEST_RETURN_MSG = "msg";
	/**
	 * request中存放在线用户的信息的字段
	 */
	public static final String FILED_ONLINE_USER = "onlineUser";

	
	
	/**
	 * Title:USERS
	 * <p>
	 * Description:users模块常量字段;
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月20日 上午7:58:55
	 * @version 1.0
	 */
	public interface USERS{
		
	}
	/**
	 * Title:GOODS
	 * <p>
	 * Description:goods模块常量字段;
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月20日 上午7:58:57
	 * @version 1.0
	 */
	public interface GOODS{
		
	}
	
	/**
	 * Title:CONFIG
	 * <p>
	 * Description:condig文件中的key常量字段;
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月20日 上午7:57:57
	 * @version 1.0
	 */
	public interface CONFIG{
		/**
		 * 存放网站地址字段
		 */
		static final String FIELD_WEB_ADDR = "config.webaddr";
		/**
		 * 用户头像资源存放路径
		 * 
		 */
		static final String FILED_SRC_USERS_HEADIMGS = "config.src.users.heaimgs";
		/**
		 * 商品图片资源存放路径
		 * 
		 */
		static final String FILED_SRC_GOODS_IMGS = "config.src.goods.imgs";
		
		/**
		 * 用户头像尺寸版本字段
		 */
		static final String FILED_USERS_HEADINGS_SIZES = "config.users.headimgs.sizes";
		/**
		 * 商品图片尺寸版本字段
		 */
		static final String FILED_GOODS_IMGS_SIZES = "config.goods.imgs.sizes";
		/**
		 * 用户头像圖片類型字段
		 */
		static final String FILED_USERS_HEADINGS_TYPES = "config.users.headimgs.types";
		/**
		 * 商品图片類型字段
		 */
		static final String FILED_GOODS_IMGS_TYPES = "config.goods.imgs.types";
		/**
		 * 用户默认头像字段字
		 */
		static final String FILED_USERS_HEADIMGS_DEFAULT = "config.users.headimgs.default";
		/**
		 * 用户头像圖片上传大小字段
		 */
		static final String FILED_USERS_HEADIMGS_MAXSIZE = "config.users.headimgs.maxsize";
		/**
		 * 商品图片上传大小字段
		 */
		static final String FILED_GOODS_IMGS_MAXSIZE = "config.goods.imgs.maxsize";
		
	}
	
	
	/**
	 * 
	 * Title:REG
	 * <p>
	 * Description:正则表达式
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月19日 下午7:27:32
	 * @version 1.0
	 */
	public interface REG{
		
		//邮箱
		static final String EMAIL = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+$";
		
		//密码
		static final String PASSWORD = "^[a-zA-Z]\\w{4,12}$";
		
		//用户名
		static final String USERNAME = "^[A-Za-z][A-Za-z1-9_-]{4,20}$";
		
		//邮编
		static final String POST_CODE = "^[1-9]\\d{5}$";
	}
	/**
	 * ajax返回的操作结果代号的字段
	 */
	public interface RESULT{
		/**
		 * 操作成功
		 */
		Integer TRUE = 1;
		/**
		 * 操作失败
		 */
		Integer FALSE = 0;
		
	}
	/**
	 * Title:USERS_STATUS
	 * <p>
	 * Description:用户状态<br/>
	 * 状态:1为激活，,0为冻结,-1为删除 ,-2为注册未激活<br/>
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月20日 下午4:58:39
	 * @version 1.0
	 */
	public interface USERS_STATUS{
		static final Short ACTIVITY = 1;
		static final Short FROZEN = 0;
		static final Short UNACTIVITY = -2;
		static final Short DELETE = -1;
	}
	/**
	 * 
	 * Title:GOODS_STAUS
	 * <p>
	 * Description:商品状态
	 * <p>
	 * @author Kor_Zhang
	 * @date 2017年9月22日 下午1:57:55
	 * @version 1.0
	 */
	public interface GOODS_STAUS{
		/*状态:
			2为已发货，
			1为购买了且待发货,
			0为创建且待购买,
			-1为买家收货后交易正常结束,
			-2为卖家取消了出售本商品,
			-3是用户取消购买本商品,
			-4管理员取消发布的商品,
			-5管理员删除发布的商品
			*/
		/**
		 * 已发货
		 */
		static final Short SENDED = 2;
		/**
		 * 购买了且待发货
		 */
		static final Short BUY_BUT_NOT_SEND = 1;
		/**
		 * 创建且待购买
		 */
		static final Short CREATE_BUT_NOT_BUY = 0;
		/**
		 * 买家收货后正常结束
		 */
		static final Short BUYER_RECEIVED = -1;
		/**
		 * 卖家取消了出售本商品
		 */
		static final Short SELLER_CANCEL_SELL = -2;
		/**
		 * 用户取消购买本商品
		 */
		static final Short BUYER_CANCEL = -3;
		/**
		 * 管理员取消发布的商品
		 */
		static final Short ADMIN_CANCEL = -4;
		/**
		 * 管理员删除发布的商品
		 */
		static final Short ADMIN_DELETE = -5;
	}
	
}
