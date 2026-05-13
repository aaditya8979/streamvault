package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivCurrencyInputMask;
import com.yandex.div2.DivCurrencyInputMaskTemplate;
import com.yandex.div2.JsonParserComponent;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a3 implements TemplateResolver<JSONObject, DivCurrencyInputMaskTemplate, DivCurrencyInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3763a;

    public a3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3763a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCurrencyInputMask resolve(@NotNull ParsingContext parsingContext, @NotNull DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivCurrencyInputMask(JsonFieldResolver.resolveOptionalExpression(parsingContext, divCurrencyInputMaskTemplate.f55008a, jSONObject, CommonUrlParts.LOCALE, TypeHelpersKt.TYPE_HELPER_STRING), (String) JsonFieldResolver.resolve(parsingContext, divCurrencyInputMaskTemplate.f55009b, jSONObject, "raw_text_variable"));
    }
}
