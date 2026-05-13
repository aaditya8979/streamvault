package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zg2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zg2 f97568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zg2 f97569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zg2 f97570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zg2 f97571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zg2[] f97572h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f97573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f97574c;

    static {
        zg2 zg2Var = new zg2(0, 1001, "TIMEOUT", "The request failed to load due to a timeout");
        f97568d = zg2Var;
        zg2 zg2Var2 = new zg2(1, 1002, "INVALID_CONFIGURATION", "The provided configuration is invalid");
        f97569e = zg2Var2;
        zg2 zg2Var3 = new zg2(2, 1003, "EMPTY_MEDIATION_DATA", "No mediation data was received. Possibly, Client Bidding adapters are not connected");
        f97570f = zg2Var3;
        zg2 zg2Var4 = new zg2(3, 1004, "INVALID_FETCHED_DATA", "The fetched data is invalid");
        f97571g = zg2Var4;
        zg2[] zg2VarArr = {zg2Var, zg2Var2, zg2Var3, zg2Var4};
        f97572h = zg2VarArr;
        kotlin.enums.a.a(zg2VarArr);
    }

    public zg2(int i10, int i11, String str, String str2) {
        this.f97573b = i11;
        this.f97574c = str2;
    }

    public static zg2 valueOf(String str) {
        return (zg2) Enum.valueOf(zg2.class, str);
    }

    public static zg2[] values() {
        return (zg2[]) f97572h.clone();
    }

    public final int a() {
        return this.f97573b;
    }

    public final String b() {
        return this.f97574c;
    }
}
