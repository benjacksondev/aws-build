package com.awsgen.pipelines;

import com.awsgen.workflows.Standard;
import com.awsgen.workflows.Workflow;

public class PipelineManager {

    Workflow workflow = null;

    public PipelineManager(String workflowType) {
        Pipeline pipeline = new Pipeline();
        Workflow workflow = null;

        switch (workflowType) {
            case "Standard": workflow = new Standard(pipeline);
        }

        if (workflow == null) {
            throw new RuntimeException("Workflow " + workflowType + " invalid.");
        }

        this.workflow = workflow;
    }

    public Workflow make() {
        return this.workflow;
    }
}
