package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.IntegerVariable;
import com.yandex.div2.IntegerVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerVariableJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class qc implements TemplateResolver<JSONObject, IntegerVariableTemplate, IntegerVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3866a;

    public qc(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3866a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IntegerVariable resolve(@NotNull ParsingContext parsingContext, @NotNull IntegerVariableTemplate integerVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new IntegerVariable((String) JsonFieldResolver.resolve(parsingContext, integerVariableTemplate.f58305a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, integerVariableTemplate.f58306b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT));
    }
}
