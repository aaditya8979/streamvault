package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f64706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f64707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f64708c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str, int i10) {
        super(0);
        this.f64706a = context;
        this.f64707b = str;
        this.f64708c = i10;
    }

    @Override // sn.a
    public final Object invoke() {
        return this.f64706a.getPackageManager().getPackageInfo(this.f64707b, this.f64708c);
    }
}
