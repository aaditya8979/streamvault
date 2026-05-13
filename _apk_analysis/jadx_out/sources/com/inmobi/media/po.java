package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class po implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.network.common.model.Ad f27910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3605n9 f27911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f27912c;

    public po(com.inmobi.media.ads.network.common.model.Ad ad2, C3605n9 c3605n9) {
        tn.p.k("l1", "tag");
        this.f27910a = ad2;
        this.f27911b = c3605n9;
        this.f27912c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        if (!this.f27912c.compareAndSet(false, true)) {
            C3605n9 c3605n9 = this.f27911b;
            if (c3605n9 == null) {
                return "win/loss notification already triggered";
            }
            c3605n9.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad2 = this.f27910a;
            List listA = ad2 != null ? AbstractC3888yi.a(ad2, "win_beacon") : null;
            if (listA != null && !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String strA = H3.a((String) it.next(), kotlin.collections.a.m(bn.h.a("${AUCTION_MIN_TO_WIN}", String.valueOf(d10)), bn.h.a("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d10))));
                    C3823w3 c3823w3 = C3823w3.f28406a;
                    C3605n9 c3605n92 = this.f27911b;
                    tn.p.k(strA, "url");
                    C3823w3.a(strA, true, c3605n92);
                }
                if (d10 > 0.0d) {
                    return null;
                }
                C3605n9 c3605n93 = this.f27911b;
                if (c3605n93 == null) {
                    return "notification triggering with invalid params";
                }
                c3605n93.b("l1", "Win notification triggered with invalid minBidToWin: " + d10);
                return "notification triggering with invalid params";
            }
            C3605n9 c3605n94 = this.f27911b;
            if (c3605n94 == null) {
                return "no win/loss notification url";
            }
            c3605n94.b("l1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e10) {
            C3605n9 c3605n95 = this.f27911b;
            if (c3605n95 == null) {
                return "win notification failed internally";
            }
            c3605n95.a("l1", "Exception in notifyWin", e10);
            return "win notification failed internally";
        }
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        if (!this.f27912c.compareAndSet(false, true)) {
            C3605n9 c3605n9 = this.f27911b;
            if (c3605n9 == null) {
                return "win/loss notification already triggered";
            }
            c3605n9.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad2 = this.f27910a;
            List listA = ad2 != null ? AbstractC3888yi.a(ad2, "loss_beacon") : null;
            if (listA != null && !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String strA = H3.a((String) it.next(), kotlin.collections.a.m(bn.h.a(com.ironsource.mediationsdk.d.f32397l, String.valueOf(i10)), bn.h.a(com.ironsource.mediationsdk.d.f32399n, String.valueOf(d10))));
                    C3823w3 c3823w3 = C3823w3.f28406a;
                    C3605n9 c3605n92 = this.f27911b;
                    tn.p.k(strA, "url");
                    C3823w3.a(strA, true, c3605n92);
                }
                if (i10 > 0 && d10 > 0.0d) {
                    return null;
                }
                C3605n9 c3605n93 = this.f27911b;
                if (c3605n93 == null) {
                    return "notification triggering with invalid params";
                }
                c3605n93.b("l1", "Loss notification triggered with invalid params - lossReason: " + i10 + ", auctionPrice: " + d10);
                return "notification triggering with invalid params";
            }
            C3605n9 c3605n94 = this.f27911b;
            if (c3605n94 == null) {
                return "no win/loss notification url";
            }
            c3605n94.b("l1", "Loss beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e10) {
            C3605n9 c3605n95 = this.f27911b;
            if (c3605n95 == null) {
                return "loss notification failed internally";
            }
            c3605n95.a("l1", "Exception in notifyLoss", e10);
            return "loss notification failed internally";
        }
    }
}
