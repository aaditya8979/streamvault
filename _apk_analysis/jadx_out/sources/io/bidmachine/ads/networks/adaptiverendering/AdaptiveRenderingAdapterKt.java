package io.bidmachine.ads.networks.adaptiverendering;

import androidx.appcompat.widget.ActivityChooserModel;
import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.core.UtilsKt;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmResult;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AdaptiveRenderingAdapter.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\fH\u0000\u001a\u001a\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010*\u00020\u0012H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"KEY_ADAPTIVE_RENDERING_CONTEXT", "", "KEY_ALGORITHM", "KEY_ALGORITHMS", "KEY_COMPONENT", "KEY_DURATION", "KEY_NAME", "KEY_PHASE", "KEY_RESULT", "KEY_THRESHOLD", "KEY_WEIGHT", "toBMError", "Lio/bidmachine/utils/BMError;", "Lio/bidmachine/rendering/model/Error;", "baseBMError", "toEventParams", "", "", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "bidmachine-android-sdk_bi_3_3_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class AdaptiveRenderingAdapterKt {

    @NotNull
    private static final String KEY_ADAPTIVE_RENDERING_CONTEXT = "adaptive_rendering_context";

    @NotNull
    private static final String KEY_ALGORITHM = "algorithm";

    @NotNull
    private static final String KEY_ALGORITHMS = "algorithms";

    @NotNull
    private static final String KEY_COMPONENT = "component";

    @NotNull
    private static final String KEY_DURATION = "duration";

    @NotNull
    private static final String KEY_NAME = "name";

    @NotNull
    private static final String KEY_PHASE = "phase";

    @NotNull
    private static final String KEY_RESULT = "result";

    @NotNull
    private static final String KEY_THRESHOLD = "threshold";

    @NotNull
    private static final String KEY_WEIGHT = "weight";

    @NotNull
    public static final BMError toBMError(@NotNull Error error, @NotNull BMError bMError) {
        p.k(error, "<this>");
        p.k(bMError, "baseBMError");
        return new BMError(bMError, -1, error.getMessage());
    }

    @Nullable
    public static final Map<String, Object> toEventParams(@NotNull BrokenCreativeEvent brokenCreativeEvent) {
        p.k(brokenCreativeEvent, "<this>");
        try {
            ListValue listValueMapNotNullToProtoListValue = ProtoUtilsKt.mapNotNullToProtoListValue(brokenCreativeEvent.getAlgorithmResults(), new l<BrokenCreativeAlgorithmResult, Value>() { // from class: io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingAdapterKt$toEventParams$algorithmsListValue$1
                @Override // sn.l
                @Nullable
                public final Value invoke(@NotNull BrokenCreativeAlgorithmResult brokenCreativeAlgorithmResult) {
                    p.k(brokenCreativeAlgorithmResult, "brokenCreativeAlgorithmResult");
                    BrokenCreativeAlgorithmParams algorithmParams = brokenCreativeAlgorithmResult.getAlgorithmParams();
                    Struct.Builder builderNewBuilder = Struct.newBuilder();
                    p.j(builderNewBuilder, "newBuilder()");
                    Struct structBuild = ProtoUtilsKt.putField(ProtoUtilsKt.putField(ProtoUtilsKt.putField(builderNewBuilder, "name", algorithmParams.getType().getKey()), ActivityChooserModel.ATTRIBUTE_WEIGHT, Float.valueOf(algorithmParams.getAndroidx.appcompat.widget.ActivityChooserModel.ATTRIBUTE_WEIGHT java.lang.String())), "threshold", Float.valueOf(algorithmParams.getThreshold())).build();
                    p.j(structBuild, "brokenCreativeAlgorithmR…build()\n                }");
                    Struct.Builder builderNewBuilder2 = Struct.newBuilder();
                    p.j(builderNewBuilder2, "newBuilder()");
                    return ProtoUtilsKt.toProtoValue(ProtoUtilsKt.putField(ProtoUtilsKt.putField(ProtoUtilsKt.putField(builderNewBuilder2, "algorithm", structBuild), "result", Integer.valueOf(UtilsKt.convertToInt(brokenCreativeAlgorithmResult.getIsBroken()))), "duration", Long.valueOf(brokenCreativeAlgorithmResult.getDurationMs())));
                }
            });
            Struct.Builder builderNewBuilder = Struct.newBuilder();
            p.j(builderNewBuilder, "newBuilder()");
            Value protoValue = ProtoUtilsKt.toProtoValue(ProtoUtilsKt.putField(ProtoUtilsKt.putField(ProtoUtilsKt.putField(ProtoUtilsKt.putField(ProtoUtilsKt.putField(builderNewBuilder, "result", Double.valueOf(brokenCreativeEvent.isBroken())), "phase", Integer.valueOf(brokenCreativeEvent.getAdPhaseSequence())), KEY_COMPONENT, brokenCreativeEvent.getAdElementName()), "duration", Long.valueOf(brokenCreativeEvent.getDurationMs())), KEY_ALGORITHMS, listValueMapNotNullToProtoListValue));
            HashMap map = new HashMap();
            map.put(KEY_ADAPTIVE_RENDERING_CONTEXT, protoValue);
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }
}
