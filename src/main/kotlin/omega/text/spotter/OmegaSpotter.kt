package omega.text.spotter

import org.deeplearning4j.nn.api.Model
import org.deeplearning4j.nn.conf.WorkspaceMode
import org.deeplearning4j.zoo.PretrainedType
import org.deeplearning4j.nn.graph.ComputationGraph
import org.deeplearning4j.zoo.model.YOLO2.*

class OmegaSpotter {

    private var seed: Long = 123;

    fun getModel(): Model? {
        var build = builder()
                .seed(seed)
                .workspaceMode(WorkspaceMode.ENABLED)
                .build();
        var pretrainedType = PretrainedType.IMAGENET;
        return build.initPretrained<ComputationGraph>(pretrainedType)
    }
}