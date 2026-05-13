package yads;

import com.ironsource.C3978d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rn1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final rn1 f94522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rn1 f94523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final rn1 f94524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final rn1 f94525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final rn1 f94526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rn1[] f94527h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94528b;

    static {
        rn1 rn1Var = new rn1(0, "WEB_VIEW", C3978d4.i.K);
        f94522c = rn1Var;
        rn1 rn1Var2 = new rn1(1, "VIDEO", "video");
        f94523d = rn1Var2;
        rn1 rn1Var3 = new rn1(2, "MULTIBANNER", "multibanner");
        f94524e = rn1Var3;
        rn1 rn1Var4 = new rn1(3, "IMAGE", "image");
        f94525f = rn1Var4;
        rn1 rn1Var5 = new rn1(4, "MEDIATION", "mediation");
        f94526g = rn1Var5;
        rn1[] rn1VarArr = {rn1Var, rn1Var2, rn1Var3, rn1Var4, rn1Var5};
        f94527h = rn1VarArr;
        kotlin.enums.a.a(rn1VarArr);
    }

    public rn1(int i10, String str, String str2) {
        this.f94528b = str2;
    }

    public static rn1 valueOf(String str) {
        return (rn1) Enum.valueOf(rn1.class, str);
    }

    public static rn1[] values() {
        return (rn1[]) f94527h.clone();
    }
}
