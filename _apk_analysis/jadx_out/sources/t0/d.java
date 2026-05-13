package t0;

import android.content.Context;
import android.media.AudioManager;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AudioRenderController.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final org.fourthline.cling.model.types.d f84590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AudioManager f84591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public org.fourthline.cling.model.types.d f84592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final p0.b f84593d;

    public d(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f84590a = new org.fourthline.cling.model.types.d(0L);
        Object systemService = context.getSystemService("audio");
        p.i(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        this.f84591b = audioManager;
        this.f84592c = new org.fourthline.cling.model.types.d((((long) audioManager.getStreamVolume(3)) * 100) / ((long) audioManager.getStreamMaxVolume(3)));
        this.f84593d = p0.b.f76945b.a("AudioRenderController");
    }

    @Override // t0.c
    @NotNull
    public org.fourthline.cling.model.types.d a(@NotNull String str) {
        p.k(str, "channelName");
        return new org.fourthline.cling.model.types.d((((long) this.f84591b.getStreamVolume(3)) * 100) / ((long) this.f84591b.getStreamMaxVolume(3)));
    }

    @Override // t0.c
    public boolean b(@NotNull String str) {
        p.k(str, "channelName");
        Long lC = a(str).c();
        return lC != null && lC.longValue() == 0;
    }
}
