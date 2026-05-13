package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRadiusTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRadiusJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h3 implements TemplateResolver<JSONObject, DivRadialGradientRadiusTemplate, DivRadialGradientRadius> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58815a;

    public h3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58815a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientRadius resolve(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientRadiusTemplate divRadialGradientRadiusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.b) {
            return new DivRadialGradientRadius.b(this.f58815a.y3().getValue().resolve(parsingContext, ((DivRadialGradientRadiusTemplate.b) divRadialGradientRadiusTemplate).b(), jSONObject));
        }
        if (divRadialGradientRadiusTemplate instanceof DivRadialGradientRadiusTemplate.c) {
            return new DivRadialGradientRadius.c(this.f58815a.w6().getValue().resolve(parsingContext, ((DivRadialGradientRadiusTemplate.c) divRadialGradientRadiusTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
