package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFilterRtlMirror;
import com.yandex.div2.DivFilterRtlMirrorTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterRtlMirrorJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a4 implements TemplateResolver<JSONObject, DivFilterRtlMirrorTemplate, DivFilterRtlMirror> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3764a;

    public a4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3764a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilterRtlMirror resolve(@NotNull ParsingContext parsingContext, @NotNull DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivFilterRtlMirror();
    }
}
