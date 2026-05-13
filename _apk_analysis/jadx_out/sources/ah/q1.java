package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSetStoredValue;
import com.yandex.div2.DivActionSetStoredValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetStoredValueJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class q1 implements TemplateResolver<JSONObject, DivActionSetStoredValueTemplate, DivActionSetStoredValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3862a;

    public q1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3862a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetStoredValue resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionSetStoredValueTemplate divActionSetStoredValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionSetStoredValue(JsonFieldResolver.resolveExpression(parsingContext, divActionSetStoredValueTemplate.f54402a, jSONObject, "lifetime", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divActionSetStoredValueTemplate.f54403b, jSONObject, "name", TypeHelpersKt.TYPE_HELPER_STRING), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionSetStoredValueTemplate.f54404c, jSONObject, "value", this.f3862a.j9(), this.f3862a.h9()));
    }
}
