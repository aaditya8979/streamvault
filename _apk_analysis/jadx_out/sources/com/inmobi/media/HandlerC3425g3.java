package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class HandlerC3425g3 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27198a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC3425g3(Looper looper) {
        super(looper);
        tn.p.k(looper, "looper");
    }

    public final void a(S2 s22) throws InterruptedException {
        C3823w3 c3823w3 = C3823w3.f28406a;
        tn.p.j("w3", "access$getTAG$p(...)");
        String str = s22.f26275b;
        b(s22);
        C3823w3.a(s22, "RETRY_EXHAUSTED");
        p000do.h.b(null, new C3373e3(s22, null), 1, null);
        C3823w3.f28411f.remove(s22);
        if (C3823w3.f28411f.isEmpty()) {
            p000do.h.b(null, new C3399f3(this, null), 1, null);
        }
    }

    public final void b(S2 s22) {
        int iY0 = cn.f0.y0(C3823w3.f28411f, s22);
        if (-1 != iY0) {
            S2 s23 = (S2) C3823w3.f28411f.get(iY0 == C3823w3.f28411f.size() + (-1) ? 0 : iY0 + 1);
            Message messageObtain = Message.obtain();
            messageObtain.what = s23.f26278e ? 3 : 2;
            messageObtain.obj = s23;
            long pingInterval = C3823w3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - s23.f26280g < pingInterval) {
                sendMessageDelayed(messageObtain, pingInterval);
            } else {
                sendMessage(messageObtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        tn.p.k(message, NotificationCompat.CATEGORY_MESSAGE);
        if (C3823w3.f28413h.get()) {
            try {
                int i10 = message.what;
                int i11 = 3;
                if (i10 == 1) {
                    if (C3823w3.e()) {
                        AdConfig.ImaiConfig imaiConfigC = C3823w3.c();
                        W2 w22 = (W2) C3823w3.f28407b.getValue();
                        List list = (List) p000do.h.b(null, new Z2(w22, imaiConfigC, null), 1, null);
                        C3823w3.f28411f = list;
                        if (list.isEmpty()) {
                            p000do.h.b(null, new C3270a3(w22, this, imaiConfigC, null), 1, null);
                            return;
                        }
                        tn.p.j("w3", "access$getTAG$p(...)");
                        for (S2 s22 : C3823w3.f28411f) {
                            C3823w3 c3823w3 = C3823w3.f28406a;
                            tn.p.j("w3", "access$getTAG$p(...)");
                            String str = s22.f26275b;
                        }
                        S2 s23 = (S2) C3823w3.f28411f.get(0);
                        Message messageObtain = Message.obtain();
                        if (!s23.f26278e) {
                            i11 = 2;
                        }
                        messageObtain.what = i11;
                        messageObtain.obj = s23;
                        long jCurrentTimeMillis = System.currentTimeMillis() - s23.f26280g;
                        if (jCurrentTimeMillis < imaiConfigC.getPingInterval() * 1000) {
                            sendMessageDelayed(messageObtain, ((long) (imaiConfigC.getPingInterval() * 1000)) - jCurrentTimeMillis);
                            return;
                        } else {
                            sendMessage(messageObtain);
                            return;
                        }
                    }
                    return;
                }
                if (i10 == 2) {
                    if (Re.a() != null) {
                        C3823w3.f28412g.set(false);
                        C3823w3.g();
                        return;
                    }
                    Object obj = message.obj;
                    AdConfig.ImaiConfig imaiConfigC2 = C3823w3.c();
                    if (!(obj instanceof S2)) {
                        tn.p.j("w3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((S2) obj).f26279f != 0) {
                        S2 s24 = (S2) obj;
                        long pingCacheExpiry = imaiConfigC2.getPingCacheExpiry();
                        s24.getClass();
                        if (!(System.currentTimeMillis() - s24.f26281h > pingCacheExpiry * ((long) 1000))) {
                            if ((imaiConfigC2.getMaxRetries() - ((S2) obj).f26279f) + 1 == 0) {
                                tn.p.j("w3", "access$getTAG$p(...)");
                                String str2 = ((S2) obj).f26275b;
                            } else {
                                tn.p.j("w3", "access$getTAG$p(...)");
                                String str3 = ((S2) obj).f26275b;
                            }
                            p000do.h.b(null, new C3296b3((S2) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((S2) obj);
                    return;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        tn.p.j("w3", "access$getTAG$p(...)");
                        bn.r rVar = bn.r.f5635a;
                        return;
                    }
                    Object obj2 = message.obj;
                    tn.p.i(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    S2 s25 = (S2) obj2;
                    tn.p.j("w3", "access$getTAG$p(...)");
                    String str4 = s25.f26275b;
                    LinkedHashMap linkedHashMap = C3823w3.f28415j;
                    C3267a0 c3267a0 = (C3267a0) linkedHashMap.get(Integer.valueOf(s25.f26274a));
                    if (c3267a0 != null) {
                        tn.p.k(s25, "click");
                        c3267a0.f26728a.a(c3267a0.f26729b);
                    }
                    linkedHashMap.remove(Integer.valueOf(s25.f26274a));
                    p000do.h.b(null, new C3348d3(s25, this, null), 1, null);
                    return;
                }
                if (Re.a() != null) {
                    C3823w3.f28412g.set(false);
                    C3823w3.g();
                    return;
                }
                Object obj3 = message.obj;
                AdConfig.ImaiConfig imaiConfigC3 = C3823w3.c();
                if (!(obj3 instanceof S2)) {
                    tn.p.j("w3", "access$getTAG$p(...)");
                    return;
                }
                if (((S2) obj3).f26279f != 0) {
                    S2 s26 = (S2) obj3;
                    long pingCacheExpiry2 = imaiConfigC3.getPingCacheExpiry();
                    s26.getClass();
                    if (!(System.currentTimeMillis() - s26.f26281h > pingCacheExpiry2 * ((long) 1000))) {
                        if ((imaiConfigC3.getMaxRetries() - ((S2) obj3).f26279f) + 1 == 0) {
                            tn.p.j("w3", "access$getTAG$p(...)");
                            String str5 = ((S2) obj3).f26275b;
                        } else {
                            tn.p.j("w3", "access$getTAG$p(...)");
                            String str6 = ((S2) obj3).f26275b;
                        }
                        new C3475i3(new C3322c3(this)).a((S2) obj3);
                        bn.r rVar2 = bn.r.f5635a;
                        return;
                    }
                }
                a((S2) obj3);
            } catch (Exception e10) {
                C3823w3 c3823w32 = C3823w3.f28406a;
                tn.p.j("w3", "access$getTAG$p(...)");
                e10.getMessage();
            }
        }
    }
}
