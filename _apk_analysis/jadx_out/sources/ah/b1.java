package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionCopyToClipboard;
import com.yandex.div2.DivActionCopyToClipboardContent;
import com.yandex.div2.DivActionCopyToClipboardTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b1 implements TemplateResolver<JSONObject, DivActionCopyToClipboardTemplate, DivActionCopyToClipboard> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3771a;

    public b1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3771a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboard resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionCopyToClipboard((DivActionCopyToClipboardContent) JsonFieldResolver.resolve(parsingContext, divActionCopyToClipboardTemplate.f54281a, jSONObject, "content", this.f3771a.e0(), this.f3771a.c0()));
    }
}
