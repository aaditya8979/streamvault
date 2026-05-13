package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivSolidBackgroundTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSolidBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class o9 implements TemplateResolver<JSONObject, DivSolidBackgroundTemplate, DivSolidBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3850a;

    public o9(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3850a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSolidBackground resolve(@NotNull ParsingContext parsingContext, @NotNull DivSolidBackgroundTemplate divSolidBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivSolidBackground(JsonFieldResolver.resolveExpression(parsingContext, divSolidBackgroundTemplate.f57155a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
