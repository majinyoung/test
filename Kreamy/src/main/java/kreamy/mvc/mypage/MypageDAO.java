package kreamy.mvc.mypage;

import org.mybatis.spring.SqlSessionTemplate;

public class MypageDAO {
	private SqlSessionTemplate sessionTemplate;

	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
}
