package com.inmobi.media;

import android.media.MediaPlayer;
import com.inmobi.media.C3419fn;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3419fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaPlayer f27186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p000do.l0 f27187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go.k f27189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f27190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f27191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27192g;

    public C3419fn(MediaPlayer mediaPlayer, p000do.l0 l0Var, long j10, go.k kVar) {
        tn.p.k(mediaPlayer, "mediaPlayer");
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(kVar, "progressEvents");
        this.f27186a = mediaPlayer;
        this.f27187b = l0Var;
        this.f27188c = j10;
        this.f27189d = kVar;
        this.f27190e = new AtomicBoolean(false);
        this.f27192g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.inmobi.media.C3419fn r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3419fn.a(com.inmobi.media.fn, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void a(C3419fn c3419fn, MediaPlayer mediaPlayer) {
        c3419fn.f27192g = 4;
        p000do.i.d(c3419fn.f27187b, null, null, new C3342cn(c3419fn, null), 3, null);
    }

    public final void a() {
        this.f27186a.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: n9.z6
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                C3419fn.a(this.f75719b, mediaPlayer);
            }
        });
    }

    public final boolean a(int i10, int i11, int i12) {
        return i12 >= -1 && i12 <= 4 && i10 >= i11 && this.f27192g == i12 - 1;
    }

    public final void b() {
        if (this.f27190e.getAndSet(true)) {
            return;
        }
        this.f27191f = p000do.i.d(this.f27187b, null, null, new C3393en(this, null), 3, null);
        a();
    }

    public final void c() {
        if (this.f27190e.getAndSet(false)) {
            this.f27186a.setOnCompletionListener(null);
            H6.a(this.f27191f);
            this.f27191f = null;
        }
    }
}
