<!DOCTYPE html>
<html>
<head>
<#assign metaTitle="Zeus个人博客" />
<#assign metaKeywords="左潇龙,个人博客,Zeus" />
<#assign metaDescription="左潇龙的个人博客，记录了工作与生活当中的点点滴滴" />
<#include "../common/head.ftl">
<link href="${contextPath}/resources/css/common/article.css" rel="stylesheet"/>
<style type="text/css">
.left_box p {text-indent: 2em;line-height:30px;}
</style>
</head>
<body>
<#include "../common/header.ftl">
<article>
	<div class="left_box float_left">
		<#include "about_me_main.ftl">
	</div>
	<div class="right_box float_right">
		<#include "right.ftl">
	</div>
</article>
<#include "../common/footer.ftl">
</body>
</html>