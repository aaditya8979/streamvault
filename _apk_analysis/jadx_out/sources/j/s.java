package j;

import com.yk.e.callBack.MainMRECCallBack;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f72007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f72008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z1 f72009d;

    public s(z1 z1Var, int i10, String str) {
        this.f72009d = z1Var;
        this.f72007b = i10;
        this.f72008c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z1 z1Var = this.f72009d;
        z1Var.f72050c.IL1Iii(this.f72007b, this.f72008c, z1Var.f72049b);
        MainMRECCallBack mainMRECCallBack = this.f72009d.f72050c.f71830e;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdFail(this.f72007b, this.f72008c);
        }
    }
}
