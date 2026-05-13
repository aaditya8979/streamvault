package com.inmobi.media;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.media.C3318c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3318c extends AbstractC3750t5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f26892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sn.a f26893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f26895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f26896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p000do.l0 f26897g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3318c(long j10, final C3775u5 c3775u5) {
        super(c3775u5);
        tn.p.k(c3775u5, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f26892b = j10;
        this.f26893c = new sn.a() { // from class: n9.u5
            @Override // sn.a
            public final Object invoke() {
                return C3318c.a(this.f75643b, c3775u5);
            }
        };
        this.f26894d = new AtomicBoolean(false);
        this.f26895e = new AtomicBoolean(false);
        this.f26896f = new Handler(Looper.getMainLooper());
    }

    public static final bn.r a(C3318c c3318c, InterfaceC3725s5 interfaceC3725s5) {
        if (c3318c.f26894d.get()) {
            if (c3318c.f26896f.hasMessages(2023)) {
                c3318c.f26896f.removeMessages(2023);
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && c3318c.f26895e.get()) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    tn.p.h(stackTrace);
                    ((C3775u5) interfaceC3725s5).a(new Wn(stackTrace));
                }
            }
            c3318c.f26895e.getAndSet(true);
            c3318c.f26896f.sendEmptyMessage(2023);
        }
        return bn.r.f5635a;
    }

    @Override // com.inmobi.media.AbstractC3750t5
    public final void a() {
        if (this.f26894d.getAndSet(true)) {
            return;
        }
        tn.p.k("ANRWatchDog", "name");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new B9("ANRWatchDog", false));
        tn.p.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(p000do.l1.c(executorServiceNewSingleThreadExecutor));
        this.f26897g = l0VarA;
        if (l0VarA != null) {
            F3.a(l0VarA, 0L, this.f26892b, new C3292b(this.f26893c));
        }
    }

    @Override // com.inmobi.media.AbstractC3750t5
    public final void b() {
        if (this.f26894d.getAndSet(false)) {
            this.f26894d.set(false);
            this.f26895e.set(false);
            F3.a(this.f26897g);
        }
    }
}
