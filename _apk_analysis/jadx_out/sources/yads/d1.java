package yads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 implements l1, hq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f88683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f88684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f88685c;

    public d1(e1 e1Var) {
        this.f88683a = e1Var;
    }

    @Override // yads.l1
    public final void a(Activity activity) {
        Objects.toString(activity);
        boolean z10 = ad1.f87661a;
        if (this.f88684b == null) {
            this.f88684b = new WeakReference(activity);
        }
    }

    public final void a(Activity activity, Bundle bundle) {
        String string;
        Objects.toString(activity);
        boolean z10 = ad1.f87661a;
        if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !tn.p.f(string, this.f88685c)) {
            return;
        }
        this.f88683a.b();
    }

    @Override // yads.l1
    public final void b(Activity activity) {
        Objects.toString(activity);
        boolean z10 = ad1.f87661a;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(activity);
        boolean z11 = nt2VarA != null && nt2VarA.i();
        Intent intent = activity.getIntent();
        boolean z12 = intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false);
        WeakReference weakReference = this.f88684b;
        if ((weakReference == null || !tn.p.f(activity, (Activity) weakReference.get()) || z11) && (!z11 || z12)) {
            return;
        }
        this.f88683a.b();
    }

    public final void b(Activity activity, Bundle bundle) {
        WeakReference weakReference;
        Objects.toString(activity);
        boolean z10 = ad1.f87661a;
        if (bundle == null || (weakReference = this.f88684b) == null || !tn.p.f(activity, (Activity) weakReference.get())) {
            return;
        }
        String string = UUID.randomUUID().toString();
        this.f88685c = string;
        bundle.putString("monetization_ads_activity_id", string);
    }
}
