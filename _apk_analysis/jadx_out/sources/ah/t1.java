package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSetVariable;
import com.yandex.div2.DivActionSetVariableTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSetVariableJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t1 implements TemplateResolver<JSONObject, DivActionSetVariableTemplate, DivActionSetVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3885a;

    public t1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3885a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSetVariable resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionSetVariableTemplate divActionSetVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionSetVariable((DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionSetVariableTemplate.f54412a, jSONObject, "value", this.f3885a.j9(), this.f3885a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionSetVariableTemplate.f54413b, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
