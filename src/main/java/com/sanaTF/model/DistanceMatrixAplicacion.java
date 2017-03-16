package com.sanaTF.model;


import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertNotNull; 
import static org.junit.Assert.assertTrue; 
 
import com.google.maps.DirectionsApi.RouteRestriction;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix; 
import com.google.maps.model.DistanceMatrixElementStatus; 


import com.google.maps.DistanceMatrixApi;
import com.google.maps.model.TravelMode; 
import com.google.maps.model.Unit; 
 
import org.joda.time.DateTime;  
import org.junit.experimental.categories.Category; 
 
import java.util.concurrent.TimeUnit; 
 
@Category(Large.class) 
public class DistanceMatrixAplicacion extends Authenticated { 
 
	private GeoApiContext context; 
  
  public DistanceMatrixAplicacion(){}
  
  public DistanceMatrixAplicacion(GeoApiContext context) { 
   this.context = context 
        .setConnectTimeout(5, TimeUnit.SECONDS) 
        .setReadTimeout(5, TimeUnit.SECONDS) 
        .setWriteTimeout(5, TimeUnit.SECONDS); 
  } 
 
 
  public void GetDistanceMatrixWithBasicStringParams() throws Exception { 
    String[] origins = new String[] { 
        "Perth, Australia", "Sydney, Australia", "Melbourne, Australia", 
        "Adelaide, Australia", "Brisbane, Australia", "Darwin, Australia", 
        "Hobart, Australia", "Canberra, Australia" 
    }; 
    String[] destinations = new String[] { 
        "Uluru, Australia", "Kakadu, Australia", "Blue Mountains, Australia", 
        "Bungle Bungles, Australia", "The Pinnacles, Australia" 
    }; 
    DistanceMatrix matrix =
        DistanceMatrixApi.getDistanceMatrix(context, origins, destinations).await(); 
 
    // Rows length will match the number of origin elements, regardless of whether they're routable. 
    assertEquals(8, matrix.rows.length); 
    assertEquals(5, matrix.rows[0].elements.length); 
    assertEquals(DistanceMatrixElementStatus.OK, matrix.rows[0].elements[0].status); 
  } 
 
 
  public void NewRequestWithAllPossibleParams() throws Exception { 
    String[] origins = new String[] { 
        "19.2799481,-99.669227"
    }; 
    String[] destinations = new String[] { 
        "19.290219,-99.659703"
    }; 
 
    DistanceMatrix matrix = DistanceMatrixApi.newRequest(context) 
        .origins(origins) 
        .destinations(destinations) 
        .mode(TravelMode.DRIVING) 
        .language("es-ES") 
        .await(); 
 
    assertEquals(8, matrix.rows.length); 
    assertEquals(5, matrix.rows[0].elements.length); 
    assertTrue(matrix.rows[0].elements[0].distance.humanReadable.endsWith("mi")); 
  } 
  
  public DistanceMatrix obtenDistancias(String origins, String destinations) throws Exception { 
	     
	    DistanceMatrix matrix = DistanceMatrixApi.newRequest(context) 
	        .origins(origins) 
	        .destinations(destinations) 
	        .mode(TravelMode.DRIVING) 
	        .language("es-ES") 
	        .await(); 
	 
	    //assertEquals(8, matrix.rows.length); 
	    //assertEquals(5, matrix.rows[0].elements.length); 
	    //assertTrue(matrix.rows[0].elements[0].distance.humanReadable.endsWith("mi")); 
	    return matrix;
	} 
  
 
  /**   * Test the language parameter. 
   * 
   * <p>Sample request: 
   * <a href="http://maps.googleapis.com/maps/api/distancematrix/json?origins=Vancouver+BC|Seattle&destinations=San+Francisco|Victoria+BC&mode=bicycling&language=fr-FR"> 
   * origins: Vancouver BC|Seattle, destinations: San Francisco|Victoria BC, mode: bicycling, 
   * language: french</a>. 
   */ 

  public void LanguageParameter() throws Exception { 
    DistanceMatrix matrix = DistanceMatrixApi.newRequest(context) 
        .origins("Vancouver BC", "Seattle") 
        .destinations("San Francisco", "Victoria BC") 
        .mode(TravelMode.BICYCLING) 
        .language("fr-FR") 
        .await(); 
 
    assertNotNull(matrix); 
  } 
 
  
 
  /**   * Test transit without arrival or departure times specified. 
   */ 
 
  public void TransitWithoutSpecifyingTime() throws Exception { 
    DistanceMatrixApi.newRequest(context) 
        .origins("Fisherman's Wharf, San Francisco", "Union Square, San Francisco") 
        .destinations("Mikkeller Bar, San Francisco", "Moscone Center, San Francisco") 
        .mode(TravelMode.TRANSIT) 
        .await(); 
 
    // Since this test may run at different times-of-day, it's entirely valid to return zero 
    // routes, but the main thing to catch is that no exception is thrown. 
  } 
 
 
 
}