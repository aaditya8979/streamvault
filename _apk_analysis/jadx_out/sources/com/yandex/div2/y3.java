package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivState;
import com.yandex.div2.DivStateTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStateJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y3 implements TemplateResolver<JSONObject, DivStateTemplate.StateTemplate, DivState.State> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59069a;

    public y3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59069a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivState.State resolve(@NotNull ParsingContext parsingContext, @NotNull DivStateTemplate.StateTemplate stateTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivState.State((DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.f57253a, jSONObject, "animation_in", this.f59069a.s1(), this.f59069a.q1()), (DivAnimation) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.f57254b, jSONObject, "animation_out", this.f59069a.s1(), this.f59069a.q1()), (Div) JsonFieldResolver.resolveOptional(parsingContext, stateTemplate.f57255c, jSONObject, "div", this.f59069a.O4(), this.f59069a.M4()), (String) JsonFieldResolver.resolve(parsingContext, stateTemplate.f57256d, jSONObject, "state_id"), JsonFieldResolver.resolveOptionalList(parsingContext, stateTemplate.f57257e, jSONObject, "swipe_out_actions", this.f59069a.w0(), this.f59069a.u0()));
    }
}
