package com.fyber.inneractive.sdk.flow.endcard;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes.dex */
public final class w extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f16384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f16385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ViewGroup f16386e;

    public w(v vVar) {
        super(vVar);
        ImageView imageView = new ImageView(IAConfigManager.O.f15976v.a());
        imageView.setId(R.id.ia_inneractive_vast_endcard_static);
        this.f16385d = imageView;
        this.f16386e = a.a(imageView);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return this.f16386e;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        com.fyber.inneractive.sdk.util.v.a(b());
        Bitmap bitmap = this.f16384c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f16384c = null;
        this.f16385d.setImageBitmap(null);
    }
}
