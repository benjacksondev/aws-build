package com.awsgen.pipelines;

import com.awsgen.build.Context;
import com.awsgen.build.Stage;
import java.util.ArrayList;

public class AWSPipeline implements Pipeline {

    private ArrayList<Stage> stages;

    public AWSPipeline() {
        stages = new ArrayList();
    }

    public void pipe(Stage stage) {
        stages.add(stage);
    }

    public Context process(Context context) {
        stages.forEach((stage) -> stage.run(context));

        return context;
    }
}
