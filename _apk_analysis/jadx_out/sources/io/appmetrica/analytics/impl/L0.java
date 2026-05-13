package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f65508a = C4696c4.l().g().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5273z0 f65509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Re f65510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ue f65511d;

    public L0() {
        C5273z0 c5273z0 = new C5273z0();
        this.f65509b = c5273z0;
        this.f65510c = new Re(c5273z0);
        this.f65511d = new Ue();
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails) {
        l02.f65509b.getClass();
        C5248y0 c5248y0 = C5248y0.f67995e;
        tn.p.h(c5248y0);
        C4910kc c4910kcI = c5248y0.f().i();
        tn.p.h(c4910kcI);
        c4910kcI.f67119a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails, String str) {
        l02.f65509b.getClass();
        C5248y0 c5248y0 = C5248y0.f67995e;
        tn.p.h(c5248y0);
        C4910kc c4910kcI = c5248y0.f().i();
        tn.p.h(c4910kcI);
        c4910kcI.f67119a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l02.f65509b.getClass();
        C5248y0 c5248y0 = C5248y0.f67995e;
        tn.p.h(c5248y0);
        C4910kc c4910kcI = c5248y0.f().i();
        tn.p.h(c4910kcI);
        c4910kcI.f67119a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public final void a(final PluginErrorDetails pluginErrorDetails) {
        Re re2 = this.f65510c;
        re2.f65835a.a(null);
        re2.f65836b.a(pluginErrorDetails);
        Ue ue2 = this.f65511d;
        tn.p.h(pluginErrorDetails);
        ue2.getClass();
        this.f65508a.execute(new Runnable() { // from class: mh.m
            @Override // java.lang.Runnable
            public final void run() {
                L0.a(this.f74280b, pluginErrorDetails);
            }
        });
    }

    public final void a(final PluginErrorDetails pluginErrorDetails, final String str) {
        Re re2 = this.f65510c;
        re2.f65835a.a(null);
        re2.f65836b.a(pluginErrorDetails);
        if (re2.f65838d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f67631a) {
            Ue ue2 = this.f65511d;
            tn.p.h(pluginErrorDetails);
            ue2.getClass();
            this.f65508a.execute(new Runnable() { // from class: mh.l
                @Override // java.lang.Runnable
                public final void run() {
                    L0.a(this.f74277b, pluginErrorDetails, str);
                }
            });
        }
    }

    public final void a(final String str, final String str2, final PluginErrorDetails pluginErrorDetails) {
        Re re2 = this.f65510c;
        re2.f65835a.a(null);
        re2.f65837c.a(str);
        Ue ue2 = this.f65511d;
        tn.p.h(str);
        ue2.getClass();
        this.f65508a.execute(new Runnable() { // from class: mh.k
            @Override // java.lang.Runnable
            public final void run() {
                L0.a(this.f74273b, str, str2, pluginErrorDetails);
            }
        });
    }
}
