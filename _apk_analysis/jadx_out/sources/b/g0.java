package b;

import android.graphics.Bitmap;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;
import com.yk.e.util.ImageLoader;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends ImageLoader.ImageLoadCallBack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f5320a;

    public g0(RewardVideoActivity rewardVideoActivity) {
        this.f5320a = rewardVideoActivity;
    }

    @Override // com.yk.e.util.ImageLoader.ImageLoadCallBack
    public final void execute(Bitmap bitmap) {
        if (bitmap != null) {
            this.f5320a.f3297iILLL1.setVisibility(0);
            this.f5320a.f3299lIiI.setVisibility(0);
        } else {
            this.f5320a.f3297iILLL1.setVisibility(8);
            this.f5320a.f3299lIiI.setVisibility(8);
        }
        this.f5320a.f3297iILLL1.setImageBitmap(bitmap);
        this.f5320a.f3299lIiI.setImageBitmap(bitmap);
    }
}
