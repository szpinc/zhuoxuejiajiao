<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>消息通知</title>
</head>
<body>
<div style="width: 80%;align-items: center">
    <h2 align="center">新预约提醒</h2>
    <hr>
    <h3 align="center">预约人信息</h3>
    <table align="center">
        <tr>
            <th>姓名:</th>
            <td>${params.name}</td>
        </tr>
        <tr>
            <th>电话:</th>
            <td>${params.phone}</td>
        </tr>
        <tr>
            <th>年级:</th>
            <td>${params.grade}</td>
        </tr>
        <tr>
            <th>科目:</th>
            <td>${params.subject}</td>
        </tr>
    </table>
    <hr>
</div>
</body>
</html>