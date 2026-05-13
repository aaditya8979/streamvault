package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputFilter;
import com.yandex.div2.DivInputFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements TemplateResolver<JSONObject, DivInputFilterTemplate, DivInputFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59019a;

    public u1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59019a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputFilter resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputFilterTemplate divInputFilterTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.c) {
            return new DivInputFilter.c(this.f59019a.r4().getValue().resolve(parsingContext, ((DivInputFilterTemplate.c) divInputFilterTemplate).b(), jSONObject));
        }
        if (divInputFilterTemplate instanceof DivInputFilterTemplate.b) {
            return new DivInputFilter.b(this.f59019a.l4().getValue().resolve(parsingContext, ((DivInputFilterTemplate.b) divInputFilterTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
