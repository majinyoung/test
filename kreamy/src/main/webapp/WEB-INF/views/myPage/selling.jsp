<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	String cp = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<style type="text/css">
*{
	font-family: 나눔고딕;
}
a{
	text-decoration: none;
}
li{
	list-style: none;
	text-align: left;
	font-size: 14px;
	letter-spacing: -.15px;
	color: rgba(34,34,34,.5);
	cursor: pointer;
	margin-bottom: 6px;
}
strong{
	font-size: 15px;
	letter-spacing: -.16px;
}
ul{
	margin-top: 8px;
	padding-left: 0px;
	margin-bottom: 8px;
}
</style>
</head>
<body>
<div align="center">
	<div align="center" style="width: 1200px; padding: 40px;">
		<table cellpadding="0" cellspacing="0" >
		<tr valign="top">
			<td style="width: 160px; margin-right: 40px;">
				<h2 style="margin-top: 0px; cursor: pointer;" onclick="location.href='<%=cp%>/myPage'">MY PAGE</h2>
				<div>
					<strong>쇼핑정보</strong>
					<ul>
						<li onclick="location.href='<%=cp%>/buying'">구매 내역</li>
						<li onclick="location.href='<%=cp%>/selling'" style="color: black; font-weight: bolder; ">판매 내역</li>
						<li onclick="location.href='<%=cp%>/wish'" style="margin-bottom: 25px;">관심 상품</li>
					</ul>
				</div>
				<div>
					<strong style="margin-top: 20px;">내 정보</strong>
					<ul>
						<li onclick="location.href='<%=cp%>/profile'">프로필 정보</li>
						<li onclick="location.href='<%=cp%>/address'">주소록</li>
						<li onclick="location.href='<%=cp%>/payment'">결제 정보</li>
						<li onclick="location.href='<%=cp%>/account'">판매 정산 계좌</li>
					</ul>
				</div>
			</td>
			<td style="width: 1000px;" align="center">
				<div style="width: 1000px; height: 148px; border: 1; border-radius: 5%; padding: 23 0 23 24;">
					프로필 사진
				</div>
				<div></div>
				<div></div>
				<div></div>
				<div></div>			
			
			
			</td>
		</tr>
		</table>
	
	</div>
</div>
</body>
</html>