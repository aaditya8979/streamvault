package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ArrayVariable;
import com.yandex.div2.ArrayVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayVariableJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements TemplateResolver<JSONObject, ArrayVariableTemplate, ArrayVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3790a;

    public f(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3790a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayVariable resolve(@NotNull ParsingContext parsingContext, @NotNull ArrayVariableTemplate arrayVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new ArrayVariable((String) JsonFieldResolver.resolve(parsingContext, arrayVariableTemplate.f54031a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, arrayVariableTemplate.f54032b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }
}
