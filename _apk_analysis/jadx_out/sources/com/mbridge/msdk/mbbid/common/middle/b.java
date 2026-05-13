package com.mbridge.msdk.mbbid.common.middle;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.mbbid.out.BidListennning;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: RequesManager.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f38576c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BidListennning f38578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BidResponsedEx f38579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f38580g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f38582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f38583j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38584k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f38585l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f38581h = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f38577d = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: compiled from: RequesManager.java */
    public class a extends com.mbridge.msdk.mbbid.common.middle.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f38586b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(str, str2);
            this.f38586b = str3;
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(int i10, String str) {
            b.this.f38581h = false;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f38577d, b.this.f38575b, str, this.f38586b);
            b.this.a(str);
        }

        @Override // com.mbridge.msdk.mbbid.common.net.c
        public void a(BidResponsedEx bidResponsedEx) {
            b.this.f38581h = false;
            b.this.f38579f = bidResponsedEx;
            com.mbridge.msdk.mbbid.common.report.a.a(b.this.f38577d, b.this.f38575b, bidResponsedEx.getBidId(), this.f38586b, bidResponsedEx.getBidToken());
            b.this.a(bidResponsedEx);
        }
    }

    public b(String str, String str2, String str3) {
        this.f38574a = str;
        this.f38575b = str2;
        this.f38576c = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BidResponsed bidResponsed) {
        BidListennning bidListennning = this.f38578e;
        if (bidListennning != null) {
            bidListennning.onSuccessed(bidResponsed);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        BidListennning bidListennning = this.f38578e;
        if (bidListennning != null) {
            bidListennning.onFailed(str);
        }
    }

    public void a(int i10) {
        this.f38580g = i10;
    }

    public void a(long j10) {
        this.f38582i = j10;
    }

    public void a(BidListennning bidListennning) {
        this.f38578e = bidListennning;
    }

    public void a(boolean z10) {
        try {
            if (this.f38581h) {
                a("current unit is biding");
                return;
            }
            this.f38581h = true;
            if (this.f38577d == null) {
                a("context is null");
            }
            com.mbridge.msdk.mbbid.common.net.a aVar = new com.mbridge.msdk.mbbid.common.net.a(this.f38577d);
            e eVar = new e();
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            eVar.a("app_id", strB);
            eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f38575b);
            if (TextUtils.isEmpty(this.f38574a)) {
                this.f38574a = "";
            }
            eVar.a(FacebookMediationAdapter.RTB_PLACEMENT_PARAMETER, this.f38574a);
            if (com.mbridge.msdk.util.b.a()) {
                eVar.a("install_ids", c.a());
            }
            eVar.a("bid_floor", this.f38576c);
            eVar.a(e.f37864h, v0.a(this.f38577d, this.f38575b));
            eVar.a(e.f37863g, com.mbridge.msdk.foundation.same.buffer.b.a(this.f38575b, ""));
            String str = "1";
            eVar.a("req_type", this.f38584k ? "1" : "2");
            eVar.a("orientation", m0.F(this.f38577d) + "");
            int i10 = this.f38580g;
            if (i10 == 296) {
                if (this.f38582i <= 0 || this.f38583j <= 0) {
                    a("bid required param is missing or error");
                    return;
                }
                eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f38583j + VastAttributes.HORIZONTAL_POSITION + this.f38582i);
                try {
                    int i11 = BannerUtils.f38520a;
                    Method method = BannerUtils.class.getMethod("getCloseIds", String.class);
                    if (method.invoke(null, this.f38575b) instanceof String) {
                        eVar.a("close_id", method.invoke(null, this.f38575b).toString());
                    }
                } catch (Exception unused) {
                    a("banner module is miss");
                    return;
                }
            } else if (i10 == 297) {
                if (this.f38582i <= 0 || this.f38583j <= 0) {
                    a("ad display area is too small");
                    return;
                }
                eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f38583j + VastAttributes.HORIZONTAL_POSITION + this.f38582i);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f38585l);
                sb2.append("");
                eVar.a("orientation", sb2.toString());
            } else if (i10 != 298) {
                if (!z10) {
                    str = "0";
                }
                eVar.a("rw_plus", str);
            } else {
                if (this.f38582i <= 0 || this.f38583j <= 0) {
                    a("bid required param is missing or error");
                    return;
                }
                eVar.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, this.f38583j + VastAttributes.HORIZONTAL_POSITION + this.f38582i);
            }
            String md5 = SameMD5.getMD5(v0.d());
            eVar.a(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID, md5);
            a aVar2 = new a(this.f38574a, this.f38575b, md5);
            aVar2.setUnitId(this.f38575b);
            aVar2.setPlacementId(this.f38574a);
            aVar.get(1, d.h().a(false, ""), eVar, aVar2, "bid_request", 30000L);
        } catch (Throwable th2) {
            a(th2.getMessage());
        }
    }

    public void b(int i10) {
        this.f38585l = i10;
    }

    public void b(long j10) {
        this.f38583j = j10;
    }

    public void b(boolean z10) {
        this.f38584k = z10;
    }
}
