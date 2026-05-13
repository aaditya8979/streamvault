package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.internal.MolocoLogger;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class c0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final AudioManager f47360a;

    public c0(@NotNull Context context) {
        AudioManager audioManager;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        try {
            audioManager = (AudioManager) ContextCompat.getSystemService(context.getApplicationContext(), AudioManager.class);
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudioService", "couldn't get android.media.AudioManager service", e10, false, 8, null);
            audioManager = null;
        }
        this.f47360a = audioManager;
    }

    @Override // com.moloco.sdk.internal.services.b0
    @NotNull
    public z a() {
        AudioManager audioManager = this.f47360a;
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        return (numValueOf != null && numValueOf.intValue() == 0) ? z.f47569a : (numValueOf != null && numValueOf.intValue() == 1) ? z.f47570b : (numValueOf != null && numValueOf.intValue() == 2) ? z.f47571c : z.f47571c;
    }

    @Override // com.moloco.sdk.internal.services.b0
    public int b() {
        AudioManager audioManager = this.f47360a;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }
}
