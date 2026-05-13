package la;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.luck.picture.lib.PictureOnlyCameraFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import ra.b0;

/* JADX INFO: compiled from: PictureSelectionCameraModel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PictureSelectionConfig f73761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f73762b;

    public h(j jVar, int i10) {
        this.f73762b = jVar;
        PictureSelectionConfig pictureSelectionConfigD = PictureSelectionConfig.d();
        this.f73761a = pictureSelectionConfigD;
        pictureSelectionConfigD.f34999b = i10;
        pictureSelectionConfigD.f35001c = true;
        pictureSelectionConfigD.f35048z0 = false;
        pictureSelectionConfigD.L = false;
        pictureSelectionConfigD.M = false;
        pictureSelectionConfigD.N = false;
    }

    public void a(b0<LocalMedia> b0Var) {
        if (ab.f.a()) {
            return;
        }
        Activity activity = this.f73762b.getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity cannot be null");
        }
        if (b0Var == null) {
            throw new NullPointerException("OnResultCallbackListener cannot be null");
        }
        PictureSelectionConfig pictureSelectionConfig = this.f73761a;
        pictureSelectionConfig.f35032r0 = true;
        pictureSelectionConfig.f35036t0 = false;
        PictureSelectionConfig.W0 = b0Var;
        FragmentManager supportFragmentManager = null;
        if (activity instanceof AppCompatActivity) {
            supportFragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
        } else if (activity instanceof FragmentActivity) {
            supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
        }
        if (supportFragmentManager == null) {
            throw new NullPointerException("FragmentManager cannot be null");
        }
        String str = PictureOnlyCameraFragment.f34713n;
        Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(str);
        if (fragmentFindFragmentByTag != null) {
            supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commitAllowingStateLoss();
        }
        a.b(supportFragmentManager, str, PictureOnlyCameraFragment.O0());
    }

    public h b(oa.b bVar) {
        PictureSelectionConfig.M0 = bVar;
        this.f73761a.f35038u0 = true;
        return this;
    }

    public h c(oa.d dVar) {
        PictureSelectionConfig.O0 = dVar;
        return this;
    }
}
