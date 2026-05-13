package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPageTransformation;
import com.yandex.div2.DivPageTransformationTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPageTransformationJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class p2 implements TemplateResolver<JSONObject, DivPageTransformationTemplate, DivPageTransformation> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58965a;

    public p2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58965a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPageTransformation resolve(@NotNull ParsingContext parsingContext, @NotNull DivPageTransformationTemplate divPageTransformationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.c) {
            return new DivPageTransformation.c(this.f58965a.y5().getValue().resolve(parsingContext, ((DivPageTransformationTemplate.c) divPageTransformationTemplate).b(), jSONObject));
        }
        if (divPageTransformationTemplate instanceof DivPageTransformationTemplate.b) {
            return new DivPageTransformation.b(this.f58965a.v5().getValue().resolve(parsingContext, ((DivPageTransformationTemplate.b) divPageTransformationTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
