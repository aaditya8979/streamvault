package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivStrokeStyleDashed;
import com.yandex.div2.DivStrokeStyleDashedTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleDashedJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class y9 implements TemplateResolver<JSONObject, DivStrokeStyleDashedTemplate, DivStrokeStyleDashed> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3923a;

    public y9(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3923a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyleDashed resolve(@NotNull ParsingContext parsingContext, @NotNull DivStrokeStyleDashedTemplate divStrokeStyleDashedTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivStrokeStyleDashed();
    }
}
