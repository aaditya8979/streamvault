package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivTabsTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f4 implements TemplateResolver<JSONObject, DivTabsTemplate.ItemTemplate, DivTabs.Item> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58775a;

    public f4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58775a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTabs.Item resolve(@NotNull ParsingContext parsingContext, @NotNull DivTabsTemplate.ItemTemplate itemTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivTabs.Item((Div) JsonFieldResolver.resolve(parsingContext, itemTemplate.f57543a, jSONObject, "div", this.f58775a.O4(), this.f58775a.M4()), JsonFieldResolver.resolveExpression(parsingContext, itemTemplate.f57544b, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonFieldResolver.resolveOptional(parsingContext, itemTemplate.f57545c, jSONObject, "title_click_action", this.f58775a.w0(), this.f58775a.u0()));
    }
}
