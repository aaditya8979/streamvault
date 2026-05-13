package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRelativeCenter;
import com.yandex.div2.DivRadialGradientRelativeCenterTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeCenterJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class f8 implements TemplateResolver<JSONObject, DivRadialGradientRelativeCenterTemplate, DivRadialGradientRelativeCenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3792a;

    public f8(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3792a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRelativeCenter resolve(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivRadialGradientRelativeCenter(JsonFieldResolver.resolveExpression(parsingContext, divRadialGradientRelativeCenterTemplate.f56627a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
