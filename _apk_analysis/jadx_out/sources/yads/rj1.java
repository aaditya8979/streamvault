package yads;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class rj1 implements pi, pf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c51 f94469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sn1 f94470b;

    public rj1(c51 c51Var, sn1 sn1Var) {
        this.f94469a = c51Var;
        this.f94470b = sn1Var;
    }

    public static View a(hk3 hk3Var) {
        if (hk3Var != null) {
            return hk3Var.b();
        }
        return null;
    }

    public static u41 a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (u41) list.get(0);
    }

    @Override // yads.pi
    public final void a() {
        sn1 sn1Var;
        c51 c51Var;
        ImageView imageView = (ImageView) a((hk3) this.f94469a);
        if (imageView != null && (c51Var = this.f94469a) != null) {
            imageView.setImageDrawable(null);
            c51Var.f88355e.a(imageView);
            imageView.setVisibility(8);
            imageView.setOnClickListener(null);
            imageView.setOnTouchListener(null);
            imageView.setSelected(false);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((hk3) this.f94470b);
        if (customizableMediaView == null || (sn1Var = this.f94470b) == null) {
            return;
        }
        sn1Var.a((View) customizableMediaView);
    }

    @Override // yads.pi
    public final void a(oi oiVar, kk3 kk3Var) {
        on1 on1Var = (on1) oiVar.f93231c;
        c51 c51Var = this.f94469a;
        if (c51Var != null) {
            c51Var.a(oiVar, kk3Var, a(on1Var.f93293c));
        }
        sn1 sn1Var = this.f94470b;
        if (sn1Var != null) {
            sn1Var.a(oiVar, kk3Var, on1Var);
        }
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        on1 on1Var = (on1) obj;
        c51 c51Var = this.f94469a;
        u41 u41VarA = a(on1Var.f93293c);
        View viewA = a((hk3) c51Var);
        boolean z10 = (viewA == null || u41VarA == null || c51Var == null || !c51Var.a(viewA, u41VarA)) ? false : true;
        sn1 sn1Var = this.f94470b;
        View viewA2 = a((hk3) sn1Var);
        return z10 || (viewA2 != null && sn1Var != null && sn1Var.a(viewA2, on1Var));
    }

    @Override // yads.pf0
    public final void b(Object obj) {
        on1 on1Var = (on1) obj;
        u41 u41VarA = a(on1Var.f93293c);
        ImageView imageView = (ImageView) a((hk3) this.f94469a);
        if (imageView != null && u41VarA != null) {
            c51 c51Var = this.f94469a;
            if (c51Var != null) {
                c51Var.a(u41VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((hk3) this.f94470b);
        if (customizableMediaView == null) {
            return;
        }
        sn1 sn1Var = this.f94470b;
        if (sn1Var != null) {
            sn1Var.a(on1Var);
        }
        customizableMediaView.setVisibility(0);
    }

    @Override // yads.pi
    public final boolean b() {
        c51 c51Var;
        sn1 sn1Var = this.f94470b;
        return ((sn1Var == null || sn1Var.b() == null) && ((c51Var = this.f94469a) == null || c51Var.b() == null)) ? false : true;
    }

    @Override // yads.pi
    public final zk3 c() {
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((hk3) this.f94470b);
        ImageView imageView = (ImageView) a((hk3) this.f94469a);
        if (customizableMediaView != null) {
            return new zk3(customizableMediaView.getWidth(), customizableMediaView.getHeight());
        }
        if (imageView != null) {
            return new zk3(imageView.getWidth(), imageView.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final void c(Object obj) {
        on1 on1Var = (on1) obj;
        u41 u41VarA = a(on1Var.f93293c);
        ImageView imageView = (ImageView) a((hk3) this.f94469a);
        if (imageView != null && u41VarA != null) {
            c51 c51Var = this.f94469a;
            if (c51Var != null) {
                c51Var.a(u41VarA);
            }
            imageView.setVisibility(0);
        }
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) a((hk3) this.f94470b);
        if (customizableMediaView != null) {
            sn1 sn1Var = this.f94470b;
            if (sn1Var != null) {
                sn1Var.b(customizableMediaView, on1Var);
            }
            customizableMediaView.setVisibility(0);
        }
    }

    @Override // yads.pi
    public final boolean d() {
        sn1 sn1Var = this.f94470b;
        boolean z10 = sn1Var != null && kl3.a(sn1Var.b()) >= 100;
        c51 c51Var = this.f94469a;
        return z10 || (c51Var != null && kl3.a(c51Var.b()) >= 100);
    }

    @Override // yads.pi
    public final void destroy() {
        sn1 sn1Var = this.f94470b;
        if (sn1Var != null) {
            sn1Var.a();
        }
    }

    @Override // yads.pi
    public final boolean e() {
        sn1 sn1Var = this.f94470b;
        if (sn1Var != null && sn1Var.c()) {
            return true;
        }
        c51 c51Var = this.f94469a;
        return c51Var != null && c51Var.c();
    }
}
