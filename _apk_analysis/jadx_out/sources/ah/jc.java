package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.EndDestination;
import com.yandex.div2.EndDestinationTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: EndDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class jc implements TemplateResolver<JSONObject, EndDestinationTemplate, EndDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3817a;

    public jc(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3817a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EndDestination resolve(@NotNull ParsingContext parsingContext, @NotNull EndDestinationTemplate endDestinationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new EndDestination();
    }
}
