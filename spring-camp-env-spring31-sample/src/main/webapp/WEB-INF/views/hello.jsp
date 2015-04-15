<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko">
<head>
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
</head>
<body>
<div id="right-penel" class="panel panel-default">
 <div class="panel-heading"> ${message} </div>
 <table class="table">
  <tr><th>현재 프로파일</th><td>${profilesActives}</td></tr>
  <tr><th>db.driver</th><td>${dbDriver}</td></tr>
  <tr><th>db.url</th><td>${dbUrl}</td></tr>
  <tr><th>db.user</th><td>${dbUser}</td></tr>
  <tr><th>db.password</th><td>${dbPassword}</td></tr>
 </table>
</div>
</body>
</html>