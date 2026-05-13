package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextGradientTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextGradientJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m4 implements TemplateResolver<JSONObject, DivTextGradientTemplate, DivTextGradient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58907a;

    public m4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58907a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextGradient resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextGradientTemplate divTextGradientTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.b) {
            return new DivTextGradient.b(this.f58907a.X4().getValue().resolve(parsingContext, ((DivTextGradientTemplate.b) divTextGradientTemplate).b(), jSONObject));
        }
        if (divTextGradientTemplate instanceof DivTextGradientTemplate.c) {
            return new DivTextGradient.c(this.f58907a.n6().getValue().resolve(parsingContext, ((DivTextGradientTemplate.c) divTextGradientTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
