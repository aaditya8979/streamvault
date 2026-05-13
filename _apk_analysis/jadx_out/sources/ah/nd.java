package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.UrlVariable;
import com.yandex.div2.UrlVariableTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: UrlVariableJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class nd implements TemplateResolver<JSONObject, UrlVariableTemplate, UrlVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3844a;

    public nd(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3844a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public UrlVariable resolve(@NotNull ParsingContext parsingContext, @NotNull UrlVariableTemplate urlVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new UrlVariable((String) JsonFieldResolver.resolve(parsingContext, urlVariableTemplate.f58693a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, urlVariableTemplate.f58694b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
