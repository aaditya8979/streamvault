package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputFilterExpression;
import com.yandex.div2.DivInputFilterExpressionTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterExpressionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s5 implements TemplateResolver<JSONObject, DivInputFilterExpressionTemplate, DivInputFilterExpression> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3879a;

    public s5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3879a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilterExpression resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputFilterExpressionTemplate divInputFilterExpressionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivInputFilterExpression(JsonFieldResolver.resolveExpression(parsingContext, divInputFilterExpressionTemplate.f56012a, jSONObject, "condition", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN));
    }
}
