package org.wso2.developerstudio.eclipse.artifact.jaxrs.prject.export;

import java.util.ArrayList;
import java.util.List;

import org.wso2.developerstudio.eclipse.artifact.jaxrs.Activator;
import org.wso2.developerstudio.eclipse.distribution.project.export.CappArtifactsListProvider;
import org.eclipse.core.resources.IProject;
import org.wso2.developerstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.developerstudio.eclipse.logging.core.Logger;

public class JaxrsArtifactProvider extends CappArtifactsListProvider {
	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	@Override
	public List<ListData> getArtifactsListForCappExport(IProject project) {

		List<ListData> list = new ArrayList<ListData>();
		try {
			list = super.getArtifactsListForCappExport(project);
		} catch (Exception e) {
			log.error("Error getting artifacts list from project ", e);
		}
		return list;
	}
}
