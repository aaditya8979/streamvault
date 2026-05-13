package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionClearFocus;
import com.yandex.div2.DivActionClearFocusTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionClearFocusJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class y0 implements TemplateResolver<JSONObject, DivActionClearFocusTemplate, DivActionClearFocus> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3918a;

    public y0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3918a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionClearFocus resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionClearFocusTemplate divActionClearFocusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionClearFocus();
    }
}
