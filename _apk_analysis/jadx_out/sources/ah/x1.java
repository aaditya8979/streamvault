package ah;

import com.vungle.ads.internal.ui.AdActivity;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.Serializer;
import com.yandex.div.serialization.TemplateDeserializer;
import com.yandex.div2.DivActionSubmitTemplate;
import com.yandex.div2.DivActionTemplate;
import com.yandex.div2.JsonParserComponent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements Serializer, TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3913a;

    public x1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3913a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmitTemplate deserialize(@NotNull ParsingContext parsingContext, @Nullable DivActionSubmitTemplate divActionSubmitTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        boolean allowPropertyOverride = parsingContext.getAllowPropertyOverride();
        ParsingContext parsingContextRestrictPropertyOverride = ParsingContextKt.restrictPropertyOverride(parsingContext);
        return new DivActionSubmitTemplate((Field<Expression<String>>) JsonFieldParser.readFieldWithExpression(parsingContextRestrictPropertyOverride, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING, allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.f54451a : null), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_fail_actions", allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.f54452b : null, this.f3913a.v0()), (Field<List<DivActionTemplate>>) JsonFieldParser.readOptionalListField(parsingContextRestrictPropertyOverride, jSONObject, "on_success_actions", allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.f54453c : null, this.f3913a.v0()), (Field<DivActionSubmitTemplate.RequestTemplate>) JsonFieldParser.readField(parsingContextRestrictPropertyOverride, jSONObject, AdActivity.REQUEST_KEY_EXTRA, allowPropertyOverride, divActionSubmitTemplate != null ? divActionSubmitTemplate.f54454d : null, this.f3913a.c1()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionSubmitTemplate divActionSubmitTemplate) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonFieldParser.writeExpressionField(parsingContext, jSONObject, "container_id", divActionSubmitTemplate.f54451a);
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_fail_actions", divActionSubmitTemplate.f54452b, this.f3913a.v0());
        JsonFieldParser.writeListField(parsingContext, jSONObject, "on_success_actions", divActionSubmitTemplate.f54453c, this.f3913a.v0());
        JsonFieldParser.writeField(parsingContext, jSONObject, AdActivity.REQUEST_KEY_EXTRA, divActionSubmitTemplate.f54454d, this.f3913a.c1());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "submit");
        return jSONObject;
    }
}
