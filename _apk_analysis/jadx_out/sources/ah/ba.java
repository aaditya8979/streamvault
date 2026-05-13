package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivStrokeStyleSolid;
import com.yandex.div2.DivStrokeStyleSolidTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleSolidJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ba implements TemplateResolver<JSONObject, DivStrokeStyleSolidTemplate, DivStrokeStyleSolid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3774a;

    public ba(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3774a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyleSolid resolve(@NotNull ParsingContext parsingContext, @NotNull DivStrokeStyleSolidTemplate divStrokeStyleSolidTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivStrokeStyleSolid();
    }
}
