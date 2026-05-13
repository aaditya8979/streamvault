package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivNeighbourPageSize;
import com.yandex.div2.DivNeighbourPageSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNeighbourPageSizeJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class q6 implements TemplateResolver<JSONObject, DivNeighbourPageSizeTemplate, DivNeighbourPageSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3864a;

    public q6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3864a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivNeighbourPageSize resolve(@NotNull ParsingContext parsingContext, @NotNull DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivNeighbourPageSize((DivFixedSize) JsonFieldResolver.resolve(parsingContext, divNeighbourPageSizeTemplate.f56219a, jSONObject, "neighbour_page_width", this.f3864a.y3(), this.f3864a.w3()));
    }
}
