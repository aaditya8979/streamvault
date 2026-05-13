package org.eclipse.jetty.io;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jetty.io.Buffers;

/* JADX INFO: compiled from: PooledBuffers.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Queue<hq.d> f76662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Queue<hq.d> f76663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Queue<hq.d> f76664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f76665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f76666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f76667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f76668l;

    public c(Buffers.Type type, int i10, Buffers.Type type2, int i11, Buffers.Type type3, int i12) {
        super(type, i10, type2, i11, type3);
        this.f76665i = new AtomicInteger();
        this.f76662f = new ConcurrentLinkedQueue();
        this.f76663g = new ConcurrentLinkedQueue();
        this.f76664h = new ConcurrentLinkedQueue();
        this.f76667k = type == type3;
        this.f76668l = type2 == type3;
        this.f76666j = i12;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public hq.d b() {
        hq.d dVarPoll = this.f76662f.poll();
        if (dVarPoll == null) {
            return j();
        }
        this.f76665i.decrementAndGet();
        return dVarPoll;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public void c(hq.d dVar) {
        dVar.clear();
        if (dVar.j0() || dVar.Z()) {
            return;
        }
        if (this.f76665i.incrementAndGet() > this.f76666j) {
            this.f76665i.decrementAndGet();
            return;
        }
        if (g(dVar)) {
            this.f76662f.add(dVar);
        } else if (f(dVar)) {
            this.f76663g.add(dVar);
        } else {
            this.f76664h.add(dVar);
        }
    }

    @Override // org.eclipse.jetty.io.Buffers
    public hq.d d(int i10) {
        if (this.f76667k && i10 == e()) {
            return b();
        }
        if (this.f76668l && i10 == a()) {
            return getBuffer();
        }
        hq.d dVarPoll = this.f76664h.poll();
        while (dVarPoll != null && dVarPoll.e0() != i10) {
            this.f76665i.decrementAndGet();
            dVarPoll = this.f76664h.poll();
        }
        if (dVarPoll == null) {
            return i(i10);
        }
        this.f76665i.decrementAndGet();
        return dVarPoll;
    }

    @Override // org.eclipse.jetty.io.Buffers
    public hq.d getBuffer() {
        hq.d dVarPoll = this.f76663g.poll();
        if (dVarPoll == null) {
            return h();
        }
        this.f76665i.decrementAndGet();
        return dVarPoll;
    }

    public String toString() {
        return String.format("%s [%d/%d@%d,%d/%d@%d,%d/%d@-]", getClass().getSimpleName(), Integer.valueOf(this.f76662f.size()), Integer.valueOf(this.f76666j), Integer.valueOf(this.f76657b), Integer.valueOf(this.f76663g.size()), Integer.valueOf(this.f76666j), Integer.valueOf(this.f76659d), Integer.valueOf(this.f76664h.size()), Integer.valueOf(this.f76666j));
    }
}
