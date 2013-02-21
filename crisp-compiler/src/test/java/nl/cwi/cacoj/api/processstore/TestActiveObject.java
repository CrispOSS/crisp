package nl.cwi.cacoj.api.processstore;

import nl.cwi.cacoj.api.ActiveObject;
import nl.cwi.cacoj.api.MethodInvocation;
import nl.cwi.cacoj.api.priority.Priority;
import nl.cwi.cacoj.api.priority.PriorityManager;

public class TestActiveObject implements ActiveObject {

	@Override
	public Class getPriorityManagerClass(String methodName) {
		return PriorityManager_m1.class;
	}
	
	@Override
	public boolean hasMethodLevelPriorities() {
		return true;
	}

	@Override
	public ProcessStore getProcessStore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub

	}

	public static class PriorityManager_m1 implements PriorityManager {
		Integer m;

		@Override
		public Priority resolve(MethodInvocation<?> mi) {
			return new Priority() {
				@Override
				public Number getValue() {
					return m;
				}
			};
		}
	}
}
