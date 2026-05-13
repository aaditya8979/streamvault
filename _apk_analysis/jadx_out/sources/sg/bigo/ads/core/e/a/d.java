package sg.bigo.ads.core.e.a;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.core.q;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.core.e.a.g;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f83805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f83806g = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q f83809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f83810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f83811e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<f> f83807a = p.a(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f83808b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f83812h = new Runnable() { // from class: sg.bigo.ads.core.e.a.d.2
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x027f  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0282  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x02a6  */
        @Override // java.lang.Runnable
        @android.annotation.SuppressLint({"ConcurrentModification", "IteratorRemove"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 844
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.e.a.d.AnonymousClass2.run():void");
        }
    };

    public static d a() {
        return f83806g;
    }

    public static /* synthetic */ boolean c() {
        f83805f = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        f83805f = true;
        b();
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "startCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(1, this.f83812h, 20000L);
    }

    public final void a(f fVar) {
        if (!f83805f) {
            d();
        }
        this.f83807a.add(fVar);
        g gVar = g.a.f83847a;
        g.a(fVar);
    }

    public final void b() {
        sg.bigo.ads.common.t.a.a(0, 3, "RetryTrackerManager", "stopCheckRetryTrack");
        sg.bigo.ads.common.n.d.a(this.f83812h);
    }

    public final void b(final f fVar) {
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.e.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.a.f83847a;
                g.b(fVar);
            }
        });
    }
}
