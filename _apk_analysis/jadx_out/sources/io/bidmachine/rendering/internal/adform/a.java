package io.bidmachine.rendering.internal.adform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import cn.r;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.a0;
import io.bidmachine.rendering.internal.c;
import io.bidmachine.rendering.internal.e;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.internal.y;
import io.bidmachine.rendering.internal.z;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AdElementType;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.Border;
import io.bidmachine.rendering.model.Padding;
import io.bidmachine.rendering.model.PaddingKt;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.rendering.utils.VisibilityChanger;
import io.bidmachine.util.ViewUtilsKt;
import java.util.concurrent.atomic.AtomicBoolean;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends y implements io.bidmachine.rendering.internal.c, View.OnClickListener, VisibilityChanger {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0814a f70027p = new C0814a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final AdElementType[] f70028q = {AdElementType.Image, AdElementType.Label};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.repository.a f70029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AdElementParams f70030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f70031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.detector.brokencreative.a f70032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f70033g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppearanceParams f70034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final z f70035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f70036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ViewGroup f70037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f70038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile boolean f70039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile boolean f70040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f70041o;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.a$a, reason: collision with other inner class name */
    public static final class C0814a {
        private C0814a() {
        }

        public /* synthetic */ C0814a(i iVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, io.bidmachine.rendering.internal.repository.a aVar, AdElementParams adElementParams, c cVar, io.bidmachine.rendering.internal.event.b bVar, io.bidmachine.rendering.internal.detector.brokencreative.a aVar2) {
        super(bVar);
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar, "repository");
        p.k(adElementParams, "adElementParams");
        p.k(cVar, "adFormListener");
        p.k(bVar, "eventCallback");
        this.f70029c = aVar;
        this.f70030d = adElementParams;
        this.f70031e = cVar;
        this.f70032f = aVar2;
        Context applicationContext = context.getApplicationContext();
        p.j(applicationContext, "context.applicationContext");
        this.f70033g = applicationContext;
        AppearanceParams appearanceParams = adElementParams.getAppearanceParams();
        this.f70034h = appearanceParams;
        Background background = appearanceParams.getIo.appmetrica.analytics.impl.A2.g java.lang.String();
        this.f70035i = background != null ? a0.a(background, applicationContext, aVar) : null;
        this.f70036j = new AtomicBoolean(false);
        this.f70039m = true;
        this.f70041o = this.f70039m;
    }

    public final void A() {
        this.f70038l = false;
        s();
    }

    public void B() {
        this.f70038l = true;
        s();
    }

    public final void C() {
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.f70032f;
        if (aVar != null) {
            aVar.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean D() {
        View viewX = x();
        if (viewX == 0) {
            return false;
        }
        Padding padding = this.f70034h.getIo.bidmachine.iab.vast.tags.VastAttributes.PADDING java.lang.String();
        if (padding != null && !padding.isZero()) {
            FrameLayout frameLayout = new FrameLayout(this.f70033g);
            frameLayout.setId(UiUtils.generateViewId());
            PaddingKt.setPadding(frameLayout, padding);
            frameLayout.addView(viewX, new FrameLayout.LayoutParams(-1, -1));
            this.f70037k = frameLayout;
        }
        View viewK = k();
        if (viewK == null) {
            return false;
        }
        viewK.setId(UiUtils.generateViewId());
        viewK.setTag(this.f70030d.getName());
        Boolean clickable = this.f70034h.getClickable();
        if (clickable != null && clickable.booleanValue()) {
            viewK.setOnClickListener(this);
        }
        Boolean bool = this.f70034h.getIo.bidmachine.iab.vast.tags.VastAttributes.VISIBLE java.lang.String();
        if (bool != null) {
            setVisibility(bool.booleanValue());
        }
        if (viewX instanceof e) {
            ((e) viewX).a(this.f70034h);
            return true;
        }
        a(viewX, this.f70035i);
        return true;
    }

    @Override // io.bidmachine.rendering.internal.y, io.bidmachine.rendering.internal.c
    public void a() {
        super.a();
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.f70032f;
        if (aVar != null) {
            aVar.c();
        }
        z();
    }

    public final void a(View view) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        io.bidmachine.rendering.internal.detector.brokencreative.a aVar = this.f70032f;
        if (aVar != null) {
            aVar.a(view);
        }
        this.f70031e.a(this);
    }

    public void a(View view, z zVar) {
        p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (zVar != null) {
            z.a(zVar, view, (Integer) null, (Border) null, 6, (Object) null);
            return;
        }
        Integer backgroundColor = this.f70034h.getBackgroundColor();
        if (backgroundColor == null || r.P(f70028q, this.f70030d.getAdElementType())) {
            return;
        }
        ViewUtilsKt.setBackgroundColorSafely(view, backgroundColor);
    }

    @Override // io.bidmachine.rendering.internal.c
    public void a(ViewGroup viewGroup) {
        c.a.a(this, viewGroup);
    }

    public final void b(String str) {
        p.k(str, "message");
        o.a(r(), str, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.c
    public abstract /* synthetic */ void c();

    @Override // io.bidmachine.rendering.internal.c
    public void d() {
        B();
    }

    @Override // io.bidmachine.rendering.internal.c
    public void f() {
        A();
    }

    @Override // io.bidmachine.rendering.internal.c
    public final AdElementParams h() {
        return this.f70030d;
    }

    @Override // io.bidmachine.rendering.internal.c
    public boolean j() {
        return this.f70041o;
    }

    @Override // io.bidmachine.rendering.internal.c
    public View k() {
        ViewGroup viewGroup = this.f70037k;
        return viewGroup != null ? viewGroup : x();
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void lockVisibility(boolean z10) {
        setVisibility(z10);
        this.f70040n = true;
    }

    @Override // io.bidmachine.rendering.internal.c
    public void o() {
        y();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        y();
    }

    @Override // io.bidmachine.rendering.internal.y
    public String r() {
        return this.f70030d.getName();
    }

    public final void s() {
        View viewX = x();
        if (viewX == null) {
            return;
        }
        if (this.f70041o && this.f70038l) {
            if (this.f70036j.compareAndSet(false, true)) {
                a(viewX);
            }
        } else if (this.f70036j.compareAndSet(true, false)) {
            C();
        }
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void setVisibility(boolean z10) {
        this.f70039m = z10;
        if (this.f70040n) {
            return;
        }
        View viewK = k();
        if (z10) {
            ViewUtilsKt.showViewSafely(viewK);
        } else {
            ViewUtilsKt.hideViewSafely(viewK);
        }
        this.f70041o = z10;
        s();
    }

    public final c t() {
        return this.f70031e;
    }

    public String toString() {
        return "type - " + this.f70030d.getAdElementType() + ", name - " + this.f70030d.getName();
    }

    public final AppearanceParams u() {
        return this.f70034h;
    }

    @Override // io.bidmachine.rendering.utils.VisibilityChanger
    public void unlockVisibility() {
        this.f70040n = false;
        setVisibility(this.f70039m);
    }

    public final Context v() {
        return this.f70033g;
    }

    public final io.bidmachine.rendering.internal.repository.a w() {
        return this.f70029c;
    }

    public abstract View x();

    public void y() {
        io.bidmachine.rendering.internal.event.b bVarQ = q();
        View viewX = x();
        bVarQ.a(viewX != null ? viewX.getId() : -1);
    }

    public void z() {
    }
}
