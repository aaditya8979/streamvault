package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f28002a = new LinkedHashMap();

    public static final String a(C3844x c3844x, double d10) {
        tn.p.k(c3844x, "adComponent");
        LinkedHashMap linkedHashMap = f28002a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(c3844x));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (!((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            C3605n9 c3605n9 = c3844x.f28472a.f27735c;
            if (c3605n9 == null) {
                return "win/loss notification already triggered";
            }
            c3605n9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList arrayListA = AbstractC3899z4.a(c3844x.f28473b, "win_beacon");
            if (arrayListA.isEmpty()) {
                C3605n9 c3605n92 = c3844x.f28472a.f27735c;
                if (c3605n92 == null) {
                    return "no win/loss notification url";
                }
                c3605n92.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String strA = H3.a((String) it.next(), kotlin.collections.a.m(bn.h.a("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), bn.h.a("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                C3823w3 c3823w3 = C3823w3.f28406a;
                C3605n9 c3605n93 = c3844x.f28472a.f27735c;
                tn.p.k(strA, "url");
                C3823w3.a(strA, true, c3605n93);
            }
            if (d10 > 0.0d) {
                return null;
            }
            C3605n9 c3605n94 = c3844x.f28472a.f27735c;
            if (c3605n94 == null) {
                return "notification triggering with invalid params";
            }
            c3605n94.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d10);
            return "notification triggering with invalid params";
        } catch (Exception e10) {
            C3605n9 c3605n95 = c3844x.f28472a.f27735c;
            if (c3605n95 == null) {
                return "win notification failed internally";
            }
            c3605n95.a("NativeWinLossBeacon", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    public static final String a(C3844x c3844x, int i10, double d10) {
        tn.p.k(c3844x, "adComponent");
        LinkedHashMap linkedHashMap = f28002a;
        Integer numValueOf = Integer.valueOf(System.identityHashCode(c3844x));
        Object atomicBoolean = linkedHashMap.get(numValueOf);
        if (atomicBoolean == null) {
            atomicBoolean = new AtomicBoolean(false);
            linkedHashMap.put(numValueOf, atomicBoolean);
        }
        if (!((AtomicBoolean) atomicBoolean).compareAndSet(false, true)) {
            C3605n9 c3605n9 = c3844x.f28472a.f27735c;
            if (c3605n9 == null) {
                return "win/loss notification already triggered";
            }
            c3605n9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList arrayListA = AbstractC3899z4.a(c3844x.f28473b, "loss_beacon");
            if (arrayListA.isEmpty()) {
                C3605n9 c3605n92 = c3844x.f28472a.f27735c;
                if (c3605n92 == null) {
                    return "no win/loss notification url";
                }
                c3605n92.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String strA = H3.a((String) it.next(), kotlin.collections.a.m(bn.h.a(com.ironsource.mediationsdk.d.f32397l, String.valueOf(i10)), bn.h.a(com.ironsource.mediationsdk.d.f32399n, String.valueOf(d10))));
                C3823w3 c3823w3 = C3823w3.f28406a;
                C3605n9 c3605n93 = c3844x.f28472a.f27735c;
                tn.p.k(strA, "url");
                C3823w3.a(strA, true, c3605n93);
            }
            if (i10 > 0 && d10 > 0.0d) {
                return null;
            }
            C3605n9 c3605n94 = c3844x.f28472a.f27735c;
            if (c3605n94 == null) {
                return "notification triggering with invalid params";
            }
            c3605n94.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
            return "notification triggering with invalid params";
        } catch (Exception e10) {
            C3605n9 c3605n95 = c3844x.f28472a.f27735c;
            if (c3605n95 == null) {
                return "loss notification failed internally";
            }
            c3605n95.a("NativeWinLossBeacon", "Exception in notifyLoss", e10);
            return "loss notification failed internally";
        }
    }
}
