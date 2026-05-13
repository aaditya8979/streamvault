package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionTyped.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivActionTyped implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final g f54499b = new g(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionTyped> f54500c = new sn.p<ParsingEnvironment, JSONObject, DivActionTyped>() { // from class: com.yandex.div2.DivActionTyped$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionTyped mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionTyped.f54499b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f54501a;

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class a extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionAnimatorStart f54502d;

        public a(@NotNull DivActionAnimatorStart divActionAnimatorStart) {
            super(null);
            this.f54502d = divActionAnimatorStart;
        }

        @NotNull
        public final DivActionAnimatorStart c() {
            return this.f54502d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class b extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionAnimatorStop f54503d;

        public b(@NotNull DivActionAnimatorStop divActionAnimatorStop) {
            super(null);
            this.f54503d = divActionAnimatorStop;
        }

        @NotNull
        public final DivActionAnimatorStop c() {
            return this.f54503d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class c extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionArrayInsertValue f54504d;

        public c(@NotNull DivActionArrayInsertValue divActionArrayInsertValue) {
            super(null);
            this.f54504d = divActionArrayInsertValue;
        }

        @NotNull
        public final DivActionArrayInsertValue c() {
            return this.f54504d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class d extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionArrayRemoveValue f54505d;

        public d(@NotNull DivActionArrayRemoveValue divActionArrayRemoveValue) {
            super(null);
            this.f54505d = divActionArrayRemoveValue;
        }

        @NotNull
        public final DivActionArrayRemoveValue c() {
            return this.f54505d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class e extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionArraySetValue f54506d;

        public e(@NotNull DivActionArraySetValue divActionArraySetValue) {
            super(null);
            this.f54506d = divActionArraySetValue;
        }

        @NotNull
        public final DivActionArraySetValue c() {
            return this.f54506d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class f extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionClearFocus f54507d;

        public f(@NotNull DivActionClearFocus divActionClearFocus) {
            super(null);
            this.f54507d = divActionClearFocus;
        }

        @NotNull
        public final DivActionClearFocus c() {
            return this.f54507d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class g {
        public g() {
        }

        public /* synthetic */ g(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionTyped a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().h1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class h extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionCopyToClipboard f54508d;

        public h(@NotNull DivActionCopyToClipboard divActionCopyToClipboard) {
            super(null);
            this.f54508d = divActionCopyToClipboard;
        }

        @NotNull
        public final DivActionCopyToClipboard c() {
            return this.f54508d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class i extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionDictSetValue f54509d;

        public i(@NotNull DivActionDictSetValue divActionDictSetValue) {
            super(null);
            this.f54509d = divActionDictSetValue;
        }

        @NotNull
        public final DivActionDictSetValue c() {
            return this.f54509d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class j extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionDownload f54510d;

        public j(@NotNull DivActionDownload divActionDownload) {
            super(null);
            this.f54510d = divActionDownload;
        }

        @NotNull
        public final DivActionDownload c() {
            return this.f54510d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class k extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionFocusElement f54511d;

        public k(@NotNull DivActionFocusElement divActionFocusElement) {
            super(null);
            this.f54511d = divActionFocusElement;
        }

        @NotNull
        public final DivActionFocusElement c() {
            return this.f54511d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class l extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionHideTooltip f54512d;

        public l(@NotNull DivActionHideTooltip divActionHideTooltip) {
            super(null);
            this.f54512d = divActionHideTooltip;
        }

        @NotNull
        public final DivActionHideTooltip c() {
            return this.f54512d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class m extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionScrollBy f54513d;

        public m(@NotNull DivActionScrollBy divActionScrollBy) {
            super(null);
            this.f54513d = divActionScrollBy;
        }

        @NotNull
        public final DivActionScrollBy c() {
            return this.f54513d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class n extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionScrollTo f54514d;

        public n(@NotNull DivActionScrollTo divActionScrollTo) {
            super(null);
            this.f54514d = divActionScrollTo;
        }

        @NotNull
        public final DivActionScrollTo c() {
            return this.f54514d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class o extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionSetState f54515d;

        public o(@NotNull DivActionSetState divActionSetState) {
            super(null);
            this.f54515d = divActionSetState;
        }

        @NotNull
        public final DivActionSetState c() {
            return this.f54515d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class p extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionSetStoredValue f54516d;

        public p(@NotNull DivActionSetStoredValue divActionSetStoredValue) {
            super(null);
            this.f54516d = divActionSetStoredValue;
        }

        @NotNull
        public final DivActionSetStoredValue c() {
            return this.f54516d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class q extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionSetVariable f54517d;

        public q(@NotNull DivActionSetVariable divActionSetVariable) {
            super(null);
            this.f54517d = divActionSetVariable;
        }

        @NotNull
        public final DivActionSetVariable c() {
            return this.f54517d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class r extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionShowTooltip f54518d;

        public r(@NotNull DivActionShowTooltip divActionShowTooltip) {
            super(null);
            this.f54518d = divActionShowTooltip;
        }

        @NotNull
        public final DivActionShowTooltip c() {
            return this.f54518d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class s extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionSubmit f54519d;

        public s(@NotNull DivActionSubmit divActionSubmit) {
            super(null);
            this.f54519d = divActionSubmit;
        }

        @NotNull
        public final DivActionSubmit c() {
            return this.f54519d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class t extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionTimer f54520d;

        public t(@NotNull DivActionTimer divActionTimer) {
            super(null);
            this.f54520d = divActionTimer;
        }

        @NotNull
        public final DivActionTimer c() {
            return this.f54520d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class u extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionUpdateStructure f54521d;

        public u(@NotNull DivActionUpdateStructure divActionUpdateStructure) {
            super(null);
            this.f54521d = divActionUpdateStructure;
        }

        @NotNull
        public final DivActionUpdateStructure c() {
            return this.f54521d;
        }
    }

    /* JADX INFO: compiled from: DivActionTyped.kt */
    public static final class v extends DivActionTyped {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final DivActionVideo f54522d;

        public v(@NotNull DivActionVideo divActionVideo) {
            super(null);
            this.f54522d = divActionVideo;
        }

        @NotNull
        public final DivActionVideo c() {
            return this.f54522d;
        }
    }

    public DivActionTyped() {
    }

    public /* synthetic */ DivActionTyped(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivActionTyped divActionTyped, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionTyped == null) {
            return false;
        }
        if (this instanceof a) {
            DivActionAnimatorStart divActionAnimatorStartC = ((a) this).c();
            Object objB = divActionTyped.b();
            return divActionAnimatorStartC.a(objB instanceof DivActionAnimatorStart ? (DivActionAnimatorStart) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivActionAnimatorStop divActionAnimatorStopC = ((b) this).c();
            Object objB2 = divActionTyped.b();
            return divActionAnimatorStopC.a(objB2 instanceof DivActionAnimatorStop ? (DivActionAnimatorStop) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            DivActionArrayInsertValue divActionArrayInsertValueC = ((c) this).c();
            Object objB3 = divActionTyped.b();
            return divActionArrayInsertValueC.a(objB3 instanceof DivActionArrayInsertValue ? (DivActionArrayInsertValue) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            DivActionArrayRemoveValue divActionArrayRemoveValueC = ((d) this).c();
            Object objB4 = divActionTyped.b();
            return divActionArrayRemoveValueC.a(objB4 instanceof DivActionArrayRemoveValue ? (DivActionArrayRemoveValue) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DivActionArraySetValue divActionArraySetValueC = ((e) this).c();
            Object objB5 = divActionTyped.b();
            return divActionArraySetValueC.a(objB5 instanceof DivActionArraySetValue ? (DivActionArraySetValue) objB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            DivActionClearFocus divActionClearFocusC = ((f) this).c();
            Object objB6 = divActionTyped.b();
            return divActionClearFocusC.a(objB6 instanceof DivActionClearFocus ? (DivActionClearFocus) objB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof h) {
            DivActionCopyToClipboard divActionCopyToClipboardC = ((h) this).c();
            Object objB7 = divActionTyped.b();
            return divActionCopyToClipboardC.a(objB7 instanceof DivActionCopyToClipboard ? (DivActionCopyToClipboard) objB7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof i) {
            DivActionDictSetValue divActionDictSetValueC = ((i) this).c();
            Object objB8 = divActionTyped.b();
            return divActionDictSetValueC.a(objB8 instanceof DivActionDictSetValue ? (DivActionDictSetValue) objB8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            DivActionDownload divActionDownloadC = ((j) this).c();
            Object objB9 = divActionTyped.b();
            return divActionDownloadC.a(objB9 instanceof DivActionDownload ? (DivActionDownload) objB9 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof k) {
            DivActionFocusElement divActionFocusElementC = ((k) this).c();
            Object objB10 = divActionTyped.b();
            return divActionFocusElementC.a(objB10 instanceof DivActionFocusElement ? (DivActionFocusElement) objB10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof l) {
            DivActionHideTooltip divActionHideTooltipC = ((l) this).c();
            Object objB11 = divActionTyped.b();
            return divActionHideTooltipC.a(objB11 instanceof DivActionHideTooltip ? (DivActionHideTooltip) objB11 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof m) {
            DivActionScrollBy divActionScrollByC = ((m) this).c();
            Object objB12 = divActionTyped.b();
            return divActionScrollByC.a(objB12 instanceof DivActionScrollBy ? (DivActionScrollBy) objB12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof n) {
            DivActionScrollTo divActionScrollToC = ((n) this).c();
            Object objB13 = divActionTyped.b();
            return divActionScrollToC.a(objB13 instanceof DivActionScrollTo ? (DivActionScrollTo) objB13 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof o) {
            DivActionSetState divActionSetStateC = ((o) this).c();
            Object objB14 = divActionTyped.b();
            return divActionSetStateC.a(objB14 instanceof DivActionSetState ? (DivActionSetState) objB14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof p) {
            DivActionSetStoredValue divActionSetStoredValueC = ((p) this).c();
            Object objB15 = divActionTyped.b();
            return divActionSetStoredValueC.a(objB15 instanceof DivActionSetStoredValue ? (DivActionSetStoredValue) objB15 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof q) {
            DivActionSetVariable divActionSetVariableC = ((q) this).c();
            Object objB16 = divActionTyped.b();
            return divActionSetVariableC.a(objB16 instanceof DivActionSetVariable ? (DivActionSetVariable) objB16 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof r) {
            DivActionShowTooltip divActionShowTooltipC = ((r) this).c();
            Object objB17 = divActionTyped.b();
            return divActionShowTooltipC.a(objB17 instanceof DivActionShowTooltip ? (DivActionShowTooltip) objB17 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof s) {
            DivActionSubmit divActionSubmitC = ((s) this).c();
            Object objB18 = divActionTyped.b();
            return divActionSubmitC.a(objB18 instanceof DivActionSubmit ? (DivActionSubmit) objB18 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof t) {
            DivActionTimer divActionTimerC = ((t) this).c();
            Object objB19 = divActionTyped.b();
            return divActionTimerC.a(objB19 instanceof DivActionTimer ? (DivActionTimer) objB19 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof u) {
            DivActionUpdateStructure divActionUpdateStructureC = ((u) this).c();
            Object objB20 = divActionTyped.b();
            return divActionUpdateStructureC.a(objB20 instanceof DivActionUpdateStructure ? (DivActionUpdateStructure) objB20 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof v)) {
            throw new NoWhenBranchMatchedException();
        }
        DivActionVideo divActionVideoC = ((v) this).c();
        Object objB21 = divActionTyped.b();
        return divActionVideoC.a(objB21 instanceof DivActionVideo ? (DivActionVideo) objB21 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        if (this instanceof t) {
            return ((t) this).c();
        }
        if (this instanceof u) {
            return ((u) this).c();
        }
        if (this instanceof v) {
            return ((v) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54501a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof h) {
            iHash = ((h) this).c().hash();
        } else if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof k) {
            iHash = ((k) this).c().hash();
        } else if (this instanceof l) {
            iHash = ((l) this).c().hash();
        } else if (this instanceof m) {
            iHash = ((m) this).c().hash();
        } else if (this instanceof n) {
            iHash = ((n) this).c().hash();
        } else if (this instanceof o) {
            iHash = ((o) this).c().hash();
        } else if (this instanceof p) {
            iHash = ((p) this).c().hash();
        } else if (this instanceof q) {
            iHash = ((q) this).c().hash();
        } else if (this instanceof r) {
            iHash = ((r) this).c().hash();
        } else if (this instanceof s) {
            iHash = ((s) this).c().hash();
        } else if (this instanceof t) {
            iHash = ((t) this).c().hash();
        } else if (this instanceof u) {
            iHash = ((u) this).c().hash();
        } else {
            if (!(this instanceof v)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((v) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f54501a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
