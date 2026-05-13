package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f23757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f23758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f23759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23760e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f23756a = context;
        this.f23757b = (AudioManager) context.getSystemService("audio");
        this.f23758c = aVar;
        this.f23759d = cVar;
    }

    private float a() {
        return this.f23758c.a(this.f23757b.getStreamVolume(3), this.f23757b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f23760e;
    }

    private void b() {
        this.f23759d.a(this.f23760e);
    }

    public void c() {
        this.f23760e = a();
        b();
        this.f23756a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f23756a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f23760e = fA;
            b();
        }
    }
}
