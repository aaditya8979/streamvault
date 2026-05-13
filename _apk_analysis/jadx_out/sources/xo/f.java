package xo;

import kotlinx.serialization.json.ClassDiscriminatorMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f87044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f87047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f87048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f87049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f87050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f87051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f87052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f87053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f87054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f87055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final y f87056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f87057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f87058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f87059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public ClassDiscriminatorMode f87060q;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull String str, boolean z16, boolean z17, @NotNull String str2, boolean z18, boolean z19, @Nullable y yVar, boolean z20, boolean z21, boolean z22, @NotNull ClassDiscriminatorMode classDiscriminatorMode) {
        tn.p.k(str, "prettyPrintIndent");
        tn.p.k(str2, "classDiscriminator");
        tn.p.k(classDiscriminatorMode, "classDiscriminatorMode");
        this.f87044a = z10;
        this.f87045b = z11;
        this.f87046c = z12;
        this.f87047d = z13;
        this.f87048e = z14;
        this.f87049f = z15;
        this.f87050g = str;
        this.f87051h = z16;
        this.f87052i = z17;
        this.f87053j = str2;
        this.f87054k = z18;
        this.f87055l = z19;
        this.f87056m = yVar;
        this.f87057n = z20;
        this.f87058o = z21;
        this.f87059p = z22;
        this.f87060q = classDiscriminatorMode;
    }

    public /* synthetic */ f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, y yVar, boolean z20, boolean z21, boolean z22, ClassDiscriminatorMode classDiscriminatorMode, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : yVar, (i10 & 8192) != 0 ? false : z20, (i10 & 16384) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & 65536) != 0 ? ClassDiscriminatorMode.POLYMORPHIC : classDiscriminatorMode);
    }

    public final boolean a() {
        return this.f87059p;
    }

    public final boolean b() {
        return this.f87054k;
    }

    public final boolean c() {
        return this.f87047d;
    }

    public final boolean d() {
        return this.f87058o;
    }

    @NotNull
    public final String e() {
        return this.f87053j;
    }

    @NotNull
    public final ClassDiscriminatorMode f() {
        return this.f87060q;
    }

    public final boolean g() {
        return this.f87051h;
    }

    public final boolean h() {
        return this.f87057n;
    }

    public final boolean i() {
        return this.f87044a;
    }

    public final boolean j() {
        return this.f87049f;
    }

    public final boolean k() {
        return this.f87045b;
    }

    @Nullable
    public final y l() {
        return this.f87056m;
    }

    public final boolean m() {
        return this.f87048e;
    }

    @NotNull
    public final String n() {
        return this.f87050g;
    }

    public final boolean o() {
        return this.f87055l;
    }

    public final boolean p() {
        return this.f87052i;
    }

    public final boolean q() {
        return this.f87046c;
    }

    @NotNull
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f87044a + ", ignoreUnknownKeys=" + this.f87045b + ", isLenient=" + this.f87046c + ", allowStructuredMapKeys=" + this.f87047d + ", prettyPrint=" + this.f87048e + ", explicitNulls=" + this.f87049f + ", prettyPrintIndent='" + this.f87050g + "', coerceInputValues=" + this.f87051h + ", useArrayPolymorphism=" + this.f87052i + ", classDiscriminator='" + this.f87053j + "', allowSpecialFloatingPointValues=" + this.f87054k + ", useAlternativeNames=" + this.f87055l + ", namingStrategy=" + this.f87056m + ", decodeEnumsCaseInsensitive=" + this.f87057n + ", allowTrailingComma=" + this.f87058o + ", allowComments=" + this.f87059p + ", classDiscriminatorMode=" + this.f87060q + ')';
    }
}
