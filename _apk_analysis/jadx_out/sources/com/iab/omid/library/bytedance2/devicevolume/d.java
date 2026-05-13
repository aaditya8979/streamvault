package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f24148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24151e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24147a = context;
        this.f24148b = (AudioManager) context.getSystemService("audio");
        this.f24149c = aVar;
        this.f24150d = cVar;
    }

    private float a() {
        return this.f24149c.a(this.f24148b.getStreamVolume(3), this.f24148b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f24151e;
    }

    private void b() {
        this.f24150d.a(this.f24151e);
    }

    public final void c() {
        this.f24151e = a();
        b();
        this.f24147a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void d() {
        this.f24147a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f24151e = fA;
            b();
        }
    }
}
