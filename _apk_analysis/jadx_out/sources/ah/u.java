package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ContentText;
import com.yandex.div2.ContentTextTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContentTextJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class u implements TemplateResolver<JSONObject, ContentTextTemplate, ContentText> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3891a;

    public u(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3891a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentText resolve(@NotNull ParsingContext parsingContext, @NotNull ContentTextTemplate contentTextTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new ContentText(JsonFieldResolver.resolveExpression(parsingContext, contentTextTemplate.f54071a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
