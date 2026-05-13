package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTooltipModeNonModal;
import com.yandex.div2.DivTooltipModeNonModalTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeNonModalJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class rb implements TemplateResolver<JSONObject, DivTooltipModeNonModalTemplate, DivTooltipModeNonModal> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3873a;

    public rb(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3873a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipModeNonModal resolve(@NotNull ParsingContext parsingContext, @NotNull DivTooltipModeNonModalTemplate divTooltipModeNonModalTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivTooltipModeNonModal();
    }
}
