package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivExtensionTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivExtensionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u3 implements TemplateResolver<JSONObject, DivExtensionTemplate, DivExtension> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3894a;

    public u3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3894a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivExtension resolve(@NotNull ParsingContext parsingContext, @NotNull DivExtensionTemplate divExtensionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivExtension((String) JsonFieldResolver.resolve(parsingContext, divExtensionTemplate.f55245a, jSONObject, "id"), (JSONObject) JsonFieldResolver.resolveOptional(parsingContext, divExtensionTemplate.f55246b, jSONObject, "params"));
    }
}
