package com.iab.omid.library.fyber.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f24278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24281e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24277a = context;
        this.f24278b = (AudioManager) context.getSystemService("audio");
        this.f24279c = aVar;
        this.f24280d = cVar;
    }

    private float a() {
        return this.f24279c.a(this.f24278b.getStreamVolume(3), this.f24278b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f24281e;
    }

    private void b() {
        this.f24280d.a(this.f24281e);
    }

    public void c() {
        this.f24281e = a();
        b();
        this.f24277a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f24277a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f24281e = fA;
            b();
        }
    }
}
