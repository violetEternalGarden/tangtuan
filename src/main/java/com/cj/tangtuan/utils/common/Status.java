package com.cj.tangtuan.utils.common;


import java.util.LinkedHashMap;
import java.util.Map;

public class Status {

	public static final short SUCCESS = 0;//成功

	public static final short ERROR = 1;//失败

	public static final short NO_REMOVE = 2;//

	public static final short NO_DELETE = 3;//不能删除

	public static final short NO_UPDATE = 4;//

	public static final short LOCK = 5;//不能删除自己

	public static final short EXISTS = 6;//已存在

	public static final short NOT_EXISTS = 7;//不存在

	public static final short VERSION_NOT_MATCH = 8;//

	public static final short PASSWD_NOT_MATCH = 9;//密码错误

	public static final short CODE_NOT_MATCH = 10;//验证码错误

	public static final short BLOCKED = 11;//

	public static final short NO_ENOUGH = 12;//余额不足

	public static final short SESSION_GUOQI = 14;//登录失效

	public static final short SESSION_CHONGFU = 15;//有人重复登录

	/**
	 * 验证码为空
	 */
	public static final short VALIDATE_CODE_EMPTY = 12;

	/**
	 * 非法操作
	 */
	public static final short INVALID_OPERATION = 13;


	/*==========================================车拇指========================================================*/

	public static final String Static = "/static/";
	public static final String Prefix = "redirect:";//View视图前缀
	public static final String Suffix = ".html";//View视图后缀

	public static final String LOGIN = "bx/login";//前端登陆页面
	public static final String MAIN = "bx/index";//前端首页路径

	/*=================================后端页面路径 start========================================*/

	public static final String IFLOGIN = "logo";//后端登陆页面
	public static final String IFMAIN = "index";//后端主页
	public static final String TO_jurisdiction = "jurisdiction";//管理员设置
	public static final String TO_role = "role";//角色设置

	/*=================================后端页面路径 end========================================*/

	public static final int ADD_CARINFO_FAIL = 0;//失败
	public static final int ADD_CARINFO_SUCCESS = 1;//成功

	public static final int UPDATE_CARINFO_FAIL = 0;//失败
	public static final int UPDATE_CARINFO_SUCCESS = 1;//成功

	public static final int LOGIN_FAIL = 0;//登陆失败
	public static final int LOGIN_SUCCESS = 1;//登陆成功
	public static final int REGISTER_SUCCESS = 2;//注册成功并登陆成功
	public static final int LOGOUT_SUCCESS = 3;//注销成功

	public static final int SEND_FAIL = 0;//短信发送失败
	public static final int SEND_SUCCESS = 1;//短信发送成功

	public static final int OVERTIME = -1;//验证码超时
	public static final int VALIDITY = 600;//验证码有效期

	public static String MESSAGE = "";


	public static Map send(int state,String message,String url){
		Map map = new LinkedHashMap();
		map.put("state",state);
		map.put("message",message);
		map.put("url",url);

		return map;
	}

}
