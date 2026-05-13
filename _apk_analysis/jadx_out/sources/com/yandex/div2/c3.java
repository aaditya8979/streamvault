package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientCenterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientCenterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c3 implements TemplateResolver<JSONObject, DivRadialGradientCenterTemplate, DivRadialGradientCenter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58736a;

    public c3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58736a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivRadialGradientCenter resolve(@NotNull ParsingContext parsingContext, @NotNull DivRadialGradientCenterTemplate divRadialGradientCenterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.b) {
            return new DivRadialGradientCenter.b(this.f58736a.k6().getValue().resolve(parsingContext, ((DivRadialGradientCenterTemplate.b) divRadialGradientCenterTemplate).b(), jSONObject));
        }
        if (divRadialGradientCenterTemplate instanceof DivRadialGradientCenterTemplate.c) {
            return new DivRadialGradientCenter.c(this.f58736a.t6().getValue().resolve(parsingContext, ((DivRadialGradientCenterTemplate.c) divRadialGradientCenterTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
