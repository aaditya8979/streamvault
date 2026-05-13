package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.BoolVariable;
import com.yandex.div2.BoolVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: BoolVariableJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements TemplateResolver<JSONObject, BoolVariableTemplate, BoolVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3824a;

    public l(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3824a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public BoolVariable resolve(@NotNull ParsingContext parsingContext, @NotNull BoolVariableTemplate boolVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new BoolVariable((String) JsonFieldResolver.resolve(parsingContext, boolVariableTemplate.f54047a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, boolVariableTemplate.f54048b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
