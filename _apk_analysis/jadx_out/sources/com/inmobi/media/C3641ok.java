package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3641ok;
import java.util.HashMap;
import java.util.Timer;

/* JADX INFO: renamed from: com.inmobi.media.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3641ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3547l1 f27803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f27804b;

    public C3641ok(AbstractC3547l1 abstractC3547l1) {
        tn.p.k(abstractC3547l1, "timeOutInformer");
        this.f27803a = abstractC3547l1;
        this.f27804b = new HashMap();
    }

    public static final void a(C3641ok c3641ok, byte b10) {
        c3641ok.f27803a.a(b10);
    }

    public final void a(byte b10) {
        tn.p.j("ok", "TAG");
        Timer timer = (Timer) this.f27804b.get(Byte.valueOf(b10));
        if (timer != null) {
            timer.cancel();
            this.f27804b.remove(Byte.valueOf(b10));
        }
    }

    public final boolean a(byte b10, long j10) {
        tn.p.j("ok", "TAG");
        if (this.f27804b.containsKey(Byte.valueOf(b10))) {
            a(b10);
        }
        try {
            Timer timer = new Timer("ok");
            this.f27804b.put(Byte.valueOf(b10), timer);
            timer.schedule(new C3616nk(this, b10), j10);
            return true;
        } catch (InternalError e10) {
            tn.p.j("ok", "TAG");
            e10.toString();
            return false;
        }
    }

    public final void b(final byte b10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: n9.x9
            @Override // java.lang.Runnable
            public final void run() {
                C3641ok.a(this.f75695b, b10);
            }
        });
    }
}
