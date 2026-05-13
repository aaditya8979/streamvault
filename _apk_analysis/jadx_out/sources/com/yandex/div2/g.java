package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivActionTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g implements TemplateResolver<JSONObject, DivActionTemplate.MenuItemTemplate, DivAction.MenuItem> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58777a;

    public g(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58777a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAction.MenuItem resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionTemplate.MenuItemTemplate menuItemTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivAction.MenuItem((DivAction) JsonFieldResolver.resolveOptional(parsingContext, menuItemTemplate.f54481a, jSONObject, "action", this.f58777a.w0(), this.f58777a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, menuItemTemplate.f54482b, jSONObject, "actions", this.f58777a.w0(), this.f58777a.u0()), JsonFieldResolver.resolveExpression(parsingContext, menuItemTemplate.f54483c, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
