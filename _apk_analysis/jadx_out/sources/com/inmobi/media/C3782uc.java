package com.inmobi.media;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: renamed from: com.inmobi.media.uc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3782uc extends ContentObserver implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3832wc f28255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3782uc(C3832wc c3832wc, String str, Context context, Handler handler) {
        super(handler);
        tn.p.k(str, "mJsCallbackNamespace");
        this.f28255d = c3832wc;
        this.f28252a = str;
        this.f28253b = context;
        this.f28254c = -1;
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        context.getContentResolver().unregisterContentObserver(this);
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        p000do.i.d(A9.f25147c, null, null, new C3757tc(this, this.f28255d, z10, null), 3, null);
    }
}
