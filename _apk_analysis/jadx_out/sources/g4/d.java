package g4;

import a6.k0;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.ironsource.C3978d4;
import java.util.Arrays;

/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes10.dex */
@TargetApi(21)
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f61943c = new d(new int[]{2}, 8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f61944d = new d(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f61945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61946b;

    public d(@Nullable int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f61945a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f61945a = new int[0];
        }
        this.f61946b = i10;
    }

    public static boolean a() {
        return k0.f3574a >= 17 && "Amazon".equals(k0.f3576c);
    }

    public static d b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static d c(Context context, @Nullable Intent intent) {
        return (a() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f61944d : (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f61943c : new d(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public int d() {
        return this.f61946b;
    }

    public boolean e(int i10) {
        return Arrays.binarySearch(this.f61945a, i10) >= 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f61945a, dVar.f61945a) && this.f61946b == dVar.f61946b;
    }

    public int hashCode() {
        return this.f61946b + (Arrays.hashCode(this.f61945a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f61946b + ", supportedEncodings=" + Arrays.toString(this.f61945a) + C3978d4.j.f31385e;
    }
}
