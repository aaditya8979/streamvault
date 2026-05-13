package ah;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPageContentSize;
import com.yandex.div2.DivPageContentSizeTemplate;
import com.yandex.div2.JsonParserComponent;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageContentSizeJsonParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class y6 implements TemplateResolver<JSONObject, DivPageContentSizeTemplate, DivPageContentSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3921a;

    public y6(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3921a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageContentSize resolve(@NotNull ParsingContext parsingContext, @NotNull DivPageContentSizeTemplate divPageContentSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivPageContentSize();
    }
}
