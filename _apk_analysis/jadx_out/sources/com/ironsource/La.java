package com.ironsource;

import android.graphics.Rect;
import co.b;
import com.ironsource.AbstractC4067i3;
import com.ironsource.C3978d4;
import com.ironsource.InterfaceC4307vf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class La implements Ra {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ha f29756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final L2 f29757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final Long f29758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private InterfaceC4307vf.a f29759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f29760e;

    public static final class a extends Lambda implements sn.a<bn.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC4067i3.c f29762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f29763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4067i3.c cVar, long j10) {
            super(0);
            this.f29762b = cVar;
            this.f29763c = j10;
        }

        public final void a() {
            La.this.f29756a.a(La.this.f29757b, this.f29762b, Long.valueOf(this.f29763c));
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    public La(@NotNull Ha ha2, @NotNull L2 l22, @Nullable Long l10) {
        tn.p.k(ha2, C3978d4.f.f31283e);
        tn.p.k(l22, "currentAdUnit");
        this.f29756a = ha2;
        this.f29757b = l22;
        this.f29758c = l10;
        this.f29760e = ha2.p().a();
        ha2.r();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final La la2) {
        tn.p.k(la2, "this$0");
        C4320wb.a(la2.f29756a.a(), new Runnable() { // from class: com.ironsource.li
            @Override // java.lang.Runnable
            public final void run() {
                La.d(this.f32212b);
            }
        }, 0L, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(La la2) {
        tn.p.k(la2, "this$0");
        if (!rg.a(la2.f29756a.k(), new Rect())) {
            la2.e();
            return;
        }
        long jA = la2.f29756a.p().a();
        long j10 = jA - la2.f29760e;
        Long l10 = la2.f29758c;
        C4320wb.a((C4320wb) la2.f29756a.a(), AbstractRunnableC4078ie.f31961a.a(la2.new a(new AbstractC4067i3.c(l10 != null ? jA - l10.longValue() : 0L, new AbstractC4067i3.d.f(j10)), jA)), 0L, 2, (Object) null);
    }

    private final void e() {
        long jQ = this.f29756a.q();
        InterfaceC4307vf interfaceC4307vfO = this.f29756a.o();
        Runnable runnable = new Runnable() { // from class: com.ironsource.mi
            @Override // java.lang.Runnable
            public final void run() {
                La.c(this.f32988b);
            }
        };
        b.a aVar = co.b.f6773c;
        this.f29759d = interfaceC4307vfO.a(runnable, co.d.t(jQ, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.M0
    public void a(@Nullable IronSourceError ironSourceError) {
        this.f29756a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.M0
    public void a(@NotNull C4258t0 c4258t0) {
        tn.p.k(c4258t0, "adUnitCallback");
        this.f29756a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ra
    public void b() {
        this.f29756a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ra
    public void c() {
        InterfaceC4307vf.a aVar = this.f29759d;
        if (aVar != null) {
            aVar.a();
        }
        this.f29757b.a(true);
        Ha ha2 = this.f29756a;
        ha2.a((Ra) new Ka(ha2));
    }

    @Override // com.ironsource.Ra
    public void d() {
        InterfaceC4307vf.a aVar = this.f29759d;
        if (aVar != null) {
            aVar.a();
        }
        Ha ha2 = this.f29756a;
        ha2.a((Ra) new Na(ha2, this.f29757b));
    }

    @Override // com.ironsource.Ra
    public void f() {
    }
}
