package com.yandex.div2;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivActionTypedTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58997a;

    public s(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58997a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionTypedTemplate deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String type;
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        EntityTemplate entityTemplate = parsingContext.getTemplates().get(string);
        DivActionTypedTemplate divActionTypedTemplate = entityTemplate instanceof DivActionTypedTemplate ? (DivActionTypedTemplate) entityTemplate : null;
        if (divActionTypedTemplate != null && (type = divActionTypedTemplate.getType()) != null) {
            string = type;
        }
        switch (string.hashCode()) {
            case -1623648839:
                if (string.equals("set_variable")) {
                    return new DivActionTypedTemplate.q(this.f58997a.Q0().getValue().deserialize(parsingContext, (DivActionSetVariableTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -1623635702:
                if (string.equals("animator_start")) {
                    return new DivActionTypedTemplate.a(this.f58997a.L().getValue().deserialize(parsingContext, (DivActionAnimatorStartTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -1254965146:
                if (string.equals("clear_focus")) {
                    return new DivActionTypedTemplate.f(this.f58997a.a0().getValue().deserialize(parsingContext, (DivActionClearFocusTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -1160753574:
                if (string.equals("animator_stop")) {
                    return new DivActionTypedTemplate.b(this.f58997a.O().getValue().deserialize(parsingContext, (DivActionAnimatorStopTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -891535336:
                if (string.equals("submit")) {
                    return new DivActionTypedTemplate.s(this.f58997a.W0().getValue().deserialize(parsingContext, (DivActionSubmitTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -796594542:
                if (string.equals("set_stored_value")) {
                    return new DivActionTypedTemplate.p(this.f58997a.N0().getValue().deserialize(parsingContext, (DivActionSetStoredValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -404256420:
                if (string.equals("copy_to_clipboard")) {
                    return new DivActionTypedTemplate.h(this.f58997a.g0().getValue().deserialize(parsingContext, (DivActionCopyToClipboardTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case -326583939:
                if (string.equals("update_structure")) {
                    return new DivActionTypedTemplate.u(this.f58997a.l1().getValue().deserialize(parsingContext, (DivActionUpdateStructureTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 10055918:
                if (string.equals("array_set_value")) {
                    return new DivActionTypedTemplate.e(this.f58997a.X().getValue().deserialize(parsingContext, (DivActionArraySetValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 110364485:
                if (string.equals("timer")) {
                    return new DivActionTypedTemplate.t(this.f58997a.f1().getValue().deserialize(parsingContext, (DivActionTimerTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new DivActionTypedTemplate.v(this.f58997a.o1().getValue().deserialize(parsingContext, (DivActionVideoTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 203934236:
                if (string.equals("array_remove_value")) {
                    return new DivActionTypedTemplate.d(this.f58997a.U().getValue().deserialize(parsingContext, (DivActionArrayRemoveValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 301532353:
                if (string.equals("show_tooltip")) {
                    return new DivActionTypedTemplate.r(this.f58997a.T0().getValue().deserialize(parsingContext, (DivActionShowTooltipTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 417790729:
                if (string.equals("scroll_by")) {
                    return new DivActionTypedTemplate.m(this.f58997a.B0().getValue().deserialize(parsingContext, (DivActionScrollByTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 417791277:
                if (string.equals("scroll_to")) {
                    return new DivActionTypedTemplate.n(this.f58997a.H0().getValue().deserialize(parsingContext, (DivActionScrollToTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 932090484:
                if (string.equals("set_state")) {
                    return new DivActionTypedTemplate.o(this.f58997a.K0().getValue().deserialize(parsingContext, (DivActionSetStateTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1427818632:
                if (string.equals(NativeAdPresenter.DOWNLOAD)) {
                    return new DivActionTypedTemplate.j(this.f58997a.m0().getValue().deserialize(parsingContext, (DivActionDownloadTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1550697109:
                if (string.equals("focus_element")) {
                    return new DivActionTypedTemplate.k(this.f58997a.p0().getValue().deserialize(parsingContext, (DivActionFocusElementTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1587919371:
                if (string.equals("dict_set_value")) {
                    return new DivActionTypedTemplate.i(this.f58997a.j0().getValue().deserialize(parsingContext, (DivActionDictSetValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1715728902:
                if (string.equals("hide_tooltip")) {
                    return new DivActionTypedTemplate.l(this.f58997a.s0().getValue().deserialize(parsingContext, (DivActionHideTooltipTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
            case 1811437713:
                if (string.equals("array_insert_value")) {
                    return new DivActionTypedTemplate.c(this.f58997a.R().getValue().deserialize(parsingContext, (DivActionArrayInsertValueTemplate) (divActionTypedTemplate != null ? divActionTypedTemplate.a() : null), jSONObject));
                }
                break;
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivActionTypedTemplate divActionTypedTemplate) throws ParsingException {
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.a) {
            return this.f58997a.L().getValue().serialize(parsingContext, ((DivActionTypedTemplate.a) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.b) {
            return this.f58997a.O().getValue().serialize(parsingContext, ((DivActionTypedTemplate.b) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.c) {
            return this.f58997a.R().getValue().serialize(parsingContext, ((DivActionTypedTemplate.c) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.d) {
            return this.f58997a.U().getValue().serialize(parsingContext, ((DivActionTypedTemplate.d) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.e) {
            return this.f58997a.X().getValue().serialize(parsingContext, ((DivActionTypedTemplate.e) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.f) {
            return this.f58997a.a0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.f) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.h) {
            return this.f58997a.g0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.h) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.i) {
            return this.f58997a.j0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.i) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.j) {
            return this.f58997a.m0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.j) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.k) {
            return this.f58997a.p0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.k) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.l) {
            return this.f58997a.s0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.l) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.m) {
            return this.f58997a.B0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.m) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.n) {
            return this.f58997a.H0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.n) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.o) {
            return this.f58997a.K0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.o) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.p) {
            return this.f58997a.N0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.p) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.q) {
            return this.f58997a.Q0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.q) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.r) {
            return this.f58997a.T0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.r) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.s) {
            return this.f58997a.W0().getValue().serialize(parsingContext, ((DivActionTypedTemplate.s) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.t) {
            return this.f58997a.f1().getValue().serialize(parsingContext, ((DivActionTypedTemplate.t) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.u) {
            return this.f58997a.l1().getValue().serialize(parsingContext, ((DivActionTypedTemplate.u) divActionTypedTemplate).b());
        }
        if (divActionTypedTemplate instanceof DivActionTypedTemplate.v) {
            return this.f58997a.o1().getValue().serialize(parsingContext, ((DivActionTypedTemplate.v) divActionTypedTemplate).b());
        }
        throw new NoWhenBranchMatchedException();
    }
}
