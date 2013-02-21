package nl.cwi.cacoj.api.processstore;

import nl.cwi.cacoj.api.MethodInvocation;
import nl.cwi.cacoj.api.priority.Priority;
import nl.cwi.cacoj.api.priority.PriorityManager;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * 
 * @author Behrooz Nobakht
 * 
 **/
@RunWith(JUnit4.class)
public class SimpleProcessStoreTest {

	@Test
	public void testInitPriorityManager() throws Exception {

		TestActiveObject o = new TestActiveObject();
		SimpleProcessStore sps = new SimpleProcessStore(o);

		MethodInvocation<?> mi = new MethodInvocation(new Runnable() {
			@Override
			public void run() {
			}
		}, o);
		mi.initMetaData("m1", null, new Object[] { new Integer(1) });

		PriorityManager pm = sps.initPriorityManager(mi);
		Priority p = pm.resolve(mi);
		Assert.assertEquals(1, p.getValue());

	}

}
