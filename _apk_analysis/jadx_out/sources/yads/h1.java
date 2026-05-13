package yads;

import com.ironsource.C3978d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h1 f90188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h1 f90189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h1 f90190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h1[] f90191f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90192b;

    static {
        h1 h1Var = new h1(0, "BROWSER", "browser");
        f90188c = h1Var;
        h1 h1Var2 = new h1(1, "WEBVIEW", C3978d4.i.K);
        f90189d = h1Var2;
        h1 h1Var3 = new h1(2, "CUSTOM", "custom");
        f90190e = h1Var3;
        h1[] h1VarArr = {h1Var, h1Var2, h1Var3};
        f90191f = h1VarArr;
        kotlin.enums.a.a(h1VarArr);
    }

    public h1(int i10, String str, String str2) {
        this.f90192b = str2;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) f90191f.clone();
    }
}
