package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class zz2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zz2 f97845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zz2 f97846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zz2 f97847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ zz2[] f97848f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97849b;

    static {
        zz2 zz2Var = new zz2(0, "FIXED", "fixed");
        f97845c = zz2Var;
        zz2 zz2Var2 = new zz2(1, "FLEXIBLE", "flexible");
        f97846d = zz2Var2;
        zz2 zz2Var3 = new zz2(2, "SCREEN", "screen");
        zz2 zz2Var4 = new zz2(3, "STICKY", "sticky");
        f97847e = zz2Var4;
        zz2[] zz2VarArr = {zz2Var, zz2Var2, zz2Var3, zz2Var4};
        f97848f = zz2VarArr;
        kotlin.enums.a.a(zz2VarArr);
    }

    public zz2(int i10, String str, String str2) {
        this.f97849b = str2;
    }

    public static zz2 valueOf(String str) {
        return (zz2) Enum.valueOf(zz2.class, str);
    }

    public static zz2[] values() {
        return (zz2[]) f97848f.clone();
    }
}
