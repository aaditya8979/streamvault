package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInfinityCount;
import com.yandex.div2.DivInfinityCountTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInfinityCountJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class p5 implements TemplateResolver<JSONObject, DivInfinityCountTemplate, DivInfinityCount> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3856a;

    public p5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3856a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInfinityCount resolve(@NotNull ParsingContext parsingContext, @NotNull DivInfinityCountTemplate divInfinityCountTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivInfinityCount();
    }
}
