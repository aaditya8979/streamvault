package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ArrayValue;
import com.yandex.div2.ArrayValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: ArrayValueJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements TemplateResolver<JSONObject, ArrayValueTemplate, ArrayValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3776a;

    public c(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3776a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ArrayValue resolve(@NotNull ParsingContext parsingContext, @NotNull ArrayValueTemplate arrayValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new ArrayValue(JsonFieldResolver.resolveExpression(parsingContext, arrayValueTemplate.f54023a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_JSON_ARRAY));
    }
}
