package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.C3670q;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlinx.coroutines.g;

/* JADX INFO: renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3670q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioManager f27914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3520k f27915c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static kotlinx.coroutines.g f27918f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static sn.l f27921i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3670q f27913a = new C3670q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f27916d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f27917e = new AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p000do.l0 f27919g = A9.f25148d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CopyOnWriteArraySet f27920h = new CopyOnWriteArraySet();

    public static final bn.r a(long j10, I2 i22) {
        tn.p.k(i22, "it");
        int i10 = i22.f25635a;
        if (i10 != 101) {
            if (i10 == 102) {
                kotlinx.coroutines.g gVar = f27918f;
                if (gVar != null) {
                    g.a.a(gVar, null, 1, null);
                }
                f27918f = null;
            }
        } else if (f27918f == null && f27916d.get()) {
            f27918f = F3.a(f27919g, 0L, j10, new C3620o(null));
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(final Context context) {
        final C3520k c3520k = f27915c;
        if (c3520k != null) {
            H3.a(new sn.a() { // from class: n9.ba
                @Override // sn.a
                public final Object invoke() {
                    return C3670q.a(context, c3520k);
                }
            });
            f27915c = null;
        }
        kotlinx.coroutines.g gVar = f27918f;
        if (gVar != null) {
            g.a.a(gVar, null, 1, null);
        }
        sn.l lVar = f27921i;
        if (lVar != null) {
            ((C3857xc) Ji.f25751e.getValue()).a(lVar);
        }
        f27921i = null;
        f27918f = null;
        return bn.r.f5635a;
    }

    public static final bn.r a(Context context, C3520k c3520k) {
        context.unregisterReceiver(c3520k);
        return bn.r.f5635a;
    }

    public static final Object a(InterfaceC3580m9 interfaceC3580m9, Context context, long j10) {
        if (f27916d.compareAndSet(false, true)) {
            return p000do.i.d(f27919g, null, null, new C3645p(interfaceC3580m9, context, j10, null), 3, null);
        }
        if (interfaceC3580m9 == null) {
            return null;
        }
        ((C3605n9) interfaceC3580m9).c("AdAudioTracker", "Audio volume tracking is already started");
        return bn.r.f5635a;
    }

    public static void a(final long j10) {
        sn.l lVar = new sn.l() { // from class: n9.z9
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3670q.a(j10, (I2) obj);
            }
        };
        f27921i = lVar;
        ((C3857xc) Ji.f25751e.getValue()).a(new int[]{102, 101}, lVar);
    }

    public static void a(final Context context, InterfaceC3580m9 interfaceC3580m9) {
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(H3.a(new sn.a() { // from class: n9.aa
            @Override // sn.a
            public final Object invoke() {
                return C3670q.a(context);
            }
        }));
        if (thM7537exceptionOrNullimpl == null || interfaceC3580m9 == null) {
            return;
        }
        ((C3605n9) interfaceC3580m9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + thM7537exceptionOrNullimpl.getMessage());
    }

    public static void a(final InterfaceC3580m9 interfaceC3580m9) {
        final Context context = Ji.f25747a;
        if (context == null) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        final long muteChangeInterval = ((AdConfig) Y3.f26611a.a(AdConfig.class)).getMraid3Config().getMuteChangeInterval();
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(H3.a(new sn.a() { // from class: n9.y9
            @Override // sn.a
            public final Object invoke() {
                return C3670q.a(interfaceC3580m9, context, muteChangeInterval);
            }
        }));
        if (thM7537exceptionOrNullimpl != null) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).b("AdAudioTracker", "Error starting audio volume tracking - " + thM7537exceptionOrNullimpl.getMessage());
            }
            a((Float) null);
        }
    }

    public static void a(Float f10) {
        if (tn.p.e((Float) f27917e.getAndSet(f10), f10)) {
            return;
        }
        Iterator it = f27920h.iterator();
        tn.p.j(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC3495j interfaceC3495j = (InterfaceC3495j) ((WeakReference) it.next()).get();
            if (interfaceC3495j != null) {
                ((Ph) interfaceC3495j).a(f10 != null ? Float.valueOf(F3.a(f10.floatValue() * 100.0f)) : null);
            }
        }
    }

    public static boolean b() {
        AudioManager audioManager;
        AudioManager audioManager2;
        C3850x5.f28483a.getClass();
        if (!C3850x5.w() ? (audioManager = f27914b) == null || audioManager.getStreamVolume(3) != 0 : (audioManager2 = f27914b) == null || !audioManager2.isStreamMute(3)) {
            if (!Ji.f25752f) {
                return false;
            }
        }
        return true;
    }

    public final synchronized float a() {
        float f10;
        boolean zB = b();
        AudioManager audioManager = f27914b;
        int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
        AudioManager audioManager2 = f27914b;
        int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
        if (zB) {
            return 0.0f;
        }
        if (streamVolume < 0) {
            return 0.0f;
        }
        if (streamVolume > streamMaxVolume) {
            f10 = 1.0f;
        } else {
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            f10 = streamVolume / streamMaxVolume;
        }
        return f10;
    }
}
