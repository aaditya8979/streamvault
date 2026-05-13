package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.NumberValue;
import com.yandex.div2.NumberValueTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberValueJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class tc implements TemplateResolver<JSONObject, NumberValueTemplate, NumberValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3890a;

    public tc(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3890a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberValue resolve(@NotNull ParsingContext parsingContext, @NotNull NumberValueTemplate numberValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new NumberValue(JsonFieldResolver.resolveExpression(parsingContext, numberValueTemplate.f58618a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
