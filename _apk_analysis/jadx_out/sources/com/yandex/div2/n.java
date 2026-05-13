package com.yandex.div2;

import com.vungle.ads.internal.ui.AdActivity;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionSubmit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionSubmitJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements TemplateResolver<JSONObject, DivActionSubmitTemplate, DivActionSubmit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58919a;

    public n(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58919a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionSubmit resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionSubmitTemplate divActionSubmitTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivActionSubmit(JsonFieldResolver.resolveExpression(parsingContext, divActionSubmitTemplate.f54451a, jSONObject, "container_id", TypeHelpersKt.TYPE_HELPER_STRING), JsonFieldResolver.resolveOptionalList(parsingContext, divActionSubmitTemplate.f54452b, jSONObject, "on_fail_actions", this.f58919a.w0(), this.f58919a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, divActionSubmitTemplate.f54453c, jSONObject, "on_success_actions", this.f58919a.w0(), this.f58919a.u0()), (DivActionSubmit.Request) JsonFieldResolver.resolve(parsingContext, divActionSubmitTemplate.f54454d, jSONObject, AdActivity.REQUEST_KEY_EXTRA, this.f58919a.d1(), this.f58919a.b1()));
    }
}
