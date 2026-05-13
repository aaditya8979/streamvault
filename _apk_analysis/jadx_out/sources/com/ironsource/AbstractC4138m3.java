package com.ironsource;

import android.app.Activity;
import com.ironsource.AbstractC4211q3;
import com.ironsource.J0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAdFullScreenInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;

/* JADX INFO: renamed from: com.ironsource.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4138m3<Listener extends J0> extends AbstractC4211q3<Listener> implements AdapterAdInteractionListener {

    /* JADX INFO: renamed from: com.ironsource.m3$a */
    public class a extends AbstractRunnableC4078ie {
        public a() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4138m3.this.P();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$b */
    public class b extends AbstractRunnableC4078ie {
        public b() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4138m3.this.S();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$c */
    public class c extends AbstractRunnableC4078ie {
        public c() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4138m3.this.Q();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$d */
    public class d extends AbstractRunnableC4078ie {
        public d() {
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4138m3.this.T();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.m3$e */
    public class e extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f32286c;

        public e(int i10, String str) {
            this.f32285b = i10;
            this.f32286c = str;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            AbstractC4138m3.this.b(this.f32285b, this.f32286c);
        }
    }

    public AbstractC4138m3(InterfaceC4204pd interfaceC4204pd, C4135m0 c4135m0, BaseAdAdapter<?, ?> baseAdAdapter, C3957c1 c3957c1, C4157n2 c4157n2, Listener listener) {
        super(interfaceC4204pd, c4135m0, baseAdAdapter, c3957c1, c4157n2, listener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        String str;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d());
        synchronized (this.f33314q) {
            if (this.f33302e != AbstractC4211q3.h.SHOWING) {
                ironLog.error("unexpected ad closed for " + k() + " - state = " + this.f33302e);
                E0 e02 = this.f33301d;
                if (e02 != null) {
                    e02.f29209j.l("unexpected ad closed - state = " + this.f33302e);
                }
                return;
            }
            a(AbstractC4211q3.h.NONE);
            if (this.f33301d != null) {
                String string = "";
                if (this.f33298a.a() == IronSource.a.REWARDED_VIDEO) {
                    String strF = ((J0) this.f33299b).f();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("otherInstanceAvailable = ");
                    if (strF.length() > 0) {
                        str = "true|" + strF;
                    } else {
                        str = com.ironsource.mediationsdk.metadata.a.f32683h;
                    }
                    sb2.append(str);
                    string = sb2.toString();
                }
                this.f33301d.f29208i.a(j(), string);
            }
            ((J0) this.f33299b).a((AbstractC4138m3<?>) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        IronLog.INTERNAL.verbose(d());
        E0 e02 = this.f33301d;
        if (e02 != null) {
            e02.f29208i.d(j());
        }
        ((J0) this.f33299b).c(this);
    }

    private void R() {
        IronLog.INTERNAL.verbose(d());
        ((J0) this.f33299b).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        IronLog.INTERNAL.verbose(d());
        E0 e02 = this.f33301d;
        if (e02 != null) {
            e02.f29208i.i(j());
        }
        ((J0) this.f33299b).d((AbstractC4138m3<?>) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        IronLog.INTERNAL.verbose(d());
        E0 e02 = this.f33301d;
        if (e02 != null) {
            e02.f29208i.k(j());
        }
    }

    public static String a(AbstractC4211q3.h hVar, int i10, String str) {
        return String.format(Locale.ENGLISH, "unexpected show failed, state - %s, error - %d %s", hVar, Integer.valueOf(i10), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("error = " + i10 + ", " + str));
        AbstractC4211q3.h hVar = this.f33302e;
        if (hVar == AbstractC4211q3.h.SHOWING) {
            a(AbstractC4211q3.h.FAILED);
            E0 e02 = this.f33301d;
            if (e02 != null) {
                e02.f29208i.a(j(), i10, str, null);
            }
            ((J0) this.f33299b).a(new IronSourceError(i10, str), (AbstractC4138m3<?>) this);
            return;
        }
        String strA = a(hVar, i10, str);
        ironLog.error(a(strA));
        E0 e03 = this.f33301d;
        if (e03 != null) {
            e03.f29209j.t(strA);
        }
    }

    @Override // com.ironsource.AbstractC4211q3
    public boolean B() {
        Object obj;
        if (this.f33308k == null || !y()) {
            return false;
        }
        try {
            obj = this.f33300c;
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str = "isReadyToShow - exception = " + th2.getMessage() + " - state = " + this.f33302e;
            IronLog.INTERNAL.error(a(str));
            E0 e02 = this.f33301d;
            if (e02 != null) {
                e02.f29209j.g(str);
            }
        }
        if (obj instanceof AdapterAdFullScreenInterface) {
            return ((AdapterAdFullScreenInterface) obj).isAdAvailable(this.f33308k);
        }
        IronLog.INTERNAL.error(a("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface"));
        E0 e03 = this.f33301d;
        if (e03 != null) {
            e03.f29209j.g("isReadyToShow - adapter not instance of AdapterAdFullScreenInterface");
        }
        return false;
    }

    public void a(Activity activity, C4041gd c4041gd) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(a("placementName = " + c4041gd.c()));
        try {
            this.f33304g = c4041gd;
            a(AbstractC4211q3.h.SHOWING);
            this.f33301d.f29208i.a(activity, j());
            Object obj = this.f33300c;
            if (obj instanceof AdapterAdFullScreenInterface) {
                ((AdapterAdFullScreenInterface) obj).showAd(this.f33308k, activity, this);
            } else {
                ironLog.error(a("showAd - adapter not instance of AdapterAdFullScreenInterface"));
                E0 e02 = this.f33301d;
                if (e02 != null) {
                    e02.f29209j.g("showAd - adapter not instance of AdapterAdFullScreenInterface");
                }
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            a(AbstractC4211q3.h.FAILED);
            String str = "showAd - exception = " + th2.getMessage() + " - state = " + this.f33302e;
            IronLog.INTERNAL.error(a(str));
            E0 e03 = this.f33301d;
            if (e03 != null) {
                e03.f29209j.g(str);
            }
            onAdShowFailed(A0.h(this.f33298a.a()), str);
        }
    }

    public void b(boolean z10) {
        E0 e02 = this.f33301d;
        if (e02 != null) {
            e02.f29208i.a(z10);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        if (u().e()) {
            u().a(new a());
        } else {
            P();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdEnded() {
        if (u().e()) {
            u().a(new c());
        } else {
            Q();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        if (u().e()) {
            u().a(new e(i10, str));
        } else {
            b(i10, str);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdStarted() {
        if (u().e()) {
            u().a(new b());
        } else {
            S();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdVisible() {
        if (u().e()) {
            u().a(new d());
        } else {
            T();
        }
    }
}
