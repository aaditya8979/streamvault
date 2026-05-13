package rb;

import pb.f;

/* JADX INFO: compiled from: DeviceManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pb.b f78877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nb.b f78878b = new nb.b();

    @Override // rb.c
    public f a() {
        return this.f78877a;
    }

    @Override // rb.c
    public void destroy() {
        if (sb.c.a(this.f78878b)) {
            this.f78878b.a();
        }
    }
}
