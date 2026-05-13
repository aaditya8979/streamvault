package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputMask;
import com.yandex.div2.DivInputMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputMaskJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements TemplateResolver<JSONObject, DivInputMaskTemplate, DivInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59049a;

    public x1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59049a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputMask resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputMaskTemplate divInputMaskTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.c) {
            return new DivInputMask.c(this.f59049a.s3().getValue().resolve(parsingContext, ((DivInputMaskTemplate.c) divInputMaskTemplate).b(), jSONObject));
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.b) {
            return new DivInputMask.b(this.f59049a.A2().getValue().resolve(parsingContext, ((DivInputMaskTemplate.b) divInputMaskTemplate).b(), jSONObject));
        }
        if (divInputMaskTemplate instanceof DivInputMaskTemplate.d) {
            return new DivInputMask.d(this.f59049a.P5().getValue().resolve(parsingContext, ((DivInputMaskTemplate.d) divInputMaskTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
