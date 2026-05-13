package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputFilterRegex;
import com.yandex.div2.DivInputFilterRegexTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterRegexJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v5 implements TemplateResolver<JSONObject, DivInputFilterRegexTemplate, DivInputFilterRegex> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3901a;

    public v5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3901a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterRegex resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputFilterRegexTemplate divInputFilterRegexTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivInputFilterRegex(JsonFieldResolver.resolveExpression(parsingContext, divInputFilterRegexTemplate.f56019a, jSONObject, "pattern", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
