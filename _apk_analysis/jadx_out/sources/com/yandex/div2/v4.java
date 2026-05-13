package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v4 implements TemplateResolver<JSONObject, DivTextRangeMaskTemplate, DivTextRangeMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59028a;

    public v4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59028a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeMask resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeMaskTemplate divTextRangeMaskTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.b) {
            return new DivTextRangeMask.b(this.f59028a.I8().getValue().resolve(parsingContext, ((DivTextRangeMaskTemplate.b) divTextRangeMaskTemplate).b(), jSONObject));
        }
        if (divTextRangeMaskTemplate instanceof DivTextRangeMaskTemplate.c) {
            return new DivTextRangeMask.c(this.f59028a.L8().getValue().resolve(parsingContext, ((DivTextRangeMaskTemplate.c) divTextRangeMaskTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
