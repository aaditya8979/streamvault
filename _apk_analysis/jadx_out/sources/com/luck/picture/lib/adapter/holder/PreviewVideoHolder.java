package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import oa.g;
import oa.k;
import ra.q;
import ya.j;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewVideoHolder extends BasePreviewHolder {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView f34922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ProgressBar f34923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f34924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f34925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f34926w;

    public class a implements j {
        public a() {
        }

        @Override // ya.j
        public void a(View view, float f10, float f11) {
            BasePreviewHolder.a aVar = PreviewVideoHolder.this.f34859r;
            if (aVar != null) {
                aVar.onBackPressed();
            }
        }
    }

    public class b implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f34928b;

        public b(LocalMedia localMedia) {
            this.f34928b = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.a aVar = PreviewVideoHolder.this.f34859r;
            if (aVar == null) {
                return false;
            }
            aVar.a(this.f34928b);
            return false;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
            if (previewVideoHolder.f34857p.G0) {
                previewVideoHolder.q();
            } else {
                previewVideoHolder.x();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
            if (previewVideoHolder.f34857p.G0) {
                previewVideoHolder.q();
                return;
            }
            BasePreviewHolder.a aVar = previewVideoHolder.f34859r;
            if (aVar != null) {
                aVar.onBackPressed();
            }
        }
    }

    public class e implements q {
        public e() {
        }

        @Override // ra.q
        public void a() {
            PreviewVideoHolder.this.v();
        }

        @Override // ra.q
        public void b() {
            PreviewVideoHolder.this.u();
        }

        @Override // ra.q
        public void onPlayerError() {
            PreviewVideoHolder.this.u();
        }
    }

    public PreviewVideoHolder(@NonNull View view) {
        super(view);
        this.f34925v = false;
        this.f34926w = new e();
        this.f34922s = (ImageView) view.findViewById(R$id.iv_play_video);
        this.f34923t = (ProgressBar) view.findViewById(R$id.progress);
        this.f34922s.setVisibility(PictureSelectionConfig.e().M ? 8 : 0);
        if (PictureSelectionConfig.S0 == null) {
            PictureSelectionConfig.S0 = new g();
        }
        View viewF = PictureSelectionConfig.S0.f(view.getContext());
        this.f34924u = viewF;
        if (viewF == null) {
            throw new NullPointerException("onCreateVideoPlayer cannot be empty,Please implement " + k.class);
        }
        if (viewF.getLayoutParams() == null) {
            this.f34924u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.indexOfChild(this.f34924u) != -1) {
            viewGroup.removeView(this.f34924u);
        }
        viewGroup.addView(this.f34924u, 0);
        this.f34924u.setVisibility(8);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void b(LocalMedia localMedia, int i10) {
        super.b(localMedia, i10);
        m(localMedia);
        this.f34922s.setOnClickListener(new c());
        this.itemView.setOnClickListener(new d());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void c(View view) {
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void f(LocalMedia localMedia, int i10, int i11) {
        if (PictureSelectionConfig.K0 != null) {
            String strF = localMedia.f();
            if (i10 == -1 && i11 == -1) {
                PictureSelectionConfig.K0.a(this.itemView.getContext(), strF, this.f34858q);
            } else {
                PictureSelectionConfig.K0.c(this.itemView.getContext(), this.f34858q, strF, i10, i11);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void g() {
        this.f34858q.setOnViewTapListener(new a());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void h(LocalMedia localMedia) {
        this.f34858q.setOnLongClickListener(new b(localMedia));
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void i() {
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.c(this.f34924u);
            PictureSelectionConfig.S0.e(this.f34926w);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void j() {
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.i(this.f34924u);
            PictureSelectionConfig.S0.h(this.f34926w);
        }
        u();
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void m(LocalMedia localMedia) {
        super.m(localMedia);
        if (this.f34857p.M || this.f34853l >= this.f34854m) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f34924u.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.f34853l;
            layoutParams2.height = this.f34855n;
            layoutParams2.gravity = 17;
            return;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.width = this.f34853l;
            layoutParams3.height = this.f34855n;
            layoutParams3.addRule(13);
            return;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams4.width = this.f34853l;
            layoutParams4.height = this.f34855n;
            layoutParams4.gravity = 17;
            return;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams5).width = this.f34853l;
            ((ViewGroup.MarginLayoutParams) layoutParams5).height = this.f34855n;
            layoutParams5.topToTop = 0;
            layoutParams5.bottomToBottom = 0;
        }
    }

    public final void q() {
        if (!this.f34925v) {
            x();
        } else if (r()) {
            s();
        } else {
            t();
        }
    }

    public boolean r() {
        k kVar = PictureSelectionConfig.S0;
        return kVar != null && kVar.d(this.f34924u);
    }

    public final void s() {
        this.f34922s.setVisibility(0);
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.j(this.f34924u);
        }
    }

    public final void t() {
        this.f34922s.setVisibility(8);
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.g(this.f34924u);
        }
    }

    public final void u() {
        this.f34925v = false;
        this.f34922s.setVisibility(0);
        this.f34923t.setVisibility(8);
        this.f34858q.setVisibility(0);
        this.f34924u.setVisibility(8);
        BasePreviewHolder.a aVar = this.f34859r;
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final void v() {
        this.f34923t.setVisibility(8);
        this.f34922s.setVisibility(8);
        this.f34858q.setVisibility(8);
        this.f34924u.setVisibility(0);
    }

    public void w() {
        k kVar = PictureSelectionConfig.S0;
        if (kVar != null) {
            kVar.h(this.f34926w);
            PictureSelectionConfig.S0.a(this.f34924u);
        }
    }

    public void x() {
        if (this.f34924u == null) {
            throw new NullPointerException("VideoPlayer cannot be empty,Please implement " + k.class);
        }
        if (PictureSelectionConfig.S0 != null) {
            this.f34923t.setVisibility(0);
            this.f34922s.setVisibility(8);
            this.f34859r.b(this.f34856o.p());
            this.f34925v = true;
            PictureSelectionConfig.S0.b(this.f34924u, this.f34856o);
        }
    }
}
