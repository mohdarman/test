<%-- 
    Document   : bookregistration
    Created on : 23 Oct, 2019, 1:20:49 PM
    Author     : arman
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     

<form method="" action="">

<table border="1" align="center" width="400" bgcolor="#CCCCCC" >

<caption>Registration book</caption>

<tr>

<th>Enter your book name</th>

<td><input type="text" name="fn" id="fn1" maxlength="10" title="enter your first name" placeholder="enter your first name" required/></td>

</tr>

<tr>

<th>Enter your auther  name</th>

<td><input type="text"/></td>

</tr>

<tr>

<th>Enter your password</th>

<td><input type="password"/></td>

</tr>

<tr>

<th>ReEnter your password</th>

<td><input type="password"/></td>

</tr>

<tr>

<th>Enter your userID</th>

<td><input type="email"/></td>

</tr>

<tr>

<th>Enter your mobile</th>

<td><input type="number"/></td>

</tr>

<tr>

<th>Enter your address</th>

<td><textarea rows="8" cols="20"></textarea></td>

</tr>

<tr>

<th>Select your book type</th>

<td>

ENGI<input type="checkbox" name="engineering" value="m"/>
INTERMEDIATE<input type="checkbox" name="g" value="intermediate"/>

</td>

</tr>


<tr>

<th>Select your DOB</th>

<td><input type="date"/></td>

</tr>

<tr>

<th>Select your Country</th>

<td>

<select name="country">

<option value="" selected="selected" disabled="disabled">Select your country</option>

<option value="1">India</option>

<option value="2">AUSTRALIA</option>

</select>

</td>

</tr>

<tr>

<th>Upload your pic</th>

<td><input type="file"/></td>

</tr>

<tr>

<td colspan="2" align="center"><input type="submit" value="Save My Data"/>

<input type="reset" value="Reset Data"/>

</td>

</tr>

</table>

</form>
    </body>
</html>
