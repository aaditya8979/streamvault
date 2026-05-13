package sg.bigo.ads.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.n;
import sg.bigo.ads.common.p.g;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.core.adview.f;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes6.dex */
public class MediaView extends sg.bigo.ads.api.a<f> {

    public interface a {
        void a(sg.bigo.ads.core.player.b.b bVar);

        void a(boolean z10);

        boolean a();

        void b();
    }

    public MediaView(@NonNull Context context) {
        super(context);
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // sg.bigo.ads.api.a
    @NonNull
    public final /* synthetic */ sg.bigo.ads.core.adview.c a() {
        return new f(this);
    }

    public final void a(Bitmap bitmap) {
        getViewImpl().f83598g = false;
        f viewImpl = getViewImpl();
        if (bitmap != null) {
            int iA = e.a(viewImpl.f83574a.getContext(), 10);
            int iA2 = e.a(viewImpl.f83574a.getContext(), 4);
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewImpl.f83574a.getContext());
            roundedFrameLayout.setCornerRadius(iA2);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z10 = ((width == height) && viewImpl.f83574a.getWidth() <= viewImpl.f83574a.getHeight()) || width > height;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z10 ? -1 : -2, z10 ? -2 : -1, 17);
            layoutParams.setMargins(iA, iA, iA, iA);
            roundedFrameLayout.setLayoutParams(layoutParams);
            AdImageView adImageView = new AdImageView(viewImpl.f83574a.getContext());
            adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            u.a(adImageView, roundedFrameLayout, null, -1);
            u.a(roundedFrameLayout, viewImpl.f83574a, null, -1);
            adImageView.setBlurBorder(viewImpl.f83598g);
            adImageView.setImageBitmap(bitmap);
        }
    }

    public final void a(@NonNull String str) {
        getViewImpl().a(str);
    }

    public final void a(@NonNull n nVar, @Nullable g gVar) {
        getViewImpl().a(nVar, gVar);
    }

    public final void a(@NonNull sg.bigo.ads.core.a.a aVar, @NonNull p pVar, sg.bigo.ads.core.g.c cVar) {
        getViewImpl().a(aVar, pVar, cVar);
    }

    public final void a(@NonNull sg.bigo.ads.core.player.b.d dVar) {
        getViewImpl().a(dVar);
    }

    public final float b(int i10, int i11) {
        f viewImpl = getViewImpl();
        if (viewImpl.f83594c == null) {
            return 0.0f;
        }
        return viewImpl.c() > viewImpl.d() ? (((i11 * viewImpl.c()) / viewImpl.d()) * 1.0f) / i10 : (((i10 * viewImpl.d()) / viewImpl.c()) * 1.0f) / i11;
    }

    @NonNull
    public final a b() {
        return getViewImpl();
    }

    public final void c() {
        f viewImpl = getViewImpl();
        AdImageView adImageView = viewImpl.f83594c;
        if (adImageView != null) {
            adImageView.setImageBitmap(null);
            viewImpl.f83594c.a();
            viewImpl.f83594c = null;
        }
        sg.bigo.ads.core.player.b.f fVar = viewImpl.f83593b;
        if (fVar != null) {
            fVar.d();
            viewImpl.f83593b = null;
        }
    }

    public View getImage() {
        return getViewImpl().f83594c;
    }

    @Nullable
    public VideoController getVideoController() {
        return getViewImpl().f83597f;
    }

    public void setImageBlurBorder(boolean z10) {
        getViewImpl().f83598g = z10;
    }

    public void setMediaAreaClickable(boolean z10) {
        getViewImpl().f83596e = Boolean.valueOf(z10);
    }

    public void setOtherClickAreaClick(boolean z10) {
        getViewImpl().f83595d = Boolean.valueOf(z10);
    }
}
