package org.jenkinsci.test.acceptance.plugins.ant;

import org.jenkinsci.test.acceptance.po.BuildStepImpl;
import org.jenkinsci.test.acceptance.po.Control;
import org.jenkinsci.test.acceptance.po.Describable;
import org.jenkinsci.test.acceptance.po.Job;

/**
 * Ant job configuration UI.
 *
 * @author Kohsuke Kawaguchi
 */
@Describable("Invoke Ant")
public class AntBuildStep extends BuildStepImpl {
    public final Control targets = control("targets");
    public final Control antName = control("antName");

    public AntBuildStep(Job parent, String path) {
        super(parent, path);
    }
}
