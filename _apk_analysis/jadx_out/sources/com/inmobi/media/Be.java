package com.inmobi.media;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Be {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f25214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f25215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaView f25216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f25217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Fe f25218e;

    public Be(ViewGroup viewGroup, ImageView imageView, MediaView mediaView, List list, Fe fe2) {
        tn.p.k(viewGroup, "parentView");
        tn.p.k(list, "friendlyViews");
        tn.p.k(fe2, "nativeVisibilitySpec");
        this.f25214a = viewGroup;
        this.f25215b = imageView;
        this.f25216c = mediaView;
        this.f25217d = list;
        this.f25218e = fe2;
    }
}
