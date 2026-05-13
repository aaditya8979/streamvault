package yads;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class zp1 implements eo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo1 f97740a;

    public zp1(mo1 mo1Var) {
        this.f97740a = mo1Var;
    }

    @Override // yads.eo1
    public final co1 a(Context context) {
        return this.f97740a.a(context, MediatedRewardedAdapter.class);
    }
}
