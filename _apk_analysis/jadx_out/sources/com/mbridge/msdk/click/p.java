package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.u0;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: WebViewSpiderLoader.java */
/* JADX INFO: loaded from: classes5.dex */
public class p extends f implements a.InterfaceC0449a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f35685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f35686c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f35688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Context f35689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f35690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f35691h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f35687d = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f35692i = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    public class a implements k {
        public a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f35686c = jumpLoaderResult;
        }
    }

    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f35685b != null) {
                if (p.this.f35686c.isSuccess()) {
                    p.this.f35685b.a(p.this.f35686c);
                } else {
                    p.this.f35685b.a(p.this.f35686c, p.this.f35686c.getMsg());
                }
            }
        }
    }

    /* JADX INFO: compiled from: WebViewSpiderLoader.java */
    public class c extends com.mbridge.msdk.foundation.same.task.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f35696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f35698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f35699e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CampaignEx f35700f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f35701g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f35702h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f35703i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Semaphore f35695a = new Semaphore(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private o.f f35704j = new a();

        /* JADX INFO: compiled from: WebViewSpiderLoader.java */
        public class a implements o.f {
            public a() {
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f35686c.setSuccess(true);
                    c.this.a();
                }
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f35686c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f35686c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f35686c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }
        }

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f35696b = context;
            this.f35697c = str;
            this.f35698d = str2;
            this.f35699e = str3;
            this.f35700f = campaignEx;
            this.f35701g = z10;
            this.f35702h = z11;
            this.f35703i = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
        
            r4.setjumpDone(true);
            r4.setUrl(r8);
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01f9 A[EDGE_INSN: B:83:0x01f9->B:76:0x01f9 BREAK  A[LOOP:0: B:24:0x0062->B:69:0x01a3], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                Method dump skipped, instruction units count: 506
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p.c.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f35695a.release();
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean a(String str) {
            return u0.a.b(str);
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f35700f, p.this.f35686c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f35685b != null) {
                p.this.f35685b.b(null);
            }
            p.this.f35686c = new JumpLoaderResult();
            p.this.f35686c.setUrl(this.f35697c);
            p.this.f35686c = a(this.f35697c, this.f35701g, this.f35702h, this.f35700f, this.f35703i);
            if (!TextUtils.isEmpty(p.this.f35686c.getExceptionMsg())) {
                p.this.f35686c.setSuccess(true);
            }
            if (p.this.f35687d && p.this.f35686c.isSuccess()) {
                if (p.this.f35691h != null) {
                    p.this.f35686c.setStatusCode(p.this.f35691h.f35613f);
                }
                q.a(this.f35700f, p.this.f35686c, p.this.f35691h, this.f35698d, this.f35699e, this.f35696b, this.f35704j, this.f35695a);
            }
        }
    }

    public p(Context context) {
        this.f35689f = context;
        this.f35690g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0449a
    public void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f35687d) {
            this.f35692i.post(new b());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        com.mbridge.msdk.foundation.same.task.a cVar;
        this.f35685b = gVar;
        this.f35688e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f35689f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f35685b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f35689f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f35690g.b(cVar, this);
    }
}
