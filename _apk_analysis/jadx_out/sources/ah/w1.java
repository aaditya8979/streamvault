package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionShowTooltip;
import com.yandex.div2.DivActionShowTooltipTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionShowTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements TemplateResolver<JSONObject, DivActionShowTooltipTemplate, DivActionShowTooltip> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3906a;

    public w1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3906a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionShowTooltip resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionShowTooltipTemplate divActionShowTooltipTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionShowTooltip(JsonFieldResolver.resolveExpression(parsingContext, divActionShowTooltipTemplate.f54421a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalExpression(parsingContext, divActionShowTooltipTemplate.f54422b, jSONObject, "multiple", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
