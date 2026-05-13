package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: SocketRequestTask.java */
/* JADX INFO: loaded from: classes9.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f35637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f35638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f35639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f35640e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CampaignEx f35641f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f35642g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f35643h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f35644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f35645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f35646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f35647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f35648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k f35649n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f35636a = new Semaphore(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final o.f f35650o = new a();

    /* JADX INFO: compiled from: SocketRequestTask.java */
    public class a implements o.f {
        public a() {
        }

        private void a() {
            synchronized (this) {
                l.this.f35647l.setSuccess(true);
                if (l.this.f35649n != null) {
                    l.this.f35649n.a(l.this.f35647l);
                }
                l.this.a();
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.f35647l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.f35647l.setContent(str3);
            }
            l.this.b(str);
            a();
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z10, String str2) {
            l.this.b(str);
            l.this.f35647l.setContent(str2);
            a();
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }
    }

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.f35637b = bVar.c();
        this.f35638c = bVar.e();
        this.f35639d = bVar.b();
        this.f35640e = bVar.d();
        this.f35641f = bVar.a();
        this.f35642g = bVar.g();
        this.f35643h = bVar.i();
        this.f35644i = bVar.f();
        this.f35645j = bVar.h();
    }

    private String a(String str) {
        if (this.f35645j) {
            String strA = com.mbridge.msdk.setting.b.a(this.f35637b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = str + strA;
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f35641f, str) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f35636a.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f35641f, this.f35647l);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162 A[LOOP:0: B:16:0x003c->B:66:0x0162, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a A[EDGE_INSN: B:73:0x016a->B:67:0x016a BREAK  A[LOOP:0: B:16:0x003c->B:66:0x0162], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult c(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.l.c(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public void a(g gVar) {
        this.f35648m = gVar;
    }

    public void a(k kVar) {
        this.f35649n = kVar;
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z10) {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.f35648m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.f35647l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f35638c);
        JumpLoaderResult jumpLoaderResultC = c(this.f35638c);
        this.f35647l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.f35647l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            k kVar = this.f35649n;
            if (kVar != null) {
                kVar.a(this.f35647l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.f35647l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.f35649n;
            if (kVar2 != null) {
                kVar2.a(this.f35647l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f35646k;
        if (aVar != null && (jumpLoaderResult = this.f35647l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f35613f);
        }
        m.a(this.f35641f, this.f35647l, this.f35646k, this.f35639d, this.f35640e, this.f35637b, this.f35650o, this.f35649n, this.f35636a);
    }
}
