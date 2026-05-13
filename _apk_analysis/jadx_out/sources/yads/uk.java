package yads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import android.util.Base64;
import com.ironsource.C3978d4;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class uk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final uk f95693c = new uk(8, new int[]{2});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final uk f95694d = new uk(8, new int[]{2, 5, 6});

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final xm2 f95695e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f95696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f95697b;

    static {
        q51 q51VarA = new q51(4).a(5, 6).a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8);
        f95695e = xm2.a(q51VarA.f93894b, q51VarA.f93893a);
    }

    public uk(int i10, int[] iArr) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f95696a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f95696a = new int[0];
        }
        this.f95697b = i10;
    }

    public static uk a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i10 = ib3.f90737a;
        if (i10 >= 17) {
            byte[] bArrDecode = Base64.decode("QW1hem9u", 0);
            Charset charset = bo.c.f5639b;
            String str = new String(bArrDecode, charset);
            String str2 = ib3.f90739c;
            if ((str.equals(str2) || new String(Base64.decode("WGlhb21p", 0), charset).equals(str2)) && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                return f95694d;
            }
        }
        if (i10 >= 29 && (ib3.d(context) || (i10 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            return new uk(8, tk.a());
        }
        if (intentRegisterReceiver == null || intentRegisterReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return f95693c;
        }
        return new uk(intentRegisterReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8), intentRegisterReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(yads.mx0 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f92610m
            r0.getClass()
            java.lang.String r1 = r10.f92607j
            int r0 = yads.ht1.b(r0, r1)
            yads.xm2 r1 = yads.uk.f95695e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 6
            r5 = 8
            r6 = 18
            if (r0 != r6) goto L2c
            int[] r7 = r9.f95696a
            int r7 = java.util.Arrays.binarySearch(r7, r6)
            if (r7 < 0) goto L2a
            goto L2c
        L2a:
            r0 = r4
            goto L38
        L2c:
            if (r0 != r5) goto L38
            int[] r7 = r9.f95696a
            int r7 = java.util.Arrays.binarySearch(r7, r5)
            if (r7 < 0) goto L37
            goto L38
        L37:
            r0 = r2
        L38:
            int[] r7 = r9.f95696a
            int r7 = java.util.Arrays.binarySearch(r7, r0)
            if (r7 < 0) goto Lb5
            int r7 = r10.f92623z
            r8 = -1
            if (r7 == r8) goto L4d
            if (r0 != r6) goto L48
            goto L4d
        L48:
            int r10 = r9.f95697b
            if (r7 <= r10) goto L76
            return r3
        L4d:
            int r10 = r10.A
            if (r10 == r8) goto L52
            goto L55
        L52:
            r10 = 48000(0xbb80, float:6.7262E-41)
        L55:
            int r6 = yads.ib3.f90737a
            r7 = 29
            if (r6 < r7) goto L60
            int r7 = yads.tk.a(r0, r10)
            goto L76
        L60:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.get(r10)
            if (r10 == 0) goto L70
            r6 = r10
        L70:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
        L76:
            int r10 = yads.ib3.f90737a
            r1 = 28
            if (r10 > r1) goto L8a
            if (r7 != r2) goto L80
            r4 = r5
            goto L8b
        L80:
            r1 = 3
            if (r7 == r1) goto L8b
            r1 = 4
            if (r7 == r1) goto L8b
            r1 = 5
            if (r7 != r1) goto L8a
            goto L8b
        L8a:
            r4 = r7
        L8b:
            r1 = 26
            if (r10 > r1) goto La1
            yads.vk r10 = yads.pk2.f93622d
            java.lang.String r10 = r10.a()
            java.lang.String r1 = yads.ib3.f90738b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto La1
            r10 = 1
            if (r4 != r10) goto La1
            r4 = 2
        La1:
            int r10 = yads.ib3.a(r4)
            if (r10 != 0) goto La8
            return r3
        La8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        Lb5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.uk.a(yads.mx0):android.util.Pair");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk)) {
            return false;
        }
        uk ukVar = (uk) obj;
        return Arrays.equals(this.f95696a, ukVar.f95696a) && this.f95697b == ukVar.f95697b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f95696a) * 31) + this.f95697b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f95697b + ", supportedEncodings=" + Arrays.toString(this.f95696a) + C3978d4.j.f31385e;
    }
}
