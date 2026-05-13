package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionArraySetValue;
import com.yandex.div2.DivActionArraySetValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArraySetValueJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class v0 implements TemplateResolver<JSONObject, DivActionArraySetValueTemplate, DivActionArraySetValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3899a;

    public v0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3899a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArraySetValue resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionArraySetValueTemplate divActionArraySetValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionArraySetValue(JsonFieldResolver.resolveExpression(parsingContext, divActionArraySetValueTemplate.f54258a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionArraySetValueTemplate.f54259b, jSONObject, "value", this.f3899a.j9(), this.f3899a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionArraySetValueTemplate.f54260c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
