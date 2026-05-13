package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f1 implements TemplateResolver<JSONObject, DivFilterTemplate, DivFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58772a;

    public f1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58772a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFilter resolve(@NotNull ParsingContext parsingContext, @NotNull DivFilterTemplate divFilterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divFilterTemplate instanceof DivFilterTemplate.a) {
            return new DivFilter.a(this.f58772a.K1().getValue().resolve(parsingContext, ((DivFilterTemplate.a) divFilterTemplate).b(), jSONObject));
        }
        if (divFilterTemplate instanceof DivFilterTemplate.c) {
            return new DivFilter.c(this.f58772a.m3().getValue().resolve(parsingContext, ((DivFilterTemplate.c) divFilterTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
