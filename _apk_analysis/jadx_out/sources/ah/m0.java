package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionAnimatorStop;
import com.yandex.div2.DivActionAnimatorStopTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStopJsonParser.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class m0 implements TemplateResolver<JSONObject, DivActionAnimatorStopTemplate, DivActionAnimatorStop> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3831a;

    public m0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3831a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionAnimatorStop resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionAnimatorStop((String) JsonFieldResolver.resolve(parsingContext, divActionAnimatorStopTemplate.f54229a, jSONObject, "animator_id"));
    }
}
