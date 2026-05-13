package yads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class or0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final or0 f93311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final or0 f93312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final or0 f93313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ or0[] f93314f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93315b;

    static {
        or0 or0Var = new or0(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        or0 or0Var2 = new or0(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        or0 or0Var3 = new or0(2, "REWARDED_PRELOADING", "RewardedPreloading");
        or0 or0Var4 = new or0(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        f93311c = or0Var4;
        or0 or0Var5 = new or0(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        f93312d = or0Var5;
        or0 or0Var6 = new or0(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        f93313e = or0Var6;
        or0[] or0VarArr = {or0Var, or0Var2, or0Var3, or0Var4, or0Var5, or0Var6, new or0(6, "BACKGROUND_NATIVE_VIDEO_PRELOADING", "BackgroundNativeVideoPreloading"), new or0(7, "DONT_WAIT_FOR_WEB_VIEW_LOAD_FINISH_ON_PRELOADING", "DontWaitForWebViewLoadFinishOnPreloading")};
        f93314f = or0VarArr;
        kotlin.enums.a.a(or0VarArr);
    }

    public or0(int i10, String str, String str2) {
        this.f93315b = str2;
    }

    public static or0 valueOf(String str) {
        return (or0) Enum.valueOf(or0.class, str);
    }

    public static or0[] values() {
        return (or0[]) f93314f.clone();
    }
}
