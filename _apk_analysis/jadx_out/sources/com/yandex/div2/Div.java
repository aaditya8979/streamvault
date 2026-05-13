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

/* JADX INFO: compiled from: Div.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Div implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54095c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, Div> f54096d = new sn.p<ParsingEnvironment, JSONObject, Div>() { // from class: com.yandex.div2.Div$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Div mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return Div.f54095c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f54097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54098b;

    /* JADX INFO: compiled from: Div.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final Div a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().M4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class b extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivContainer f54099e;

        public b(@NotNull DivContainer divContainer) {
            super(null);
            this.f54099e = divContainer;
        }

        @NotNull
        public final DivContainer c() {
            return this.f54099e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class c extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivCustom f54100e;

        public c(@NotNull DivCustom divCustom) {
            super(null);
            this.f54100e = divCustom;
        }

        @NotNull
        public final DivCustom c() {
            return this.f54100e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class d extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivGallery f54101e;

        public d(@NotNull DivGallery divGallery) {
            super(null);
            this.f54101e = divGallery;
        }

        @NotNull
        public final DivGallery c() {
            return this.f54101e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class e extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivGifImage f54102e;

        public e(@NotNull DivGifImage divGifImage) {
            super(null);
            this.f54102e = divGifImage;
        }

        @NotNull
        public final DivGifImage c() {
            return this.f54102e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class f extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivGrid f54103e;

        public f(@NotNull DivGrid divGrid) {
            super(null);
            this.f54103e = divGrid;
        }

        @NotNull
        public final DivGrid c() {
            return this.f54103e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class g extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivImage f54104e;

        public g(@NotNull DivImage divImage) {
            super(null);
            this.f54104e = divImage;
        }

        @NotNull
        public final DivImage c() {
            return this.f54104e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class h extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivIndicator f54105e;

        public h(@NotNull DivIndicator divIndicator) {
            super(null);
            this.f54105e = divIndicator;
        }

        @NotNull
        public final DivIndicator c() {
            return this.f54105e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class i extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivInput f54106e;

        public i(@NotNull DivInput divInput) {
            super(null);
            this.f54106e = divInput;
        }

        @NotNull
        public final DivInput c() {
            return this.f54106e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class j extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivPager f54107e;

        public j(@NotNull DivPager divPager) {
            super(null);
            this.f54107e = divPager;
        }

        @NotNull
        public final DivPager c() {
            return this.f54107e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class k extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivSelect f54108e;

        public k(@NotNull DivSelect divSelect) {
            super(null);
            this.f54108e = divSelect;
        }

        @NotNull
        public final DivSelect c() {
            return this.f54108e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class l extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivSeparator f54109e;

        public l(@NotNull DivSeparator divSeparator) {
            super(null);
            this.f54109e = divSeparator;
        }

        @NotNull
        public final DivSeparator c() {
            return this.f54109e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class m extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivSlider f54110e;

        public m(@NotNull DivSlider divSlider) {
            super(null);
            this.f54110e = divSlider;
        }

        @NotNull
        public final DivSlider c() {
            return this.f54110e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class n extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivState f54111e;

        public n(@NotNull DivState divState) {
            super(null);
            this.f54111e = divState;
        }

        @NotNull
        public final DivState c() {
            return this.f54111e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class o extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivSwitch f54112e;

        public o(@NotNull DivSwitch divSwitch) {
            super(null);
            this.f54112e = divSwitch;
        }

        @NotNull
        public final DivSwitch c() {
            return this.f54112e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class p extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivTabs f54113e;

        public p(@NotNull DivTabs divTabs) {
            super(null);
            this.f54113e = divTabs;
        }

        @NotNull
        public final DivTabs c() {
            return this.f54113e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class q extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivText f54114e;

        public q(@NotNull DivText divText) {
            super(null);
            this.f54114e = divText;
        }

        @NotNull
        public final DivText c() {
            return this.f54114e;
        }
    }

    /* JADX INFO: compiled from: Div.kt */
    public static final class r extends Div {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final DivVideo f54115e;

        public r(@NotNull DivVideo divVideo) {
            super(null);
            this.f54115e = divVideo;
        }

        @NotNull
        public final DivVideo c() {
            return this.f54115e;
        }
    }

    public Div() {
    }

    public /* synthetic */ Div(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable Div div, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (div == null) {
            return false;
        }
        if (this instanceof g) {
            DivImage divImageC = ((g) this).c();
            ah.e2 e2VarB = div.b();
            return divImageC.A(e2VarB instanceof DivImage ? (DivImage) e2VarB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            DivGifImage divGifImageC = ((e) this).c();
            ah.e2 e2VarB2 = div.b();
            return divGifImageC.A(e2VarB2 instanceof DivGifImage ? (DivGifImage) e2VarB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof q) {
            DivText divTextC = ((q) this).c();
            ah.e2 e2VarB3 = div.b();
            return divTextC.A(e2VarB3 instanceof DivText ? (DivText) e2VarB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof l) {
            DivSeparator divSeparatorC = ((l) this).c();
            ah.e2 e2VarB4 = div.b();
            return divSeparatorC.A(e2VarB4 instanceof DivSeparator ? (DivSeparator) e2VarB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            DivContainer divContainerC = ((b) this).c();
            ah.e2 e2VarB5 = div.b();
            return divContainerC.A(e2VarB5 instanceof DivContainer ? (DivContainer) e2VarB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            DivGrid divGridC = ((f) this).c();
            ah.e2 e2VarB6 = div.b();
            return divGridC.A(e2VarB6 instanceof DivGrid ? (DivGrid) e2VarB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            DivGallery divGalleryC = ((d) this).c();
            ah.e2 e2VarB7 = div.b();
            return divGalleryC.A(e2VarB7 instanceof DivGallery ? (DivGallery) e2VarB7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            DivPager divPagerC = ((j) this).c();
            ah.e2 e2VarB8 = div.b();
            return divPagerC.A(e2VarB8 instanceof DivPager ? (DivPager) e2VarB8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof p) {
            DivTabs divTabsC = ((p) this).c();
            ah.e2 e2VarB9 = div.b();
            return divTabsC.A(e2VarB9 instanceof DivTabs ? (DivTabs) e2VarB9 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof n) {
            DivState divStateC = ((n) this).c();
            ah.e2 e2VarB10 = div.b();
            return divStateC.A(e2VarB10 instanceof DivState ? (DivState) e2VarB10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            DivCustom divCustomC = ((c) this).c();
            ah.e2 e2VarB11 = div.b();
            return divCustomC.A(e2VarB11 instanceof DivCustom ? (DivCustom) e2VarB11 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof h) {
            DivIndicator divIndicatorC = ((h) this).c();
            ah.e2 e2VarB12 = div.b();
            return divIndicatorC.A(e2VarB12 instanceof DivIndicator ? (DivIndicator) e2VarB12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof m) {
            DivSlider divSliderC = ((m) this).c();
            ah.e2 e2VarB13 = div.b();
            return divSliderC.A(e2VarB13 instanceof DivSlider ? (DivSlider) e2VarB13 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof o) {
            DivSwitch divSwitchC = ((o) this).c();
            ah.e2 e2VarB14 = div.b();
            return divSwitchC.A(e2VarB14 instanceof DivSwitch ? (DivSwitch) e2VarB14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof i) {
            DivInput divInputC = ((i) this).c();
            ah.e2 e2VarB15 = div.b();
            return divInputC.A(e2VarB15 instanceof DivInput ? (DivInput) e2VarB15 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof k) {
            DivSelect divSelectC = ((k) this).c();
            ah.e2 e2VarB16 = div.b();
            return divSelectC.A(e2VarB16 instanceof DivSelect ? (DivSelect) e2VarB16 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof r)) {
            throw new NoWhenBranchMatchedException();
        }
        DivVideo divVideoC = ((r) this).c();
        ah.e2 e2VarB17 = div.b();
        return divVideoC.A(e2VarB17 instanceof DivVideo ? (DivVideo) e2VarB17 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final ah.e2 b() {
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof h) {
            return ((h) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54098b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof g) {
            iHash = ((g) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof q) {
            iHash = ((q) this).c().hash();
        } else if (this instanceof l) {
            iHash = ((l) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof p) {
            iHash = ((p) this).c().hash();
        } else if (this instanceof n) {
            iHash = ((n) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof h) {
            iHash = ((h) this).c().hash();
        } else if (this instanceof m) {
            iHash = ((m) this).c().hash();
        } else if (this instanceof o) {
            iHash = ((o) this).c().hash();
        } else if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof k) {
            iHash = ((k) this).c().hash();
        } else {
            if (!(this instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((r) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f54098b = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.data.Hashable
    public int propertiesHash() {
        int iPropertiesHash;
        Integer num = this.f54097a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof g) {
            iPropertiesHash = ((g) this).c().propertiesHash();
        } else if (this instanceof e) {
            iPropertiesHash = ((e) this).c().propertiesHash();
        } else if (this instanceof q) {
            iPropertiesHash = ((q) this).c().propertiesHash();
        } else if (this instanceof l) {
            iPropertiesHash = ((l) this).c().propertiesHash();
        } else if (this instanceof b) {
            iPropertiesHash = ((b) this).c().propertiesHash();
        } else if (this instanceof f) {
            iPropertiesHash = ((f) this).c().propertiesHash();
        } else if (this instanceof d) {
            iPropertiesHash = ((d) this).c().propertiesHash();
        } else if (this instanceof j) {
            iPropertiesHash = ((j) this).c().propertiesHash();
        } else if (this instanceof p) {
            iPropertiesHash = ((p) this).c().propertiesHash();
        } else if (this instanceof n) {
            iPropertiesHash = ((n) this).c().propertiesHash();
        } else if (this instanceof c) {
            iPropertiesHash = ((c) this).c().propertiesHash();
        } else if (this instanceof h) {
            iPropertiesHash = ((h) this).c().propertiesHash();
        } else if (this instanceof m) {
            iPropertiesHash = ((m) this).c().propertiesHash();
        } else if (this instanceof o) {
            iPropertiesHash = ((o) this).c().propertiesHash();
        } else if (this instanceof i) {
            iPropertiesHash = ((i) this).c().propertiesHash();
        } else if (this instanceof k) {
            iPropertiesHash = ((k) this).c().propertiesHash();
        } else {
            if (!(this instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            iPropertiesHash = ((r) this).c().propertiesHash();
        }
        int i10 = iHashCode + iPropertiesHash;
        this.f54097a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
