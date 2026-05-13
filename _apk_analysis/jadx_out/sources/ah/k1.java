package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionFocusElement;
import com.yandex.div2.DivActionFocusElementTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionFocusElementJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class k1 implements TemplateResolver<JSONObject, DivActionFocusElementTemplate, DivActionFocusElement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3821a;

    public k1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3821a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionFocusElement resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionFocusElementTemplate divActionFocusElementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionFocusElement(JsonFieldResolver.resolveExpression(parsingContext, divActionFocusElementTemplate.f54310a, jSONObject, "element_id", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
