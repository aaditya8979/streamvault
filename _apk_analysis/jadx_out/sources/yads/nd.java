package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class nd implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ od f92821b;

    public nd(od odVar) {
        this.f92821b = odVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pd pdVar = this.f92821b.f93179c;
        if (pdVar != null) {
            ((vc) pdVar).f96056a.f96709d.removeCallbacksAndMessages(null);
        }
    }
}
