package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class zo1 implements eo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo1 f97733a;

    public zo1(mo1 mo1Var) {
        this.f97733a = mo1Var;
    }

    @Override // yads.eo1
    public final co1 a(Context context) {
        return this.f97733a.a(context, MediatedBannerAdapter.class);
    }
}
