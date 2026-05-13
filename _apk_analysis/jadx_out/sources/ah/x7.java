package ah;

import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPointJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x7 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3915a;

    public x7(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3915a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPoint deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivPoint((DivDimension) JsonPropertyParser.read(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, this.f3915a.M2()), (DivDimension) JsonPropertyParser.read(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, this.f3915a.M2()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivPoint divPoint) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.HORIZONTAL_POSITION, divPoint.f56563a, this.f3915a.M2());
        JsonPropertyParser.write(parsingContext, jSONObject, VastAttributes.VERTICAL_POSITION, divPoint.f56564b, this.f3915a.M2());
        return jSONObject;
    }
}
