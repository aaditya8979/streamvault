package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.C4844hn;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4844hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5273z0 f66939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Io f66940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4998o f66941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xk f66942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F5 f66943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4728da f66944f;

    public C4844hn(C5273z0 c5273z0, Io io2) {
        this(c5273z0, io2, C4696c4.l().a(), C4696c4.l().o(), C4696c4.l().h(), C4696c4.l().k());
    }

    public C4844hn(C5273z0 c5273z0, Io io2, C4998o c4998o, Xk xk2, F5 f52, C4728da c4728da) {
        this.f66939a = c5273z0;
        this.f66940b = io2;
        this.f66941c = c4998o;
        this.f66942d = xk2;
        this.f66943e = f52;
        this.f66944f = c4728da;
    }

    public static Intent a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", ActivityChooserModel.ATTRIBUTE_ACTIVITY, new FunctionWithThrowable() { // from class: mh.g0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C4844hn.b((Activity) obj);
            }
        });
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }
}
