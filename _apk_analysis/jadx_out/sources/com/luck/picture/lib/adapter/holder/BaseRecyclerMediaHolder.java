package com.luck.picture.lib.adapter.holder;

import ab.q;
import ab.s;
import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.adapter.PictureImageGridAdapter;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import oa.f;
import ra.h;

/* JADX INFO: loaded from: classes4.dex */
public class BaseRecyclerMediaHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f34860l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f34861m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f34862n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f34863o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PictureSelectionConfig f34864p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f34865q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f34866r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorFilter f34867s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorFilter f34868t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorFilter f34869u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PictureImageGridAdapter.b f34870v;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseRecyclerMediaHolder.this.f34862n.performClick();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f34872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f34873c;

        public b(LocalMedia localMedia, int i10) {
            this.f34872b = localMedia;
            this.f34873c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iA;
            h hVar;
            if (this.f34872b.J() || BaseRecyclerMediaHolder.this.f34870v == null || (iA = BaseRecyclerMediaHolder.this.f34870v.a(BaseRecyclerMediaHolder.this.f34861m, this.f34873c, this.f34872b)) == -1) {
                return;
            }
            if (iA == 0) {
                BaseRecyclerMediaHolder baseRecyclerMediaHolder = BaseRecyclerMediaHolder.this;
                if (baseRecyclerMediaHolder.f34864p.B0) {
                    h hVar2 = PictureSelectionConfig.f34994n1;
                    if (hVar2 != null) {
                        hVar2.a(baseRecyclerMediaHolder.f34860l, true);
                    } else {
                        ab.b.b(baseRecyclerMediaHolder.f34860l);
                    }
                }
            } else if (iA == 1) {
                BaseRecyclerMediaHolder baseRecyclerMediaHolder2 = BaseRecyclerMediaHolder.this;
                if (baseRecyclerMediaHolder2.f34864p.B0 && (hVar = PictureSelectionConfig.f34994n1) != null) {
                    hVar.a(baseRecyclerMediaHolder2.f34860l, false);
                }
            }
            BaseRecyclerMediaHolder baseRecyclerMediaHolder3 = BaseRecyclerMediaHolder.this;
            baseRecyclerMediaHolder3.k(baseRecyclerMediaHolder3.h(this.f34872b));
        }
    }

    public class c implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f34875b;

        public c(int i10) {
            this.f34875b = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (BaseRecyclerMediaHolder.this.f34870v == null) {
                return false;
            }
            BaseRecyclerMediaHolder.this.f34870v.d(view, this.f34875b);
            return false;
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f34877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f34878c;

        public d(LocalMedia localMedia, int i10) {
            this.f34877b = localMedia;
            this.f34878c = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f34877b
                boolean r4 = r4.J()
                if (r4 != 0) goto L7b
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.adapter.PictureImageGridAdapter$b r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.b(r4)
                if (r4 != 0) goto L11
                goto L7b
            L11:
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f34877b
                java.lang.String r4 = r4.s()
                boolean r4 = ma.d.h(r4)
                r0 = 1
                if (r4 == 0) goto L26
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f34864p
                boolean r4 = r4.I
                if (r4 != 0) goto L60
            L26:
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f34864p
                boolean r4 = r4.f35003d
                if (r4 != 0) goto L60
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f34877b
                java.lang.String r4 = r4.s()
                boolean r4 = ma.d.i(r4)
                if (r4 == 0) goto L46
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f34864p
                boolean r1 = r4.J
                if (r1 != 0) goto L60
                int r4 = r4.f35017k
                if (r4 == r0) goto L60
            L46:
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f34877b
                java.lang.String r4 = r4.s()
                boolean r4 = ma.d.d(r4)
                if (r4 == 0) goto L5f
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f34864p
                boolean r1 = r4.K
                if (r1 != 0) goto L60
                int r4 = r4.f35017k
                if (r4 != r0) goto L5f
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 == 0) goto L74
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.adapter.PictureImageGridAdapter$b r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.b(r4)
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r0 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                android.widget.TextView r0 = r0.f34861m
                int r1 = r3.f34878c
                com.luck.picture.lib.entity.LocalMedia r2 = r3.f34877b
                r4.c(r0, r1, r2)
                goto L7b
            L74:
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                android.view.View r4 = r4.f34862n
                r4.performClick()
            L7b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.d.onClick(android.view.View):void");
        }
    }

    public BaseRecyclerMediaHolder(@NonNull View view) {
        super(view);
    }

    public BaseRecyclerMediaHolder(@NonNull View view, PictureSelectionConfig pictureSelectionConfig) {
        int i10;
        super(view);
        this.f34864p = pictureSelectionConfig;
        Context context = view.getContext();
        this.f34863o = context;
        this.f34867s = q.g(context, R$color.ps_color_20);
        this.f34868t = q.g(this.f34863o, R$color.ps_color_80);
        this.f34869u = q.g(this.f34863o, R$color.ps_color_half_white);
        SelectMainStyle selectMainStyleC = PictureSelectionConfig.T0.c();
        this.f34865q = selectMainStyleC.Y();
        this.f34860l = (ImageView) view.findViewById(R$id.ivPicture);
        this.f34861m = (TextView) view.findViewById(R$id.tvCheck);
        this.f34862n = view.findViewById(R$id.btnCheck);
        boolean z10 = true;
        if (pictureSelectionConfig.f35017k == 1 && pictureSelectionConfig.f35003d) {
            this.f34861m.setVisibility(8);
            this.f34862n.setVisibility(8);
        } else {
            this.f34861m.setVisibility(0);
            this.f34862n.setVisibility(0);
        }
        if (pictureSelectionConfig.f35003d || ((i10 = pictureSelectionConfig.f35017k) != 1 && i10 != 2)) {
            z10 = false;
        }
        this.f34866r = z10;
        int iV = selectMainStyleC.v();
        if (q.b(iV)) {
            this.f34861m.setTextSize(iV);
        }
        int iU = selectMainStyleC.u();
        if (q.c(iU)) {
            this.f34861m.setTextColor(iU);
        }
        int I = selectMainStyleC.I();
        if (q.c(I)) {
            this.f34861m.setBackgroundResource(I);
        }
        int[] iArrT = selectMainStyleC.t();
        if (q.a(iArrT)) {
            if (this.f34861m.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f34861m.getLayoutParams()).removeRule(21);
                for (int i11 : iArrT) {
                    ((RelativeLayout.LayoutParams) this.f34861m.getLayoutParams()).addRule(i11);
                }
            }
            if (this.f34862n.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f34862n.getLayoutParams()).removeRule(21);
                for (int i12 : iArrT) {
                    ((RelativeLayout.LayoutParams) this.f34862n.getLayoutParams()).addRule(i12);
                }
            }
            int iS = selectMainStyleC.s();
            if (q.b(iS)) {
                ViewGroup.LayoutParams layoutParams = this.f34862n.getLayoutParams();
                layoutParams.width = iS;
                layoutParams.height = iS;
            }
        }
    }

    public static BaseRecyclerMediaHolder g(ViewGroup viewGroup, int i10, int i11, PictureSelectionConfig pictureSelectionConfig) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        return i10 != 1 ? i10 != 3 ? i10 != 4 ? new ImageViewHolder(viewInflate, pictureSelectionConfig) : new AudioViewHolder(viewInflate, pictureSelectionConfig) : new VideoViewHolder(viewInflate, pictureSelectionConfig) : new CameraViewHolder(viewInflate);
    }

    public void e(LocalMedia localMedia, int i10) {
        localMedia.f35071n = getAbsoluteAdapterPosition();
        k(h(localMedia));
        if (this.f34865q) {
            j(localMedia);
        }
        if (this.f34866r && this.f34864p.f35012h0) {
            f(localMedia);
        }
        String strW = localMedia.w();
        if (localMedia.H()) {
            strW = localMedia.m();
        }
        i(strW);
        this.f34861m.setOnClickListener(new a());
        this.f34862n.setOnClickListener(new b(localMedia, i10));
        this.itemView.setOnLongClickListener(new c(i10));
        this.itemView.setOnClickListener(new d(localMedia, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.luck.picture.lib.entity.LocalMedia r6) {
        /*
            r5 = this;
            int r0 = va.a.l()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L77
            java.util.ArrayList r0 = va.a.n()
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L77
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r5.f34864p
            boolean r3 = r0.Q
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L32
            int r0 = r0.f35017k
            if (r0 != r2) goto L27
            int r0 = va.a.l()
            if (r0 != r4) goto L77
        L25:
            r0 = r2
            goto L78
        L27:
            int r0 = va.a.l()
            com.luck.picture.lib.config.PictureSelectionConfig r3 = r5.f34864p
            int r3 = r3.f35019l
            if (r0 != r3) goto L77
            goto L25
        L32:
            java.lang.String r0 = va.a.o()
            boolean r0 = ma.d.i(r0)
            if (r0 == 0) goto L5d
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r5.f34864p
            int r3 = r0.f35017k
            if (r3 != r2) goto L43
            goto L4c
        L43:
            int r3 = r0.f35023n
            if (r3 <= 0) goto L49
            r4 = r3
            goto L4c
        L49:
            int r0 = r0.f35019l
            r4 = r0
        L4c:
            int r0 = va.a.l()
            if (r0 == r4) goto L25
            java.lang.String r0 = r6.s()
            boolean r0 = ma.d.h(r0)
            if (r0 == 0) goto L77
            goto L25
        L5d:
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r5.f34864p
            int r3 = r0.f35017k
            if (r3 != r2) goto L64
            goto L66
        L64:
            int r4 = r0.f35019l
        L66:
            int r0 = va.a.l()
            if (r0 == r4) goto L25
            java.lang.String r0 = r6.s()
            boolean r0 = ma.d.i(r0)
            if (r0 == 0) goto L77
            goto L25
        L77:
            r0 = r1
        L78:
            if (r0 == 0) goto L85
            android.widget.ImageView r0 = r5.f34860l
            android.graphics.ColorFilter r1 = r5.f34869u
            r0.setColorFilter(r1)
            r6.j0(r2)
            goto L88
        L85:
            r6.j0(r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.f(com.luck.picture.lib.entity.LocalMedia):void");
    }

    public final boolean h(LocalMedia localMedia) {
        LocalMedia localMediaH;
        boolean zContains = va.a.n().contains(localMedia);
        if (zContains && (localMediaH = localMedia.h()) != null && localMediaH.H()) {
            localMedia.b0(localMediaH.m());
            localMedia.a0(!TextUtils.isEmpty(localMediaH.m()));
            localMedia.e0(localMediaH.H());
        }
        return zContains;
    }

    public void i(String str) {
        f fVar = PictureSelectionConfig.K0;
        if (fVar != null) {
            fVar.f(this.f34860l.getContext(), str, this.f34860l);
        }
    }

    public final void j(LocalMedia localMedia) {
        this.f34861m.setText("");
        for (int i10 = 0; i10 < va.a.l(); i10++) {
            LocalMedia localMedia2 = va.a.n().get(i10);
            if (TextUtils.equals(localMedia2.w(), localMedia.w()) || localMedia2.r() == localMedia.r()) {
                localMedia.l0(localMedia2.t());
                localMedia2.q0(localMedia.x());
                this.f34861m.setText(s.g(Integer.valueOf(localMedia.t())));
            }
        }
    }

    public final void k(boolean z10) {
        if (this.f34861m.isSelected() != z10) {
            this.f34861m.setSelected(z10);
        }
        if (this.f34864p.f35003d) {
            this.f34860l.setColorFilter(this.f34867s);
        } else {
            this.f34860l.setColorFilter(z10 ? this.f34868t : this.f34867s);
        }
    }

    public void l(PictureImageGridAdapter.b bVar) {
        this.f34870v = bVar;
    }
}
