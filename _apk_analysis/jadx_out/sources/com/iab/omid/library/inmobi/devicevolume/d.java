package com.iab.omid.library.inmobi.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f24412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f24413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f24414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.a f24415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f24416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f24417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f24418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f24419h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.inmobi.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0342a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ float f24421a;

            public RunnableC0342a(float f10) {
                this.f24421a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f24416e.a(this.f24421a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f24418g.set(false);
            if (((Float) d.this.f24417f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f24412a.post(new RunnableC0342a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.inmobi.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f24417f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f24418g = new AtomicBoolean(false);
        this.f24419h = Executors.newSingleThreadExecutor();
        this.f24412a = handler;
        this.f24413b = context;
        this.f24414c = (AudioManager) context.getSystemService("audio");
        this.f24415d = aVar;
        this.f24416e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f24415d.a(this.f24414c.getStreamVolume(3), this.f24414c.getStreamMaxVolume(3));
    }

    private void d() {
        this.f24419h.submit(new a());
    }

    public void b() {
        d();
        this.f24413b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f24413b.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f24418g.getAndSet(true)) {
            return;
        }
        d();
    }
}
