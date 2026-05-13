package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StrValue;
import com.yandex.div2.StrValueTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrValueJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ed implements TemplateResolver<JSONObject, StrValueTemplate, StrValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3789a;

    public ed(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3789a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StrValue resolve(@NotNull ParsingContext parsingContext, @NotNull StrValueTemplate strValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new StrValue(JsonFieldResolver.resolveExpression(parsingContext, strValueTemplate.f58669a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
