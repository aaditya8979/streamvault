package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivLayoutProvider;
import com.yandex.div2.DivLayoutProviderTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivLayoutProviderJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class i6 implements TemplateResolver<JSONObject, DivLayoutProviderTemplate, DivLayoutProvider> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3810a;

    public i6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3810a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivLayoutProvider resolve(@NotNull ParsingContext parsingContext, @NotNull DivLayoutProviderTemplate divLayoutProviderTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivLayoutProvider((String) JsonFieldResolver.resolveOptional(parsingContext, divLayoutProviderTemplate.f56177a, jSONObject, "height_variable_name"), (String) JsonFieldResolver.resolveOptional(parsingContext, divLayoutProviderTemplate.f56178b, jSONObject, "width_variable_name"));
    }
}
