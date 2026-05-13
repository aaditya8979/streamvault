package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.InputDeviceCompat;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4914kg implements InterfaceC4811gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5241xi f67129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final We f67130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M7 f67131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C5114sg f67132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f67133f;

    public C4914kg(C5241xi c5241xi, We we2, @NonNull Handler handler) {
        this(c5241xi, we2, handler, we2.s());
    }

    public C4914kg(C5241xi c5241xi, We we2, Handler handler, boolean z10) {
        this(c5241xi, we2, handler, z10, new M7(z10), new C5114sg());
    }

    public C4914kg(C5241xi c5241xi, We we2, Handler handler, boolean z10, M7 m72, C5114sg c5114sg) {
        this.f67129b = c5241xi;
        this.f67130c = we2;
        this.f67128a = z10;
        this.f67131d = m72;
        this.f67132e = c5114sg;
        this.f67133f = handler;
    }

    public final void a() {
        if (this.f67128a) {
            return;
        }
        C5241xi c5241xi = this.f67129b;
        ResultReceiverC5164ug resultReceiverC5164ug = new ResultReceiverC5164ug(this.f67133f, this);
        c5241xi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver", resultReceiverC5164ug);
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC5232x9.f67933a;
        EnumC4703cb enumC4703cb = EnumC4703cb.EVENT_TYPE_UNDEFINED;
        N3 n32 = new N3("", "", InputDeviceCompat.SOURCE_TOUCHSCREEN, 0, anonymousInstance);
        n32.f65800m = bundle;
        G4 g42 = c5241xi.f67953a;
        c5241xi.a(C5241xi.a(n32, g42), g42, 1, (Map) null);
    }

    public final synchronized void a(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            M7 m72 = this.f67131d;
            m72.f65577b = deferredDeeplinkListener;
            if (m72.f65576a) {
                m72.a(1);
            } else {
                m72.a();
            }
        } finally {
            this.f67130c.u();
        }
    }

    public final synchronized void a(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            M7 m72 = this.f67131d;
            m72.f65578c = deferredDeeplinkParametersListener;
            if (m72.f65576a) {
                m72.a(1);
            } else {
                m72.a();
            }
        } finally {
            this.f67130c.u();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4811gg
    public final void a(@Nullable C5015og c5015og) {
        String str = c5015og == null ? null : c5015og.f67460a;
        if (!this.f67128a) {
            synchronized (this) {
                M7 m72 = this.f67131d;
                this.f67132e.getClass();
                m72.f65579d = C5114sg.a(str);
                m72.a();
            }
        }
    }
}
