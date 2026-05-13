package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StrVariable;
import com.yandex.div2.StrVariableTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrVariableJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class hd implements TemplateResolver<JSONObject, StrVariableTemplate, StrVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3806a;

    public hd(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3806a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrVariable resolve(@NotNull ParsingContext parsingContext, @NotNull StrVariableTemplate strVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new StrVariable((String) JsonFieldResolver.resolve(parsingContext, strVariableTemplate.f58677a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, strVariableTemplate.f58678b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
