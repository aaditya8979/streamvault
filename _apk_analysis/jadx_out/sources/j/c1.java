package j;

import com.yk.e.callBack.MainMaterialCallback;

/* JADX INFO: loaded from: classes9.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f71833d;

    public c1(l1 l1Var, int i10, String str) {
        this.f71833d = l1Var;
        this.f71831b = i10;
        this.f71832c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = this.f71833d;
        l1Var.f71935c.IL1Iii(this.f71831b, this.f71832c, l1Var.f71934b);
        MainMaterialCallback mainMaterialCallback = this.f71833d.f71935c.f71841g;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdFail(this.f71831b, this.f71832c);
        }
    }
}
