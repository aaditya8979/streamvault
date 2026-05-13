package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionArrayInsertValue;
import com.yandex.div2.DivActionArrayInsertValueTemplate;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionArrayInsertValueJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class p0 implements TemplateResolver<JSONObject, DivActionArrayInsertValueTemplate, DivActionArrayInsertValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3854a;

    public p0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3854a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionArrayInsertValue resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionArrayInsertValue(JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionArrayInsertValueTemplate.f54238a, jSONObject, "index", TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), (DivTypedValue) JsonFieldResolver.resolve(parsingContext, divActionArrayInsertValueTemplate.f54239b, jSONObject, "value", this.f3854a.j9(), this.f3854a.h9()), JsonFieldResolver.resolveExpression(parsingContext, divActionArrayInsertValueTemplate.f54240c, jSONObject, "variable_name", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
