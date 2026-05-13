package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.StartDestination;
import com.yandex.div2.StartDestinationTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: StartDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class bd implements TemplateResolver<JSONObject, StartDestinationTemplate, StartDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3775a;

    public bd(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3775a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StartDestination resolve(@NotNull ParsingContext parsingContext, @NotNull StartDestinationTemplate startDestinationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new StartDestination();
    }
}
