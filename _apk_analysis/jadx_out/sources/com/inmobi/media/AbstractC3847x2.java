package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;

/* JADX INFO: renamed from: com.inmobi.media.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC3847x2 extends AbstractC3371e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f28477h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f28478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3847x2(p000do.l0 l0Var, InterfaceC3580m9 interfaceC3580m9) {
        super(l0Var, interfaceC3580m9);
        tn.p.k(l0Var, "coroutineScope");
        this.f28478g = AbstractC3847x2.class.getSimpleName();
    }

    public final void a(float f10, boolean z10) {
        if (this.f27077e == null) {
            InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
            if (interfaceC3580m9 != null) {
                String str = this.f28478g;
                tn.p.j(str, "tag");
                ((C3605n9) interfaceC3580m9).a(str, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f27074b;
        if (interfaceC3580m92 != null) {
            String str2 = this.f28478g;
            tn.p.j(str2, "tag");
            ((C3605n9) interfaceC3580m92).a(str2, "skippableVideoAdLoaded - skipOffset: " + f10 + ", isAutoPlay: " + z10);
        }
        try {
            P4.a(this.f27073a, new C3797v2(this, VastProperties.createVastPropertiesForSkippableMedia(f10, z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            tn.p.j(this.f28478g, "tag");
            e10.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC3371e1, com.inmobi.media.Kl
    public final void a(Rl rl2) {
        tn.p.k(rl2, "videoEvent");
        if (rl2 instanceof Xm) {
            return;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
        if (interfaceC3580m9 != null) {
            String str = this.f28478g;
            tn.p.j(str, "tag");
            ((C3605n9) interfaceC3580m9).a(str, "trackAdVideoEvent - videoEvent: " + rl2);
        }
        if (this.f27076d == null) {
            tn.p.j(this.f28478g, "tag");
        } else {
            P4.a(this.f27073a, new C3822w2(this, rl2, null));
        }
    }

    @Override // com.inmobi.media.AbstractC3371e1
    public final void a(boolean z10) {
        if (this.f27077e == null) {
            tn.p.j(this.f28478g, "tag");
            return;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
        if (interfaceC3580m9 != null) {
            String str = this.f28478g;
            tn.p.j(str, "tag");
            ((C3605n9) interfaceC3580m9).a(str, "nonSkippableVideoAdLoaded - isAutoPlay: " + z10);
        }
        try {
            P4.a(this.f27073a, new C3772u2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z10, Position.STANDALONE), null));
        } catch (Exception e10) {
            tn.p.j(this.f28478g, "tag");
            e10.getStackTrace();
        }
    }

    public final void b(Rl rl2) {
        MediaEvents mediaEvents;
        InterfaceC3580m9 interfaceC3580m9 = this.f27074b;
        if (interfaceC3580m9 != null) {
            String str = this.f28478g;
            tn.p.j(str, "tag");
            ((C3605n9) interfaceC3580m9).a(str, "fireAdVideoEvent - received video event: " + rl2);
        }
        if (rl2 instanceof Ql) {
            AdSession adSession = this.f27075c;
            if (adSession != null) {
                ErrorType errorType = ErrorType.VIDEO;
                ((Ql) rl2).getClass();
                adSession.error(errorType, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (rl2 instanceof Om) {
            MediaEvents mediaEvents2 = this.f27076d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (rl2 instanceof C3470hn) {
            MediaEvents mediaEvents3 = this.f27076d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (rl2 instanceof C3867xm) {
            MediaEvents mediaEvents4 = this.f27076d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (rl2 instanceof C3494in) {
            MediaEvents mediaEvents5 = this.f27076d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (rl2 instanceof C3718rn) {
            MediaEvents mediaEvents6 = this.f27076d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (rl2 instanceof Pl) {
            MediaEvents mediaEvents7 = this.f27076d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (rl2 instanceof C3544kn) {
            MediaEvents mediaEvents8 = this.f27076d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((C3544kn) rl2).f27499a, 0.0f);
                return;
            }
            return;
        }
        if (rl2 instanceof S1) {
            MediaEvents mediaEvents9 = this.f27076d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((S1) rl2).f26273b);
                return;
            }
            return;
        }
        if (!(rl2 instanceof C3519jn) || (mediaEvents = this.f27076d) == null) {
            return;
        }
        mediaEvents.skipped();
    }
}
