package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class N1 extends C3269a2 {
    public final T1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(Context context, C3795v0 c3795v0, W1 w12) {
        super(context, c3795v0, w12);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3795v0, "placement");
        this.K = new T1();
    }

    @Override // com.inmobi.media.C3269a2
    public final boolean V() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "<get-TAG>(...)");
            c3605n9.c("l1", "canProceedToLoad");
        }
        E();
        byte b10 = this.f27506b;
        if (1 == b10 || 2 == b10) {
            tn.p.j("l1", "<get-TAG>(...)");
            Kb.a((byte) 1, "l1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n92.b("l1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == b10) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.f27516l.f28301a);
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n93.b("l1", "Ad is active. ignore load");
            }
            return false;
        }
        if (b10 == 4) {
            if (!z()) {
                C3605n9 c3605n94 = this.f27513i;
                if (c3605n94 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n94.c("l1", "signalCanShowForStateReady");
                }
                C3605n9 c3605n95 = this.f27513i;
                if (c3605n95 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n95.a("l1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC3423g1 abstractC3423g1M = m();
                if (abstractC3423g1M == null) {
                    Kb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    C3605n9 c3605n96 = this.f27513i;
                    if (c3605n96 != null) {
                        tn.p.j("l1", "<get-TAG>(...)");
                        c3605n96.b("l1", "listener is null. load show callback missed");
                    }
                } else {
                    C3605n9 c3605n97 = this.f27513i;
                    if (c3605n97 != null) {
                        tn.p.j("l1", "<get-TAG>(...)");
                        c3605n97.a("l1", "callback - onLoadSuccess");
                    }
                    d(abstractC3423g1M);
                }
                return false;
            }
            C3605n9 c3605n98 = this.f27513i;
            if (c3605n98 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n98.b("l1", "ad is expired, clearing");
            }
            d();
        }
        D();
        return true;
    }

    @Override // com.inmobi.media.C3269a2, com.inmobi.media.AbstractC3388ei
    public final void a(V1 v12) {
        tn.p.k(v12, "audioStatusInternal");
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M != null) {
            abstractC3423g1M.a(v12);
        }
        T1 t12 = this.K;
        t12.getClass();
        tn.p.k(v12, "audioStatusInternal");
        if (!t12.f26343a && v12 == V1.f26462e) {
            t12.f26343a = true;
            T8 t82 = T8.f26349c;
            t82.f27127a = System.currentTimeMillis();
            t82.f27128b++;
        }
    }

    @Override // com.inmobi.media.C3269a2, com.inmobi.media.AbstractC3388ei
    public final void a(boolean z10) {
        Context context = Ji.f25747a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f25372b;
        Ea eaA = Da.a(context, "audio_pref_file");
        tn.p.k("user_mute_count", "key");
        int i10 = eaA.f25373a.getInt("user_mute_count", 0);
        eaA.a("user_mute_count", z10 ? Math.max(0, i10 - 1) : i10 + 1, false);
    }

    public final void c0() {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "<get-TAG>(...)");
            c3605n9.d("l1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        e((short) 2153);
    }

    public final void e(short s10) {
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "<get-TAG>(...)");
            c3605n9.c("l1", "onShowFailure");
        }
        AbstractC3423g1 abstractC3423g1M = m();
        if (abstractC3423g1M == null) {
            Kb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n92.b("l1", "listener is null. show fail callback missed. ");
            }
        } else {
            C3605n9 c3605n93 = this.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n93.b("l1", "callback - onAdShowFailed");
            }
            abstractC3423g1M.b();
        }
        if (s10 != 0) {
            C3605n9 c3605n94 = this.f27513i;
            if (c3605n94 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n94.b("l1", "show failed - " + ((int) s10));
            }
            d(s10);
        }
    }

    @Override // com.inmobi.media.C3269a2, com.inmobi.media.AbstractC3547l1, com.inmobi.media.AbstractC3388ei
    public final void j(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        AbstractC3423g1 abstractC3423g1M;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        C3605n9 c3605n9 = this.f27513i;
        if (c3605n9 != null) {
            tn.p.j("l1", "<get-TAG>(...)");
            c3605n9.c("l1", "onRenderViewVisible");
        }
        if (this.f27506b == 4 && (abstractC3423g1M = m()) != null) {
            C3605n9 c3605n92 = this.f27513i;
            if (c3605n92 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n92.a("l1", "callback - onAdDisplayed");
            }
            a(abstractC3423g1M);
        }
        super.j(gestureDetectorOnGestureListenerC3337ci);
    }

    @Override // com.inmobi.media.C3269a2, com.inmobi.media.AbstractC3547l1
    public final String l() {
        return "audio";
    }
}
