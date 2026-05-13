package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class lp1 implements eo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mo1 f92057a;

    public lp1(mo1 mo1Var) {
        this.f92057a = mo1Var;
    }

    @Override // yads.eo1
    public final co1 a(Context context) {
        return this.f92057a.a(context, MediatedNativeAdapter.class);
    }
}
