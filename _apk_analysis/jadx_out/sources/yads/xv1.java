package yads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xv1 implements uu1, vu1, ja2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f96887a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f96888b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f96889c = new ArrayList();

    @Override // yads.vu1
    public final void a() {
        Iterator it = this.f96888b.iterator();
        while (it.hasNext()) {
            ((vu1) it.next()).a();
        }
    }

    @Override // yads.ja2
    public final void a(boolean z10) {
        Iterator it = this.f96889c.iterator();
        while (it.hasNext()) {
            ((ja2) it.next()).a(z10);
        }
    }

    @Override // yads.uu1
    public final void b() {
        Iterator it = this.f96887a.iterator();
        while (it.hasNext()) {
            ((uu1) it.next()).b();
        }
    }

    @Override // yads.ja2
    public final void c() {
        Iterator it = this.f96889c.iterator();
        while (it.hasNext()) {
            ((ja2) it.next()).c();
        }
    }

    @Override // yads.uu1
    public final void e() {
        Iterator it = this.f96887a.iterator();
        while (it.hasNext()) {
            ((uu1) it.next()).e();
        }
    }
}
