package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAnimator;
import com.yandex.div2.DivAnimatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAnimatorJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x implements TemplateResolver<JSONObject, DivAnimatorTemplate, DivAnimator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59047a;

    public x(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59047a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAnimator resolve(@NotNull ParsingContext parsingContext, @NotNull DivAnimatorTemplate divAnimatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.a) {
            return new DivAnimator.a(this.f59047a.l2().getValue().resolve(parsingContext, ((DivAnimatorTemplate.a) divAnimatorTemplate).b(), jSONObject));
        }
        if (divAnimatorTemplate instanceof DivAnimatorTemplate.c) {
            return new DivAnimator.c(this.f59047a.j5().getValue().resolve(parsingContext, ((DivAnimatorTemplate.c) divAnimatorTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
