package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionDownload;
import com.yandex.div2.DivActionDownloadTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownloadJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class h1 implements TemplateResolver<JSONObject, DivActionDownloadTemplate, DivActionDownload> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3802a;

    public h1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3802a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDownload resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionDownloadTemplate divActionDownloadTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionDownload(JsonFieldResolver.resolveOptionalList(parsingContext, divActionDownloadTemplate.f54301a, jSONObject, "on_fail_actions", this.f3802a.w0(), this.f3802a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divActionDownloadTemplate.f54302b, jSONObject, "on_success_actions", this.f3802a.w0(), this.f3802a.u0()), JsonFieldResolver.resolveExpression(parsingContext, divActionDownloadTemplate.f54303c, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }
}
