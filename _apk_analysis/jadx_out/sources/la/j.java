package la;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.luck.picture.lib.entity.LocalMedia;
import java.lang.ref.SoftReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PictureSelector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SoftReference<Activity> f73765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SoftReference<Fragment> f73766b;

    public j(Activity activity) {
        this(activity, null);
    }

    public j(Activity activity, Fragment fragment) {
        this.f73765a = new SoftReference<>(activity);
        this.f73766b = new SoftReference<>(fragment);
    }

    public static j a(Context context) {
        return new j((Activity) context);
    }

    public static Intent d(ArrayList<LocalMedia> arrayList) {
        return new Intent().putParcelableArrayListExtra("extra_result_media", arrayList);
    }

    public h b(int i10) {
        return new h(this, i10);
    }

    public i c(int i10) {
        return new i(this, i10);
    }

    @Nullable
    public Activity getActivity() {
        return this.f73765a.get();
    }
}
