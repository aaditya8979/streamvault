package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public final class S7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f26285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f26286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final go.k f26287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q1 f26288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26289e;

    public S7(Context context, p000do.l0 l0Var, ExoPlayer exoPlayer, boolean z10, go.k kVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(exoPlayer, "exoPlayer");
        tn.p.k(kVar, "playerEventsFlow");
        this.f26285a = l0Var;
        this.f26286b = exoPlayer;
        this.f26287c = kVar;
        Q1 q12 = new Q1(context);
        this.f26288d = q12;
        this.f26289e = z10;
        Q7 q72 = new Q7(this);
        tn.p.k(q72, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        q12.f26157c = new WeakReference(q72);
    }

    public final void a() {
        this.f26286b.setVolume(0.0f);
        P4.a(this.f26287c, this.f26285a, new S1(0.0f, true));
        this.f26289e = true;
    }
}
