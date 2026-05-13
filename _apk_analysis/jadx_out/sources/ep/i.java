package ep;

/* JADX INFO: compiled from: UpdateThread.java */
/* JADX INFO: loaded from: classes4.dex */
public class i extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f61305b;

    public i(String str) {
        super(str);
    }

    public boolean a() {
        return this.f61305b;
    }

    public void b() {
        this.f61305b = true;
    }
}
