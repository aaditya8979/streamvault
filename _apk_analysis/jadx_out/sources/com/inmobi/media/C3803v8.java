package com.inmobi.media;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.datasource.cache.SimpleCache;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerRequest;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.ironsource.C4157n2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3803v8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlayerRequest f28335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3589mi f28336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3580m9 f28337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p000do.l0 f28338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p000do.l0 f28339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.g f28340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f28341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WeakReference f28342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HtmlVideoPlayerConfig f28344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N7 f28345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f28346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uh f28347m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3285ai f28348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28349o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C3885yf f28350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReference f28351q;

    public C3803v8(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, AdConfig.HybridNativeConfig hybridNativeConfig, HtmlVideoPlayerRequest htmlVideoPlayerRequest, C3285ai c3285ai, C3589mi c3589mi, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        tn.p.k(hybridNativeConfig, "hybridNativeConfig");
        tn.p.k(htmlVideoPlayerRequest, "videoRequestConfig");
        this.f28335a = htmlVideoPlayerRequest;
        this.f28336b = c3589mi;
        this.f28337c = interfaceC3580m9;
        C3778u8 c3778u8 = new C3778u8(p000do.i0.D8, this);
        p000do.l0 l0VarA = kotlinx.coroutines.d.a(p000do.w0.b().plus(c3778u8));
        this.f28338d = l0VarA;
        this.f28339e = P4.a(l0VarA, c3778u8);
        this.f28341g = new AtomicBoolean(false);
        this.f28342h = new WeakReference(gestureDetectorOnGestureListenerC3337ci.getContext());
        this.f28344j = htmlVideoPlayerRequest.getConfig();
        Context context = gestureDetectorOnGestureListenerC3337ci.getContext();
        tn.p.j(context, "getContext(...)");
        this.f28345k = new N7(context, hybridNativeConfig, l0VarA, htmlVideoPlayerRequest, interfaceC3580m9);
        this.f28348n = c3285ai;
        this.f28351q = new AtomicReference(EnumC3728s8.f28097a);
    }

    public static /* synthetic */ boolean a(C3803v8 c3803v8, EnumC3728s8[] enumC3728s8Arr, String str, String str2, EnumC3728s8 enumC3728s8, int i10) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            enumC3728s8 = null;
        }
        return c3803v8.a(enumC3728s8Arr, str, str2, enumC3728s8);
    }

    public final void a() throws JSONException {
        ViewGroup viewGroup;
        SimpleCache simpleCache;
        if (this.f28341g.getAndSet(true)) {
            return;
        }
        EnumC3728s8 enumC3728s8 = EnumC3728s8.f28105i;
        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
        a(enumC3728s8, "executeVideoPlayerActions", (String) null);
        InterfaceC3580m9 interfaceC3580m9 = this.f28337c;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("HybridVideoPlayerHandler", "destroy video player");
        }
        N7 n72 = this.f28345k;
        if (!n72.f25999h.getAndSet(true)) {
            InterfaceC3580m9 interfaceC3580m92 = n72.f25993b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("HtmlMediaPlayer", "destroy called");
            }
            kotlinx.coroutines.g gVar = n72.f26013v;
            if (gVar != null) {
                g.a.a(gVar, null, 1, null);
            }
            n72.f26013v = null;
            n72.f26003l.set(EnumC3736sg.f28129h);
            n72.f25998g.set(false);
            P4.a(n72.f26002k);
            n72.f26015x.a();
            if (n72.f25997f.get()) {
                n72.f25997f.set(false);
                if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
                    n72.f26007p.removeListener(n72.B);
                } else {
                    p000do.i.d(n72.f25994c, null, null, new I7(null, n72), 3, null);
                }
            }
            if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
                n72.f26007p.stop();
                n72.f26007p.clearMediaItems();
                n72.f26007p.release();
                n72.f26017z.a();
                n72.f26016y.f26288d.c();
            } else {
                p000do.i.d(n72.f25994c, null, null, new H7(null, n72), 3, null);
            }
            K2 k22 = n72.f26014w;
            while (true) {
                int i10 = k22.f25780f.get();
                if (i10 <= 0) {
                    break;
                }
                int i11 = i10 - 1;
                if (k22.f25780f.compareAndSet(i10, i11)) {
                    if (i11 == 0) {
                        synchronized (k22.f25775a) {
                            if (k22.f25780f.get() == 0) {
                                simpleCache = k22.f25781g;
                                k22.f25781g = null;
                            } else {
                                simpleCache = null;
                            }
                            bn.r rVar = bn.r.f5635a;
                        }
                    } else {
                        simpleCache = null;
                    }
                    if (simpleCache != null) {
                        simpleCache.release();
                    }
                }
            }
            n72.f26005n.setOnPositionChangeListener(null);
            n72.f26005n.removeAllViews();
            WeakReference weakReference = n72.f26009r;
            if (weakReference != null && (viewGroup = (ViewGroup) weakReference.get()) != null) {
                viewGroup.removeView(n72.f26005n);
            }
            WeakReference weakReference2 = n72.f26009r;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            kotlinx.coroutines.d.e(n72.f25994c, null, 1, null);
            kotlinx.coroutines.d.e(n72.f25995d, null, 1, null);
        }
        N7 n73 = this.f28345k;
        n73.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("totalDuration", n73.f26007p.getDuration());
        jSONObject.put("playbackTime", n73.f26007p.getCurrentPosition());
        jSONObject.put("bufferTime", n73.f26007p.getBufferedPosition());
        String string = jSONObject.toString();
        tn.p.j(string, "toString(...)");
        C3589mi c3589mi = this.f28336b;
        if (c3589mi != null) {
            tn.p.k(string, "durationPayload");
            Map mapA = c3589mi.a();
            mapA.put("payload", string);
            Wj wj2 = Wj.f26549a;
            Wj.b("VideoDestroyed", mapA, EnumC3287ak.f26805a);
        }
        C3285ai c3285ai = this.f28348n;
        if (c3285ai != null) {
            EnumC3654p8 enumC3654p8 = EnumC3654p8.f27850k;
            tn.p.k(enumC3654p8, "htmlVideoTemplateEvents");
            c3285ai.f26802a.a(enumC3654p8, (Object) null);
        }
        kotlinx.coroutines.g gVar2 = this.f28340f;
        if (gVar2 != null) {
            g.a.a(gVar2, null, 1, null);
        }
        this.f28340f = null;
        this.f28347m = null;
        this.f28348n = null;
    }

    public final void a(Rl rl2) throws JSONException {
        C3589mi c3589mi;
        C3285ai c3285ai;
        C3285ai c3285ai2;
        Uh uh2;
        C3285ai c3285ai3;
        C3885yf c3885yf;
        InterfaceC3580m9 interfaceC3580m9 = this.f28337c;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HybridVideoPlayerHandler", "handleMediaEvent: " + rl2);
        }
        boolean z10 = rl2 instanceof C3867xm;
        if (z10) {
            C3285ai c3285ai4 = this.f28348n;
            if (c3285ai4 != null) {
                EnumC3654p8 enumC3654p8 = EnumC3654p8.f27847h;
                Z7[] z7Arr = Z7.f26691a;
                tn.p.k(enumC3654p8, "htmlVideoTemplateEvents");
                c3285ai4.f26802a.a(enumC3654p8, "q1");
            }
        } else if (rl2 instanceof C3494in) {
            C3285ai c3285ai5 = this.f28348n;
            if (c3285ai5 != null) {
                EnumC3654p8 enumC3654p82 = EnumC3654p8.f27847h;
                Z7[] z7Arr2 = Z7.f26691a;
                tn.p.k(enumC3654p82, "htmlVideoTemplateEvents");
                c3285ai5.f26802a.a(enumC3654p82, "q2");
            }
        } else if (rl2 instanceof C3718rn) {
            C3285ai c3285ai6 = this.f28348n;
            if (c3285ai6 != null) {
                EnumC3654p8 enumC3654p83 = EnumC3654p8.f27847h;
                Z7[] z7Arr3 = Z7.f26691a;
                tn.p.k(enumC3654p83, "htmlVideoTemplateEvents");
                c3285ai6.f26802a.a(enumC3654p83, "q3");
            }
        } else if (rl2 instanceof C3892ym) {
            C3285ai c3285ai7 = this.f28348n;
            if (c3285ai7 != null) {
                EnumC3654p8 enumC3654p84 = EnumC3654p8.f27847h;
                Z7[] z7Arr4 = Z7.f26691a;
                tn.p.k(enumC3654p84, "htmlVideoTemplateEvents");
                c3285ai7.f26802a.a(enumC3654p84, "q4");
            }
        } else if (rl2 instanceof Pl) {
            if (a(EnumC3728s8.f28103g, (String) null, (String) null) && (c3285ai3 = this.f28348n) != null) {
                EnumC3654p8 enumC3654p85 = EnumC3654p8.f27842c;
                tn.p.k(enumC3654p85, "htmlVideoTemplateEvents");
                c3285ai3.f26802a.a(enumC3654p85, (Object) null);
            }
        } else if (rl2 instanceof C3430g8) {
            if (a(this, new EnumC3728s8[]{EnumC3728s8.f28098b}, null, null, EnumC3728s8.f28099c, 6)) {
                Uh uh3 = this.f28347m;
                if (uh3 != null) {
                    HtmlVideoPlaybackState htmlVideoPlaybackState = ((C3430g8) rl2).f27210a;
                    tn.p.k(htmlVideoPlaybackState, "videoInfo");
                    InterfaceC3580m9 interfaceC3580m92 = uh3.f26446a.f26958i;
                    if (interfaceC3580m92 != null) {
                        ((C3605n9) interfaceC3580m92).b("HtmlVideoPlayer", "onVideoLoadSuccess");
                    }
                    GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = uh3.f26446a;
                    EnumC3654p8 enumC3654p86 = EnumC3654p8.f27841b;
                    tn.p.k(htmlVideoPlaybackState, IconCompat.EXTRA_OBJ);
                    gestureDetectorOnGestureListenerC3337ci.a(enumC3654p86, AbstractC3581ma.a(htmlVideoPlaybackState, HtmlVideoPlaybackState.class));
                }
                if (this.f28349o) {
                    this.f28345k.e();
                }
            }
        } else if (rl2 instanceof C3301b8) {
            if (a(this, new EnumC3728s8[]{EnumC3728s8.f28098b}, null, null, EnumC3728s8.f28100d, 6) && (uh2 = this.f28347m) != null) {
                uh2.a((C3301b8) rl2);
            }
        } else if (rl2 instanceof C3480i8) {
            a(EnumC3728s8.f28104h, (String) null, (String) null);
            C3285ai c3285ai8 = this.f28348n;
            if (c3285ai8 != null) {
                EnumC3654p8 enumC3654p87 = EnumC3654p8.f27843d;
                tn.p.k(rl2, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA = AbstractC3581ma.a(rl2, rl2.getClass());
                tn.p.k(enumC3654p87, "htmlVideoTemplateEvents");
                c3285ai8.f26802a.a(enumC3654p87, jSONObjectA);
            }
        } else if (rl2 instanceof Om) {
            EnumC3728s8[] enumC3728s8Arr = {EnumC3728s8.f28101e};
            EnumC3728s8 enumC3728s8 = EnumC3728s8.f28102f;
            a(this, enumC3728s8Arr, null, null, enumC3728s8, 6);
            if (this.f28351q.get() == enumC3728s8 && (c3285ai2 = this.f28348n) != null) {
                EnumC3654p8 enumC3654p88 = EnumC3654p8.f27845f;
                HtmlVideoPlaybackState htmlVideoPlaybackStateA = this.f28345k.a();
                tn.p.k(htmlVideoPlaybackStateA, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA2 = AbstractC3581ma.a(htmlVideoPlaybackStateA, HtmlVideoPlaybackState.class);
                tn.p.k(enumC3654p88, "htmlVideoTemplateEvents");
                c3285ai2.f26802a.a(enumC3654p88, jSONObjectA2);
            }
        } else if (rl2 instanceof C3470hn) {
            EnumC3728s8[] enumC3728s8Arr2 = {EnumC3728s8.f28099c, EnumC3728s8.f28102f, EnumC3728s8.f28103g};
            EnumC3728s8 enumC3728s82 = EnumC3728s8.f28101e;
            a(this, enumC3728s8Arr2, null, null, enumC3728s82, 6);
            if (this.f28351q.get() == enumC3728s82 && (c3285ai = this.f28348n) != null) {
                EnumC3654p8 enumC3654p89 = EnumC3654p8.f27845f;
                HtmlVideoPlaybackState htmlVideoPlaybackStateA2 = this.f28345k.a();
                tn.p.k(htmlVideoPlaybackStateA2, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA3 = AbstractC3581ma.a(htmlVideoPlaybackStateA2, HtmlVideoPlaybackState.class);
                tn.p.k(enumC3654p89, "htmlVideoTemplateEvents");
                c3285ai.f26802a.a(enumC3654p89, jSONObjectA3);
            }
        } else if (rl2 instanceof C3544kn) {
            C3285ai c3285ai9 = this.f28348n;
            if (c3285ai9 != null) {
                EnumC3654p8 enumC3654p810 = EnumC3654p8.f27847h;
                Z7[] z7Arr5 = Z7.f26691a;
                tn.p.k(enumC3654p810, "htmlVideoTemplateEvents");
                c3285ai9.f26802a.a(enumC3654p810, "q0");
            }
        } else if (rl2 instanceof C3554l8) {
            C3554l8 c3554l8 = (C3554l8) rl2;
            float f10 = c3554l8.f27549a / 1000.0f;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", Float.valueOf(f10));
            jSONObject.put("duration", Float.valueOf(c3554l8.f27550b / 1000.0f));
            C3285ai c3285ai10 = this.f28348n;
            if (c3285ai10 != null) {
                EnumC3654p8 enumC3654p811 = EnumC3654p8.f27846g;
                tn.p.k(enumC3654p811, "htmlVideoTemplateEvents");
                c3285ai10.f26802a.a(enumC3654p811, jSONObject);
            }
        } else if (rl2 instanceof C3529k8) {
            C3285ai c3285ai11 = this.f28348n;
            if (c3285ai11 != null) {
                EnumC3654p8 enumC3654p812 = EnumC3654p8.f27852m;
                VideoViewPosition videoViewPosition = ((C3529k8) rl2).f27456a;
                tn.p.k(videoViewPosition, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA4 = AbstractC3581ma.a(videoViewPosition, VideoViewPosition.class);
                tn.p.k(enumC3654p812, "htmlVideoTemplateEvents");
                c3285ai11.f26802a.a(enumC3654p812, jSONObjectA4);
            }
        } else if (rl2 instanceof W7) {
            C3285ai c3285ai12 = this.f28348n;
            if (c3285ai12 != null) {
                EnumC3654p8 enumC3654p813 = EnumC3654p8.f27853n;
                tn.p.k(enumC3654p813, "htmlVideoTemplateEvents");
                c3285ai12.f26802a.a(enumC3654p813, (Object) null);
            }
        } else if (rl2 instanceof C3455h8) {
            C3285ai c3285ai13 = this.f28348n;
            if (c3285ai13 != null) {
                EnumC3654p8 enumC3654p814 = EnumC3654p8.f27854o;
                tn.p.k(enumC3654p814, "htmlVideoTemplateEvents");
                c3285ai13.f26802a.a(enumC3654p814, (Object) null);
            }
        } else if (rl2 instanceof S1) {
            C3285ai c3285ai14 = this.f28348n;
            if (c3285ai14 != null) {
                EnumC3654p8 enumC3654p815 = EnumC3654p8.f27845f;
                HtmlVideoPlaybackState htmlVideoPlaybackStateA3 = this.f28345k.a();
                tn.p.k(htmlVideoPlaybackStateA3, IconCompat.EXTRA_OBJ);
                JSONObject jSONObjectA5 = AbstractC3581ma.a(htmlVideoPlaybackStateA3, HtmlVideoPlaybackState.class);
                tn.p.k(enumC3654p815, "htmlVideoTemplateEvents");
                c3285ai14.f26802a.a(enumC3654p815, jSONObjectA5);
            }
        } else if ((rl2 instanceof C3679q8) && (c3589mi = this.f28336b) != null) {
            Map mapA = c3589mi.a();
            Wj wj2 = Wj.f26549a;
            Wj.b("ViewStateOnParentAttached", mapA, EnumC3287ak.f26805a);
        }
        if ((z10 || (rl2 instanceof C3494in) || (rl2 instanceof C3718rn) || (rl2 instanceof Pl) || (rl2 instanceof C3544kn) || (rl2 instanceof Om) || (rl2 instanceof C3470hn) || (rl2 instanceof C3480i8) || (rl2 instanceof S1)) && (c3885yf = this.f28350p) != null) {
            tn.p.k(rl2, "videoEvent");
            Ae ae2 = c3885yf.f28591e;
            if (ae2 != null) {
                ae2.a(rl2);
            }
        }
    }

    public final void a(String str, String str2, String str3) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28337c;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).b("HybridVideoPlayerHandler", "Manager error (" + str + "): " + str2);
        }
        if (this.f28341g.get()) {
            return;
        }
        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
        if (tn.p.f(str, "unknown")) {
            return;
        }
        X7 x72 = new X7(str3);
        C3285ai c3285ai = this.f28348n;
        if (c3285ai != null) {
            EnumC3654p8 enumC3654p8 = EnumC3654p8.f27844e;
            tn.p.k(x72, IconCompat.EXTRA_OBJ);
            JSONObject jSONObjectA = AbstractC3581ma.a(x72, X7.class);
            tn.p.k(enumC3654p8, "htmlVideoTemplateEvents");
            c3285ai.f26802a.a(enumC3654p8, jSONObjectA);
        }
    }

    public final void a(boolean z10) throws JSONException {
        if (this.f28341g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? CampaignEx.JSON_NATIVE_VIDEO_MUTE : CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        EnumC3728s8[] enumC3728s8Arr = {EnumC3728s8.f28099c, EnumC3728s8.f28101e, EnumC3728s8.f28102f};
        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
        if (a(this, enumC3728s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n72 = this.f28345k;
            if (n72.f25999h.get()) {
                return;
            }
            if (!z10) {
                S7 s72 = n72.f26016y;
                P4.a(s72.f26285a, new R7(s72, null));
            } else {
                S7 s73 = n72.f26016y;
                s73.a();
                s73.f26288d.a();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r7 == com.inmobi.media.EnumC3728s8.f28105i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r7 != com.inmobi.media.EnumC3728s8.f28104h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r7 != com.inmobi.media.EnumC3728s8.f28104h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r7 != com.inmobi.media.EnumC3728s8.f28105i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        if (r7 == com.inmobi.media.EnumC3728s8.f28105i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0063, code lost:
    
        if (r7 != com.inmobi.media.EnumC3728s8.f28104h) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0074, code lost:
    
        if (r7 != com.inmobi.media.EnumC3728s8.f28105i) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007d, code lost:
    
        if (r7 != com.inmobi.media.EnumC3728s8.f28105i) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.inmobi.media.EnumC3728s8 r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3803v8.a(com.inmobi.media.s8, java.lang.String, java.lang.String):boolean");
    }

    public final boolean a(EnumC3728s8[] enumC3728s8Arr, String str, String str2, EnumC3728s8 enumC3728s8) {
        EnumC3728s8 enumC3728s82 = (EnumC3728s8) this.f28351q.get();
        boolean z10 = false;
        if (cn.r.P(enumC3728s8Arr, enumC3728s82)) {
            if (enumC3728s8 != null && !a(enumC3728s8, str, str2)) {
                z10 = true;
            }
            return !z10;
        }
        if (str != null) {
            String str3 = String.format("Invalid state (%s) for %s. Allowed: %s", Arrays.copyOf(new Object[]{enumC3728s82, str2, cn.r.n0(enumC3728s8Arr, null, null, null, 0, null, null, 63, null)}, 3));
            tn.p.j(str3, "format(...)");
            a(str, str3, str2);
        }
        return false;
    }

    public final void b(boolean z10) throws JSONException {
        if (this.f28341g.get()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", z10 ? C4157n2.f33013v : "hide");
        EnumC3728s8[] enumC3728s8Arr = {EnumC3728s8.f28099c, EnumC3728s8.f28101e, EnumC3728s8.f28102f, EnumC3728s8.f28103g, EnumC3728s8.f28104h};
        EnumC3275a8[] enumC3275a8Arr = EnumC3275a8.f26763a;
        if (a(this, enumC3728s8Arr, "executeVideoPlayerActions", jSONObject.toString(), null, 8)) {
            N7 n72 = this.f28345k;
            if (n72.f25999h.get()) {
                return;
            }
            if (z10) {
                n72.e();
            } else {
                n72.f();
            }
            if (tn.p.f(Looper.myLooper(), Looper.getMainLooper())) {
                n72.f26005n.setVisibility(z10 ? 0 : 8);
            } else {
                p000do.i.d(n72.f25994c, null, null, new C3877y7(null, n72, z10), 3, null);
            }
        }
    }
}
