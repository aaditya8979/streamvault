package com.iab.omid.library.bigosg.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f24004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f24005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f24006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f24007e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f24003a = context;
        this.f24004b = (AudioManager) context.getSystemService("audio");
        this.f24005c = aVar;
        this.f24006d = cVar;
    }

    private boolean a(float f10) {
        return f10 != this.f24007e;
    }

    private float c() {
        return this.f24005c.a(this.f24004b.getStreamVolume(3), this.f24004b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f24006d.a(this.f24007e);
    }

    public final void a() {
        this.f24007e = c();
        d();
        this.f24003a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f24003a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (a(fC)) {
            this.f24007e = fC;
            d();
        }
    }
}
