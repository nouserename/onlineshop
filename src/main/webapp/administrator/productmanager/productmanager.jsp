<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" http-equiv='Content-Type' content='text/html; charset=gb2312'>
<title>Insert title here</title>
</head>
<body>
<div class="text" style=" text-align:center;"><br />星云手机值得拥有<br /><br>
<form action=" ">
<input type="text" name="s" class="input" placeholder="输入 产品名称" autofocus x-webkit-speech>&emsp;&emsp;&emsp;
<select>
    <option value="1">价格区间1</option>
    <option value="2">价格区间2</option>
    <option value="3">价格区间3</option>
    <option value="4">价格区间4</option>
</select>&emsp;&emsp;&emsp;


  <select name="YYYY" onchange="YYYYDD(this.value)">
    <option value="">请选择 年</option>
  </select>
  <select name="MM" onchange="MMDD(this.value)">
    <option value="">选择 月</option>
  </select>
  <select name="DD">
    <option value="">选择 日</option>
  </select>

<script language="JavaScript"><!--   
   function YYYYMMDDstart()   
   {   
           MonHead = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];   
    
           //先给年下拉框赋内容   
           var y  = new Date().getFullYear();   
           for (var i = (y-30); i < (y+30); i++) //以今年为准，前30年，后30年   
                   document.reg_testdate.YYYY.options.add(new Option(" "+ i +" 年", i));   
    
           //赋月份的下拉框   
           for (var i = 1; i < 13; i++)   
                   document.reg_testdate.MM.options.add(new Option(" " + i + " 月", i));   
    
           document.reg_testdate.YYYY.value = y;   
           document.reg_testdate.MM.value = new Date().getMonth() + 1;   
           var n = MonHead[new Date().getMonth()];   
           if (new Date().getMonth() ==1 && IsPinYear(YYYYvalue)) n++;   
                writeDay(n); //赋日期下拉框Author:meizz   
           document.reg_testdate.DD.value = new Date().getDate();   
   }   
   if(document.attachEvent)   
       window.attachEvent("onload", YYYYMMDDstart);   
   else   
       window.addEventListener('load', YYYYMMDDstart, false);   
   function YYYYDD(str) //年发生变化时日期发生变化(主要是判断闰平年)   
   {   
           var MMvalue = document.reg_testdate.MM.options[document.reg_testdate.MM.selectedIndex].value;   
           if (MMvalue == ""){ var e = document.reg_testdate.DD; optionsClear(e); return;}   
           var n = MonHead[MMvalue - 1];   
           if (MMvalue ==2 && IsPinYear(str)) n++;   
                writeDay(n)   
   }   
   function MMDD(str)   //月发生变化时日期联动   
   {   
        var YYYYvalue = document.reg_testdate.YYYY.options[document.reg_testdate.YYYY.selectedIndex].value;   
        if (YYYYvalue == ""){ var e = document.reg_testdate.DD; optionsClear(e); return;}   
        var n = MonHead[str - 1];   
        if (str ==2 && IsPinYear(YYYYvalue)) n++;   
       writeDay(n)   
   }   
   function writeDay(n)   //据条件写日期的下拉框   
   {   
           var e = document.reg_testdate.DD; optionsClear(e);   
           for (var i=1; i<(n+1); i++)   
                e.options.add(new Option(" "+ i + " 日", i));   
   }   
   function IsPinYear(year)//判断是否闰平年   
   {     return(0 == year%4 && (year%100 !=0 || year%400 == 0));}   
   function optionsClear(e)   
   {   
        e.options.length = 1;   
   }   
   //--></script>
   &emsp;&emsp;&emsp;
<input name="搜索" type="button" id="btn1" title="搜索" value="搜索" />&emsp;&emsp;&emsp;
<input name="新增" type="button" id="btn2" title="新增" value="新增" />&emsp;&emsp;&emsp;</div><br />
<div style="position: absolute;left:200px;">
名称&emsp;&emsp;&emsp;<input type="text" name="s1" ><br />
上架日期&emsp;<input type="text" name="s2" >
</div><br /><br />
<div style="position: absolute;right:200px;"><input name="删除" type="button" id="btn5" title="删除" value="删除" style="height:30px;width:100px;"/>
</div><br />
<div style="position: absolute;left:200px;">
价格&emsp;&emsp;&emsp;<input type="text" name="s3" ><br />
销量&emsp;&emsp;&emsp;<input type="text" name="s4" ><br />
</div>
</body>
</html>