package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivVariable;
import com.yandex.div2.DivVariableTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVariableJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class i5 implements TemplateResolver<JSONObject, DivVariableTemplate, DivVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58840a;

    public i5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58840a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVariable resolve(@NotNull ParsingContext parsingContext, @NotNull DivVariableTemplate divVariableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divVariableTemplate instanceof DivVariableTemplate.i) {
            return new DivVariable.i(this.f58840a.ia().getValue().resolve(parsingContext, ((DivVariableTemplate.i) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.g) {
            return new DivVariable.g(this.f58840a.T9().getValue().resolve(parsingContext, ((DivVariableTemplate.g) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.f) {
            return new DivVariable.f(this.f58840a.N9().getValue().resolve(parsingContext, ((DivVariableTemplate.f) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.b) {
            return new DivVariable.b(this.f58840a.l().getValue().resolve(parsingContext, ((DivVariableTemplate.b) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.c) {
            return new DivVariable.c(this.f58840a.r().getValue().resolve(parsingContext, ((DivVariableTemplate.c) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.j) {
            return new DivVariable.j(this.f58840a.oa().getValue().resolve(parsingContext, ((DivVariableTemplate.j) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.e) {
            return new DivVariable.e(this.f58840a.D().getValue().resolve(parsingContext, ((DivVariableTemplate.e) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.a) {
            return new DivVariable.a(this.f58840a.f().getValue().resolve(parsingContext, ((DivVariableTemplate.a) divVariableTemplate).b(), jSONObject));
        }
        if (divVariableTemplate instanceof DivVariableTemplate.h) {
            return new DivVariable.h(this.f58840a.Z9().getValue().resolve(parsingContext, ((DivVariableTemplate.h) divVariableTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
