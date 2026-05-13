package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivEvaluableType;
import com.yandex.div2.DivFunctionArgument;
import com.yandex.div2.DivFunctionArgumentTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j4 implements TemplateResolver<JSONObject, DivFunctionArgumentTemplate, DivFunctionArgument> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3816a;

    public j4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3816a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFunctionArgument resolve(@NotNull ParsingContext parsingContext, @NotNull DivFunctionArgumentTemplate divFunctionArgumentTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivFunctionArgument((String) JsonFieldResolver.resolve(parsingContext, divFunctionArgumentTemplate.f55392a, jSONObject, "name"), (DivEvaluableType) JsonFieldResolver.resolve(parsingContext, divFunctionArgumentTemplate.f55393b, jSONObject, "type", DivEvaluableType.FROM_STRING));
    }
}
