package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivWrapContentSize;
import com.yandex.div2.DivWrapContentSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivWrapContentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class gc implements TemplateResolver<JSONObject, DivWrapContentSizeTemplate, DivWrapContentSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3799a;

    public gc(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3799a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivWrapContentSize resolve(@NotNull ParsingContext parsingContext, @NotNull DivWrapContentSizeTemplate divWrapContentSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivWrapContentSize(JsonFieldResolver.resolveOptionalExpression(parsingContext, divWrapContentSizeTemplate.f58276a, jSONObject, "constrained", TypeHelpersKt.TYPE_HELPER_BOOLEAN, ParsingConvertersKt.ANY_TO_BOOLEAN), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divWrapContentSizeTemplate.f58277b, jSONObject, "max_size", this.f3799a.d7(), this.f3799a.b7()), (DivSizeUnitValue) JsonFieldResolver.resolveOptional(parsingContext, divWrapContentSizeTemplate.f58278c, jSONObject, "min_size", this.f3799a.d7(), this.f3799a.b7()));
    }
}
