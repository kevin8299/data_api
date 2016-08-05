<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<c:set var="ctx" value="<%=basePath %>"></c:set>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>SpringMVC Demo 首页</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>

    <![endif]-->
</head>
<body>
<h1>这里是SpringMVC Demo首页</h1>

<h3>出现此页面，说明配置成功。</h3>

<h3>
    ${count}</br>
    ${scoreCount}</br>
    ${altCount}</br>
    <%=basePath%></br>
    ${ctx}
    <img src="${ctx}/imgs/fruits.jpg"/>
</h3>

<div class="Table" style="width:80%;float:left" overflow-x:auto;>
    <table id="datatable" class="table data-table" cellpadding="0" cellspacing="0" width="auto;" style="border-bottom:none;border-collapse:collapse;color:#505050;">
        <thead>
        <tr class="tr_01" width="auto;" style="line-height:12px;">
            <td  width="13%" style="border-bottom:none;">经度</td>
            <td  width="12%" style="border-bottom:none;">纬度</td>
            <td  width="12%" style="border-bottom:none;">高度</td>
            <td  width="12%" style="border-bottom:none;">时间</td>
        </tr>
        </thead>
        <tbody></tbody>

    </table>
</div>


<!-- jQuery文件。务必在bootstrap.min.js 之前引入
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script> -->

<!-- 最新的 Bootstrap 核心 JavaScript 文件
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>-->


<script type="text/javascript" src="${ctx}/js/jquery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${ctx}/js/datatables/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="${ctx}/js/datatables/js/dataTables.bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/js/easydialog/easydialog.min.js"></script>
<script type="text/javascript" src="${ctx}/js/test/test.js"></script>
</body>
</html>