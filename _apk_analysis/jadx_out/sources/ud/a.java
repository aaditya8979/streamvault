package ud;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.dramarush.shortin.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import oa.f;

/* JADX INFO: compiled from: GlideEngine.java */
/* JADX INFO: loaded from: classes11.dex */
public class a implements f {

    /* JADX INFO: compiled from: GlideEngine.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f85630a = new a();
    }

    public a() {
    }

    public static a g() {
        return b.f85630a;
    }

    @Override // oa.f
    public void a(Context context, String str, ImageView imageView) {
        if (ab.a.a(context)) {
            Glide.with(context).load(str).into(imageView);
        }
    }

    @Override // oa.f
    public void b(Context context) {
        if (ab.a.a(context)) {
            Glide.with(context).pauseRequests();
        }
    }

    @Override // oa.f
    public void c(Context context, ImageView imageView, String str, int i10, int i11) {
        if (ab.a.a(context)) {
            Glide.with(context).load(str).override(i10, i11).into(imageView);
        }
    }

    @Override // oa.f
    public void d(Context context) {
        if (ab.a.a(context)) {
            Glide.with(context).resumeRequests();
        }
    }

    @Override // oa.f
    public void e(Context context, String str, ImageView imageView) {
        if (ab.a.a(context)) {
            Glide.with(context).asBitmap().load(str).override(BaseTransientBottomBar.ANIMATION_FADE_DURATION, BaseTransientBottomBar.ANIMATION_FADE_DURATION).sizeMultiplier(0.5f).transform(new CenterCrop(), new RoundedCorners(8)).placeholder(R.drawable.ps_image_placeholder).into(imageView);
        }
    }

    @Override // oa.f
    public void f(Context context, String str, ImageView imageView) {
        if (ab.a.a(context)) {
            Glide.with(context).load(str).override(200, 200).centerCrop().placeholder(R.drawable.ps_image_placeholder).into(imageView);
        }
    }
}
