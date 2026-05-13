package ah;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionDownloadTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDownloadJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class g1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3796a;

    public g1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3796a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDownloadTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionDownloadTemplate divActionDownloadTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionDownloadTemplate(JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, divActionDownloadTemplate != null ? divActionDownloadTemplate.f54301a : null, this.f3796a.v0()), JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, divActionDownloadTemplate != null ? divActionDownloadTemplate.f54302b : null, this.f3796a.v0()), JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, allowPropertyOverride, divActionDownloadTemplate != null ? divActionDownloadTemplate.f54303c : null, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionDownloadTemplate divActionDownloadTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divActionDownloadTemplate.f54301a, this.f3796a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divActionDownloadTemplate.f54302b, this.f3796a.v0());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", NativeAdPresenter.DOWNLOAD);
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "url", divActionDownloadTemplate.f54303c, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
