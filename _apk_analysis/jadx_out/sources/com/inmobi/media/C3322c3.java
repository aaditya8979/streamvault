package com.inmobi.media;

import android.os.Message;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3322c3 implements InterfaceC3549l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC3425g3 f26907a;

    public C3322c3(HandlerC3425g3 handlerC3425g3) {
        this.f26907a = handlerC3425g3;
    }

    @Override // com.inmobi.media.InterfaceC3549l3
    public final void a(S2 s22) {
        tn.p.k(s22, "click");
        HandlerC3425g3 handlerC3425g3 = this.f26907a;
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = s22;
        handlerC3425g3.sendMessage(messageObtain);
    }

    @Override // com.inmobi.media.InterfaceC3549l3
    public final void a(S2 s22, EnumC3273a6 enumC3273a6) throws InterruptedException {
        EnumC3273a6 enumC3273a62 = EnumC3273a6.f26744d;
        tn.p.k(s22, "click");
        tn.p.k(enumC3273a62, IronSourceConstants.EVENTS_ERROR_CODE);
        C3823w3 c3823w3 = C3823w3.f28406a;
        tn.p.j("w3", "access$getTAG$p(...)");
        String str = s22.f26275b;
        C3823w3.b(s22);
        this.f26907a.b(s22);
    }
}
