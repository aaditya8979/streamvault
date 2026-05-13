package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ColorValue;
import com.yandex.div2.ColorValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorValueJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements TemplateResolver<JSONObject, ColorValueTemplate, ColorValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3845a;

    public o(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3845a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ColorValue resolve(@NotNull ParsingContext parsingContext, @NotNull ColorValueTemplate colorValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new ColorValue(JsonFieldResolver.resolveExpression(parsingContext, colorValueTemplate.f54055a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
