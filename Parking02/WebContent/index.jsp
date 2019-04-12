<%@include file="/common/sub_header.jsp"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!doctype html>
<html>
	<head>
		<base href="<%=basePath%>">
		<meta charset="UTF-8">
		<title>后台管理</title>
		
	</head>
	<body>
		<jsp:include page="/top.jsp"></jsp:include>
		<div class="container clearfix">

			<jsp:include page="/left.jsp"></jsp:include>
			<!--/sidebar-->
			<div class="main-wrap">
				<div class="crumb-wrap">
					<div class="crumb-list">
						<i class="icon-font">&#xe06b;</i><span>欢迎使用管理系统。</span>
					</div>
				</div>

				<div class="result-wrap">
					<div class="result-title">
						<h1>
							系统基本信息
						</h1>
					</div>
					<div class="result-content">
						<ul class="sys-info-list">
							<li>
								<label class="res-lab">
									操作系统
								</label>
								<span class="res-info">WINNT</span>
							</li>
							<li>
								<label class="res-lab">
									运行环境
								</label>
								<span class="res-info">Apache Tomcat</span>
							</li>

							<li>
								<label class="res-lab">
									版本
								</label>
								<span class="res-info">v-0.1</span>
							</li>

							<li>
								<label class="res-lab">
									北京时间
								</label>
								<span class="res-info"><%=new Date().toLocaleString()%></span>
							</li>
							<li>
								<label class="res-lab">
									服务器域名/IP
								</label>
								<span class="res-info"><%=request.getRemoteAddr()%></span>
							</li>
							<li>
								<label class="res-lab">
									Host
								</label>
								<span class="res-info"><%=request.getRemoteHost()%></span>
							</li>
							<li>
								<label class="res-lab">
									技术支持
								</label>
								
							</li>
						</ul>
					</div>
				</div>

			</div>
			<!--/main-->
		</div>
	</body>
</html>