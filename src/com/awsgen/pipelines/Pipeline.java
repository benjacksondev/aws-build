package com.awsgen.pipelines;

import com.awsgen.build.contracts.ContextContract;
import com.awsgen.build.contracts.Stage;
import com.awsgen.pipelines.contracts.PipelineContract;

import java.util.ArrayList;

public class Pipeline implements PipelineContract {

    private ArrayList<Stage> stages;

    public Pipeline() {
        this.stages = new ArrayList<Stage>();
    }

    public void pipe(Stage stage) {
        stages.add(stage);
    }

    public ContextContract process(ContextContract context) {
        this.stages.forEach((stage) -> stage.run(context));

        return context;
    }
}
