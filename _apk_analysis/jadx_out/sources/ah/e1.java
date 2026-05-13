package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionDictSetValue;
import com.yandex.div2.DivActionDictSetValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionDictSetValueJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e1 implements TemplateResolver<JSONObject, DivActionDictSetValueTemplate, DivActionDictSetValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3786a;

    public e1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3786a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionDictSetValue resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionDictSetValueTemplate divActionDictSetValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        Field<Expression<String>> field = divActionDictSetValueTemplate.f54290a;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivActionDictSetValue(JsonFieldResolver.resolveExpression(parsingContext, field, jSONObject, "key", typeHelper), (DivTypedValue) JsonFieldResolver.resolveOptional(parsingContext, divActionDictSetValueTemplate.f54291b, jSONObject, "value", this.f3786a.j9(), this.f3786a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionDictSetValueTemplate.f54292c, jSONObject, "variable_name", typeHelper));
    }
}
