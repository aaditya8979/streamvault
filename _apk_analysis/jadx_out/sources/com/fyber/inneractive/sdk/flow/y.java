package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.util.g1;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f16710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.util.g f16711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f16712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.click.o f16713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b0 f16714g;

    public y(b0 b0Var, Context context, String str, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar, boolean z10, com.fyber.inneractive.sdk.click.o oVar) {
        this.f16714g = b0Var;
        this.f16708a = context;
        this.f16709b = str;
        this.f16710c = g1Var;
        this.f16711d = gVar;
        this.f16712e = z10;
        this.f16713f = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16714g.a(this.f16708a, this.f16709b, this.f16710c, this.f16711d, this.f16712e, this.f16713f);
    }
}
