package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTypedValue;
import com.yandex.div2.DivTypedValueTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTypedValueJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f5 implements TemplateResolver<JSONObject, DivTypedValueTemplate, DivTypedValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58776a;

    public f5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58776a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTypedValue resolve(@NotNull ParsingContext parsingContext, @NotNull DivTypedValueTemplate divTypedValueTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.h) {
            return new DivTypedValue.h(this.f58776a.fa().getValue().resolve(parsingContext, ((DivTypedValueTemplate.h) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.f) {
            return new DivTypedValue.f(this.f58776a.K9().getValue().resolve(parsingContext, ((DivTypedValueTemplate.f) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.g) {
            return new DivTypedValue.g(this.f58776a.Q9().getValue().resolve(parsingContext, ((DivTypedValueTemplate.g) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.c) {
            return new DivTypedValue.c(this.f58776a.o().getValue().resolve(parsingContext, ((DivTypedValueTemplate.c) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.b) {
            return new DivTypedValue.b(this.f58776a.i().getValue().resolve(parsingContext, ((DivTypedValueTemplate.b) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.i) {
            return new DivTypedValue.i(this.f58776a.la().getValue().resolve(parsingContext, ((DivTypedValueTemplate.i) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.e) {
            return new DivTypedValue.e(this.f58776a.A().getValue().resolve(parsingContext, ((DivTypedValueTemplate.e) divTypedValueTemplate).b(), jSONObject));
        }
        if (divTypedValueTemplate instanceof DivTypedValueTemplate.a) {
            return new DivTypedValue.a(this.f58776a.c().getValue().resolve(parsingContext, ((DivTypedValueTemplate.a) divTypedValueTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
