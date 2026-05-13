package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivCountTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCountJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements TemplateResolver<JSONObject, DivCountTemplate, DivCount> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59018a;

    public u0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59018a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivCount resolve(@NotNull ParsingContext parsingContext, @NotNull DivCountTemplate divCountTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divCountTemplate instanceof DivCountTemplate.c) {
            return new DivCount.c(this.f59018a.i4().getValue().resolve(parsingContext, ((DivCountTemplate.c) divCountTemplate).b(), jSONObject));
        }
        if (divCountTemplate instanceof DivCountTemplate.b) {
            return new DivCount.b(this.f59018a.p3().getValue().resolve(parsingContext, ((DivCountTemplate.b) divCountTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
