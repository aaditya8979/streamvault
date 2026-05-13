package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f24689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24692e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24688a = context;
        this.f24689b = (AudioManager) context.getSystemService("audio");
        this.f24690c = aVar;
        this.f24691d = cVar;
    }

    private float a() {
        return this.f24690c.a(this.f24689b.getStreamVolume(3), this.f24689b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f24692e;
    }

    private void b() {
        this.f24691d.a(this.f24692e);
    }

    public void c() {
        this.f24692e = a();
        b();
        this.f24688a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f24688a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f24692e = fA;
            b();
        }
    }
}
