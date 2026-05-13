package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: LoopTimer.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f40886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<i> f40888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinkedList<i> f40889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f40890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e f40892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f40893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private l f40894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f40895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f40896k;

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoopTimer.java */
    public class HandlerC0510a extends Handler {
        public HandlerC0510a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                int i10 = message.what;
                if (i10 != 1) {
                    if (i10 == 2) {
                        a.this.c();
                    }
                } else {
                    if (a.this.f40887b) {
                        return;
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f40886a);
                    sendMessageDelayed(obtainMessage(1), a.this.f40886a);
                }
            }
        }
    }

    /* JADX INFO: compiled from: LoopTimer.java */
    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.reward.adapter.c f40898a;

        public b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f40898a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f40896k.sendMessage(a.this.f40896k.obtainMessage(2));
            this.f40898a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f40896k.sendMessage(a.this.f40896k.obtainMessage(2));
            this.f40898a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }
    }

    /* JADX INFO: compiled from: LoopTimer.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static a f40900a = new a(null);
    }

    private a() {
        this.f40887b = false;
        this.f40888c = new LinkedList<>();
        this.f40889d = new LinkedList<>();
        this.f40890e = 0;
        this.f40891f = 0;
        this.f40896k = new HandlerC0510a();
    }

    public /* synthetic */ a(HandlerC0510a handlerC0510a) {
        this();
    }

    public static a a() {
        return c.f40900a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f40888c;
        if (linkedList == null || linkedList.size() <= 0 || this.f40890e == 0 || this.f40888c.size() <= this.f40890e) {
            LinkedList<i> linkedList2 = this.f40889d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f40891f == 0 || this.f40889d.size() == this.f40891f) {
                this.f40891f = 0;
                this.f40890e = 0;
                Handler handler = this.f40896k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(v0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h("0");
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            q0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar == null || TextUtils.isEmpty(iVar.g())) {
            return false;
        }
        String strG = iVar.g();
        try {
            if (this.f40892g != null) {
                com.mbridge.msdk.videocommon.setting.a aVar = this.f40893h;
                int iA = this.f40892g.a(strG, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strG);
                } else if (iA != 1) {
                }
                try {
                    Handler handler = this.f40896k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    q0.b("LoopTimer", th.getMessage(), th);
                    return z10;
                }
            }
            return true;
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
        }
    }

    private void b() {
        if (this.f40895j == null) {
            this.f40895j = g.a(com.mbridge.msdk.foundation.controller.c.n().d());
        }
        if (this.f40894i == null) {
            this.f40894i = l.a(this.f40895j);
        }
        List<i> listA = this.f40894i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f40889d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.d(), iVar.g());
            }
        }
        List<i> listA2 = this.f40894i.a(94);
        if (listA2 != null) {
            this.f40888c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.d(), iVar2.g());
            }
        }
        if (this.f40892g == null) {
            this.f40892g = e.a(this.f40895j);
        }
        if (this.f40893h == null) {
            this.f40893h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    private void b(String str) {
        l lVar = this.f40894i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f40888c;
            if (linkedList == null || linkedList.size() <= 0 || this.f40890e >= this.f40888c.size()) {
                LinkedList<i> linkedList2 = this.f40889d;
                if (linkedList2 != null && linkedList2.size() > 0 && this.f40891f < this.f40889d.size()) {
                    i iVar = this.f40889d.get(this.f40891f);
                    this.f40891f++;
                    if (a(iVar)) {
                        c(iVar.d(), iVar.g());
                    }
                }
            } else {
                i iVar2 = this.f40888c.get(this.f40890e);
                this.f40890e++;
                if (a(iVar2)) {
                    a(iVar2.d(), iVar2.g(), false);
                }
            }
        } catch (Throwable th2) {
            q0.b("LoopTimer", th2.getMessage(), th2);
        }
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f40888c;
        if (linkedList == null || !linkedList.contains(str)) {
            LinkedList<i> linkedList2 = this.f40889d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f40889d.remove(str);
            }
        } else {
            this.f40888c.remove(str);
        }
        b(str);
    }

    public void a(String str, String str2) {
        if (this.f40889d.contains(str2)) {
            return;
        }
        this.f40889d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f40894i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void b(long j10) {
        b();
        this.f40886a = j10;
        this.f40887b = false;
        Handler handler = this.f40896k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f40886a);
    }

    public void b(String str, String str2) {
        if (this.f40888c.contains(str2)) {
            return;
        }
        this.f40888c.add(new i(str, str2, 94));
        l lVar = this.f40894i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }
}
