package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivPointTemplate;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class z7 implements TemplateResolver<JSONObject, DivPointTemplate, DivPoint> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3934a;

    public z7(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3934a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPoint resolve(@NotNull ParsingContext parsingContext, @NotNull DivPointTemplate divPointTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivPoint((DivDimension) JsonFieldResolver.resolve(parsingContext, divPointTemplate.f56568a, jSONObject, VastAttributes.HORIZONTAL_POSITION, this.f3934a.O2(), this.f3934a.M2()), (DivDimension) JsonFieldResolver.resolve(parsingContext, divPointTemplate.f56569b, jSONObject, VastAttributes.VERTICAL_POSITION, this.f3934a.O2(), this.f3934a.M2()));
    }
}
