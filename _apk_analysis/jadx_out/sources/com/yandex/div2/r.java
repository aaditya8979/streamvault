package com.yandex.div2;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionTyped;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58980a;

    public r(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58980a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionTyped deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1623648839:
                if (string.equals("set_variable")) {
                    return new DivActionTyped.q(this.f58980a.P0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -1623635702:
                if (string.equals("animator_start")) {
                    return new DivActionTyped.a(this.f58980a.K().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -1254965146:
                if (string.equals("clear_focus")) {
                    return new DivActionTyped.f(this.f58980a.Z().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -1160753574:
                if (string.equals("animator_stop")) {
                    return new DivActionTyped.b(this.f58980a.N().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -891535336:
                if (string.equals("submit")) {
                    return new DivActionTyped.s(this.f58980a.V0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -796594542:
                if (string.equals("set_stored_value")) {
                    return new DivActionTyped.p(this.f58980a.M0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -404256420:
                if (string.equals("copy_to_clipboard")) {
                    return new DivActionTyped.h(this.f58980a.f0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -326583939:
                if (string.equals("update_structure")) {
                    return new DivActionTyped.u(this.f58980a.k1().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 10055918:
                if (string.equals("array_set_value")) {
                    return new DivActionTyped.e(this.f58980a.W().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 110364485:
                if (string.equals("timer")) {
                    return new DivActionTyped.t(this.f58980a.e1().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new DivActionTyped.v(this.f58980a.n1().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 203934236:
                if (string.equals("array_remove_value")) {
                    return new DivActionTyped.d(this.f58980a.T().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 301532353:
                if (string.equals("show_tooltip")) {
                    return new DivActionTyped.r(this.f58980a.S0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 417790729:
                if (string.equals("scroll_by")) {
                    return new DivActionTyped.m(this.f58980a.A0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 417791277:
                if (string.equals("scroll_to")) {
                    return new DivActionTyped.n(this.f58980a.G0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 932090484:
                if (string.equals("set_state")) {
                    return new DivActionTyped.o(this.f58980a.J0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1427818632:
                if (string.equals(NativeAdPresenter.DOWNLOAD)) {
                    return new DivActionTyped.j(this.f58980a.l0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1550697109:
                if (string.equals("focus_element")) {
                    return new DivActionTyped.k(this.f58980a.o0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1587919371:
                if (string.equals("dict_set_value")) {
                    return new DivActionTyped.i(this.f58980a.i0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1715728902:
                if (string.equals("hide_tooltip")) {
                    return new DivActionTyped.l(this.f58980a.r0().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1811437713:
                if (string.equals("array_insert_value")) {
                    return new DivActionTyped.c(this.f58980a.Q().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivActionTypedTemplate divActionTypedTemplate = orThrow instanceof DivActionTypedTemplate ? (DivActionTypedTemplate) orThrow : null;
        if (divActionTypedTemplate != null) {
            return this.f58980a.j1().getValue().resolve(parsingContext, divActionTypedTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionTyped divActionTyped) throws ParsingException {
        if (divActionTyped instanceof DivActionTyped.a) {
            return this.f58980a.K().getValue().serialize(parsingContext, ((DivActionTyped.a) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.b) {
            return this.f58980a.N().getValue().serialize(parsingContext, ((DivActionTyped.b) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.c) {
            return this.f58980a.Q().getValue().serialize(parsingContext, ((DivActionTyped.c) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.d) {
            return this.f58980a.T().getValue().serialize(parsingContext, ((DivActionTyped.d) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.e) {
            return this.f58980a.W().getValue().serialize(parsingContext, ((DivActionTyped.e) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.f) {
            return this.f58980a.Z().getValue().serialize(parsingContext, ((DivActionTyped.f) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.h) {
            return this.f58980a.f0().getValue().serialize(parsingContext, ((DivActionTyped.h) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.i) {
            return this.f58980a.i0().getValue().serialize(parsingContext, ((DivActionTyped.i) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.j) {
            return this.f58980a.l0().getValue().serialize(parsingContext, ((DivActionTyped.j) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.k) {
            return this.f58980a.o0().getValue().serialize(parsingContext, ((DivActionTyped.k) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.l) {
            return this.f58980a.r0().getValue().serialize(parsingContext, ((DivActionTyped.l) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.m) {
            return this.f58980a.A0().getValue().serialize(parsingContext, ((DivActionTyped.m) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.n) {
            return this.f58980a.G0().getValue().serialize(parsingContext, ((DivActionTyped.n) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.o) {
            return this.f58980a.J0().getValue().serialize(parsingContext, ((DivActionTyped.o) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.p) {
            return this.f58980a.M0().getValue().serialize(parsingContext, ((DivActionTyped.p) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.q) {
            return this.f58980a.P0().getValue().serialize(parsingContext, ((DivActionTyped.q) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.r) {
            return this.f58980a.S0().getValue().serialize(parsingContext, ((DivActionTyped.r) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.s) {
            return this.f58980a.V0().getValue().serialize(parsingContext, ((DivActionTyped.s) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.t) {
            return this.f58980a.e1().getValue().serialize(parsingContext, ((DivActionTyped.t) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.u) {
            return this.f58980a.k1().getValue().serialize(parsingContext, ((DivActionTyped.u) divActionTyped).c());
        }
        if (divActionTyped instanceof DivActionTyped.v) {
            return this.f58980a.n1().getValue().serialize(parsingContext, ((DivActionTyped.v) divActionTyped).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
