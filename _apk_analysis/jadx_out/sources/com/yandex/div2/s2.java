package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPagerLayoutMode;
import com.yandex.div2.DivPagerLayoutModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPagerLayoutModeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s2 implements TemplateResolver<JSONObject, DivPagerLayoutModeTemplate, DivPagerLayoutMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59000a;

    public s2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59000a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPagerLayoutMode resolve(@NotNull ParsingContext parsingContext, @NotNull DivPagerLayoutModeTemplate divPagerLayoutModeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.d) {
            return new DivPagerLayoutMode.d(this.f59000a.p5().getValue().resolve(parsingContext, ((DivPagerLayoutModeTemplate.d) divPagerLayoutModeTemplate).b(), jSONObject));
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.b) {
            return new DivPagerLayoutMode.b(this.f59000a.d5().getValue().resolve(parsingContext, ((DivPagerLayoutModeTemplate.b) divPagerLayoutModeTemplate).b(), jSONObject));
        }
        if (divPagerLayoutModeTemplate instanceof DivPagerLayoutModeTemplate.c) {
            return new DivPagerLayoutMode.c(this.f59000a.m5().getValue().resolve(parsingContext, ((DivPagerLayoutModeTemplate.c) divPagerLayoutModeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
