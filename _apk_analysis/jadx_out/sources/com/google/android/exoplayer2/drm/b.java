package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.i;
import java.util.concurrent.CopyOnWriteArrayList;
import s7.m0;

/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b {

    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final i.b f21524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList<C0300a> f21525c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        public static final class C0300a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f21526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public b f21527b;

            public C0300a(Handler handler, b bVar) {
                this.f21526a = handler;
                this.f21527b = bVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public a(CopyOnWriteArrayList<C0300a> copyOnWriteArrayList, int i10, @Nullable i.b bVar) {
            this.f21525c = copyOnWriteArrayList;
            this.f21523a = i10;
            this.f21524b = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(b bVar) {
            bVar.t(this.f21523a, this.f21524b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(b bVar) {
            bVar.B(this.f21523a, this.f21524b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(b bVar) {
            bVar.y(this.f21523a, this.f21524b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void q(b bVar, int i10) {
            bVar.C(this.f21523a, this.f21524b);
            bVar.v(this.f21523a, this.f21524b, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void r(b bVar, Exception exc) {
            bVar.F(this.f21523a, this.f21524b, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void s(b bVar) {
            bVar.J(this.f21523a, this.f21524b);
        }

        public void g(Handler handler, b bVar) {
            s7.a.e(handler);
            s7.a.e(bVar);
            this.f21525c.add(new C0300a(handler, bVar));
        }

        public void h() {
            for (C0300a c0300a : this.f21525c) {
                final b bVar = c0300a.f21527b;
                m0.C0(c0300a.f21526a, new Runnable() { // from class: h6.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63001b.n(bVar);
                    }
                });
            }
        }

        public void i() {
            for (C0300a c0300a : this.f21525c) {
                final b bVar = c0300a.f21527b;
                m0.C0(c0300a.f21526a, new Runnable() { // from class: h6.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62999b.o(bVar);
                    }
                });
            }
        }

        public void j() {
            for (C0300a c0300a : this.f21525c) {
                final b bVar = c0300a.f21527b;
                m0.C0(c0300a.f21526a, new Runnable() { // from class: h6.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63003b.p(bVar);
                    }
                });
            }
        }

        public void k(final int i10) {
            for (C0300a c0300a : this.f21525c) {
                final b bVar = c0300a.f21527b;
                m0.C0(c0300a.f21526a, new Runnable() { // from class: h6.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62996b.q(bVar, i10);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            for (C0300a c0300a : this.f21525c) {
                final b bVar = c0300a.f21527b;
                m0.C0(c0300a.f21526a, new Runnable() { // from class: h6.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62993b.r(bVar, exc);
                    }
                });
            }
        }

        public void m() {
            for (C0300a c0300a : this.f21525c) {
                final b bVar = c0300a.f21527b;
                m0.C0(c0300a.f21526a, new Runnable() { // from class: h6.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f62991b.s(bVar);
                    }
                });
            }
        }

        public void t(b bVar) {
            for (C0300a c0300a : this.f21525c) {
                if (c0300a.f21527b == bVar) {
                    this.f21525c.remove(c0300a);
                }
            }
        }

        @CheckResult
        public a u(int i10, @Nullable i.b bVar) {
            return new a(this.f21525c, i10, bVar);
        }
    }

    default void B(int i10, @Nullable i.b bVar) {
    }

    @Deprecated
    default void C(int i10, @Nullable i.b bVar) {
    }

    default void F(int i10, @Nullable i.b bVar, Exception exc) {
    }

    default void J(int i10, @Nullable i.b bVar) {
    }

    default void t(int i10, @Nullable i.b bVar) {
    }

    default void v(int i10, @Nullable i.b bVar, int i11) {
    }

    default void y(int i10, @Nullable i.b bVar) {
    }
}
