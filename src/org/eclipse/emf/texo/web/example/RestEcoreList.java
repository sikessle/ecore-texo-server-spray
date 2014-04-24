package org.eclipse.emf.texo.web.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.server.service.ServiceModelPackageRegistry;
import org.json.JSONArray;

/**
 * Returns a json array of all ecore names which
 * are known by the server.
 */
public class RestEcoreList extends HttpServlet {
	private static final long serialVersionUID = 1L;

@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	JSONArray arr = new JSONArray();
	  for (ModelPackage modelPackage : ServiceModelPackageRegistry.getInstance().getRegisteredModelPackages()) {
		  arr.put(modelPackage.getEPackage().getName());
	    }
    resp.getWriter().write(arr.toString());
  }
}
