package yads;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d00 f89039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e00 f89040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e00 f89041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e00 f89042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e00 f89043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e00 f89044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e00 f89045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e00 f89046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ e00[] f89047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kn.a f89048l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89049b;

    static {
        e00 e00Var = new e00(0, "BANNER", "banner");
        f89040d = e00Var;
        e00 e00Var2 = new e00(1, "INTERSTITIAL", "interstitial");
        f89041e = e00Var2;
        e00 e00Var3 = new e00(2, BrandSafetyUtils.f51654k, "rewarded");
        f89042f = e00Var3;
        e00 e00Var4 = new e00(3, "NATIVE", "native");
        f89043g = e00Var4;
        e00 e00Var5 = new e00(4, "INSTREAM", "instream");
        f89044h = e00Var5;
        e00 e00Var6 = new e00(5, "APPOPENAD", "appopenad");
        f89045i = e00Var6;
        e00 e00Var7 = new e00(6, "RETAIL_MEDIA", "retail");
        e00 e00Var8 = new e00(7, "FEED", "feed");
        f89046j = e00Var8;
        e00[] e00VarArr = {e00Var, e00Var2, e00Var3, e00Var4, e00Var5, e00Var6, e00Var7, e00Var8};
        f89047k = e00VarArr;
        f89048l = kotlin.enums.a.a(e00VarArr);
        f89039c = new d00();
    }

    public e00(int i10, String str, String str2) {
        this.f89049b = str2;
    }

    public static e00 valueOf(String str) {
        return (e00) Enum.valueOf(e00.class, str);
    }

    public static e00[] values() {
        return (e00[]) f89047k.clone();
    }
}
