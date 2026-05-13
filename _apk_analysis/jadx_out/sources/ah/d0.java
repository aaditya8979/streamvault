package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DictVariable;
import com.yandex.div2.DictVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DictVariableJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class d0 implements TemplateResolver<JSONObject, DictVariableTemplate, DictVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3781a;

    public d0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3781a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DictVariable resolve(@NotNull ParsingContext parsingContext, @NotNull DictVariableTemplate dictVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DictVariable((String) JsonFieldResolver.resolve(parsingContext, dictVariableTemplate.f54093a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, dictVariableTemplate.f54094b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_DICT));
    }
}
