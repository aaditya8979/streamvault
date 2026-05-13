package sg.bigo.ads.ad.c;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f80087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.ad.b.b f80088b;

    public b(@NonNull sg.bigo.ads.ad.b.b bVar) {
        ImageView imageView;
        Context context;
        this.f80088b = bVar;
        if (bVar == null || (context = bVar.f80021b.f81865f) == null) {
            imageView = null;
        } else {
            imageView = new ImageView(context);
            int iA = e.a(context, 38);
            imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(iA, iA));
            imageView.setVisibility(8);
        }
        this.f80087a = imageView;
    }

    public final void a() {
        ImageView imageView = this.f80087a;
        if (imageView != null) {
            u.b(imageView);
            this.f80087a = null;
        }
        sg.bigo.ads.ad.b.b bVar = this.f80088b;
        if (bVar != null) {
            bVar.destroy();
            this.f80088b = null;
        }
    }
}
