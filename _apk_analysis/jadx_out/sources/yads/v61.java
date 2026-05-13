package yads;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class v61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f95963a;

    public v61(Context context) {
        this.f95963a = context;
    }

    public final File a() {
        File file = new File(this.f95963a.getCacheDir(), "debug_panel");
        file.mkdir();
        return new File(file, "monetization_ads_debug_panel_report.txt");
    }
}
