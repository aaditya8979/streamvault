package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* JADX INFO: loaded from: classes11.dex */
public final class jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju3 f91419a;

    public jy0(ju3 ju3Var) {
        this.f91419a = ju3Var;
    }

    public final Intent a(Context context, long j10) {
        this.f91419a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j10);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
