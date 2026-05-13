package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class bw1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aw1 f88174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bw1 f88175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ bw1[] f88176e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88177b;

    static {
        bw1 bw1Var = new bw1(0, "AD_VIDEO_COMPLETE", "advideocomplete");
        bw1 bw1Var2 = new bw1(1, "IMPRESSION_TRACKING_START", "impressionTrackingStart");
        bw1 bw1Var3 = new bw1(2, "IMPRESSION_TRACKING_SUCCESS", "impressionTrackingSuccess");
        bw1 bw1Var4 = new bw1(3, "CLOSE", "close");
        bw1 bw1Var5 = new bw1(4, "OPEN", "open");
        bw1 bw1Var6 = new bw1(5, "REWARDED_AD_COMPLETE", "rewardedAdComplete");
        bw1 bw1Var7 = new bw1(6, "USE_CUSTOM_CLOSE", "usecustomclose");
        bw1 bw1Var8 = new bw1(7, "UNSPECIFIED", "");
        f88175d = bw1Var8;
        bw1[] bw1VarArr = {bw1Var, bw1Var2, bw1Var3, bw1Var4, bw1Var5, bw1Var6, bw1Var7, bw1Var8, new bw1(8, "AD_RENDERED", "adRendered")};
        f88176e = bw1VarArr;
        kotlin.enums.a.a(bw1VarArr);
        f88174c = new aw1();
    }

    public bw1(int i10, String str, String str2) {
        this.f88177b = str2;
    }

    public static bw1 valueOf(String str) {
        return (bw1) Enum.valueOf(bw1.class, str);
    }

    public static bw1[] values() {
        return (bw1[]) f88176e.clone();
    }

    public final String a() {
        return this.f88177b;
    }
}
