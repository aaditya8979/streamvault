package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j2 implements TemplateResolver<JSONObject, DivTemplate, Div> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58844a;

    public j2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58844a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Div resolve(@NotNull ParsingContext parsingContext, @NotNull DivTemplate divTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divTemplate instanceof DivTemplate.g) {
            return new Div.g(this.f58844a.Z3().getValue().resolve(parsingContext, ((DivTemplate.g) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.e) {
            return new Div.e(this.f58844a.Q3().getValue().resolve(parsingContext, ((DivTemplate.e) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.q) {
            return new Div.q(this.f58844a.r8().getValue().resolve(parsingContext, ((DivTemplate.q) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.l) {
            return new Div.l(this.f58844a.O6().getValue().resolve(parsingContext, ((DivTemplate.l) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.b) {
            return new Div.b(this.f58844a.o2().getValue().resolve(parsingContext, ((DivTemplate.b) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.f) {
            return new Div.f(this.f58844a.T3().getValue().resolve(parsingContext, ((DivTemplate.f) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.d) {
            return new Div.d(this.f58844a.N3().getValue().resolve(parsingContext, ((DivTemplate.d) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.j) {
            return new Div.j(this.f58844a.B5().getValue().resolve(parsingContext, ((DivTemplate.j) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.p) {
            return new Div.p(this.f58844a.W7().getValue().resolve(parsingContext, ((DivTemplate.p) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.n) {
            return new Div.n(this.f58844a.v7().getValue().resolve(parsingContext, ((DivTemplate.n) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.c) {
            return new Div.c(this.f58844a.D2().getValue().resolve(parsingContext, ((DivTemplate.c) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.h) {
            return new Div.h(this.f58844a.f4().getValue().resolve(parsingContext, ((DivTemplate.h) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.m) {
            return new Div.m(this.f58844a.j7().getValue().resolve(parsingContext, ((DivTemplate.m) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.o) {
            return new Div.o(this.f58844a.Q7().getValue().resolve(parsingContext, ((DivTemplate.o) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.i) {
            return new Div.i(this.f58844a.u4().getValue().resolve(parsingContext, ((DivTemplate.i) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.k) {
            return new Div.k(this.f58844a.F6().getValue().resolve(parsingContext, ((DivTemplate.k) divTemplate).b(), jSONObject));
        }
        if (divTemplate instanceof DivTemplate.r) {
            return new Div.r(this.f58844a.p9().getValue().resolve(parsingContext, ((DivTemplate.r) divTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
