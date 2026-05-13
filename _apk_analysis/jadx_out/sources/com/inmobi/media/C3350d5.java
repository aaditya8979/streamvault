package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3350d5 extends CustomTabsCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3375e5 f27015a;

    public C3350d5(C3375e5 c3375e5) {
        this.f27015a = c3375e5;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) throws JSONException {
        tn.p.k(bundle, "extras");
        super.onActivityLayout(i10, i11, i12, i13, i14, bundle);
        tn.p.j("e5", "access$getLOG_TAG$cp(...)");
        R2 r22 = this.f27015a.f27090c;
        if (r22 != null) {
            r22.a(i10, i11, i12, i13, i14);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i10, Bundle bundle) {
        super.onNavigationEvent(i10, bundle);
        tn.p.j("e5", "access$getLOG_TAG$cp(...)");
        R2 r22 = this.f27015a.f27090c;
        if (r22 != null) {
            C3401f5 c3401f5 = r22.f26223g;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 6 && c3401f5.f27135c == null) {
                            if (c3401f5.f27136d == 4) {
                                c3401f5.f27135c = Boolean.TRUE;
                            } else {
                                c3401f5.f27135c = Boolean.FALSE;
                            }
                            if (tn.p.f(c3401f5.f27135c, Boolean.TRUE)) {
                                Rh rh2 = (Rh) c3401f5.f27137e.get();
                                if (rh2 != null) {
                                    Na na2 = Na.f26025i;
                                    Ya ya2 = c3401f5.f27133a;
                                    tn.p.k(na2, "landingPageFunnelState");
                                    rh2.f26262a.getLandingPageHandler().a(na2, ya2, (Integer) 8003);
                                }
                                Rh rh3 = (Rh) c3401f5.f27137e.get();
                                if (rh3 != null) {
                                    InterfaceC3580m9 interfaceC3580m9 = rh3.f26262a.f26958i;
                                    if (interfaceC3580m9 != null) {
                                        String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                                        tn.p.j(str, "access$getTAG$cp(...)");
                                        ((C3605n9) interfaceC3580m9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    rh3.f26262a.D();
                                }
                            } else {
                                Rh rh4 = (Rh) c3401f5.f27137e.get();
                                if (rh4 != null) {
                                    Na na3 = Na.f26026j;
                                    Ya ya3 = c3401f5.f27133a;
                                    tn.p.k(na3, "landingPageFunnelState");
                                    rh4.f26262a.getLandingPageHandler().a(na3, ya3, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c3401f5.f27135c == null) {
                        c3401f5.f27135c = Boolean.FALSE;
                        Rh rh5 = (Rh) c3401f5.f27137e.get();
                        if (rh5 != null) {
                            Na na4 = Na.f26026j;
                            Ya ya4 = c3401f5.f27133a;
                            tn.p.k(na4, "landingPageFunnelState");
                            rh5.f26262a.getLandingPageHandler().a(na4, ya4, (Integer) 8004);
                        }
                    }
                } else if (c3401f5.f27135c == null) {
                    c3401f5.f27135c = Boolean.TRUE;
                    Rh rh6 = (Rh) c3401f5.f27137e.get();
                    if (rh6 != null) {
                        J2.a(rh6, Na.f26025i, c3401f5.f27133a);
                    }
                    Rh rh7 = (Rh) c3401f5.f27137e.get();
                    if (rh7 != null) {
                        InterfaceC3580m9 interfaceC3580m92 = rh7.f26262a.f26958i;
                        if (interfaceC3580m92 != null) {
                            String str2 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                            tn.p.j(str2, "access$getTAG$cp(...)");
                            ((C3605n9) interfaceC3580m92).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        rh7.f26262a.D();
                    }
                }
            } else if (!c3401f5.f27134b) {
                c3401f5.f27134b = true;
                Rh rh8 = (Rh) c3401f5.f27137e.get();
                if (rh8 != null) {
                    J2.a(rh8, Na.f26024h, c3401f5.f27133a);
                }
            }
            c3401f5.f27136d = i10;
            if (i10 == 1) {
                Rh rh9 = (Rh) r22.f26225i.get();
                if (rh9 != null) {
                    GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
                    rh9.a(Mh.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i10 == 4) {
                Rh rh10 = (Rh) r22.f26225i.get();
                if (rh10 != null) {
                    GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
                    rh10.a(Mh.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i10 == 5) {
                Rh rh11 = (Rh) r22.f26225i.get();
                if (rh11 != null) {
                    GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
                    rh11.a(Mh.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                Rh rh12 = (Rh) r22.f26225i.get();
                if (rh12 != null) {
                    InterfaceC3580m9 interfaceC3580m93 = rh12.f26262a.f26958i;
                    if (interfaceC3580m93 != null) {
                        String str3 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                        tn.p.j(str3, "access$getTAG$cp(...)");
                        ((C3605n9) interfaceC3580m93).a(str3, "onCCTScreenDisplayed");
                    }
                    rh12.f26262a.getListener().f(rh12.f26262a);
                    rh12.f26262a.b((String) null, (String) null, (String) null);
                    return;
                }
                return;
            }
            if (i10 != 6) {
                return;
            }
            Rh rh13 = (Rh) r22.f26225i.get();
            if (rh13 != null) {
                GestureDetectorOnGestureListenerC3337ci.f26935e1.getClass();
                rh13.a(Mh.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            Rh rh14 = (Rh) r22.f26225i.get();
            if (rh14 != null) {
                InterfaceC3580m9 interfaceC3580m94 = rh14.f26262a.f26958i;
                if (interfaceC3580m94 != null) {
                    String str4 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                    tn.p.j(str4, "access$getTAG$cp(...)");
                    ((C3605n9) interfaceC3580m94).a(str4, "onCCTScreenDismissed");
                }
                rh14.f26262a.W();
            }
        }
    }
}
