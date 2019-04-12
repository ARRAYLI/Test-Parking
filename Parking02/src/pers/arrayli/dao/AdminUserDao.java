package pers.arrayli.dao;

import java.sql.SQLException;

import com.arrayli.domain.AdminUser;

/**
 * @author lzj13
 *	管理用户 dao 
 *	定义一些管理的数据操作接口
 */
public interface AdminUserDao {
	/**验证管理员登录
	 * @param name  管理员名字
	 * @param password  管理员密码
	 * @return  登录成功与否
	 * @throws SQLException
	 */
	boolean login(AdminUser user) throws SQLException;
}
 