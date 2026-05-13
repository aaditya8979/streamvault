package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4161n6 implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Activity f33079a;

    public C4161n6(@NotNull Activity activity) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.f33079a = activity;
    }

    @Override // com.ironsource.J
    public void a(@NotNull C4123l6 c4123l6) {
        tn.p.k(c4123l6, "fullscreenAdInstance");
        c4123l6.a(this.f33079a);
    }
}
