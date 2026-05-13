package com.iab.omid.library.vungle.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f24951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f24953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.a f24954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f24955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f24956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f24957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f24958h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0359a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f24960a;

            public RunnableC0359a(float f10) {
                this.f24960a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f24955e.a(this.f24960a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f24957g.set(false);
            if (((Float) d.this.f24956f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f24951a.post(new RunnableC0359a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.vungle.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f24956f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f24957g = new AtomicBoolean(false);
        this.f24958h = Executors.newSingleThreadExecutor();
        this.f24951a = handler;
        this.f24952b = context;
        this.f24953c = (AudioManager) context.getSystemService("audio");
        this.f24954d = aVar;
        this.f24955e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f24954d.a(this.f24953c.getStreamVolume(3), this.f24953c.getStreamMaxVolume(3));
    }

    private void d() {
        this.f24958h.submit(new a());
    }

    public void b() {
        d();
        this.f24952b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f24952b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f24957g.getAndSet(true)) {
            return;
        }
        d();
    }
}
