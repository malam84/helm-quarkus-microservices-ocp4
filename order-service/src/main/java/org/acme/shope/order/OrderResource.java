package org.acme.shope.order;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;

@Path("/order")
public class OrderResource {

    private static final Logger logger = Logger.getLogger(OrderResource.class);
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("orderlist")
	public Map<String, String> getOrder() {
		try {
			logger.info("List of customer order");
			HashMap<String, String> ordersMap = new HashMap<String, String>();
			ordersMap.put("iPhone 12", "Order completed");
			ordersMap.put("Mac Os", "Order in pending");
			return ordersMap;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}