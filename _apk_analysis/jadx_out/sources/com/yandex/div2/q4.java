package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class q4 implements TemplateResolver<JSONObject, DivTextRangeBackgroundTemplate, DivTextRangeBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58979a;

    public q4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58979a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTextRangeBackground resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.c) {
            return new DivTextRangeBackground.c(this.f58979a.s7().getValue().resolve(parsingContext, ((DivTextRangeBackgroundTemplate.c) divTextRangeBackgroundTemplate).b(), jSONObject));
        }
        if (divTextRangeBackgroundTemplate instanceof DivTextRangeBackgroundTemplate.a) {
            return new DivTextRangeBackground.a(this.f58979a.c2().getValue().resolve(parsingContext, ((DivTextRangeBackgroundTemplate.a) divTextRangeBackgroundTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
