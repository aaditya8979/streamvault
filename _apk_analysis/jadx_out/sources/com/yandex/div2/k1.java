package com.yandex.div2;

import androidx.compose.material.OutlinedTextFieldKt;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFocus;
import io.appmetrica.analytics.impl.A2;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class k1 implements TemplateResolver<JSONObject, DivFocusTemplate, DivFocus> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58854a;

    public k1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58854a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus resolve(@NotNull ParsingContext parsingContext, @NotNull DivFocusTemplate divFocusTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivFocus(JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.f55365a, jSONObject, A2.f64965g, this.f58854a.H1(), this.f58854a.F1()), (DivBorder) JsonFieldResolver.resolveOptional(parsingContext, divFocusTemplate.f55366b, jSONObject, OutlinedTextFieldKt.BorderId, this.f58854a.N1(), this.f58854a.L1()), (DivFocus.NextFocusIds) JsonFieldResolver.resolveOptional(parsingContext, divFocusTemplate.f55367c, jSONObject, "next_focus_ids", this.f58854a.E3(), this.f58854a.C3()), JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.f55368d, jSONObject, "on_blur", this.f58854a.w0(), this.f58854a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divFocusTemplate.f55369e, jSONObject, "on_focus", this.f58854a.w0(), this.f58854a.u0()));
    }
}
