package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* JADX INFO: loaded from: classes7.dex */
public final class Eh extends Y4 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f65198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final F6 f65199x;

    public Eh(Context context, R4 r42, C4898k0 c4898k0, TimePassedChecker timePassedChecker, C4723d5 c4723d5, F6 f62, C5028p4 c5028p4) {
        super(context, r42, c4898k0, timePassedChecker, c4723d5, c5028p4);
        this.f65198w = r42.b();
        this.f65199x = f62;
    }

    public Eh(@NonNull Context context, @NonNull R4 r42, @NonNull C5028p4 c5028p4, @NonNull F6 f62, @NonNull C4817gm c4817gm, @NonNull W4 w42, @NonNull InterfaceC5132t9 interfaceC5132t9) {
        this(context, r42, new C4898k0(), new TimePassedChecker(), new C4723d5(context, r42, c5028p4, w42, c4817gm, new C5290zh(f62), C5009oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C5009oa.k().l(), interfaceC5132t9), f62, c5028p4);
    }

    @Override // io.appmetrica.analytics.impl.Y4, io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public final synchronized void a(@NonNull C5028p4 c5028p4) {
        super.a(c5028p4);
        this.f65199x.a(this.f65198w, c5028p4.f67498i);
    }
}
