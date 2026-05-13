package com.inmobi.media;

import com.inmobi.media.C3441gj;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3441gj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3580m9 f27243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27244b = 101;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f27245c = cn.w.g(101);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f27246d;

    public C3441gj(InterfaceC3580m9 interfaceC3580m9) {
        this.f27243a = interfaceC3580m9;
        List listP = cn.w.p(new C3890yk(101, 1, 102, new sn.a() { // from class: n9.a7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.a(this.f75285b);
            }
        }), new C3890yk(101, 4, 104, new sn.a() { // from class: n9.b7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.b(this.f75302b);
            }
        }), new C3890yk(102, 2, 103, new sn.a() { // from class: n9.c7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.l(this.f75317b);
            }
        }), new C3890yk(102, 3, 104, new sn.a() { // from class: n9.d7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.m(this.f75332b);
            }
        }), new C3890yk(102, 4, 104, new sn.a() { // from class: n9.e7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.n(this.f75349b);
            }
        }), new C3890yk(102, 8, 107, new sn.a() { // from class: n9.f7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.o(this.f75366b);
            }
        }), new C3890yk(102, 5, 105, new sn.a() { // from class: n9.g7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.p(this.f75387b);
            }
        }), new C3890yk(103, 5, 105, new sn.a() { // from class: n9.h7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.q(this.f75401b);
            }
        }), new C3890yk(106, 5, 105, new sn.a() { // from class: n9.i7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.r(this.f75426b);
            }
        }), new C3890yk(106, 7, 105, new sn.a() { // from class: n9.j7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.s(this.f75444b);
            }
        }), new C3890yk(103, 8, 107, new sn.a() { // from class: n9.k7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.c(this.f75460b);
            }
        }), new C3890yk(103, 4, 104, new sn.a() { // from class: n9.l7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.d(this.f75481b);
            }
        }), new C3890yk(106, 2, 106, new sn.a() { // from class: n9.m7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.e(this.f75501b);
            }
        }), new C3890yk(106, 4, 104, new sn.a() { // from class: n9.n7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.f(this.f75525b);
            }
        }), new C3890yk(106, 8, 107, new sn.a() { // from class: n9.o7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.g(this.f75545b);
            }
        }), new C3890yk(104, 8, 107, new sn.a() { // from class: n9.p7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.h(this.f75570b);
            }
        }), new C3890yk(105, 7, 106, new sn.a() { // from class: n9.q7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.i(this.f75589b);
            }
        }), new C3890yk(105, 4, 104, new sn.a() { // from class: n9.r7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.j(this.f75601b);
            }
        }), new C3890yk(105, 2, 105, new sn.a() { // from class: n9.s7
            @Override // sn.a
            public final Object invoke() {
                return C3441gj.k(this.f75613b);
            }
        }));
        LinkedHashMap linkedHashMap = new LinkedHashMap(zn.n.e(cn.p0.f(cn.x.x(listP, 10)), 16));
        for (Object obj : listP) {
            C3890yk c3890yk = (C3890yk) obj;
            linkedHashMap.put(bn.h.a(Integer.valueOf(c3890yk.f28602a), Integer.valueOf(c3890yk.f28603b)), obj);
        }
        this.f27246d = linkedHashMap;
    }

    public static final bn.r a(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "SDK loads HTML in EndCardWebView");
        }
        return bn.r.f5635a;
    }

    public static final bn.r b(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "Error: Render process gone from IDLE");
        }
        return bn.r.f5635a;
    }

    public static final bn.r c(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "WebView destroyed from LOADED");
        }
        return bn.r.f5635a;
    }

    public static final bn.r d(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "Error: WebView load FAILED due to Render Process Gone from LOADED");
        }
        return bn.r.f5635a;
    }

    public static final bn.r e(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "FireAdReady came in shown and Invisible state, no change in state");
        }
        return bn.r.f5635a;
    }

    public static final bn.r f(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "Error: Render process gone from INVISIBLE");
        }
        return bn.r.f5635a;
    }

    public static final bn.r g(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "WebView destroyed when it is not visible");
        }
        return bn.r.f5635a;
    }

    public static final bn.r h(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "WebView destroyed from FAILED");
        }
        return bn.r.f5635a;
    }

    public static final bn.r i(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "WebView invisible from SHOWN");
        }
        return bn.r.f5635a;
    }

    public static final bn.r j(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "Error: Render process gone from SHOWN");
        }
        return bn.r.f5635a;
    }

    public static final bn.r k(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "FireAdReady came in SHOWN state, no change in state");
        }
        return bn.r.f5635a;
    }

    public static final bn.r l(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", " Fire Ad ready from LOADING");
        }
        return bn.r.f5635a;
    }

    public static final bn.r m(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", " Fire Ad failed from LOADING");
        }
        return bn.r.f5635a;
    }

    public static final bn.r n(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "Error: Render process gone from LOADING");
        }
        return bn.r.f5635a;
    }

    public static final bn.r o(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", " WebView destroyed from LOADING");
        }
        return bn.r.f5635a;
    }

    public static final bn.r p(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", " WebView Show called and started rendering from LOADING");
        }
        return bn.r.f5635a;
    }

    public static final bn.r q(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "WebView Show called and started rendering from LOADED");
        }
        return bn.r.f5635a;
    }

    public static final bn.r r(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "WebView Show called on a view part of viewHierarchy but not on top");
        }
        return bn.r.f5635a;
    }

    public static final bn.r s(C3441gj c3441gj) {
        InterfaceC3580m9 interfaceC3580m9 = c3441gj.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "Focus changed from Invisible to show");
        }
        return bn.r.f5635a;
    }

    public final Integer a(int i10) {
        String str;
        C3890yk c3890yk = (C3890yk) this.f27246d.get(bn.h.a(Integer.valueOf(this.f27244b), Integer.valueOf(i10)));
        if (c3890yk == null) {
            return Integer.valueOf(this.f27244b);
        }
        c3890yk.f28605d.invoke();
        Map map = AbstractC3466hj.f27310a;
        int i11 = this.f27244b;
        Map map2 = AbstractC3466hj.f27310a;
        String str2 = (String) map2.get(Integer.valueOf(i11));
        switch (i10) {
            case 1:
                str = "IMRAID_LOAD_WEBVIEW";
                break;
            case 2:
                str = "FIRE_AD_READY";
                break;
            case 3:
                str = "FIRE_AD_FAILED";
                break;
            case 4:
                str = "ON_RENDER_PROCESS_GONE";
                break;
            case 5:
                str = "SHOW_WEBVIEW";
                break;
            case 6:
                str = "IMRAID_RENDERED";
                break;
            case 7:
                str = "IMRAID_FOCUS_CHANGE";
                break;
            case 8:
                str = "IMRAID_DESTROY_WEBVIEW";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        System.out.println((Object) ("Transition: " + str2 + " --[" + str + "]--> " + ((String) map2.get(Integer.valueOf(c3890yk.f28604c)))));
        this.f27245c.add(Integer.valueOf(c3890yk.f28604c));
        InterfaceC3580m9 interfaceC3580m9 = this.f27243a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("StateMachine", "history - " + this.f27245c);
        }
        this.f27244b = c3890yk.f28604c;
        return null;
    }
}
