package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBackgroundTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBackgroundJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements TemplateResolver<JSONObject, DivBackgroundTemplate, DivBackground> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58771a;

    public f0(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58771a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivBackground resolve(@NotNull ParsingContext parsingContext, @NotNull DivBackgroundTemplate divBackgroundTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.c) {
            return new DivBackground.c(this.f58771a.X4().getValue().resolve(parsingContext, ((DivBackgroundTemplate.c) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.e) {
            return new DivBackground.e(this.f58771a.n6().getValue().resolve(parsingContext, ((DivBackgroundTemplate.e) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.b) {
            return new DivBackground.b(this.f58771a.W3().getValue().resolve(parsingContext, ((DivBackgroundTemplate.b) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.f) {
            return new DivBackground.f(this.f58771a.s7().getValue().resolve(parsingContext, ((DivBackgroundTemplate.f) divBackgroundTemplate).b(), jSONObject));
        }
        if (divBackgroundTemplate instanceof DivBackgroundTemplate.d) {
            return new DivBackground.d(this.f58771a.g5().getValue().resolve(parsingContext, ((DivBackgroundTemplate.d) divBackgroundTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
