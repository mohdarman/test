package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userLogged_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t\t<title>Calculate Distance Between Two Locations(points) Using google maps javascript</title>\n");
      out.write("\t\t<meta charset=\"utf-8\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("\t\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\t\t<script src=\"//maps.googleapis.com/maps/api/js?key=js-9qZHzu2Flc59Eq5rx10JdKERovBlJp3TQ3ApyC4TOa3tA8U7aVRnFwf41RpLgtE7&sensor=false&libraries=places\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <h2>Calculate Distance between two points google maps javascript</h2>\n");
      out.write("\n");
      out.write("  <form class=\"form-inline\" action=\"\">\n");
      out.write("    <div class=\"form-group col-md-6\">\n");
      out.write("      <label for=\"email\">Source:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"source\" value=\"Jaipur, India\" >\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group col-md-6\">\n");
      out.write("      <label for=\"pwd\">Destination:</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"destination\" value=\"Mumbai, India\" >\n");
      out.write("    </div>\n");
      out.write("\t</br>&nbsp;</br>\n");
      out.write("\t<div class=\"form-group col-md-6\">\n");
      out.write("\t\n");
      out.write("    <button type=\"button\" value=\"Get Route\" onclick=\"get_rout()\" >Get Rout & Distance</button>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group col-md-6\">\n");
      out.write("      <label for=\"pwd\">Distance in km :</label>\n");
      out.write("      <input type=\"text\" class=\"form-control distance\" readonly >\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write(" \n");
      out.write("  <div class=\"row\" >\n");
      out.write("  <br /><br />\n");
      out.write("   <div class='col-md-6' id='panallocation' style=\"width: 500px; height: 500px\" ></div>\n");
      out.write("  <div class='col-md-6' id='maplocation' style=\"height: 450px;\" ></div>\n");
      out.write(" \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar source, destination;\n");
      out.write("\tvar darection = new google.maps.DirectionsRenderer;\n");
      out.write("\tvar directionsService = new google.maps.DirectionsService;\n");
      out.write("\tgoogle.maps.event.addDomListener(window, 'load', function () {\n");
      out.write("\t\tnew google.maps.places.SearchBox(document.getElementById('source'));\n");
      out.write("\t\tnew google.maps.places.SearchBox(document.getElementById('destination'));\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction get_rout() {\n");
      out.write("\t\tvar mapOptions = {\n");
      out.write("\t\t\tmapTypeControl: false,\n");
      out.write("\t\t\tcenter: {lat: -100.8688, lng: 151.2195},\n");
      out.write("\t\t\tzoom: 20\n");
      out.write("\t\t};\n");
      out.write("\t\t\n");
      out.write("\t\tmap = new google.maps.Map(document.getElementById('maplocation'), mapOptions);\n");
      out.write("\t\tdarection.setMap(map);\n");
      out.write("\t\tdarection.setPanel(document.getElementById('panallocation'));\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\tsource = document.getElementById(\"source\").value;\n");
      out.write("\t\tdestination = document.getElementById(\"destination\").value;\n");
      out.write("\n");
      out.write("\t\tvar request = {\n");
      out.write("\t\t\torigin: source,\n");
      out.write("\t\t\tdestination: destination,\n");
      out.write("\t\t\ttravelMode: google.maps.TravelMode.DRIVING\n");
      out.write("\t\t};\n");
      out.write("\t\tdirectionsService.route(request, function (response, status) {\n");
      out.write("\t\t\tif (status == google.maps.DirectionsStatus.OK) {\n");
      out.write("\t\t\t\tdarection.setDirections(response);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tvar service = new google.maps.DistanceMatrixService();\n");
      out.write("\t\tservice.getDistanceMatrix({\n");
      out.write("\t\t\torigins: [source],\n");
      out.write("\t\t\tdestinations: [destination],\n");
      out.write("\t\t\ttravelMode: google.maps.TravelMode.DRIVING,\n");
      out.write("\t\t\tunitSystem: google.maps.UnitSystem.METRIC,\n");
      out.write("\t\t\tavoidHighways: false,\n");
      out.write("\t\t\tavoidTolls: false\n");
      out.write("\t\t}, function (response, status) {\n");
      out.write("\t\t\tif (status == google.maps.DistanceMatrixStatus.OK && response.rows[0].elements[0].status != \"ZERO_RESULTS\") {\n");
      out.write("\t\t\t\tvar distance = response.rows[0].elements[0].distance.text;\n");
      out.write("\t\t\t\tvar duration = response.rows[0].elements[0].duration.text;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tdistancefinel = distance.split(\" \");\n");
      out.write("\t\t\t\t$('.distance').val(distancefinel[0]);\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\talert(\"Unable to find the distance between selected locations\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
