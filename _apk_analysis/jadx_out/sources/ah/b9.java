package ah;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeDrawable;
import com.yandex.div2.DivShapeDrawableTemplate;
import com.yandex.div2.DivStroke;
import com.yandex.div2.JsonParserComponent;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b9 implements TemplateResolver<JSONObject, DivShapeDrawableTemplate, DivShapeDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f3773a;

    public b9(@NotNull JsonParserComponent jsonParserComponent) {
        this.f3773a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShapeDrawable resolve(@NotNull ParsingContext parsingContext, @NotNull DivShapeDrawableTemplate divShapeDrawableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivShapeDrawable(JsonFieldResolver.resolveExpression(parsingContext, divShapeDrawableTemplate.f56939a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT), (DivShape) JsonFieldResolver.resolve(parsingContext, divShapeDrawableTemplate.f56940b, jSONObject, "shape", this.f3773a.X6(), this.f3773a.V6()), (DivStroke) JsonFieldResolver.resolveOptional(parsingContext, divShapeDrawableTemplate.f56941c, jSONObject, VastAttributes.STROKE_COLOR, this.f3773a.E7(), this.f3773a.C7()));
    }
}
