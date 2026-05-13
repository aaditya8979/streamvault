package com.yandex.div2;

import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionTypedTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTypedTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivActionTypedTemplate implements JSONSerializable, JsonTemplate<DivActionTyped> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f54523a = new g(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionTypedTemplate> f54524b = new sn.p<ParsingEnvironment, JSONObject, DivActionTypedTemplate>() { // from class: com.yandex.div2.DivActionTypedTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTypedTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionTypedTemplate.g.b(DivActionTypedTemplate.f54523a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class a extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionAnimatorStartTemplate f54525c;

        public a(@NotNull DivActionAnimatorStartTemplate divActionAnimatorStartTemplate) {
            super(null);
            this.f54525c = divActionAnimatorStartTemplate;
        }

        @NotNull
        public final DivActionAnimatorStartTemplate b() {
            return this.f54525c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class b extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionAnimatorStopTemplate f54526c;

        public b(@NotNull DivActionAnimatorStopTemplate divActionAnimatorStopTemplate) {
            super(null);
            this.f54526c = divActionAnimatorStopTemplate;
        }

        @NotNull
        public final DivActionAnimatorStopTemplate b() {
            return this.f54526c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class c extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionArrayInsertValueTemplate f54527c;

        public c(@NotNull DivActionArrayInsertValueTemplate divActionArrayInsertValueTemplate) {
            super(null);
            this.f54527c = divActionArrayInsertValueTemplate;
        }

        @NotNull
        public final DivActionArrayInsertValueTemplate b() {
            return this.f54527c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class d extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionArrayRemoveValueTemplate f54528c;

        public d(@NotNull DivActionArrayRemoveValueTemplate divActionArrayRemoveValueTemplate) {
            super(null);
            this.f54528c = divActionArrayRemoveValueTemplate;
        }

        @NotNull
        public final DivActionArrayRemoveValueTemplate b() {
            return this.f54528c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class e extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionArraySetValueTemplate f54529c;

        public e(@NotNull DivActionArraySetValueTemplate divActionArraySetValueTemplate) {
            super(null);
            this.f54529c = divActionArraySetValueTemplate;
        }

        @NotNull
        public final DivActionArraySetValueTemplate b() {
            return this.f54529c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class f extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionClearFocusTemplate f54530c;

        public f(@NotNull DivActionClearFocusTemplate divActionClearFocusTemplate) {
            super(null);
            this.f54530c = divActionClearFocusTemplate;
        }

        @NotNull
        public final DivActionClearFocusTemplate b() {
            return this.f54530c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class g {
        public g() {
        }

        public /* synthetic */ g(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivActionTypedTemplate b(g gVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return gVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivActionTypedTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().i1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class h extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionCopyToClipboardTemplate f54531c;

        public h(@NotNull DivActionCopyToClipboardTemplate divActionCopyToClipboardTemplate) {
            super(null);
            this.f54531c = divActionCopyToClipboardTemplate;
        }

        @NotNull
        public final DivActionCopyToClipboardTemplate b() {
            return this.f54531c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class i extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionDictSetValueTemplate f54532c;

        public i(@NotNull DivActionDictSetValueTemplate divActionDictSetValueTemplate) {
            super(null);
            this.f54532c = divActionDictSetValueTemplate;
        }

        @NotNull
        public final DivActionDictSetValueTemplate b() {
            return this.f54532c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class j extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionDownloadTemplate f54533c;

        public j(@NotNull DivActionDownloadTemplate divActionDownloadTemplate) {
            super(null);
            this.f54533c = divActionDownloadTemplate;
        }

        @NotNull
        public final DivActionDownloadTemplate b() {
            return this.f54533c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class k extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionFocusElementTemplate f54534c;

        public k(@NotNull DivActionFocusElementTemplate divActionFocusElementTemplate) {
            super(null);
            this.f54534c = divActionFocusElementTemplate;
        }

        @NotNull
        public final DivActionFocusElementTemplate b() {
            return this.f54534c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class l extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionHideTooltipTemplate f54535c;

        public l(@NotNull DivActionHideTooltipTemplate divActionHideTooltipTemplate) {
            super(null);
            this.f54535c = divActionHideTooltipTemplate;
        }

        @NotNull
        public final DivActionHideTooltipTemplate b() {
            return this.f54535c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class m extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionScrollByTemplate f54536c;

        public m(@NotNull DivActionScrollByTemplate divActionScrollByTemplate) {
            super(null);
            this.f54536c = divActionScrollByTemplate;
        }

        @NotNull
        public final DivActionScrollByTemplate b() {
            return this.f54536c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class n extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionScrollToTemplate f54537c;

        public n(@NotNull DivActionScrollToTemplate divActionScrollToTemplate) {
            super(null);
            this.f54537c = divActionScrollToTemplate;
        }

        @NotNull
        public final DivActionScrollToTemplate b() {
            return this.f54537c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class o extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionSetStateTemplate f54538c;

        public o(@NotNull DivActionSetStateTemplate divActionSetStateTemplate) {
            super(null);
            this.f54538c = divActionSetStateTemplate;
        }

        @NotNull
        public final DivActionSetStateTemplate b() {
            return this.f54538c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class p extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionSetStoredValueTemplate f54539c;

        public p(@NotNull DivActionSetStoredValueTemplate divActionSetStoredValueTemplate) {
            super(null);
            this.f54539c = divActionSetStoredValueTemplate;
        }

        @NotNull
        public final DivActionSetStoredValueTemplate b() {
            return this.f54539c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class q extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionSetVariableTemplate f54540c;

        public q(@NotNull DivActionSetVariableTemplate divActionSetVariableTemplate) {
            super(null);
            this.f54540c = divActionSetVariableTemplate;
        }

        @NotNull
        public final DivActionSetVariableTemplate b() {
            return this.f54540c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class r extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionShowTooltipTemplate f54541c;

        public r(@NotNull DivActionShowTooltipTemplate divActionShowTooltipTemplate) {
            super(null);
            this.f54541c = divActionShowTooltipTemplate;
        }

        @NotNull
        public final DivActionShowTooltipTemplate b() {
            return this.f54541c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class s extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionSubmitTemplate f54542c;

        public s(@NotNull DivActionSubmitTemplate divActionSubmitTemplate) {
            super(null);
            this.f54542c = divActionSubmitTemplate;
        }

        @NotNull
        public final DivActionSubmitTemplate b() {
            return this.f54542c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class t extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionTimerTemplate f54543c;

        public t(@NotNull DivActionTimerTemplate divActionTimerTemplate) {
            super(null);
            this.f54543c = divActionTimerTemplate;
        }

        @NotNull
        public final DivActionTimerTemplate b() {
            return this.f54543c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class u extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionUpdateStructureTemplate f54544c;

        public u(@NotNull DivActionUpdateStructureTemplate divActionUpdateStructureTemplate) {
            super(null);
            this.f54544c = divActionUpdateStructureTemplate;
        }

        @NotNull
        public final DivActionUpdateStructureTemplate b() {
            return this.f54544c;
        }
    }

    /* JADX INFO: compiled from: DivActionTypedTemplate.kt */
    public static final class v extends DivActionTypedTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivActionVideoTemplate f54545c;

        public v(@NotNull DivActionVideoTemplate divActionVideoTemplate) {
            super(null);
            this.f54545c = divActionVideoTemplate;
        }

        @NotNull
        public final DivActionVideoTemplate b() {
            return this.f54545c;
        }
    }

    public DivActionTypedTemplate() {
    }

    public /* synthetic */ DivActionTypedTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof d) {
            return ((d) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof h) {
            return ((h) this).b();
        }
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof j) {
            return ((j) this).b();
        }
        if (this instanceof k) {
            return ((k) this).b();
        }
        if (this instanceof l) {
            return ((l) this).b();
        }
        if (this instanceof m) {
            return ((m) this).b();
        }
        if (this instanceof n) {
            return ((n) this).b();
        }
        if (this instanceof o) {
            return ((o) this).b();
        }
        if (this instanceof p) {
            return ((p) this).b();
        }
        if (this instanceof q) {
            return ((q) this).b();
        }
        if (this instanceof r) {
            return ((r) this).b();
        }
        if (this instanceof s) {
            return ((s) this).b();
        }
        if (this instanceof t) {
            return ((t) this).b();
        }
        if (this instanceof u) {
            return ((u) this).b();
        }
        if (this instanceof v) {
            return ((v) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof a) {
            return "animator_start";
        }
        if (this instanceof b) {
            return "animator_stop";
        }
        if (this instanceof c) {
            return "array_insert_value";
        }
        if (this instanceof d) {
            return "array_remove_value";
        }
        if (this instanceof e) {
            return "array_set_value";
        }
        if (this instanceof f) {
            return "clear_focus";
        }
        if (this instanceof h) {
            return "copy_to_clipboard";
        }
        if (this instanceof i) {
            return "dict_set_value";
        }
        if (this instanceof j) {
            return NativeAdPresenter.DOWNLOAD;
        }
        if (this instanceof k) {
            return "focus_element";
        }
        if (this instanceof l) {
            return "hide_tooltip";
        }
        if (this instanceof m) {
            return "scroll_by";
        }
        if (this instanceof n) {
            return "scroll_to";
        }
        if (this instanceof o) {
            return "set_state";
        }
        if (this instanceof p) {
            return "set_stored_value";
        }
        if (this instanceof q) {
            return "set_variable";
        }
        if (this instanceof r) {
            return "show_tooltip";
        }
        if (this instanceof s) {
            return "submit";
        }
        if (this instanceof t) {
            return "timer";
        }
        if (this instanceof u) {
            return "update_structure";
        }
        if (this instanceof v) {
            return "video";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
