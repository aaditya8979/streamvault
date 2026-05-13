package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.ColorVariable;
import com.yandex.div2.ColorVariableTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: ColorVariableJsonParser.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements TemplateResolver<JSONObject, ColorVariableTemplate, ColorVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3867a;

    public r(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3867a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ColorVariable resolve(@NotNull ParsingContext parsingContext, @NotNull ColorVariableTemplate colorVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new ColorVariable((String) JsonFieldResolver.resolve(parsingContext, colorVariableTemplate.f54063a, jSONObject, "name"), JsonFieldResolver.resolveExpression(parsingContext, colorVariableTemplate.f54064b, jSONObject, "value", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
