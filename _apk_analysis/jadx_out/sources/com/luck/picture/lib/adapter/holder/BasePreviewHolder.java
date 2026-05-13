package com.luck.picture.lib.adapter.holder;

import ab.c;
import ab.e;
import ab.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.photoview.PhotoView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BasePreviewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f34853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f34854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f34855n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LocalMedia f34856o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PictureSelectionConfig f34857p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PhotoView f34858q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f34859r;

    public interface a {
        void a(LocalMedia localMedia);

        void b(String str);

        void onBackPressed();
    }

    public BasePreviewHolder(@NonNull View view) {
        super(view);
        this.f34857p = PictureSelectionConfig.e();
        this.f34853l = e.e(view.getContext());
        this.f34854m = e.g(view.getContext());
        this.f34855n = e.d(view.getContext());
        this.f34858q = (PhotoView) view.findViewById(R$id.preview_image);
        c(view);
    }

    public static BasePreviewHolder d(ViewGroup viewGroup, int i10, int i11) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        return i10 == 2 ? new PreviewVideoHolder(viewInflate) : i10 == 3 ? new PreviewAudioHolder(viewInflate) : new PreviewImageHolder(viewInflate);
    }

    public void b(LocalMedia localMedia, int i10) {
        this.f34856o = localMedia;
        int[] iArrE = e(localMedia);
        int[] iArrB = c.b(iArrE[0], iArrE[1]);
        f(localMedia, iArrB[0], iArrB[1]);
        m(localMedia);
        k(localMedia);
        g();
        h(localMedia);
    }

    public abstract void c(View view);

    public int[] e(LocalMedia localMedia) {
        return (!localMedia.G() || localMedia.k() <= 0 || localMedia.j() <= 0) ? new int[]{localMedia.D(), localMedia.q()} : new int[]{localMedia.k(), localMedia.j()};
    }

    public abstract void f(LocalMedia localMedia, int i10, int i11);

    public abstract void g();

    public abstract void h(LocalMedia localMedia);

    public void i() {
    }

    public void j() {
    }

    public void k(LocalMedia localMedia) {
        if (j.n(localMedia.D(), localMedia.q())) {
            this.f34858q.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            this.f34858q.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public void l(a aVar) {
        this.f34859r = aVar;
    }

    public void m(LocalMedia localMedia) {
        if (this.f34857p.M || this.f34853l >= this.f34854m || localMedia.D() <= 0 || localMedia.q() <= 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34858q.getLayoutParams();
        layoutParams.width = this.f34853l;
        layoutParams.height = this.f34855n;
        layoutParams.gravity = 17;
    }
}
