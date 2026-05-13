package k;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f72645b;

    public g0(y yVar) {
        this.f72645b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f72645b;
        if (yVar.F) {
            return;
        }
        yVar.v("load ad time out!");
        this.f72645b.G = true;
    }
}
