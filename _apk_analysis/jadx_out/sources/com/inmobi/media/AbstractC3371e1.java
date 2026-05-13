package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC3371e1 implements X2, Kl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f27072f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f27073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f27074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSession f27075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediaEvents f27076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdEvents f27077e;

    static {
        String simpleName = AbstractC3371e1.class.getSimpleName();
        tn.p.j(simpleName, "getSimpleName(...)");
        f27072f = simpleName;
    }

    public AbstractC3371e1(p000do.l0 l0Var, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(l0Var, "coroutineScope");
        this.f27073a = l0Var;
        this.f27074b = interfaceC3580m9;
    }

    public void a() {
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        tn.p.k(adSessionConfiguration, "adSessionConfiguration");
        tn.p.k(adSessionContext, "adSessionContext");
        if (this.f27075c != null) {
            InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a(f27072f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f27074b;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a(f27072f, "initAdSession");
        }
        try {
            this.f27075c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m93 = this.f27074b;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a(f27072f, "AdSession creation failed. " + e10);
            }
        }
    }

    public final void a(InteractionType interactionType) {
        tn.p.k(interactionType, "type");
        if (this.f27076d == null) {
            InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a(f27072f, "Failed to register adUserInteractionEvent with type: " + interactionType);
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f27074b;
        if (interfaceC3580m92 != null) {
            ((C3605n9) interfaceC3580m92).a(f27072f, "trackAdUserInteractionEvent with type: " + interactionType);
        }
        P4.a(this.f27073a, new C3346d1(this, interactionType, null));
    }

    @Override // com.inmobi.media.Kl
    public void a(Rl rl2) {
        tn.p.k(rl2, "videoEvent");
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z10);

    public void a(boolean z10) {
    }

    public final void b() {
        InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a(f27072f, "initAdEvents");
        }
        try {
            this.f27077e = AdEvents.createAdEvents(this.f27075c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f27074b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a(f27072f, "Failure initAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }

    public final void c() {
        InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a(f27072f, "initMediaAdEvents");
        }
        try {
            this.f27076d = MediaEvents.createMediaEvents(this.f27075c);
        } catch (IllegalArgumentException e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f27074b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a(f27072f, "Failure initMediaAdEvents: " + Log.getStackTraceString(e10));
            }
        }
    }
}
