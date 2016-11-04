package org.jboss.ddoyle.jbpm.marshalling;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.jboss.ComplexTypeOne;
import org.jboss.ComplexTypeTwo;
import org.junit.Test;
import org.kie.server.api.marshalling.json.JSONMarshaller;

public class JSONMarshallerTest {
	
	@Test
	public void testMarshallUnmarshallWithBothClassesRegistered() {
		ComplexTypeOne complexTypeOne = new ComplexTypeOne();
		complexTypeOne.setName("Duncan");
		ComplexTypeTwo complexTypeTwo = new ComplexTypeTwo();
		complexTypeTwo.setName("Doyle");
		complexTypeOne.setComplexTypeTwo(complexTypeTwo);
		
		Set<Class<?>> classes = new HashSet<>();
		classes.add(ComplexTypeOne.class);
		classes.add(ComplexTypeTwo.class);

		ClassLoader cl = this.getClass().getClassLoader();
				
		JSONMarshaller jsonMarshaller = new JSONMarshaller(classes, cl);
		
		Map<String, Object> inputData = new HashMap();
		inputData.put("complexTypeOne", complexTypeOne);
		
		String marshalledData = jsonMarshaller.marshall(inputData);
		System.out.println("Marshalled data: " + marshalledData);
		
		Map unmarshallledData = jsonMarshaller.unmarshall(marshalledData, Map.class); 
		
		System.out.println("Unmarshalled data: " + unmarshallledData);
		
		ComplexTypeOne unmarshalledCto = (ComplexTypeOne) unmarshallledData.get("complexTypeOne");
		assertEquals("Duncan", unmarshalledCto.getName());
		assertEquals("Doyle", unmarshalledCto.getComplexTypeTwo().getName());
	}
	
	@Test
	public void testMarshallUnmarshallWithOneClassRegistered() {
		ComplexTypeOne complexTypeOne = new ComplexTypeOne();
		complexTypeOne.setName("Duncan");
		ComplexTypeTwo complexTypeTwo = new ComplexTypeTwo();
		complexTypeTwo.setName("Doyle");
		complexTypeOne.setComplexTypeTwo(complexTypeTwo);
		
		Set<Class<?>> classes = new HashSet<>();
		classes.add(ComplexTypeOne.class);
		//classes.add(ComplexTypeTwo.class);

		ClassLoader cl = this.getClass().getClassLoader();
				
		JSONMarshaller jsonMarshaller = new JSONMarshaller(classes, cl);
		
		Map<String, Object> inputData = new HashMap();
		inputData.put("complexTypeOne", complexTypeOne);
		
		String marshalledData = jsonMarshaller.marshall(inputData);
		System.out.println("Marshalled data: " + marshalledData);
		
		Map unmarshallledData = jsonMarshaller.unmarshall(marshalledData, Map.class); 
		
		System.out.println("Unmarshalled data: " + unmarshallledData);
		
		ComplexTypeOne unmarshalledCto = (ComplexTypeOne) unmarshallledData.get("complexTypeOne");
		assertEquals("Duncan", unmarshalledCto.getName());
		assertEquals("Doyle", unmarshalledCto.getComplexTypeTwo().getName());
	}
	
	
}
