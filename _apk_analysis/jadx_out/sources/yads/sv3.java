package yads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sv3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UiModeManager f94956a;

    public static int a() {
        UiModeManager uiModeManager = f94956a;
        if (uiModeManager == null) {
            return 3;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? 3 : 1;
        }
        return 2;
    }

    public static void a(Context context) {
        f94956a = (UiModeManager) context.getSystemService("uimode");
    }
}
