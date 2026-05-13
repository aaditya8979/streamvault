package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTooltipModeModal;
import com.yandex.div2.DivTooltipModeModalTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeModalJsonParser.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ob implements TemplateResolver<JSONObject, DivTooltipModeModalTemplate, DivTooltipModeModal> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3851a;

    public ob(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3851a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeModal resolve(@NotNull ParsingContext parsingContext, @NotNull DivTooltipModeModalTemplate divTooltipModeModalTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivTooltipModeModal();
    }
}
