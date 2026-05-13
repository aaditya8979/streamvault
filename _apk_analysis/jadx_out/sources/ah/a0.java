package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DictValue;
import com.yandex.div2.DictValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictValueJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements TemplateResolver<JSONObject, DictValueTemplate, DictValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3761a;

    public a0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3761a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DictValue resolve(@NotNull ParsingContext parsingContext, @NotNull DictValueTemplate dictValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DictValue(JsonFieldResolver.resolveExpression(parsingContext, dictValueTemplate.f54085a, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }
}
