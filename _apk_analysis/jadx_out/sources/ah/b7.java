package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPageSize;
import com.yandex.div2.DivPageSizeTemplate;
import com.yandex.div2.DivPercentageSize;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b7 implements TemplateResolver<JSONObject, DivPageSizeTemplate, DivPageSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3772a;

    public b7(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3772a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageSize resolve(@NotNull ParsingContext parsingContext, @NotNull DivPageSizeTemplate divPageSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivPageSize((DivPercentageSize) JsonFieldResolver.resolve(parsingContext, divPageSizeTemplate.f56287a, jSONObject, "page_width", this.f3772a.M5(), this.f3772a.K5()));
    }
}
