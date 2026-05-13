package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDataJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements TemplateResolver<JSONObject, DivDataTemplate.StateTemplate, DivData.State> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59048a;

    public x0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59048a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivData.State resolve(@NotNull ParsingContext parsingContext, @NotNull DivDataTemplate.StateTemplate stateTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivData.State((Div) JsonFieldResolver.resolve(parsingContext, stateTemplate.f55113a, jSONObject, "div", this.f59048a.O4(), this.f59048a.M4()), ((Number) JsonFieldResolver.resolve(parsingContext, stateTemplate.f55114b, jSONObject, "state_id", ParsingConvertersKt.NUMBER_TO_INT)).longValue());
    }
}
