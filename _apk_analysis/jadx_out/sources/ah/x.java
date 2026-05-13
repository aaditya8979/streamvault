package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ContentUrl;
import com.yandex.div2.ContentUrlTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: ContentUrlJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class x implements TemplateResolver<JSONObject, ContentUrlTemplate, ContentUrl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3911a;

    public x(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3911a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ContentUrl resolve(@NotNull ParsingContext parsingContext, @NotNull ContentUrlTemplate contentUrlTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new ContentUrl(JsonFieldResolver.resolveExpression(parsingContext, contentUrlTemplate.f54078a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
