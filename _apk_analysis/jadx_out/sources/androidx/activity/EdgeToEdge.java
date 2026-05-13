package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.SystemBarStyle;
import androidx.annotation.VisibleForTesting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class EdgeToEdge {

    @Nullable
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static final void enable(@NotNull ComponentActivity componentActivity) {
        tn.p.k(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static final void enable(@NotNull ComponentActivity componentActivity, @NotNull SystemBarStyle systemBarStyle) {
        tn.p.k(componentActivity, "<this>");
        tn.p.k(systemBarStyle, "statusBarStyle");
        enable$default(componentActivity, systemBarStyle, null, 2, null);
    }

    public static final void enable(@NotNull ComponentActivity componentActivity, @NotNull SystemBarStyle systemBarStyle, @NotNull SystemBarStyle systemBarStyle2) {
        tn.p.k(componentActivity, "<this>");
        tn.p.k(systemBarStyle, "statusBarStyle");
        tn.p.k(systemBarStyle2, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        tn.p.j(decorView, "window.decorView");
        sn.l<Resources, Boolean> detectDarkMode$activity_release = systemBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        tn.p.j(resources, "view.resources");
        boolean zBooleanValue = detectDarkMode$activity_release.invoke(resources).booleanValue();
        sn.l<Resources, Boolean> detectDarkMode$activity_release2 = systemBarStyle2.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        tn.p.j(resources2, "view.resources");
        boolean zBooleanValue2 = detectDarkMode$activity_release2.invoke(resources2).booleanValue();
        EdgeToEdgeImpl edgeToEdgeApi30 = Impl;
        if (edgeToEdgeApi30 == null) {
            int i10 = Build.VERSION.SDK_INT;
            edgeToEdgeApi30 = i10 >= 30 ? new EdgeToEdgeApi30() : i10 >= 29 ? new EdgeToEdgeApi29() : i10 >= 28 ? new EdgeToEdgeApi28() : i10 >= 26 ? new EdgeToEdgeApi26() : new EdgeToEdgeApi23();
        }
        Window window = componentActivity.getWindow();
        tn.p.j(window, "window");
        edgeToEdgeApi30.setUp(systemBarStyle, systemBarStyle2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        tn.p.j(window2, "window");
        edgeToEdgeApi30.adjustLayoutInDisplayCutoutMode(window2);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }
}
