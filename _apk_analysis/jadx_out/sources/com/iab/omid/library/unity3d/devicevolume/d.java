package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f24825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24828e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24824a = context;
        this.f24825b = (AudioManager) context.getSystemService("audio");
        this.f24826c = aVar;
        this.f24827d = cVar;
    }

    private float a() {
        return this.f24826c.a(this.f24825b.getStreamVolume(3), this.f24825b.getStreamMaxVolume(3));
    }

    private boolean a(float f10) {
        return f10 != this.f24828e;
    }

    private void b() {
        this.f24827d.a(this.f24828e);
    }

    public void c() {
        this.f24828e = a();
        b();
        this.f24824a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f24824a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f24828e = fA;
            b();
        }
    }
}
