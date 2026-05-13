package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivAppearanceTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivAppearanceTransitionJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements TemplateResolver<JSONObject, DivAppearanceTransitionTemplate, DivAppearanceTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58714a;

    public b0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58714a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivAppearanceTransition resolve(@NotNull ParsingContext parsingContext, @NotNull DivAppearanceTransitionTemplate divAppearanceTransitionTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.d) {
            return new DivAppearanceTransition.d(this.f58714a.y1().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.d) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.b) {
            return new DivAppearanceTransition.b(this.f58714a.g3().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.b) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.c) {
            return new DivAppearanceTransition.c(this.f58714a.C6().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.c) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        if (divAppearanceTransitionTemplate instanceof DivAppearanceTransitionTemplate.e) {
            return new DivAppearanceTransition.e(this.f58714a.g7().getValue().resolve(parsingContext, ((DivAppearanceTransitionTemplate.e) divAppearanceTransitionTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
