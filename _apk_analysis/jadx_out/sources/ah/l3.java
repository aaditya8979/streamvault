package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivDownloadCallbacks;
import com.yandex.div2.DivDownloadCallbacksTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDownloadCallbacksJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class l3 implements TemplateResolver<JSONObject, DivDownloadCallbacksTemplate, DivDownloadCallbacks> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3827a;

    public l3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3827a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDownloadCallbacks resolve(@NotNull ParsingContext parsingContext, @NotNull DivDownloadCallbacksTemplate divDownloadCallbacksTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivDownloadCallbacks(JsonFieldResolver.resolveOptionalList(parsingContext, divDownloadCallbacksTemplate.f55183a, jSONObject, "on_fail_actions", this.f3827a.w0(), this.f3827a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divDownloadCallbacksTemplate.f55184b, jSONObject, "on_success_actions", this.f3827a.w0(), this.f3827a.u0()));
    }
}
