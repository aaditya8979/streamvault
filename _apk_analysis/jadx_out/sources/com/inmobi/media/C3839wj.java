package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.C3839wj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.squareup.picasso.Picasso;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;

/* JADX INFO: renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3839wj extends AbstractC3498j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p000do.l0 f28456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3864xj f28457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go.k f28458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3605n9 f28459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f28460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Cj f28461g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3839wj(Context context, p000do.l0 l0Var, C3864xj c3864xj, go.k kVar, C3605n9 c3605n9) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(c3864xj, "staticExperienceModel");
        tn.p.k(kVar, "mediaEventFlow");
        this.f28456b = l0Var;
        this.f28457c = c3864xj;
        this.f28458d = kVar;
        this.f28459e = c3605n9;
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        this.f28460f = "Static-Image-" + string;
        int i10 = Cj.f25271b;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f28461g = new Cj(context);
    }

    public static final void a(C3839wj c3839wj, Image image, View view) {
        C3605n9 c3605n9 = c3839wj.f28459e;
        if (c3605n9 != null) {
            c3605n9.a("StaticExperienceManager", "Static Click Event");
        }
        p000do.i.d(c3839wj.f28456b, null, null, new C3814vj(image, c3839wj, null), 3, null);
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final Object a(FrameLayout frameLayout, C3533kc c3533kc) {
        Object objG = p000do.g.g(p000do.w0.c(), new C3690qj(this, frameLayout, null), c3533kc);
        return objG == in.a.g() ? objG : bn.r.f5635a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (p000do.g.g(r12, r13, r8) == r9) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r16, android.widget.ImageView r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r15 = this;
            r7 = r15
            r0 = r18
            boolean r1 = r0 instanceof com.inmobi.media.C3739sj
            if (r1 == 0) goto L16
            r1 = r0
            com.inmobi.media.sj r1 = (com.inmobi.media.C3739sj) r1
            int r2 = r1.f28144f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f28144f = r2
            goto L1b
        L16:
            com.inmobi.media.sj r1 = new com.inmobi.media.sj
            r1.<init>(r15, r0)
        L1b:
            r8 = r1
            java.lang.Object r0 = r8.f28142d
            java.lang.Object r9 = in.a.g()
            int r1 = r8.f28144f
            r10 = 2
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L48
            if (r1 == r2) goto L3a
            if (r1 != r10) goto L32
            kotlin.c.b(r0)
            goto Lb1
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.jvm.internal.Ref$BooleanRef r1 = r8.f28141c
            android.widget.ImageView r2 = r8.f28140b
            java.util.List r3 = r8.f28139a
            kotlin.c.b(r0)
            r4 = r2
            r14 = r3
            r3 = r1
            r1 = r14
            goto L93
        L48:
            kotlin.c.b(r0)
            com.inmobi.media.n9 r0 = r7.f28459e
            if (r0 == 0) goto L6e
            int r1 = r16.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "loadImagesIntoImageView - attempting to load "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " images"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "StaticExperienceManager"
            r0.a(r3, r1)
        L6e:
            kotlin.jvm.internal.Ref$BooleanRef r0 = new kotlin.jvm.internal.Ref$BooleanRef
            r0.<init>()
            do.y1 r1 = p000do.w0.c()
            com.inmobi.media.uj r3 = new com.inmobi.media.uj
            r3.<init>(r15, r11)
            r4 = r16
            r8.f28139a = r4
            r5 = r17
            r8.f28140b = r5
            r8.f28141c = r0
            r8.f28144f = r2
            java.lang.Object r1 = p000do.g.g(r1, r3, r8)
            if (r1 != r9) goto L8f
            goto Lb0
        L8f:
            r3 = r0
            r0 = r1
            r1 = r4
            r4 = r5
        L93:
            r5 = r0
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            do.h0 r12 = p000do.w0.b()
            com.inmobi.media.tj r13 = new com.inmobi.media.tj
            r6 = 0
            r0 = r13
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f28139a = r11
            r8.f28140b = r11
            r8.f28141c = r11
            r8.f28144f = r10
            java.lang.Object r0 = p000do.g.g(r12, r13, r8)
            if (r0 != r9) goto Lb1
        Lb0:
            return r9
        Lb1:
            bn.r r0 = bn.r.f5635a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3839wj.a(java.util.List, android.widget.ImageView, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3498j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws com.inmobi.media.C3357dc {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3839wj.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final void a() {
        ViewParent parent = this.f28461g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = Qf.f26183a;
        Qf.b(this.f27375a).cancelTag(this.f28460f);
    }

    public final void a(ImageView imageView, final Image image) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: n9.wb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3839wj.a(this.f75682b, image, view);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final void a(go.l lVar) {
        tn.p.k(lVar, "windowFlow");
    }

    @Override // com.inmobi.media.AbstractC3498j2
    public final void b() {
    }
}
