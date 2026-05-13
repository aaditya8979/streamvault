package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class xy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xy f96922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xy f96923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ xy[] f96924e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96925b;

    static {
        xy xyVar = new xy(0, "NETWORK", "network");
        f96922c = xyVar;
        xy xyVar2 = new xy(1, "CACHE", "cache");
        f96923d = xyVar2;
        xy[] xyVarArr = {xyVar, xyVar2};
        f96924e = xyVarArr;
        kotlin.enums.a.a(xyVarArr);
    }

    public xy(int i10, String str, String str2) {
        this.f96925b = str2;
    }

    public static xy valueOf(String str) {
        return (xy) Enum.valueOf(xy.class, str);
    }

    public static xy[] values() {
        return (xy[]) f96924e.clone();
    }
}
