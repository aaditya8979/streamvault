package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.inmobi.media.C3805va;
import com.inmobi.media.GestureDetectorOnGestureListenerC3337ci;
import com.inmobi.media.Ne;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C3978d4;
import com.ironsource.C4089j8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3805va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f28354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3580m9 f28356c;

    public C3805va(int i10, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "mRenderView");
        this.f28354a = gestureDetectorOnGestureListenerC3337ci;
        this.f28355b = i10;
    }

    public static final bn.r a(C3805va c3805va, Ff ff2, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "it");
        if (!gestureDetectorOnGestureListenerC3337ci.O0) {
            gestureDetectorOnGestureListenerC3337ci.a(ff2);
            return bn.r.f5635a;
        }
        InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
        if (interfaceC3580m9 != null) {
            String str = AbstractC3830wa.f28425a;
            tn.p.j(str, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).b(str, "setOrientationProperties called on unloaded ad");
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(C3805va c3805va, Ne ne2) {
        tn.p.k(ne2, "response");
        if (AbstractC3443gl.a(ne2)) {
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str = AbstractC3830wa.f28425a;
                tn.p.j(str, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).a(str, "asyncPing Successful");
            }
        } else {
            InterfaceC3580m9 interfaceC3580m92 = c3805va.f28356c;
            if (interfaceC3580m92 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str2, "asyncPing Failed");
            }
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(boolean z10, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "it");
        gestureDetectorOnGestureListenerC3337ci.setDisableBackButton(z10);
        return bn.r.f5635a;
    }

    public static final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, C3805va c3805va, String str) {
        try {
            gestureDetectorOnGestureListenerC3337ci.m();
        } catch (Exception e10) {
            c3805va.f28354a.a(str, "Unexpected error", "close");
            Kb.a((byte) 1, "InMobi", "Failed to close ad; SDK encountered an unexpected error");
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str2, "SDK encountered an expected error in handling the close() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(C3805va c3805va) {
        if (c3805va.f28354a.getEmbeddedBrowserJsCallbacks() != null) {
            S5 embeddedBrowserJsCallbacks = c3805va.f28354a.getEmbeddedBrowserJsCallbacks();
            if (embeddedBrowserJsCallbacks != null) {
                M8.a(((K8) embeddedBrowserJsCallbacks).f25802a);
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
        if (interfaceC3580m9 != null) {
            String str = AbstractC3830wa.f28425a;
            tn.p.j(str, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).b(str, "Found a null instance of EmbeddedBrowserJSCallback instance to closeCustomExpand");
        }
    }

    public static final void a(C3805va c3805va, int i10) {
        c3805va.f28354a.setInitialScale(i10);
    }

    public static final void a(C3805va c3805va, Ya ya2, String str, int i10, String str2, float f10, boolean z10) {
        try {
            if (c3805va.f28354a.getEmbeddedBrowserJsCallbacks() == null) {
                InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
                if (interfaceC3580m9 != null) {
                    String str3 = AbstractC3830wa.f28425a;
                    tn.p.j(str3, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m9).b(str3, "Found a null instance of EmbeddedBrowserJSCallback instance to customExpand");
                }
                c3805va.f28354a.getLandingPageHandler().a(Na.f26021e, ya2, (Integer) 8002);
                return;
            }
            InterfaceC3580m9 interfaceC3580m92 = c3805va.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).a(str4, "Custom expand called. Url: " + str);
            }
            R5 r52 = R5.values()[i10];
            if (r52 != R5.f26227a) {
                S5 embeddedBrowserJsCallbacks = c3805va.f28354a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks != null) {
                    ((K8) embeddedBrowserJsCallbacks).a(str, r52, f10, z10, c3805va.f28354a.getViewTouchTimestamp(), ya2);
                }
                c3805va.f28354a.getLandingPageHandler().a(Na.f26022f, ya2, (Integer) null);
                Ma ma2 = c3805va.f28354a.getLandingPageHandler().f26428d;
                if (ma2 != null) {
                    ma2.b("customExpand", str2, str);
                    return;
                }
                return;
            }
            int iA = c3805va.f28354a.getLandingPageHandler().a("customExpand", str2, str, ya2, (P2) null);
            InterfaceC3580m9 interfaceC3580m93 = c3805va.f28356c;
            if (interfaceC3580m93 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).a(str5, "processCustomExpandRequest: " + iA);
            }
            if (iA != 3) {
                S5 embeddedBrowserJsCallbacks2 = c3805va.f28354a.getEmbeddedBrowserJsCallbacks();
                if (embeddedBrowserJsCallbacks2 != null) {
                    M8.a(((K8) embeddedBrowserJsCallbacks2).f25802a);
                    return;
                }
                return;
            }
            S5 embeddedBrowserJsCallbacks3 = c3805va.f28354a.getEmbeddedBrowserJsCallbacks();
            if (embeddedBrowserJsCallbacks3 != null) {
                ((K8) embeddedBrowserJsCallbacks3).a(str, r52, f10, z10, c3805va.f28354a.getViewTouchTimestamp(), ya2);
            }
            c3805va.f28354a.getLandingPageHandler().a(Na.f26022f, ya2, (Integer) null);
            Ma ma3 = c3805va.f28354a.getLandingPageHandler().f26428d;
            if (ma3 != null) {
                ma3.b("customExpand", str2, str);
            }
        } catch (Exception e10) {
            c3805va.f28354a.a(str2, "Unexpected error", "customExpand");
            c3805va.f28354a.getLandingPageHandler().a(Na.f26021e, ya2, (Integer) 9);
            Kb.a((byte) 1, "InMobi", "Failed to custom expand ad; SDK encountered an unexpected error");
            InterfaceC3580m9 interfaceC3580m94 = c3805va.f28356c;
            if (interfaceC3580m94 != null) {
                String str6 = AbstractC3830wa.f28425a;
                tn.p.j(str6, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m94).b(str6, "SDK encountered unexpected error in handling customExpand() request; " + e10.getMessage());
            }
        }
    }

    public static final void a(C3805va c3805va, String str) {
        try {
            c3805va.f28354a.getSiblingWebviewManager().a(c3805va.f28354a.getRoute().f25331b, str);
        } catch (Exception e10) {
            c3805va.f28354a.a("destroyWebView", AbstractC3763ti.a(str, 311));
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str2, "SDK encountered unexpected error in handling destroyWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(C3805va c3805va, String str, String str2) {
        try {
            c3805va.f28354a.getSiblingWebviewManager().a(c3805va.f28354a.getRoute().f25331b, str, str2);
        } catch (Exception e10) {
            c3805va.f28354a.a("loadWebView", AbstractC3763ti.a(str, 308));
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str3, "SDK encountered unexpected error in handling loadWebView() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void a(C3805va c3805va, boolean z10, String str) {
        try {
            c3805va.f28354a.e(z10);
        } catch (Exception e10) {
            c3805va.f28354a.a(str, "Unexpected error", "disableCloseRegion");
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str2, "SDK encountered unexpected error in handling disableCloseRegion() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void b(C3805va c3805va) {
        try {
            c3805va.f28354a.H();
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str = AbstractC3830wa.f28425a;
                tn.p.j(str, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str, "SDK encountered unexpected error in getting/setting current position; " + e10.getMessage());
            }
        }
    }

    public static final void b(final C3805va c3805va, String str) {
        Ff orientationProperties = c3805va.f28354a.getOrientationProperties();
        tn.p.k(str, "json");
        tn.p.k(orientationProperties, "op");
        final Ff ff2 = new Ff();
        ff2.f25443d = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("forceOrientation", orientationProperties.f25441b);
            tn.p.j(strOptString, "optString(...)");
            tn.p.k(strOptString, "<set-?>");
            ff2.f25441b = strOptString;
            ff2.f25440a = jSONObject.optBoolean("allowOrientationChange", orientationProperties.f25440a);
            String strOptString2 = jSONObject.optString("direction", orientationProperties.f25442c);
            tn.p.j(strOptString2, "optString(...)");
            tn.p.k(strOptString2, "<set-?>");
            ff2.f25442c = strOptString2;
            if (!tn.p.f(ff2.f25441b, C3978d4.i.D) && !tn.p.f(ff2.f25441b, C3978d4.i.C)) {
                tn.p.k("none", "<set-?>");
                ff2.f25441b = "none";
            }
            if (!tn.p.f(ff2.f25442c, "left") && !tn.p.f(ff2.f25442c, "right")) {
                tn.p.k("right", "<set-?>");
                ff2.f25442c = "right";
            }
        } catch (JSONException unused) {
            ff2 = null;
        }
        if (ff2 != null) {
            c3805va.f28354a.getWebViewFactory().a(new sn.l() { // from class: n9.bb
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return C3805va.a(this.f75306b, ff2, (GestureDetectorOnGestureListenerC3337ci) obj);
                }
            });
        }
    }

    public static final void b(C3805va c3805va, String str, String str2) {
        Ua.a(c3805va.f28354a.getLandingPageHandler(), "open", str, str2, (Ya) null, 24);
    }

    public static final void b(C3805va c3805va, boolean z10, String str) {
        try {
            c3805va.f28354a.f(z10);
        } catch (Exception e10) {
            c3805va.f28354a.a(str, "Unexpected error", "useCustomClose");
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str2, "SDK encountered internal error in handling useCustomClose() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void c(C3805va c3805va) {
        try {
            c3805va.f28354a.I();
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str = AbstractC3830wa.f28425a;
                tn.p.j(str, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str, "SDK encountered unexpected error in getting/setting default position; " + e10.getMessage());
            }
        }
    }

    public static final void c(C3805va c3805va, String str) {
        try {
            c3805va.f28354a.getSiblingWebviewManager().b(c3805va.f28354a.getRoute().f25331b, str);
        } catch (Exception e10) {
            c3805va.f28354a.a("showWebView", AbstractC3763ti.a(str, 309));
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str2, "SDK encountered unexpected error in handling showEndCard() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void c(C3805va c3805va, String str, String str2) {
        Ya ya2;
        try {
            Za za2 = c3805va.f28354a.getLandingPageHandler().f26430f;
            if (za2 != null) {
                String strA = Pa.a(str2);
                Ua landingPageHandler = c3805va.f28354a.getLandingPageHandler();
                int i10 = landingPageHandler.f26433i + 1;
                landingPageHandler.f26433i = i10;
                ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
            } else {
                ya2 = null;
            }
            if (ya2 != null) {
                ya2.f26632f = "IN_NATIVE";
            }
            c3805va.f28354a.getLandingPageHandler().d("openEmbedded", str, str2, ya2);
        } catch (Exception e10) {
            c3805va.f28354a.a(str, "Unexpected error", "openEmbedded");
            Kb.a((byte) 1, "InMobi", "Failed to open URL; SDK encountered unexpected error");
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str3, "SDK encountered unexpected error in handling openEmbedded() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void d(C3805va c3805va, String str, String str2) {
        Ua.a(c3805va.f28354a.getLandingPageHandler(), "openWithoutTracker", str, str2, (Ya) null, 8);
    }

    public static final void e(C3805va c3805va, String str, String str2) {
        try {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = c3805va.f28354a;
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = tn.p.m(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            gestureDetectorOnGestureListenerC3337ci.b(str, str2.subSequence(i10, length + 1).toString());
        } catch (Exception e10) {
            c3805va.f28354a.a(str, "Unexpected error", "playVideo");
            Kb.a((byte) 1, "InMobi", "Error playing video; SDK encountered an unexpected error");
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str3, "SDK encountered unexpected error in handling playVideo() request from creative; " + e10.getMessage());
            }
        }
    }

    public static final void f(C3805va c3805va, String str, String str2) {
        try {
            c3805va.f28354a.getSiblingWebviewManager().b(c3805va.f28354a.getRoute().f25331b, str, str2);
        } catch (Exception e10) {
            c3805va.f28354a.a(C4089j8.f32053j, AbstractC3763ti.a(str, 310));
            InterfaceC3580m9 interfaceC3580m9 = c3805va.f28356c;
            if (interfaceC3580m9 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str3, "SDK encountered unexpected error in handling sendMessage() request from creative; " + e10.getMessage());
            }
        }
    }

    public final Pm a(String str) {
        try {
            for (Object obj : Pm.f26145c) {
                if (tn.p.f(((Pm) obj).f26146a, str)) {
                    return (Pm) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Exception unused) {
            InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
            if (interfaceC3580m9 == null) {
                return null;
            }
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "No matching action found for - " + str);
            return null;
        }
    }

    public final GestureDetectorOnGestureListenerC3337ci a() {
        if (tn.p.f(this.f28354a.getRoute().f25331b, "default")) {
            return this.f28354a;
        }
        ko webViewFactory = this.f28354a.getWebViewFactory();
        webViewFactory.getClass();
        tn.p.k("default", "id");
        return (GestureDetectorOnGestureListenerC3337ci) webViewFactory.f27501b.get("default");
    }

    public final void a(final String str, final String str2, final int i10, final float f10, final boolean z10, final Ya ya2) {
        if (ya2 != null) {
            ya2.f26632f = "IN_CUSTOM";
        }
        new Handler(this.f28354a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: n9.hb
            @Override // java.lang.Runnable
            public final void run() {
                C3805va.a(this.f75407b, ya2, str2, i10, str, f10, z10);
            }
        });
    }

    public final void a(String str, JSONObject jSONObject) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "fireVideoError " + this + " - " + jSONObject);
        }
        if (str != null) {
            this.f28354a.a(str, "broadcastEvent('VideoCommandError'," + jSONObject + ")");
        }
    }

    @JavascriptInterface
    public final void asyncPing(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "url");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "asyncPing called: " + str2);
        }
        if (!URLUtil.isValidUrl(str2)) {
            this.f28354a.a(str, "Invalid url", "asyncPing");
            return;
        }
        try {
            p000do.p0 p0VarA = ((C3779u9) He.f25608c.getValue()).a(new Je(str2, null, null, null, null, false, 62));
            sn.l lVar = new sn.l() { // from class: n9.jb
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return C3805va.a(this.f75448b, (Ne) obj);
                }
            };
            tn.p.k(p0VarA, "<this>");
            tn.p.k(lVar, "onCompleted");
            p000do.i.d(A9.f25147c, null, null, new A3(p0VarA, lVar, null), 3, null);
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "asyncPing");
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "SDK encountered internal error in handling asyncPing() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void cancelSaveContent(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "mediaId");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "cancelSaveContent called. mediaId:" + str2);
        }
    }

    @JavascriptInterface
    public final void close(@Nullable final String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "close called");
        }
        final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).a(str3, "webview not present cannot be closed");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3337ciA.O0) {
            Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
            Runnable runnable = new Runnable() { // from class: n9.kb
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.a(gestureDetectorOnGestureListenerC3337ciA, this, str);
                }
            };
            wb2.getClass();
            tn.p.k(runnable, "runnable");
            wb2.f26536a.post(runnable);
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).b(str4, "close called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void closeAll(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "closeAll is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            gestureDetectorOnGestureListenerC3337ciA.g();
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void closeCustomExpand(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "closeCustomExpand called.");
        }
        if (this.f28355b == 1) {
            if (this.f28354a != null) {
                new Handler(this.f28354a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: n9.xa
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3805va.a(this.f75697b);
                    }
                });
                return;
            }
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).b(str4, "closeCustomExpand called in incorrect Ad type: " + this.f28355b);
        }
    }

    @JavascriptInterface
    public final void createVideoPlayer(@Nullable String str, @Nullable String str2) throws JSONException {
        Object objD;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "createVideoPlayer is called with config - " + str2);
        }
        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid config");
        jSONObject.put("jsCommand", "createVideoPlayer");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                tn.p.k(jSONObject2, "jsonObject");
                tn.p.k(HtmlVideoPlayerRequest.class, "type");
                HtmlVideoPlayerRequest htmlVideoPlayerRequest = (HtmlVideoPlayerRequest) HtmlVideoPlayerRequest.class.cast(AbstractC3581ma.a(jSONObject2, HtmlVideoPlayerRequest.class, null, null));
                if (htmlVideoPlayerRequest == null || (objD = p000do.i.d(A9.f25150f, null, null, new C3656pa(this, htmlVideoPlayerRequest, null), 3, null)) == null) {
                    EnumC3654p8 enumC3654p8 = EnumC3654p8.f27841b;
                    a(str, jSONObject);
                    obj = bn.r.f5635a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3654p8 enumC3654p82 = EnumC3654p8.f27841b;
                a(str, jSONObject);
                InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
                if (interfaceC3580m92 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m92).a(str4, "Error while creating config Json.", e10);
                    obj = bn.r.f5635a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3654p8 enumC3654p83 = EnumC3654p8.f27841b;
        a(str, jSONObject);
        bn.r rVar = bn.r.f5635a;
    }

    @JavascriptInterface
    public final void customExpand(@Nullable String str, @Nullable String str2, int i10, float f10, boolean z10, boolean z11) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->customExpand(Ljava/lang/String;Ljava/lang/String;IFZZ)V");
        safedk_va_customExpand_ffb33700094ade89f7204b785950f1d7(str, str2, i10, f10, z10, z11);
        BrandSafetyUtils.onMraidExpand(com.safedk.android.utils.g.f53135i, str, str2, this.f28354a, "imraid.customExpand");
    }

    @JavascriptInterface
    public final void customExpandInNative(@Nullable String str, @NotNull String str2, float f10, boolean z10) {
        Ya ya2;
        tn.p.k(str2, "url");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "customExpandInNative called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "customExpandInNative called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f28355b != 1) {
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b(str5, "customExpandInNative called in incorrect Ad type: " + this.f28355b);
                return;
            }
            return;
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            gestureDetectorOnGestureListenerC3337ci.a(str, "Invalid screenPercentage", "customExpandInNative");
            return;
        }
        Za za2 = gestureDetectorOnGestureListenerC3337ci.getLandingPageHandler().f26430f;
        if (za2 != null) {
            String strA = Pa.a(str2);
            Ua landingPageHandler = this.f28354a.getLandingPageHandler();
            int i10 = landingPageHandler.f26433i + 1;
            landingPageHandler.f26433i = i10;
            ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
        } else {
            ya2 = null;
        }
        Ya ya3 = ya2;
        if (ya3 != null) {
            ya3.f26632f = "IN_NATIVE";
        }
        this.f28354a.getLandingPageHandler().a(Na.f26020d, ya3, (Integer) 8010);
        int iA = this.f28354a.getLandingPageHandler().a("customExpandInNative", str, str2, ya3, new P2(f10, z10));
        InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
        if (interfaceC3580m94 != null) {
            String str6 = AbstractC3830wa.f28425a;
            tn.p.j(str6, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m94).a(str6, "customExpandInNativeRequest: " + iA);
        }
        if (iA == 3) {
            R5 r52 = R5.f26227a;
            a(str, str2, 0, f10, !z10, ya3);
        }
    }

    @JavascriptInterface
    public final void destroyVideoPlayer(@Nullable String str) {
        p000do.i.d(A9.f25150f, null, null, new C3681qa(this, null), 3, null);
    }

    @JavascriptInterface
    public final void destroyWebView(@Nullable String str, @Nullable final String str2) throws JSONException {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "destroyWebView called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null && gestureDetectorOnGestureListenerC3337ciA.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "destroyWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
            if (str2 == null) {
                str2 = "";
            }
            bn.g gVar = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3337ci.a("destroyWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
            Runnable runnable = new Runnable() { // from class: n9.ib
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.a(this.f75434b, str2);
                }
            };
            wb2.getClass();
            tn.p.k(runnable, "runnable");
            wb2.f26536a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f28354a;
        if (str2 == null) {
            str2 = "";
        }
        bn.g gVar2 = AbstractC3763ti.f28193a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC3337ci2.a("destroyWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void disableBackButton(@Nullable String str, final boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "disableBackButton called");
        }
        this.f28354a.getWebViewFactory().a(new sn.l() { // from class: n9.gb
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3805va.a(z10, (GestureDetectorOnGestureListenerC3337ci) obj);
            }
        });
    }

    @JavascriptInterface
    public final void disableCloseRegion(@Nullable final String str, final boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "disableCloseRegion called");
        }
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        Runnable runnable = new Runnable() { // from class: n9.wa
            @Override // java.lang.Runnable
            public final void run() {
                C3805va.a(this.f75679b, z10, str);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    @JavascriptInterface
    public final void enableNativeGestures(@Nullable String str, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "enableNativeGestures called with enabled: " + z10);
        }
        this.f28354a.setEnableNativeGestures(z10);
    }

    @JavascriptInterface
    public final void enableTouchBeginCallback(@Nullable String str, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "enableTouchBeginCallback called with enabled: " + z10);
        }
        this.f28354a.setEnableTouchBeginCallback(z10);
    }

    @JavascriptInterface
    public final void enableTouchEndCallback(@Nullable String str, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "enableTouchEndCallback called with enabled: " + z10);
        }
        this.f28354a.setEnableTouchEndCallback(z10);
    }

    @JavascriptInterface
    public final void executeVideoPlayerActions(@Nullable String str, @NotNull String str2, @Nullable String str3) throws JSONException {
        tn.p.k(str2, "action");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str4, "executeVideoPlayerActions is called with action - " + str2 + ", " + str3);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoCommand", str2);
        jSONObject.put("config", str3);
        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMessage", "Invalid action");
        jSONObject2.put("jsCommand", "executeVideoPlayerActions");
        jSONObject2.put("params", String.valueOf(jSONObject));
        try {
            Pm pmA = a(str2);
            if (pmA == null || p000do.i.d(A9.f25150f, null, null, new C3705ra(this, pmA, jSONObject, null), 3, null) == null) {
                EnumC3654p8 enumC3654p8 = EnumC3654p8.f27841b;
                a(str, jSONObject2);
                bn.r rVar = bn.r.f5635a;
            }
        } catch (JSONException e10) {
            EnumC3654p8 enumC3654p82 = EnumC3654p8.f27841b;
            a(str, jSONObject2);
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).a(str5, "Error while creating action Json.", e10);
            }
        }
    }

    @JavascriptInterface
    public final void fireAdFailed(@Nullable String str) {
        try {
            InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).a(str2, "fireAdFailed called.");
            }
            this.f28354a.p();
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "fireAdFailed");
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "SDK encountered unexpected error in handling fireAdFailed() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireAdReady(@Nullable String str) {
        try {
            InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).a(str2, "fireAdReady called.");
            }
            this.f28354a.q();
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "fireAdReady");
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "SDK encountered unexpected error in handling fireAdReady() signal from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void fireComplete(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "fireComplete is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            gestureDetectorOnGestureListenerC3337ci.h();
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
        }
    }

    @JavascriptInterface
    public final void fireSkip(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9;
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).a(str2, "fireSkip is called");
        }
        if (this.f28354a == null && (interfaceC3580m9 = this.f28356c) != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).b(str3, "Found a null instance of render view!");
        }
        this.f28354a.P();
    }

    @JavascriptInterface
    @Nullable
    public final String getAdContext(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getAdContext is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            InterfaceC3820w0 adPodHandler = gestureDetectorOnGestureListenerC3337ciA.getAdPodHandler();
            if (adPodHandler != null) {
                return ((AbstractC3547l1) adPodHandler).u();
            }
            return null;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
        }
        return null;
    }

    @JavascriptInterface
    public final void getBlob(@Nullable String str, @Nullable String str2) {
        E2 e22;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "getBlob is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = gestureDetectorOnGestureListenerC3337ci.f26958i;
        if (interfaceC3580m93 != null) {
            String str5 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str5, "TAG");
            ((C3605n9) interfaceC3580m93).a(str5, "getBlob");
        }
        if (str == null || str2 == null || (e22 = gestureDetectorOnGestureListenerC3337ci.f26961j0) == null) {
            return;
        }
        ((AbstractC3547l1) e22).a(str, str2, gestureDetectorOnGestureListenerC3337ci, gestureDetectorOnGestureListenerC3337ci.getImpressionId());
    }

    @JavascriptInterface
    @NotNull
    public final String getCurrentPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getCurrentPosition called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci2 == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 == null) {
                return "";
            }
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
            return "";
        }
        synchronized (gestureDetectorOnGestureListenerC3337ci2.getCurrentPositionMonitor()) {
            this.f28354a.F = true;
            new Handler(this.f28354a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: n9.nb
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.b(this.f75528b);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC3337ci = this.f28354a;
                if (gestureDetectorOnGestureListenerC3337ci.F) {
                    try {
                        gestureDetectorOnGestureListenerC3337ci.getCurrentPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    bn.r rVar = bn.r.f5635a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3337ci.getCurrentPosition();
    }

    @JavascriptInterface
    public final int getCurrentRenderingIndex(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getCurrentRenderingIndex is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            return gestureDetectorOnGestureListenerC3337ciA.getCurrentRenderingPodAdIndex();
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 == null) {
            return 0;
        }
        String str3 = AbstractC3830wa.f28425a;
        tn.p.j(str3, "access$getTAG$p(...)");
        ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
        return 0;
    }

    @JavascriptInterface
    @NotNull
    public final String getDefaultPosition(@Nullable String str) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getDefaultPosition called");
        }
        synchronized (this.f28354a.getDefaultPositionMonitor()) {
            this.f28354a.E = true;
            new Handler(this.f28354a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: n9.cb
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.c(this.f75326b);
                }
            });
            while (true) {
                gestureDetectorOnGestureListenerC3337ci = this.f28354a;
                if (gestureDetectorOnGestureListenerC3337ci.E) {
                    try {
                        gestureDetectorOnGestureListenerC3337ci.getDefaultPositionMonitor().wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    bn.r rVar = bn.r.f5635a;
                }
            }
        }
        return gestureDetectorOnGestureListenerC3337ci.getDefaultPosition();
    }

    @JavascriptInterface
    public final int getDeviceVolume(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getDeviceVolume called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
            }
            return -1;
        }
        try {
            C3832wc mediaProcessor = gestureDetectorOnGestureListenerC3337ci.getMediaProcessor();
            if (mediaProcessor != null) {
                return mediaProcessor.a();
            }
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "getDeviceVolume");
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b(str4, "SDK encountered unexpected error in handling getDeviceVolume() request from creative; " + e10.getMessage());
            }
        }
        return -1;
    }

    @JavascriptInterface
    public final int getMaxDeviceVolume(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getMaxDeviceVolume called");
        }
        try {
            C3850x5 c3850x5 = C3850x5.f28483a;
            c3850x5.getClass();
            return ((Number) C3850x5.f28488f.getValue(c3850x5, C3850x5.f28484b[0])).intValue();
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "getMaxDeviceVolume");
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "SDK encountered unexpected error in handling getMaxDeviceVolume() request from creative; " + e10.getMessage());
            }
            return 0;
        }
    }

    @JavascriptInterface
    @NotNull
    public final String getMaxSize(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getMaxSize called");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Activity fullScreenActivity = this.f28354a.getFullScreenActivity();
            if (fullScreenActivity == null) {
                Context containerContext = this.f28354a.getContainerContext();
                if ((containerContext instanceof Activity ? (Activity) containerContext : null) == null) {
                    return getScreenSize(str);
                }
                Context containerContext2 = this.f28354a.getContainerContext();
                tn.p.i(containerContext2, "null cannot be cast to non-null type android.app.Activity");
                fullScreenActivity = (Activity) containerContext2;
            }
            FrameLayout frameLayout = (FrameLayout) fullScreenActivity.findViewById(R.id.content);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = F3.b(frameLayout.getWidth() / J5.b());
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            ref$IntRef2.element = F3.b(frameLayout.getHeight() / J5.b());
            if (this.f28354a.getFullScreenActivity() != null && (ref$IntRef.element == 0 || ref$IntRef2.element == 0)) {
                tn.p.h(frameLayout);
                ViewTreeObserverOnGlobalLayoutListenerC3631oa viewTreeObserverOnGlobalLayoutListenerC3631oa = new ViewTreeObserverOnGlobalLayoutListenerC3631oa(frameLayout, this.f28356c);
                frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3631oa);
                p000do.i.d(A9.f25147c, null, null, new C3730sa(viewTreeObserverOnGlobalLayoutListenerC3631oa, ref$IntRef, ref$IntRef2, null), 3, null);
            }
            try {
                jSONObject.put("width", ref$IntRef.element);
                jSONObject.put("height", ref$IntRef2.element);
            } catch (JSONException e10) {
                InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
                if (interfaceC3580m92 != null) {
                    String str3 = AbstractC3830wa.f28425a;
                    tn.p.j(str3, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m92).a(str3, "Error while creating max size Json.", e10);
                }
            }
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).a(str4, "getMaxSize called:" + jSONObject);
            }
        } catch (Exception e11) {
            this.f28354a.a(str, "Unexpected error", "getMaxSize");
            InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
            if (interfaceC3580m94 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m94).b(str5, "SDK encountered unexpected error in handling getMaxSize() request from creative; " + e11.getMessage());
            }
        }
        String string = jSONObject.toString();
        tn.p.j(string, "toString(...)");
        return string;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientation(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getOrientation called");
        }
        byte bG = J5.g();
        return bG == 1 ? "0" : bG == 3 ? "90" : bG == 2 ? "180" : bG == 4 ? "270" : com.ironsource.Y1.f30690f;
    }

    @JavascriptInterface
    @NotNull
    public final String getOrientationProperties(@Nullable String str) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            gestureDetectorOnGestureListenerC3337ciA = this.f28354a;
        }
        String str2 = gestureDetectorOnGestureListenerC3337ciA.getOrientationProperties().f25443d;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "getOrientationProperties called: " + str2);
        }
        tn.p.h(str2);
        return str2;
    }

    @JavascriptInterface
    @NotNull
    public final String getPlacementType(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getPlacementType called");
        }
        return 1 == this.f28355b ? "interstitial" : "inline";
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatform(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 == null) {
            return "android";
        }
        String str2 = AbstractC3830wa.f28425a;
        tn.p.j(str2, "access$getTAG$p(...)");
        ((C3605n9) interfaceC3580m9).a(str2, "getPlatform. Platform:android");
        return "android";
    }

    @JavascriptInterface
    @NotNull
    public final String getPlatformVersion(@Nullable String str) {
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getPlatformVersion. Version:" + strValueOf);
        }
        return strValueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @Nullable
    public final String getPlaybackState(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        p000do.i.d(A9.f25150f, null, null, new C3755ta(this, ref$ObjectRef, countDownLatch, null), 3, null);
        if (!countDownLatch.await(1L, TimeUnit.SECONDS) && (interfaceC3580m9 = this.f28356c) != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).b(str2, "getPlaybackState timed out waiting on main thread");
        }
        JSONObject jSONObject = (JSONObject) ref$ObjectRef.element;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getRenderableAdIndexes(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getRenderableAdIndexes is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
            }
            String string = new JSONArray().toString();
            tn.p.j(string, "toString(...)");
            return string;
        }
        JSONArray renderableAdIndexes = gestureDetectorOnGestureListenerC3337ciA.getRenderableAdIndexes();
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "renderableAdIndexes called:" + renderableAdIndexes);
        }
        String string2 = renderableAdIndexes.toString();
        tn.p.j(string2, "toString(...)");
        return string2;
    }

    @JavascriptInterface
    @Nullable
    public final String getSafeArea(@Nullable String str) {
        JSONObject safeArea = this.f28354a.getSafeArea();
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getSafeArea called:" + safeArea);
        }
        if (safeArea != null) {
            return safeArea.toString();
        }
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getScreenSize(@Nullable String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", J5.h().f25855a);
            jSONObject.put("height", J5.h().f25856b);
            InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
            if (interfaceC3580m9 != null) {
                String str2 = AbstractC3830wa.f28425a;
                tn.p.j(str2, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).c(str2, "Message:Width x Height : " + J5.h().f25855a + VastAttributes.HORIZONTAL_POSITION + J5.h().f25856b);
            }
        } catch (JSONException unused) {
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "getScreenSize");
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "SDK encountered unexpected error while getting screen dimensions; " + e10.getMessage());
            }
        }
        String string = jSONObject.toString();
        tn.p.j(string, "toString(...)");
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "getScreenSize called:" + string);
        }
        return string;
    }

    @JavascriptInterface
    @NotNull
    public final String getSdkVersion(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 == null) {
            return "11.1.0";
        }
        String str2 = AbstractC3830wa.f28425a;
        tn.p.j(str2, "access$getTAG$p(...)");
        ((C3605n9) interfaceC3580m9).a(str2, "getSdkVersion called. Version:11.1.0");
        return "11.1.0";
    }

    @JavascriptInterface
    public final long getShowTimeStamp(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "getShowTimeStamp is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 == null) {
                return 0L;
            }
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
            return 0L;
        }
        long showTimeStamp = gestureDetectorOnGestureListenerC3337ciA.getShowTimeStamp();
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "getShowTimeStamp is " + showTimeStamp);
        }
        return showTimeStamp;
    }

    @JavascriptInterface
    @NotNull
    public final String getState(@Nullable String str) {
        String viewState = this.f28354a.getViewState();
        Locale locale = Locale.ENGLISH;
        tn.p.j(locale, "ENGLISH");
        String lowerCase = viewState.toLowerCase(locale);
        tn.p.j(lowerCase, "toLowerCase(...)");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).c(str2, "getState called:" + lowerCase);
        }
        return lowerCase;
    }

    @JavascriptInterface
    @NotNull
    public final String getVersion(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 == null) {
            return "2.0";
        }
        String str2 = AbstractC3830wa.f28425a;
        tn.p.j(str2, "access$getTAG$p(...)");
        ((C3605n9) interfaceC3580m9).a(str2, "getVersion called. Version:2.0");
        return "2.0";
    }

    @JavascriptInterface
    public final void impressionFired(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "impressionFired is called");
        }
        this.f28354a.C();
    }

    @JavascriptInterface
    public final void incentCompleted(@Nullable String str, @Nullable String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "incentCompleted called. IncentData:" + str2);
        }
        if (str2 == null) {
            try {
                this.f28354a.getListener().b(new HashMap());
                return;
            } catch (Exception e10) {
                this.f28354a.a(str, "Unexpected error", "incentCompleted");
                InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
                if (interfaceC3580m92 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m92).b(str4, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                tn.p.j(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    tn.p.i(next, "null cannot be cast to non-null type kotlin.String");
                    String str5 = next;
                    map.put(str5, jSONObject.get(str5));
                }
                try {
                    this.f28354a.getListener().b(map);
                    bn.r rVar = bn.r.f5635a;
                } catch (Exception e11) {
                    this.f28354a.a(str, "Unexpected error", "incentCompleted");
                    InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
                    if (interfaceC3580m93 != null) {
                        String str6 = AbstractC3830wa.f28425a;
                        tn.p.j(str6, "access$getTAG$p(...)");
                        ((C3605n9) interfaceC3580m93).b(str6, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        bn.r rVar2 = bn.r.f5635a;
                    }
                }
            } catch (JSONException unused) {
                this.f28354a.getListener().b(new HashMap());
                bn.r rVar3 = bn.r.f5635a;
            }
        } catch (Exception e12) {
            this.f28354a.a(str, "Unexpected error", "incentCompleted");
            InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
            if (interfaceC3580m94 != null) {
                String str7 = AbstractC3830wa.f28425a;
                tn.p.j(str7, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                bn.r rVar4 = bn.r.f5635a;
            }
        }
    }

    @JavascriptInterface
    public final boolean isBackButtonDisabled(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "isBackButtonDisabled called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            gestureDetectorOnGestureListenerC3337ciA = this.f28354a;
        }
        return gestureDetectorOnGestureListenerC3337ciA.K;
    }

    @JavascriptInterface
    @NotNull
    public final String isDeviceMuted(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "isDeviceMuted called");
        }
        if (this.f28354a == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 == null) {
                return com.ironsource.mediationsdk.metadata.a.f32683h;
            }
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
            return com.ironsource.mediationsdk.metadata.a.f32683h;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "JavaScript called: isDeviceMuted()");
        }
        boolean z10 = false;
        try {
            C3832wc mediaProcessor = this.f28354a.getMediaProcessor();
            tn.p.h(mediaProcessor);
            InterfaceC3580m9 interfaceC3580m94 = mediaProcessor.f28430b;
            if (interfaceC3580m94 != null) {
                ((C3605n9) interfaceC3580m94).c("MraidMediaProcessor", "isVolumeMuted");
            }
            Context context = Ji.f25747a;
            if (context != null) {
                Object systemService = context.getSystemService("audio");
                AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
                if (audioManager != null) {
                    if (2 != audioManager.getRingerMode()) {
                        z10 = true;
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m95 = this.f28356c;
            if (interfaceC3580m95 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m95).b(str5, "SDK encountered unexpected error in checking if device is muted; " + e10.getMessage());
            }
        }
        return String.valueOf(z10);
    }

    @JavascriptInterface
    @NotNull
    public final String isHeadphonePlugged(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "isHeadphonePlugged called");
        }
        if (this.f28354a == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 == null) {
                return com.ironsource.mediationsdk.metadata.a.f32683h;
            }
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
            return com.ironsource.mediationsdk.metadata.a.f32683h;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "JavaScript called: isHeadphonePlugged()");
        }
        boolean zB = false;
        try {
            C3832wc mediaProcessor = this.f28354a.getMediaProcessor();
            tn.p.h(mediaProcessor);
            mediaProcessor.getClass();
            zB = C3832wc.b();
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
            if (interfaceC3580m94 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m94).b(str5, "SDK encountered unexpected error in checking if headphones are plugged-in; " + e10.getMessage());
            }
        }
        return String.valueOf(zB);
    }

    @JavascriptInterface
    public final boolean isViewable(@Nullable String str) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            return gestureDetectorOnGestureListenerC3337ci.I == Hn.f25626c;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).b(str2, "Found a null instance of render view!");
        }
        return false;
    }

    @JavascriptInterface
    public final void loadAd(@Nullable String str, int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "loadAd is called with index - " + i10);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            gestureDetectorOnGestureListenerC3337ciA.b(i10);
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void loadWebView(@Nullable String str, @Nullable final String str2, @Nullable final String str3) throws JSONException {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str4, "loadWebView called with html: " + str3);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null && gestureDetectorOnGestureListenerC3337ciA.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str5, "loadWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
            if (str2 == null) {
                str2 = "";
            }
            bn.g gVar = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3337ci.a("loadWebView", jSONObjectA);
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA2 = a();
        if (gestureDetectorOnGestureListenerC3337ciA2 == null || gestureDetectorOnGestureListenerC3337ciA2.getPlacementType() != 1) {
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str6 = AbstractC3830wa.f28425a;
                tn.p.j(str6, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b(str6, "sibling creation not allowed for inline placement type");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f28354a;
            if (str2 == null) {
                str2 = "";
            }
            bn.g gVar2 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 312);
            gestureDetectorOnGestureListenerC3337ci2.a("loadWebView", jSONObjectA2);
            return;
        }
        if (str2 == null || bo.d0.u0(str2)) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci3 = this.f28354a;
            bn.g gVar3 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA3 = Si.a("", "targetViewId", "id", "");
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC3337ci3.a("loadWebView", jSONObjectA3);
            return;
        }
        if (str3 == null || str3.length() == 0) {
            this.f28354a.a("loadWebView", AbstractC3763ti.a(str2, 301));
            return;
        }
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        Runnable runnable = new Runnable() { // from class: n9.db
            @Override // java.lang.Runnable
            public final void run() {
                C3805va.a(this.f75341b, str2, str3);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    @JavascriptInterface
    public final void log(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "message");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).c(str3, "Log called. Message:" + str2);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        gestureDetectorOnGestureListenerC3337ci.getClass();
        Mh mh2 = GestureDetectorOnGestureListenerC3337ci.f26935e1;
        mh2.getClass();
        if (!((Boolean) GestureDetectorOnGestureListenerC3337ci.f26938h1.getValue(mh2, Mh.f25968a[0])).booleanValue() || str2 == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3337ci.getListener().a(str2);
    }

    @JavascriptInterface
    public final void logTelemetryEvent(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str2 == null) {
            InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
            if (interfaceC3580m9 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str4, "eventType is null");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str5 = AbstractC3830wa.f28425a;
            tn.p.j(str5, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).a(str5, "logTelemetryEvent is called: " + str2);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        gestureDetectorOnGestureListenerC3337ci.getClass();
        tn.p.k(str2, "eventType");
        C3589mi c3589mi = gestureDetectorOnGestureListenerC3337ci.f26948d0;
        if (c3589mi != null) {
            c3589mi.a(str2, str3);
        }
    }

    @JavascriptInterface
    public final void onAudioStateChanged(@Nullable String str, int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "onAudioStateChanged is called: " + i10);
        }
        V1.f26459b.getClass();
        V1 v12 = (V1) V1.f26460c.get(i10);
        if (v12 == null) {
            v12 = V1.f26461d;
        }
        if (v12 != V1.f26461d) {
            this.f28354a.getListener().a(v12);
        }
    }

    @JavascriptInterface
    public final void onOrientationChange(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, ">>> onOrientationChange() >>> This API is deprecated!");
        }
    }

    @JavascriptInterface
    public final void onUserAudioMuteInteraction(@Nullable String str, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "onAudioMuteInteraction is called: " + z10);
        }
        this.f28354a.getListener().a(z10);
    }

    @JavascriptInterface
    public final void onUserInteraction(@Nullable String str, @Nullable String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "onUserInteraction called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci != null && !gestureDetectorOnGestureListenerC3337ci.a()) {
            this.f28354a.a("onUserInteraction");
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).a(str4, "onUserInteraction called. Params:" + str2);
        }
        if (str2 == null) {
            try {
                this.f28354a.a(new HashMap());
                return;
            } catch (Exception e10) {
                this.f28354a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
                if (interfaceC3580m93 != null) {
                    String str5 = AbstractC3830wa.f28425a;
                    tn.p.j(str5, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m93).b(str5, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e10.getMessage());
                    return;
                }
                return;
            }
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject.keys();
                tn.p.j(itKeys, "keys(...)");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    tn.p.i(next, "null cannot be cast to non-null type kotlin.String");
                    String str6 = next;
                    map.put(str6, jSONObject.get(str6));
                }
                try {
                    this.f28354a.a(map);
                    bn.r rVar = bn.r.f5635a;
                } catch (Exception e11) {
                    this.f28354a.a(str, "Unexpected error", "onUserInteraction");
                    InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
                    if (interfaceC3580m94 != null) {
                        String str7 = AbstractC3830wa.f28425a;
                        tn.p.j(str7, "access$getTAG$p(...)");
                        ((C3605n9) interfaceC3580m94).b(str7, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e11.getMessage());
                        bn.r rVar2 = bn.r.f5635a;
                    }
                }
            } catch (Exception e12) {
                this.f28354a.a(str, "Unexpected error", "onUserInteraction");
                InterfaceC3580m9 interfaceC3580m95 = this.f28356c;
                if (interfaceC3580m95 != null) {
                    String str8 = AbstractC3830wa.f28425a;
                    tn.p.j(str8, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m95).b(str8, "SDK encountered unexpected error in handling onUserInteraction() signal from creative; " + e12.getMessage());
                    bn.r rVar3 = bn.r.f5635a;
                }
            }
        } catch (JSONException unused) {
            this.f28354a.a(new HashMap());
            bn.r rVar4 = bn.r.f5635a;
        }
    }

    @JavascriptInterface
    public final void open(@Nullable String str, @Nullable String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->open(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_open_d4dd02313feb7f67e616c97d2eecb9ee(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f53135i, str, str2, this.f28354a, "mraid.open");
    }

    @JavascriptInterface
    public final void openEmbedded(@Nullable String str, @Nullable String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->openEmbedded(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_openEmbedded_f47467373bd0e5cac3aeae18b14e1452(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f53135i, str, str2, this.f28354a, "imraid.openEmbedded");
    }

    @JavascriptInterface
    public final void openExternal(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->openExternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_openExternal_72f8e5a70a71c6d1565e9355b2555faf(str, str2, str3);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f53135i, str, str2, this.f28354a, "imraid.openExternal");
    }

    @JavascriptInterface
    public final void openWithoutTracker(@Nullable String str, @Nullable String str2) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/va;->openWithoutTracker(Ljava/lang/String;Ljava/lang/String;)V");
        safedk_va_openWithoutTracker_1e6cb2fa0a1d7f976f93c8793be65293(str, str2);
        BrandSafetyUtils.onMraidOpen(com.safedk.android.utils.g.f53135i, str, str2, this.f28354a, "imraid.openWithoutTracker");
    }

    @JavascriptInterface
    public final void ping(@Nullable String str, @Nullable String str2, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "ping called");
        }
        if (this.f28354a == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = tn.p.m(str2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
                if (interfaceC3580m93 != null) {
                    String str5 = AbstractC3830wa.f28425a;
                    tn.p.j(str5, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m93).a(str5, "JavaScript called ping() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3823w3 c3823w3 = C3823w3.f28406a;
                    InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
                    tn.p.k(str2, "url");
                    C3823w3.a(str2, z10, interfaceC3580m94);
                    return;
                } catch (Exception e10) {
                    this.f28354a.a(str, "Unexpected error", "ping");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3580m9 interfaceC3580m95 = this.f28356c;
                    if (interfaceC3580m95 != null) {
                        String str6 = AbstractC3830wa.f28425a;
                        tn.p.j(str6, "access$getTAG$p(...)");
                        ((C3605n9) interfaceC3580m95).b(str6, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f28354a.a(str, "Invalid URL:" + str2, "ping");
    }

    @JavascriptInterface
    public final void pingInWebView(@Nullable String str, @Nullable String str2, boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "openInWebView called");
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                boolean z12 = tn.p.m(str2.charAt(!z11 ? i10 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z12) {
                    i10++;
                } else {
                    z11 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && URLUtil.isValidUrl(str2)) {
                InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
                if (interfaceC3580m92 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m92).a(str4, "JavaScript called pingInWebView() URL: >>> " + str2 + " <<<");
                }
                try {
                    C3823w3 c3823w3 = C3823w3.f28406a;
                    InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
                    tn.p.k(str2, "url");
                    Dg.a(Ag.f25163b, new C3649p3(str2, z10, interfaceC3580m93, null));
                    return;
                } catch (Exception e10) {
                    this.f28354a.a(str, "Unexpected error", "pingInWebView");
                    Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
                    InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
                    if (interfaceC3580m94 != null) {
                        String str5 = AbstractC3830wa.f28425a;
                        tn.p.j(str5, "access$getTAG$p(...)");
                        ((C3605n9) interfaceC3580m94).b(str5, "SDK encountered unexpected error in handling pingInWebView() request from creative; " + e10.getMessage());
                        return;
                    }
                    return;
                }
            }
        }
        this.f28354a.a(str, "Invalid URL:" + str2, "pingInWebView");
    }

    @JavascriptInterface
    public final void pingV2(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "pingJson");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "pingV2 called with JSON: >>> " + str2 + " <<<");
        }
        try {
            this.f28354a.f(str2);
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "ping");
            this.f28354a.a(e10);
            Kb.a((byte) 1, "InMobi", "Failed to fire ping; SDK encountered unexpected error");
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "SDK encountered unexpected error in handling ping() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void playVideo(@Nullable final String str, @Nullable final String str2) {
        if (this.f28354a == null) {
            InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
            if (interfaceC3580m9 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m9).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = tn.p.m(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str2.subSequence(i10, length + 1).toString().length() != 0 && bo.a0.W(str2, "http", false, 2, null) && (bo.a0.I(str2, "mp4", false, 2, null) || bo.a0.I(str2, "avi", false, 2, null) || bo.a0.I(str2, "m4v", false, 2, null))) {
                InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
                if (interfaceC3580m92 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m92).a(str4, "JavaScript called: playVideo (" + str2 + ")");
                }
                new Handler(this.f28354a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: n9.lb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3805va.e(this.f75486b, str, str2);
                    }
                });
                return;
            }
        }
        this.f28354a.a(str, "Null or empty or invalid media playback URL supplied", "playVideo");
    }

    @JavascriptInterface
    public final void registerBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "registerBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3337ci.k(str);
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "registerBackButtonPressedEventListener");
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b(str4, "SDK encountered unexpected error in handling registerBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceMuteEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "registerDeviceMuteEventListener called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                C3832wc mediaProcessor = gestureDetectorOnGestureListenerC3337ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    tn.p.k(str, "jsCallbackNamespace");
                    if (mediaProcessor.f28432d == null) {
                        C3279ac c3279ac = new C3279ac(new C3732sc(mediaProcessor, str));
                        mediaProcessor.f28432d = c3279ac;
                        c3279ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f28354a.a(str, "Unexpected error", "registerDeviceMuteEventListener");
                InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
                if (interfaceC3580m93 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m93).b(str4, "SDK encountered unexpected error in handling registerDeviceMuteEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerDeviceVolumeChangeEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "registerDeviceVolumeChangeEventListener called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                C3832wc mediaProcessor = gestureDetectorOnGestureListenerC3337ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    tn.p.k(str, "jsCallbackNamespace");
                    Context context = Ji.f25747a;
                    if (context != null && mediaProcessor.f28433e == null) {
                        C3279ac c3279ac = new C3279ac(new C3782uc(mediaProcessor, str, context, new Handler(Looper.getMainLooper())));
                        mediaProcessor.f28433e = c3279ac;
                        c3279ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f28354a.a(str, "Unexpected error", "registerDeviceVolumeChangeEventListener");
                InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
                if (interfaceC3580m93 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m93).b(str4, "SDK encountered unexpected error in handling registerDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public final void registerHeadphonePluggedEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "registerHeadphonePluggedEventListener called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (str != null) {
            try {
                C3832wc mediaProcessor = gestureDetectorOnGestureListenerC3337ci.getMediaProcessor();
                if (mediaProcessor != null) {
                    tn.p.k(str, "jsCallbackNamespace");
                    if (mediaProcessor.f28434f == null) {
                        C3279ac c3279ac = new C3279ac(new C3707rc(mediaProcessor, str));
                        mediaProcessor.f28434f = c3279ac;
                        c3279ac.b();
                    }
                }
            } catch (Exception e10) {
                this.f28354a.a(str, "Unexpected error", "registerHeadphonePluggedEventListener");
                InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
                if (interfaceC3580m93 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m93).b(str4, "SDK encountered unexpected error in handling registerHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
                }
            }
        }
    }

    @JavascriptInterface
    public void safedk_va_customExpand_ffb33700094ade89f7204b785950f1d7(String str, String str2, int i10, float f10, boolean z10, boolean z11) {
        Ya ya2;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "customExpand called");
        }
        if (this.f28354a.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "customExpand called on unloaded ad");
                return;
            }
            return;
        }
        if (this.f28355b != 1) {
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b(str5, "customExpand called in incorrect Ad type: " + this.f28355b);
                return;
            }
            return;
        }
        if (str2 != null) {
            int length = str2.length() - 1;
            int i11 = 0;
            boolean z12 = false;
            while (i11 <= length) {
                boolean z13 = tn.p.m(str2.charAt(!z12 ? i11 : length), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z13) {
                    i11++;
                } else {
                    z12 = true;
                }
            }
            if (str2.subSequence(i11, length + 1).toString().length() != 0) {
                if (i10 < 0 || i10 >= R5.values().length) {
                    this.f28354a.a(str, "Invalid inputType", "customExpand");
                    return;
                }
                if (f10 < 0.0f || f10 > 1.0f) {
                    this.f28354a.a(str, "Invalid screenPercentage", "customExpand");
                    return;
                }
                Za za2 = this.f28354a.getLandingPageHandler().f26430f;
                if (za2 != null) {
                    String strA = Pa.a(str2);
                    Ua landingPageHandler = this.f28354a.getLandingPageHandler();
                    int i12 = landingPageHandler.f26433i + 1;
                    landingPageHandler.f26433i = i12;
                    ya2 = new Ya(za2, strA, i12, SystemClock.elapsedRealtime());
                } else {
                    ya2 = null;
                }
                Ya ya3 = ya2;
                if (ya3 != null) {
                    ya3.f26632f = "IN_CUSTOM";
                }
                this.f28354a.getLandingPageHandler().a(Na.f26020d, ya3, (Integer) 8008);
                a(str, str2, i10, f10, z11, ya3);
                return;
            }
        }
        this.f28354a.a(str, "Invalid " + i10, "customExpand");
    }

    @JavascriptInterface
    public void safedk_va_openEmbedded_f47467373bd0e5cac3aeae18b14e1452(final String str, final String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "openEmbedded called");
        }
        if (!this.f28354a.a()) {
            this.f28354a.a("openEmbedded");
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (!gestureDetectorOnGestureListenerC3337ci.O0) {
            gestureDetectorOnGestureListenerC3337ci.s();
            Oj.a(new Runnable() { // from class: n9.fb
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.c(this.f75371b, str, str2);
                }
            });
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str4, "openEmbedded called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_va_openExternal_72f8e5a70a71c6d1565e9355b2555faf(String str, String str2, String str3) {
        Ya ya2;
        tn.p.k(str2, "url");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str4, "open External");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str5, "Found a null instance of render view!");
                return;
            }
            return;
        }
        if (gestureDetectorOnGestureListenerC3337ci.O0) {
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str6 = AbstractC3830wa.f28425a;
                tn.p.j(str6, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b(str6, "open called on unloaded ad");
                return;
            }
            return;
        }
        if (!gestureDetectorOnGestureListenerC3337ci.a()) {
            this.f28354a.a("openExternal");
            return;
        }
        this.f28354a.s();
        InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
        if (interfaceC3580m94 != null) {
            String str7 = AbstractC3830wa.f28425a;
            tn.p.j(str7, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m94).a(str7, "openExternal called with url: " + str2 + " , schema: " + Pa.a(str2) + ", fallback - " + str3);
        }
        Za za2 = this.f28354a.getLandingPageHandler().f26430f;
        if (za2 != null) {
            String strA = Pa.a(str2);
            Ua landingPageHandler = this.f28354a.getLandingPageHandler();
            int i10 = landingPageHandler.f26433i + 1;
            landingPageHandler.f26433i = i10;
            ya2 = new Ya(za2, strA, i10, SystemClock.elapsedRealtime());
        } else {
            ya2 = null;
        }
        if (ya2 != null) {
            ya2.f26632f = "EX_NATIVE";
        }
        this.f28354a.getLandingPageHandler().a(Na.f26020d, ya2, (Integer) null);
        Ua landingPageHandler2 = this.f28354a.getLandingPageHandler();
        landingPageHandler2.getClass();
        tn.p.k("openExternal", "api");
        if (str2 != null) {
            landingPageHandler2.f(str, str2, str3, ya2);
            return;
        }
        if (str3 != null) {
            landingPageHandler2.f(str, str3, null, ya2);
            return;
        }
        landingPageHandler2.a(Na.f26021e, ya2, (Integer) 2);
        Ma ma2 = landingPageHandler2.f26428d;
        if (ma2 != null) {
            ma2.a(str, "Empty url and fallback url", "openExternal");
        }
        InterfaceC3580m9 interfaceC3580m95 = landingPageHandler2.f26431g;
        if (interfaceC3580m95 != null) {
            tn.p.j("Ua", "TAG");
            ((C3605n9) interfaceC3580m95).b("Ua", "Empty deeplink and fallback urls");
        }
    }

    @JavascriptInterface
    public void safedk_va_openWithoutTracker_1e6cb2fa0a1d7f976f93c8793be65293(final String str, final String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "openWithoutTracker called");
        }
        if (!this.f28354a.a()) {
            this.f28354a.a("openWithoutTracker");
            return;
        }
        if (!this.f28354a.O0) {
            Oj.a(new Runnable() { // from class: n9.mb
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.d(this.f75506b, str, str2);
                }
            });
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str4, "openWithoutTracker called on unloaded ad");
        }
    }

    @JavascriptInterface
    public void safedk_va_open_d4dd02313feb7f67e616c97d2eecb9ee(final String str, final String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "open called");
        }
        if (!this.f28354a.a()) {
            this.f28354a.a("open");
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (!gestureDetectorOnGestureListenerC3337ci.O0) {
            gestureDetectorOnGestureListenerC3337ci.s();
            Oj.a(new Runnable() { // from class: n9.ab
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.b(this.f75289b, str, str2);
                }
            });
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str4, "open called on unloaded ad");
        }
    }

    @JavascriptInterface
    public final void saveBlob(@Nullable String str, @Nullable String str2) {
        E2 e22;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "saveBlob is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = gestureDetectorOnGestureListenerC3337ci.f26958i;
        if (interfaceC3580m93 != null) {
            String str5 = GestureDetectorOnGestureListenerC3337ci.f26937g1;
            tn.p.j(str5, "TAG");
            ((C3605n9) interfaceC3580m93).a(str5, "saveBlob");
        }
        if (str2 == null || (e22 = gestureDetectorOnGestureListenerC3337ci.f26961j0) == null) {
            return;
        }
        ((AbstractC3547l1) e22).a(str2, gestureDetectorOnGestureListenerC3337ci.getImpressionId());
    }

    @JavascriptInterface
    public final void sendMessage(@Nullable String str, @Nullable final String str2, @Nullable final String str3) throws JSONException {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str4, "sendMessage called with message: " + str3);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null && gestureDetectorOnGestureListenerC3337ciA.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str5, "sendMessage called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
            if (str2 == null) {
                str2 = "";
            }
            bn.g gVar = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3337ci.a(C4089j8.f32053j, jSONObjectA);
            return;
        }
        if (str2 == null || bo.d0.u0(str2)) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f28354a;
            if (str2 == null) {
                str2 = "";
            }
            bn.g gVar2 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
            gestureDetectorOnGestureListenerC3337ci2.a(C4089j8.f32053j, jSONObjectA2);
            return;
        }
        if (str3 == null || bo.d0.u0(str3)) {
            this.f28354a.a(C4089j8.f32053j, AbstractC3763ti.a(str2, 301));
            return;
        }
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        Runnable runnable = new Runnable() { // from class: n9.pb
            @Override // java.lang.Runnable
            public final void run() {
                C3805va.f(this.f75574b, str2, str3);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    @JavascriptInterface
    public final void setAdContext(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "podAdContext");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "setAdContext is called " + str2);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            InterfaceC3820w0 adPodHandler = gestureDetectorOnGestureListenerC3337ciA.getAdPodHandler();
            if (adPodHandler != null) {
                ((AbstractC3547l1) adPodHandler).b(str2);
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str4, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void setOrientationProperties(@Nullable String str, @NotNull final String str2) {
        tn.p.k(str2, "orientationPropertiesString");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "setOrientationProperties called: " + str2);
        }
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        Runnable runnable = new Runnable() { // from class: n9.ya
            @Override // java.lang.Runnable
            public final void run() {
                C3805va.b(this.f75713b, str2);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    @JavascriptInterface
    public final void showAd(@Nullable String str, int i10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "showAd is called with index " + i10);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            gestureDetectorOnGestureListenerC3337ciA.c(i10);
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
        }
    }

    @JavascriptInterface
    public final void showAlert(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "alert");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "showAlert: " + str2);
        }
    }

    @JavascriptInterface
    public final void showWebView(@Nullable String str, @Nullable final String str2) throws JSONException {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "showEndCard called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null && gestureDetectorOnGestureListenerC3337ciA.O0) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str4, "showWebView called on unloaded ad");
            }
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
            if (str2 == null) {
                str2 = "";
            }
            bn.g gVar = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 108);
            gestureDetectorOnGestureListenerC3337ci.a("showWebView", jSONObjectA);
            return;
        }
        if (str2 != null && str2.length() != 0) {
            Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
            Runnable runnable = new Runnable() { // from class: n9.eb
                @Override // java.lang.Runnable
                public final void run() {
                    C3805va.c(this.f75356b, str2);
                }
            };
            wb2.getClass();
            tn.p.k(runnable, "runnable");
            wb2.f26536a.post(runnable);
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f28354a;
        if (str2 == null) {
            str2 = "";
        }
        bn.g gVar2 = AbstractC3763ti.f28193a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 302);
        gestureDetectorOnGestureListenerC3337ci2.a("showWebView", jSONObjectA2);
    }

    @JavascriptInterface
    public final void storePicture(@Nullable String str, @Nullable String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "storePicture is deprecated and no-op. ");
        }
    }

    @JavascriptInterface
    public final void submitAdReport(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        tn.p.k(str2, "adQualityUrl");
        tn.p.k(str3, "enableUserAdReportScreenshot");
        tn.p.k(str4, "templateInfo");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str5 = AbstractC3830wa.f28425a;
            tn.p.j(str5, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str5, "submitAdReport called");
        }
        this.f28354a.a(str2, str4, tn.p.f(str3, "1"));
    }

    @JavascriptInterface
    @NotNull
    public final String supports(@Nullable String str, @NotNull String str2) {
        tn.p.k(str2, "feature");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "Checking support for: " + str2);
        }
        String strValueOf = String.valueOf(this.f28354a.m(str2));
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m92).c(str4, "Message:" + str2 + " support: " + strValueOf);
        }
        return strValueOf;
    }

    @JavascriptInterface
    public final long timeSinceShow(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "timeSinceShow is called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            return gestureDetectorOnGestureListenerC3337ciA.V();
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
        if (interfaceC3580m92 == null) {
            return 0L;
        }
        String str3 = AbstractC3830wa.f28425a;
        tn.p.j(str3, "access$getTAG$p(...)");
        ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of ad render view!");
        return 0L;
    }

    @JavascriptInterface
    public final void unload(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "unload called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            gestureDetectorOnGestureListenerC3337ciA = this.f28354a;
        }
        try {
            gestureDetectorOnGestureListenerC3337ciA.E();
        } catch (Exception e10) {
            gestureDetectorOnGestureListenerC3337ciA.a(str, "Unexpected error", "unload");
            Kb.a((byte) 1, "InMobi", "Failed to unload ad; SDK encountered an unexpected error");
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "SDK encountered an expected error in handling the unload() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterBackButtonPressedEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "unregisterBackButtonPressedEventListener called");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28354a;
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3337ci.X();
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "unregisterBackButtonPressedEventListener");
            InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
            if (interfaceC3580m93 != null) {
                String str4 = AbstractC3830wa.f28425a;
                tn.p.j(str4, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m93).b(str4, "SDK encountered unexpected error in handling unregisterBackButtonPressedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceMuteEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "unregisterDeviceMuteEventListener called");
        }
        if (this.f28354a == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "Unregister device mute event listener ...");
        }
        try {
            C3832wc mediaProcessor = this.f28354a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3279ac c3279ac = mediaProcessor.f28432d;
                if (c3279ac != null) {
                    c3279ac.a();
                }
                mediaProcessor.f28432d = null;
            }
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "unRegisterDeviceMuteEventListener");
            InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
            if (interfaceC3580m94 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceMuteEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterDeviceVolumeChangeEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "unregisterDeviceVolumeChangeEventListener called");
        }
        if (this.f28354a == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "Unregister device volume change listener ...");
        }
        try {
            C3832wc mediaProcessor = this.f28354a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3279ac c3279ac = mediaProcessor.f28433e;
                if (c3279ac != null) {
                    c3279ac.a();
                }
                mediaProcessor.f28433e = null;
            }
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "unregisterDeviceVolumeChangeEventListener");
            InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
            if (interfaceC3580m94 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m94).b(str5, "SDK encountered unexpected error in handling unregisterDeviceVolumeChangeEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void unregisterHeadphonePluggedEventListener(@Nullable String str) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "unregisterHeadphonePluggedEventListener called");
        }
        if (this.f28354a == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
            if (interfaceC3580m92 != null) {
                String str3 = AbstractC3830wa.f28425a;
                tn.p.j(str3, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m92).b(str3, "Found a null instance of render view!");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m93 = this.f28356c;
        if (interfaceC3580m93 != null) {
            String str4 = AbstractC3830wa.f28425a;
            tn.p.j(str4, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m93).a(str4, "Unregister headphone plugged event listener ...");
        }
        try {
            C3832wc mediaProcessor = this.f28354a.getMediaProcessor();
            if (mediaProcessor != null) {
                C3279ac c3279ac = mediaProcessor.f28434f;
                if (c3279ac != null) {
                    c3279ac.a();
                }
                mediaProcessor.f28434f = null;
            }
        } catch (Exception e10) {
            this.f28354a.a(str, "Unexpected error", "unregisterHeadphonePluggedEventListener");
            InterfaceC3580m9 interfaceC3580m94 = this.f28356c;
            if (interfaceC3580m94 != null) {
                String str5 = AbstractC3830wa.f28425a;
                tn.p.j(str5, "access$getTAG$p(...)");
                ((C3605n9) interfaceC3580m94).b(str5, "SDK encountered unexpected error in handling unregisterHeadphonePluggedEventListener() request from creative; " + e10.getMessage());
            }
        }
    }

    @JavascriptInterface
    public final void updateVideoPosition(@Nullable String str, @Nullable String str2) throws JSONException {
        Object objD;
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str3 = AbstractC3830wa.f28425a;
            tn.p.j(str3, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str3, "updateVideoPosition is called with position - " + str2);
        }
        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMessage", "Invalid position");
        jSONObject.put("jsCommand", "updateVideoPlayerPosition");
        jSONObject.put("params", "null");
        if (str2 != null) {
            Object obj = null;
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                tn.p.k(jSONObject2, "jsonObject");
                tn.p.k(VideoViewPosition.class, "type");
                VideoViewPosition videoViewPosition = (VideoViewPosition) VideoViewPosition.class.cast(AbstractC3581ma.a(jSONObject2, VideoViewPosition.class, null, null));
                if (videoViewPosition == null || (objD = p000do.i.d(A9.f25150f, null, null, new C3780ua(this, videoViewPosition, str2, null), 3, null)) == null) {
                    EnumC3654p8 enumC3654p8 = EnumC3654p8.f27841b;
                    a(str, jSONObject);
                    obj = bn.r.f5635a;
                } else {
                    obj = objD;
                }
            } catch (JSONException e10) {
                EnumC3654p8 enumC3654p82 = EnumC3654p8.f27841b;
                a(str, jSONObject);
                InterfaceC3580m9 interfaceC3580m92 = this.f28356c;
                if (interfaceC3580m92 != null) {
                    String str4 = AbstractC3830wa.f28425a;
                    tn.p.j(str4, "access$getTAG$p(...)");
                    ((C3605n9) interfaceC3580m92).a(str4, "Error while creating position Json.", e10);
                    obj = bn.r.f5635a;
                }
            }
            if (obj != null) {
                return;
            }
        }
        EnumC3654p8 enumC3654p83 = EnumC3654p8.f27841b;
        a(str, jSONObject);
        bn.r rVar = bn.r.f5635a;
    }

    @JavascriptInterface
    public final void useCustomClose(@Nullable final String str, final boolean z10) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "useCustomClose called:" + z10);
        }
        new Handler(this.f28354a.getContainerContext().getMainLooper()).post(new Runnable() { // from class: n9.ob
            @Override // java.lang.Runnable
            public final void run() {
                C3805va.b(this.f75550b, z10, str);
            }
        });
    }

    @JavascriptInterface
    public final void zoom(@NotNull String str, final int i10) {
        tn.p.k(str, "jsCallbackNamespace");
        InterfaceC3580m9 interfaceC3580m9 = this.f28356c;
        if (interfaceC3580m9 != null) {
            String str2 = AbstractC3830wa.f28425a;
            tn.p.j(str2, "access$getTAG$p(...)");
            ((C3605n9) interfaceC3580m9).a(str2, "zoom is called " + str + com.ironsource.Z7.f30794r + i10);
        }
        Oj.a(new Runnable() { // from class: n9.za
            @Override // java.lang.Runnable
            public final void run() {
                C3805va.a(this.f75724b, i10);
            }
        });
    }
}
