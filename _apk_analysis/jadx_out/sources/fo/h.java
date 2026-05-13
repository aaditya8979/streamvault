package fo;

import io.b0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class h<E> extends b0<h<E>> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final BufferedChannel<E> f61768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f61769g;

    public h(long j10, @Nullable h<E> hVar, @Nullable BufferedChannel<E> bufferedChannel, int i10) {
        super(j10, hVar, i10);
        this.f61768f = bufferedChannel;
        this.f61769g = new AtomicReferenceArray(BufferedChannelKt.f73292b * 2);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f61769g;
    }

    public final E A(int i10) {
        return (E) z().get(i10 * 2);
    }

    @Nullable
    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().m1((this.f68504d * ((long) BufferedChannelKt.f73292b)) + ((long) i10));
        }
        t();
    }

    public final E D(int i10) {
        E eA = A(i10);
        w(i10);
        return eA;
    }

    public final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    public final void F(int i10, @Nullable Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, E e10) {
        E(i10, e10);
    }

    @Override // io.b0
    public int r() {
        return BufferedChannelKt.f73292b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        w(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        r4 = y().f73284c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        io.x.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // io.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(int r4, @org.jetbrains.annotations.Nullable java.lang.Throwable r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r6) {
        /*
            r3 = this;
            int r5 = kotlinx.coroutines.channels.BufferedChannelKt.f73292b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.A(r4)
        Le:
            java.lang.Object r1 = r3.B(r4)
            boolean r2 = r1 instanceof p000do.s2
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof fo.q
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            if (r1 == r2) goto L63
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.p()
            if (r1 == r2) goto Le
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            io.e0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.f()
            if (r1 == r4) goto L62
            io.e0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.f73294d
            if (r1 != r4) goto L40
            goto L62
        L40:
            io.e0 r4 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.w(r4)
            if (r0 == 0) goto L73
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.y()
            sn.l<E, bn.r> r4 = r4.f73284c
            if (r4 == 0) goto L73
            io.x.a(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            goto L7f
        L7b:
            io.e0 r2 = kotlinx.coroutines.channels.BufferedChannelKt.i()
        L7f:
            boolean r1 = r3.v(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.w(r4)
            r1 = r0 ^ 1
            r3.C(r4, r1)
            if (r0 == 0) goto L9a
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.y()
            sn.l<E, bn.r> r4 = r4.f73284c
            if (r4 == 0) goto L9a
            io.x.a(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fo.h.s(int, java.lang.Throwable, kotlin.coroutines.d):void");
    }

    public final boolean v(int i10, @Nullable Object obj, @Nullable Object obj2) {
        return wl.c.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    @Nullable
    public final Object x(int i10, @Nullable Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    @NotNull
    public final BufferedChannel<E> y() {
        BufferedChannel<E> bufferedChannel = this.f61768f;
        tn.p.h(bufferedChannel);
        return bufferedChannel;
    }
}
