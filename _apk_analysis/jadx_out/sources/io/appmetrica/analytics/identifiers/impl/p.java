package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends Lambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f64858a = new p();

    public p() {
        super(1);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i10 = t.f64862a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof u)) ? new s(iBinder) : (u) iInterfaceQueryLocalInterface;
    }
}
