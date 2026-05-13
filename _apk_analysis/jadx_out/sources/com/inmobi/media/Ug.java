package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;
import com.inmobi.media.Ug;

/* JADX INFO: loaded from: classes9.dex */
public final class Ug {
    public static void a(Sg sg2, final sn.l lVar) {
        tn.p.k(sg2, "publisherNativeViewData");
        tn.p.k(lVar, "onClick");
        sg2.f26319a.getParentView$media_release().setOnClickListener(new View.OnClickListener() { // from class: n9.n4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Ug.a(lVar, view);
            }
        });
        View titleView$media_release = sg2.f26319a.getTitleView$media_release();
        if (titleView$media_release != null) {
            titleView$media_release.setOnClickListener(new View.OnClickListener() { // from class: n9.o4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.b(lVar, view);
                }
            });
        }
        View descriptionView$media_release = sg2.f26319a.getDescriptionView$media_release();
        if (descriptionView$media_release != null) {
            descriptionView$media_release.setOnClickListener(new View.OnClickListener() { // from class: n9.p4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.c(lVar, view);
                }
            });
        }
        ImageView iconView$media_release = sg2.f26319a.getIconView$media_release();
        if (iconView$media_release != null) {
            iconView$media_release.setOnClickListener(new View.OnClickListener() { // from class: n9.q4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.d(lVar, view);
                }
            });
        }
        View ctaView$media_release = sg2.f26319a.getCtaView$media_release();
        if (ctaView$media_release != null) {
            ctaView$media_release.setOnClickListener(new View.OnClickListener() { // from class: n9.r4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.e(lVar, view);
                }
            });
        }
        View advertiserView$media_release = sg2.f26319a.getAdvertiserView$media_release();
        if (advertiserView$media_release != null) {
            advertiserView$media_release.setOnClickListener(new View.OnClickListener() { // from class: n9.s4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.f(lVar, view);
                }
            });
        }
        View ratingView$media_release = sg2.f26319a.getRatingView$media_release();
        if (ratingView$media_release != null) {
            ratingView$media_release.setOnClickListener(new View.OnClickListener() { // from class: n9.t4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Ug.g(lVar, view);
                }
            });
        }
        View view = sg2.f26321c;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: n9.u4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Ug.h(lVar, view2);
                }
            });
        }
    }

    public static final void a(sn.l lVar, View view) {
        lVar.invoke((short) 2);
    }

    public static final void b(sn.l lVar, View view) {
        lVar.invoke((short) 3);
    }

    public static final void c(sn.l lVar, View view) {
        lVar.invoke((short) 4);
    }

    public static final void d(sn.l lVar, View view) {
        lVar.invoke((short) 5);
    }

    public static final void e(sn.l lVar, View view) {
        lVar.invoke((short) 6);
    }

    public static final void f(sn.l lVar, View view) {
        lVar.invoke((short) 9);
    }

    public static final void g(sn.l lVar, View view) {
        lVar.invoke((short) 8);
    }

    public static final void h(sn.l lVar, View view) {
        lVar.invoke((short) 7);
    }
}
