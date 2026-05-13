package com.ironsource;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.AbstractC4158n3;
import com.ironsource.O0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class G2 extends AbstractC4158n3<K2, AdapterAdViewListener> implements InterfaceC4241s0, F2 {
    private C3923a3 K;
    private boolean L;
    private com.ironsource.mediationsdk.q M;
    private View N;
    private AbstractC4211q3<?> O;
    private FrameLayout.LayoutParams P;
    private final AtomicBoolean Q;
    private final AtomicBoolean R;

    public class a implements C3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC4211q3 f29363a;

        public a(AbstractC4211q3 abstractC4211q3) {
            this.f29363a = abstractC4211q3;
        }

        @Override // com.ironsource.C3
        public void a() {
            ((K2) this.f29363a).Q();
        }
    }

    public class b implements C3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC4211q3 f29365a;

        public b(AbstractC4211q3 abstractC4211q3) {
            this.f29365a = abstractC4211q3;
        }

        @Override // com.ironsource.C3
        public void a() {
            ((K2) this.f29365a).Q();
            G2 g22 = G2.this;
            g22.f33050s.f29208i.j(g22.n());
            G2.this.Q.set(false);
            G2.this.W();
            IronLog.INTERNAL.verbose("start binding timer after impression, expected interval = " + G2.this.f33046o.h().b() + ", current timestamp = " + System.currentTimeMillis());
            G2.this.O().h();
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29367a;

        static {
            int[] iArr = new int[O0.a.values().length];
            f29367a = iArr;
            try {
                iArr[O0.a.MANUAL_WITH_AUTOMATIC_RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29367a[O0.a.MANUAL_WITH_LOAD_ON_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public G2(List<NetworkSettings> list, U2 u22, String str, C4201pa c4201pa, C4002ea c4002ea) {
        super(new H2(str, list, u22), c4201pa, c4002ea);
        this.L = false;
        this.Q = new AtomicBoolean(true);
        this.R = new AtomicBoolean(false);
        this.K = N();
    }

    private void M() {
        int i10 = c.f29367a[this.f33048q.b().a().ordinal()];
        if (i10 == 1) {
            P().a();
        } else {
            if (i10 != 2) {
                return;
            }
            P().l();
            P().m();
            O().a();
            O().b();
        }
    }

    private C3923a3 N() {
        return new C3923a3(this.f33046o.h(), this.f33046o.g(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3923a3 O() {
        return this.K;
    }

    private C4031g3 P() {
        return (C4031g3) this.f33048q;
    }

    private ISBannerSize Q() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar == null || qVar.getSize() == null) {
            return null;
        }
        return this.M.getSize().isSmart() ? AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? com.ironsource.mediationsdk.l.a() : ISBannerSize.BANNER : this.M.getSize();
    }

    private boolean S() {
        IronLog.INTERNAL.verbose(b(this.N + ", " + this.P + ", " + this.O));
        return (this.N == null || this.P == null || this.O == null) ? false : true;
    }

    private void U() {
        int i10 = c.f29367a[this.f33048q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().r();
        }
    }

    private void V() {
        int i10 = c.f29367a[this.f33048q.b().a().ordinal()];
        if (i10 == 1) {
            P().k();
        } else {
            if (i10 != 2) {
                return;
            }
            P().q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.O = null;
        this.N = null;
        this.P = null;
    }

    private void b(AbstractC4211q3<?> abstractC4211q3, View view, FrameLayout.LayoutParams layoutParams) {
        ((K2) abstractC4211q3).R();
        com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new a(abstractC4211q3));
    }

    private void c(AbstractC4211q3<?> abstractC4211q3, View view, FrameLayout.LayoutParams layoutParams) {
        if (a(AbstractC4158n3.f.READY_TO_SHOW, AbstractC4158n3.f.SHOWING)) {
            this.R.set(false);
            O().e();
            ((K2) abstractC4211q3).R();
            com.ironsource.mediationsdk.l.a(this.M, view, layoutParams, new b(abstractC4211q3));
            return;
        }
        IronLog.INTERNAL.verbose("wrong state = " + this.f33047p);
    }

    public boolean R() {
        if (!this.M.isShown()) {
            IronLog.INTERNAL.verbose("banner or one of its parents are INVISIBLE or GONE");
            return false;
        }
        if (!this.M.hasWindowFocus()) {
            IronLog.INTERNAL.verbose("banner has no window focus");
            return false;
        }
        boolean globalVisibleRect = this.M.getGlobalVisibleRect(new Rect());
        IronLog.INTERNAL.verbose("visible = " + globalVisibleRect);
        return globalVisibleRect;
    }

    public void T() {
        com.ironsource.mediationsdk.q qVar = this.M;
        if (qVar != null) {
            a(qVar);
        }
    }

    @Override // com.ironsource.AbstractC4158n3
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC4158n3
    public AdData a(NetworkSettings networkSettings, String str) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), this.f33046o.b(), str, this.M);
    }

    @Override // com.ironsource.AbstractC4158n3, com.ironsource.D0
    public Map<String, Object> a(B0 b02) {
        Map<String, Object> mapA = super.a(b02);
        if (b(this.M)) {
            com.ironsource.mediationsdk.l.a(mapA, this.M.getSize());
        }
        if (this.f33040i != null) {
            mapA.put("placement", n());
        }
        return mapA;
    }

    @Override // com.ironsource.AbstractC4158n3
    public void a(int i10, String str, boolean z10) {
        if (!v()) {
            super.a(i10, str, z10);
            return;
        }
        if (!z10) {
            this.f33050s.f29205f.a(C4122l5.a(this.f33045n), i10, str);
            com.ironsource.mediationsdk.n.a().b(this.f33046o.b(), new IronSourceError(i10, str));
        }
        if (v()) {
            a(AbstractC4158n3.f.SHOWING);
            V();
        }
    }

    @Override // com.ironsource.AbstractC4158n3
    public void a(Context context, com.ironsource.mediationsdk.i iVar, S1 s12) {
        if (this.f33034c == null) {
            IronLog.INTERNAL.error(b("mAuctionHandler is null"));
        } else {
            iVar.a(Q());
            this.f33034c.a(context, iVar, s12);
        }
    }

    public void a(com.ironsource.mediationsdk.q qVar) {
        try {
            if (!b(qVar)) {
                String str = String.format("can't destroy banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
                IronLog.API.error("destroy banner failed - errorMessage = " + str);
                return;
            }
            IronLog.INTERNAL.verbose("destroying banner");
            M();
            K2 k22 = (K2) this.f33032a.d();
            if (k22 != null) {
                this.f33050s.f29205f.a(k22.r() != null ? k22.r().intValue() : this.C.a(this.f33046o.b()));
                k22.P();
                this.f33032a.a(null);
                this.f33032a.b(null);
            }
            com.ironsource.mediationsdk.l.a(qVar);
            this.M = null;
            this.f33040i = null;
            this.L = false;
            if (P().o()) {
                this.Q.set(true);
                this.R.set(false);
                W();
            }
            a(AbstractC4158n3.f.READY_TO_LOAD);
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            String str2 = "destroyBanner - exception = " + th2.getLocalizedMessage() + " state = " + this.f33047p;
            IronLog.INTERNAL.error(b(str2));
            E0 e02 = this.f33050s;
            if (e02 != null) {
                e02.f29209j.g(str2);
            }
        }
    }

    public void a(com.ironsource.mediationsdk.q qVar, C4041gd c4041gd) {
        String str;
        IronLog.INTERNAL.verbose("placement = " + c4041gd);
        int iB = 510;
        if (!b(qVar)) {
            str = String.format("can't load banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
        } else if (c4041gd == null || TextUtils.isEmpty(c4041gd.c())) {
            str = String.format("can't load banner - %s", c4041gd == null ? "placement is null" : "placement name is empty");
            iB = A0.b(this.f33046o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c4041gd, this.f33046o.b())) {
            str = String.format("placement %s is capped", c4041gd.c());
            iB = A0.f(this.f33046o.b());
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.API.error(b(str));
            a(iB, str, false);
        } else {
            com.ironsource.mediationsdk.l.b(qVar);
            this.M = qVar;
            this.f33040i = c4041gd;
            A();
        }
    }

    @Override // com.ironsource.AbstractC4158n3, com.ironsource.R0
    public void a(AbstractC4211q3<?> abstractC4211q3) {
        super.a(abstractC4211q3);
        if (P().o()) {
            if (!this.R.compareAndSet(false, true)) {
                IronLog.INTERNAL.verbose("Impression already recorded as receive, it can occur from network onAdOpened or from impression timeout timer - loading next ad already in progress");
            } else {
                O().b();
                U();
            }
        }
    }

    @Override // com.ironsource.InterfaceC4241s0
    public void a(AbstractC4211q3<?> abstractC4211q3, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog.INTERNAL.verbose("mState = " + this.f33047p);
        super.d(abstractC4211q3);
        if (this.f33046o.h().a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            if (a(AbstractC4158n3.f.READY_TO_SHOW, AbstractC4158n3.f.SHOWING)) {
                this.f33032a.a(abstractC4211q3);
                this.f33032a.b(abstractC4211q3);
                b(abstractC4211q3, view, layoutParams);
                P().k();
                this.f33051t.c(abstractC4211q3.f());
                return;
            }
            return;
        }
        if (P().o()) {
            this.f33032a.b(abstractC4211q3);
            if (this.Q.get()) {
                c(abstractC4211q3, view, layoutParams);
            } else {
                this.O = abstractC4211q3;
                this.N = view;
                this.P = layoutParams;
            }
            this.f33051t.c(abstractC4211q3.f());
        }
    }

    @Override // com.ironsource.AbstractC4158n3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public K2 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, int i10, String str, C4157n2 c4157n2) {
        return new K2(this, new C4135m0(IronSource.a.BANNER, this.f33046o.o(), i10, this.f33038g, str, this.f33036e, this.f33037f, networkSettings, this.f33046o.n()), baseAdAdapter, this.M, this.f33040i, v(), c4157n2, this);
    }

    @Override // com.ironsource.AbstractC4158n3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    @Override // com.ironsource.AbstractC4158n3, com.ironsource.Gb
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(i());
        try {
            if (this.M == null) {
                ironLog.error("mIronSourceBanner is null");
                this.f33050s.f29205f.b(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
                return;
            }
            boolean z10 = false;
            if (!R()) {
                if (this.f33046o.h().a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
                    ironLog.verbose("banner is not visible, reload skipped");
                    this.f33050s.f29205f.b(613);
                }
                U();
                return;
            }
            synchronized (this.f33055x) {
                if (a(AbstractC4158n3.f.SHOWING, AbstractC4158n3.f.READY_TO_LOAD)) {
                    ironLog.verbose("start reload");
                    this.L = true;
                    z10 = true;
                } else {
                    ironLog.error("wrong state = " + this.f33047p);
                }
            }
            if (z10) {
                a(this.M, this.f33040i);
            }
        } catch (Throwable th2) {
            C4228r4.d().a(th2);
            this.f33050s.f29209j.c(th2.getMessage());
        }
    }

    @Override // com.ironsource.U0
    public void b(AbstractC4211q3<?> abstractC4211q3) {
        IronLog.INTERNAL.verbose(b(abstractC4211q3.k()));
        this.f33051t.e(abstractC4211q3.f());
    }

    public boolean b(com.ironsource.mediationsdk.q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }

    @Override // com.ironsource.F2
    public void c() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, binding skipped");
            O().h();
            this.f33050s.f29205f.b(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        } else {
            if (!S()) {
                IronLog.INTERNAL.verbose("Cannot bind banner view after interval, the next ad is not ready yet");
                this.Q.set(true);
                return;
            }
            IronLog.INTERNAL.verbose("done binding timer, binding view now, current timestamp = " + System.currentTimeMillis());
            c(this.O, this.N, this.P);
        }
    }

    @Override // com.ironsource.U0
    public void c(AbstractC4211q3<?> abstractC4211q3) {
        IronLog.INTERNAL.verbose(b(abstractC4211q3.k()));
        this.f33051t.b(abstractC4211q3.f());
    }

    @Override // com.ironsource.F2
    public void d() {
        if (!R()) {
            IronLog.INTERNAL.verbose("banner is not visible, starting the impression timeout timer again");
            O().e();
        } else if (this.R.compareAndSet(false, true)) {
            IronLog.INTERNAL.verbose("banner impression timeout reached, reloading banner manually");
            U();
            this.f33050s.f29209j.b("banner impression timeout reached, reloading banner manually");
        }
    }

    @Override // com.ironsource.U0
    public void f(AbstractC4211q3<?> abstractC4211q3) {
        IronLog.INTERNAL.verbose(b(abstractC4211q3.k()));
        this.f33051t.f(abstractC4211q3.f());
    }

    @Override // com.ironsource.AbstractC4158n3
    public L0 g() {
        return new C3941b3();
    }

    @Override // com.ironsource.AbstractC4158n3
    public void g(AbstractC4211q3<?> abstractC4211q3) {
    }

    @Override // com.ironsource.AbstractC4158n3
    public Q0 h() {
        return new C4031g3(this.f33046o.h(), this);
    }

    @Override // com.ironsource.AbstractC4158n3
    public void h(AbstractC4211q3<?> abstractC4211q3) {
    }

    @Override // com.ironsource.AbstractC4158n3
    public String l() {
        return "BN";
    }

    @Override // com.ironsource.AbstractC4158n3
    public String o() {
        return IronSourceConstants.OPW_BN_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC4158n3
    public boolean v() {
        return this.L;
    }
}
