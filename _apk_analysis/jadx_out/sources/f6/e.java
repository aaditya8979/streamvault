package f6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.r2;
import com.google.common.primitives.Ints;
import com.ironsource.C3978d4;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: compiled from: AudioCapabilities.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f61493c = new e(new int[]{2}, 8);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f61494d = new e(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ImmutableMap<Integer, Integer> f61495e = new ImmutableMap.b().g(5, 6).g(17, 6).g(7, 6).g(18, 6).g(6, 8).g(8, 8).g(14, 8).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f61496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f61497b;

    /* JADX INFO: compiled from: AudioCapabilities.java */
    @RequiresApi(29)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AudioAttributes f61498a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        @DoNotInline
        public static int[] a() {
            ImmutableList.a aVarBuilder = ImmutableList.builder();
            r2 it = e.f61495e.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f61498a)) {
                    aVarBuilder.a(Integer.valueOf(iIntValue));
                }
            }
            aVarBuilder.a(2);
            return Ints.n(aVarBuilder.m());
        }

        @DoNotInline
        public static int b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(m0.D(i12)).build(), f61498a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    public e(@Nullable int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f61496a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f61496a = new int[0];
        }
        this.f61497b = i10;
    }

    public static boolean b() {
        if (m0.f79487a >= 17) {
            String str = m0.f79489c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static e c(Context context) {
        return d(context, m0.E0(context, null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static e d(Context context, @Nullable Intent intent) {
        return (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) ? f61494d : (m0.f79487a < 29 || !(m0.r0(context) || m0.m0(context))) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f61493c : new e(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : new e(a.a(), 8);
    }

    public static int e(int i10) {
        int i11 = m0.f79487a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(m0.f79488b) && i10 == 1) {
            i10 = 2;
        }
        return m0.D(i10);
    }

    public static int g(int i10, int i11) {
        return m0.f79487a >= 29 ? a.b(i10, i11) : ((Integer) s7.a.e(f61495e.getOrDefault(Integer.valueOf(i10), 0))).intValue();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Arrays.equals(this.f61496a, eVar.f61496a) && this.f61497b == eVar.f61497b;
    }

    @Nullable
    public Pair<Integer, Integer> f(com.google.android.exoplayer2.m mVar) {
        int iD = s7.u.d((String) s7.a.e(mVar.f21751m), mVar.f21748j);
        if (!f61495e.containsKey(Integer.valueOf(iD))) {
            return null;
        }
        if (iD == 18 && !i(18)) {
            iD = 6;
        } else if (iD == 8 && !i(8)) {
            iD = 7;
        }
        if (!i(iD)) {
            return null;
        }
        int iG = mVar.f21764z;
        if (iG == -1 || iD == 18) {
            int i10 = mVar.A;
            if (i10 == -1) {
                i10 = 48000;
            }
            iG = g(iD, i10);
        } else if (iG > this.f61497b) {
            return null;
        }
        int iE = e(iG);
        if (iE == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iD), Integer.valueOf(iE));
    }

    public boolean h(com.google.android.exoplayer2.m mVar) {
        return f(mVar) != null;
    }

    public int hashCode() {
        return this.f61497b + (Arrays.hashCode(this.f61496a) * 31);
    }

    public boolean i(int i10) {
        return Arrays.binarySearch(this.f61496a, i10) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f61497b + ", supportedEncodings=" + Arrays.toString(this.f61496a) + C3978d4.j.f31385e;
    }
}
