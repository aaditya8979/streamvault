package com.iab.omid.library.appodeal.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f23892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f23893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f23894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f23895e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f23891a = context;
        this.f23892b = (AudioManager) context.getSystemService("audio");
        this.f23893c = aVar;
        this.f23894d = cVar;
    }

    private float a() {
        return this.f23893c.a(this.f23892b.getStreamVolume(3), this.f23892b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f23895e;
    }

    private void b() {
        this.f23894d.a(this.f23895e);
    }

    public void c() {
        this.f23895e = a();
        b();
        this.f23891a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f23891a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f23895e = fA;
            b();
        }
    }
}
