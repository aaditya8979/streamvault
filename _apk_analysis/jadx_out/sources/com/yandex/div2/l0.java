package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivChangeTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements TemplateResolver<JSONObject, DivChangeTransitionTemplate, DivChangeTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58868a;

    public l0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58868a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivChangeTransition resolve(@NotNull ParsingContext parsingContext, @NotNull DivChangeTransitionTemplate divChangeTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.c) {
            return new DivChangeTransition.c(this.f58868a.T1().getValue().resolve(parsingContext, ((DivChangeTransitionTemplate.c) divChangeTransitionTemplate).b(), jSONObject));
        }
        if (divChangeTransitionTemplate instanceof DivChangeTransitionTemplate.a) {
            return new DivChangeTransition.a(this.f58868a.Q1().getValue().resolve(parsingContext, ((DivChangeTransitionTemplate.a) divChangeTransitionTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
