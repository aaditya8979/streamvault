package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.NumberVariable;
import com.yandex.div2.NumberVariableTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberVariableJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class wc implements TemplateResolver<JSONObject, NumberVariableTemplate, NumberVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3910a;

    public wc(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3910a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public NumberVariable resolve(@NotNull ParsingContext parsingContext, @NotNull NumberVariableTemplate numberVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new NumberVariable((String) JsonFieldResolver.resolve(parsingContext, numberVariableTemplate.f58626a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, numberVariableTemplate.f58627b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DOUBLE, ParsingConvertersKt.NUMBER_TO_DOUBLE));
    }
}
