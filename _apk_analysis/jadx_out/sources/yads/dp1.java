package yads;

import android.os.Handler;
import android.os.Looper;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class dp1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88950d = {wb.a(dp1.class, "adView", "getAdView()Landroid/view/ViewGroup;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a03 f88951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f88952b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f88953c;

    public dp1(tc1 tc1Var, a03 a03Var) {
        this.f88951a = a03Var;
        this.f88953c = mm2.a(tc1Var);
    }
}
