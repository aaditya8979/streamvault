package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionHideTooltip;
import com.yandex.div2.DivActionHideTooltipTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionHideTooltipJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class n1 implements TemplateResolver<JSONObject, DivActionHideTooltipTemplate, DivActionHideTooltip> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3839a;

    public n1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3839a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionHideTooltip resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionHideTooltipTemplate divActionHideTooltipTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionHideTooltip(JsonFieldResolver.resolveExpression(parsingContext, divActionHideTooltipTemplate.f54317a, jSONObject, "id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
