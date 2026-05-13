package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import java.util.Map;

/* JADX INFO: compiled from: VideoViewStatisticsListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class o extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f41892n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f41893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f41894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f41895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f41896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f41897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f41898t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Map<Integer, String> f41899u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MBridgeVideoView.u f41900v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f41901w;

    /* JADX INFO: compiled from: VideoViewStatisticsListener.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f41902a;

        public a(Object obj) {
            this.f41902a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f41902a;
            if (obj instanceof String) {
                o.this.b((String) obj);
            }
        }
    }

    public o(CampaignEx campaignEx, com.mbridge.msdk.videocommon.entity.c cVar, com.mbridge.msdk.videocommon.download.a aVar, String str, String str2, com.mbridge.msdk.video.module.listener.a aVar2, int i10, boolean z10) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i10, z10);
        this.f41897s = false;
        this.f41898t = 0;
        this.f41901w = -1;
        if (this.f41867a) {
            this.f41899u = campaignEx.getAdvImpList();
        }
        this.f41898t = campaignEx.getVideoCompleteTime();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x014a A[Catch: all -> 0x016a, TryCatch #0 {all -> 0x016a, blocks: (B:18:0x0024, B:19:0x002c, B:21:0x003b, B:23:0x0046, B:22:0x0043, B:24:0x0057, B:80:0x0164, B:25:0x005f, B:27:0x0072, B:29:0x0076, B:31:0x007c, B:33:0x0081, B:35:0x0085, B:38:0x0096, B:40:0x009a, B:41:0x009e, B:43:0x00ba, B:44:0x00c3, B:46:0x00c7, B:51:0x00cf, B:52:0x00d3, B:53:0x00eb, B:56:0x00f1, B:58:0x00f5, B:60:0x00fe, B:62:0x0102, B:64:0x0114, B:66:0x0118, B:67:0x0128, B:69:0x012c, B:70:0x0136, B:72:0x0140, B:74:0x0144, B:75:0x014a, B:77:0x014e, B:79:0x0152), top: B:85:0x0004 }] */
    @Override // com.mbridge.msdk.video.module.listener.impl.k, com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.listener.impl.o.a(int, java.lang.Object):void");
    }
}
