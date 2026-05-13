package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f24554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24557e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24553a = context;
        this.f24554b = (AudioManager) context.getSystemService("audio");
        this.f24555c = aVar;
        this.f24556d = cVar;
    }

    private float a() {
        return this.f24555c.a(this.f24554b.getStreamVolume(3), this.f24554b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f24557e;
    }

    private void b() {
        this.f24556d.a(this.f24557e);
    }

    public void c() {
        this.f24557e = a();
        b();
        this.f24553a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f24553a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f24557e = fA;
            b();
        }
    }
}
