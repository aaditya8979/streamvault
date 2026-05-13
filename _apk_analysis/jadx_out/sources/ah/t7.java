package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPhoneInputMask;
import com.yandex.div2.DivPhoneInputMaskTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t7 implements TemplateResolver<JSONObject, DivPhoneInputMaskTemplate, DivPhoneInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3889a;

    public t7(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3889a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPhoneInputMask resolve(@NotNull ParsingContext parsingContext, @NotNull DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivPhoneInputMask((String) JsonFieldResolver.resolve(parsingContext, divPhoneInputMaskTemplate.f56527a, jSONObject, "raw_text_variable"));
    }
}
