package la;

import android.app.Activity;
import android.content.Intent;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.basic.PictureSelectorSupporterActivity;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.safedk.android.utils.Logger;
import ra.b0;

/* JADX INFO: compiled from: PictureSelectionModel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PictureSelectionConfig f73763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f73764b;

    public i(j jVar, int i10) {
        this.f73764b = jVar;
        PictureSelectionConfig pictureSelectionConfigD = PictureSelectionConfig.d();
        this.f73763a = pictureSelectionConfigD;
        pictureSelectionConfigD.f34999b = i10;
        f(pictureSelectionConfigD.f35023n);
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        activity.startActivity(intent);
    }

    public void a(b0<LocalMedia> b0Var) {
        if (ab.f.a()) {
            return;
        }
        Activity activity = this.f73764b.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (b0Var == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f73763a;
        pictureSelectionConfig.f35032r0 = true;
        pictureSelectionConfig.f35036t0 = false;
        PictureSelectionConfig.W0 = b0Var;
        if (PictureSelectionConfig.K0 == null && pictureSelectionConfig.f34999b != ma.e.b()) {
            throw new NullPointerException("imageEngine is null,Please implement ImageEngine");
        }
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent(activity, (Class<?>) PictureSelectorSupporterActivity.class));
        activity.overridePendingTransition(PictureSelectionConfig.T0.e().f35154b, R$anim.ps_anim_fade_in);
    }

    public i b(oa.b bVar) {
        PictureSelectionConfig.M0 = bVar;
        this.f73763a.f35038u0 = true;
        return this;
    }

    public i c(oa.d dVar) {
        PictureSelectionConfig.O0 = dVar;
        return this;
    }

    public i d(oa.f fVar) {
        PictureSelectionConfig.K0 = fVar;
        return this;
    }

    public i e(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f73763a;
        if (pictureSelectionConfig.f35017k == 1) {
            i10 = 1;
        }
        pictureSelectionConfig.f35019l = i10;
        return this;
    }

    public i f(int i10) {
        PictureSelectionConfig pictureSelectionConfig = this.f73763a;
        if (pictureSelectionConfig.f34999b == ma.e.d()) {
            i10 = 0;
        }
        pictureSelectionConfig.f35023n = i10;
        return this;
    }

    public i g(int i10) {
        this.f73763a.f35021m = i10;
        return this;
    }

    public i h(za.a aVar) {
        if (aVar != null) {
            PictureSelectionConfig.T0 = aVar;
        }
        return this;
    }
}
