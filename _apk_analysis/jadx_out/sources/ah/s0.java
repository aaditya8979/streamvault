package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionArrayRemoveValue;
import com.yandex.div2.DivActionArrayRemoveValueTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayRemoveValueJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 implements TemplateResolver<JSONObject, DivActionArrayRemoveValueTemplate, DivActionArrayRemoveValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3876a;

    public s0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3876a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayRemoveValue resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionArrayRemoveValue(JsonFieldResolver.resolveExpression(parsingContext, divActionArrayRemoveValueTemplate.f54248a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonFieldResolver.resolveExpression(parsingContext, divActionArrayRemoveValueTemplate.f54249b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
