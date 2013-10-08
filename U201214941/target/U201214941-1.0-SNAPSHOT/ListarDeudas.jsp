<%-- 
    Document   : ListarDeudas
    Created on : 06-oct-2013, 22:34:00
    Author     : Alfonso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Estilos/Estilos.css" />
    </head>
    <body>
        <div name="page" class="page"> 
            <form:form commandName="frmdeudas">
                <table border="0" align="center">
                    <tr >
                        <td>&nbsp;</td>
                        <td><label><h1>Lista de Deudas</h1></label></td>
                        <td>&nbsp;</td>
                    </tr>
                    <table id="Busqueda" border="0" align="center">
                        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr> 
                        <tr><td>RUC</td><td>:</td><td><input name="txtruc" maxlength="11" width="120px"> </td><td>&nbsp;</td><td><input type="submit" value="Buscar" name="btnbuscar" class="stlbutton"></td></tr>
                        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
                        <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>                        
                    </table>
                </table>

                <table border="0" align="center">
                    <tr>
                        <td style="border: 2px solid #000;">Id Deuda</td>
                        <td style="border: 2px solid #000;">RUC</td>               
                        <td style="border: 2px solid #000;">Motivo</td>
                        <td style="border: 2px solid #000;">Periodo Tributo</td>
                        <td style="border: 2px solid #000;">Resolucion</td>
                        <td style="border: 2px solid #000;">Codigo Tributo</td>
                        <td style="border: 2px solid #000;">Importe</td>
                    </tr> 
                    <c:forEach var="deuda" items="${deuda}">
                        <tr>
                            <td>$ <c:out value="${deuda.IdDeuda}"/></td>	
                            <td>$ <c:out value="${deuda.Ruc}"/></td>	
                            <td>$ <c:out value="${deuda.Motivo}"/></td>	
                            <td>$ <c:out value="${deuda.Periodo_tributo}"/></td>	 
                            <td>$ <c:out value="${deuda.Resolucion}"/></td>	
                            <td>$ <c:out value="${deuda.Cod_tributo}"/></td>	
                            <td>$ <c:out value="${deuda.Importe}"/></td>	
                        </tr>								
                    </c:forEach>	


                </table>

            </form:form>
        </div>
    </body>
</html>
