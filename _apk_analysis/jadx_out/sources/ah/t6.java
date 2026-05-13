package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivNinePatchBackground;
import com.yandex.div2.DivNinePatchBackgroundTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t6 implements TemplateResolver<JSONObject, DivNinePatchBackgroundTemplate, DivNinePatchBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3888a;

    public t6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3888a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNinePatchBackground resolve(@NotNull ParsingContext parsingContext, @NotNull DivNinePatchBackgroundTemplate divNinePatchBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivNinePatchBackground(JsonFieldResolver.resolveExpression(parsingContext, divNinePatchBackgroundTemplate.f56227a, jSONObject, "image_url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI), (DivAbsoluteEdgeInsets) JsonFieldResolver.resolve(parsingContext, divNinePatchBackgroundTemplate.f56228b, jSONObject, "insets", this.f3888a.G(), this.f3888a.E()));
    }
}
