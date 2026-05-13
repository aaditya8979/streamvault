package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.if, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class Cif {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2482 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2483;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2484;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f2485;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2486;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2487;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Cipher f2488;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private SecretKey f2489;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Cipher f2490;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.if$e */
    public class e extends Exception {
        public e(String str) {
            super(str);
        }
    }

    static {
        m6551();
        f2487 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
        int i10 = f2482 + 39;
        f2484 = i10 % 128;
        int i11 = i10 % 2;
    }

    public Cif(byte[] bArr, String str, String str2, String str3) {
        byte[] bArrDigest;
        try {
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(m6550("\ufffe\f\uffff\ufffe￩\uffff\ufffe\uffff￩\u000f\u0001�\u0010\u0005\ufffe\ufff2\ufff1￮\u0000\n��\u0004\u000f\u0004\u0010\u0005\u0013\u0001", MotionEvent.axisFromString("") + 30, true, 2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 227 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            sb2.append(str3);
            bArrDigest = secretKeyFactory.generateSecret(new PBEKeySpec(sb2.toString().toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            ik.m6581(m6550("\f\u001c\u001e\u000f\u000b\ufff8￼￮￪\uffc9￪\uffff￮￮\ufff4\u001b\u0018\u001d\n", KeyEvent.getDeadChar(0, 0) + 19, true, 15 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 245 - TextUtils.getOffsetAfter("", 0)).intern(), m6550("\uffc1\ufff5\u0013\u001a\n\u000f\b\uffc1\u0005\n\u0007\u0007\u0006\u0013\u0006\u000f\u0015\uffc1\u0002\u0011\u0011\u0013\u0010\u0002\u0004\tￏ\ufff1\u0013\u0010\u0003\u0002\u0003\r\u001a\uffc1\u0002\u000f\uffc1\n\u000f\u0004\u0010\u000e\u0011\u0002\u0015\n\u0003\r\u0006\uffc1\u0005\u0006\u0017\n\u0004\u0006ￏ", 59 - Drawable.resolveOpacity(0, 0), false, ImageFormat.getBitsPerPixel(0) + 28, 253 - (Process.myPid() >> 22)).intern());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(m6548("\u0001\u0002±", 2 - TextUtils.lastIndexOf("", '0'), (byte) (124 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(str2);
                sb3.append(str3);
                for (char c10 : sb3.toString().toCharArray()) {
                    messageDigest.update((byte) c10);
                }
                bArrDigest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(m6548("\u0004\u0000\u0006\u0007\b\t\u0005\u000e\u000e\u0001\u0006\t\r\u000e\t\u0013\u000e\u0001¬", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 56)).intern(), e10);
            }
        }
        this.f2489 = new SecretKeySpec(bArrDigest, m6550("�\ufff9\u000b", ExpandableListView.getPackedPositionType(0L) + 3, true, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, 229 - MotionEvent.axisFromString("")).intern());
        m6549();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6548(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f2483;
            char c10 = f2485;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2156 = 0;
                while (true) {
                    int i11 = g.f2156;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2155 = cArr[i11];
                    g.f2153 = cArr[g.f2156 + 1];
                    if (g.f2155 == g.f2153) {
                        cArr3[g.f2156] = (char) (g.f2155 - b10);
                        cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                    } else {
                        g.f2154 = g.f2155 / c10;
                        g.f2152 = g.f2155 % c10;
                        g.f2157 = g.f2153 / c10;
                        g.f2150 = g.f2153 % c10;
                        if (g.f2152 == g.f2150) {
                            g.f2154 = ((g.f2154 + c10) - 1) % c10;
                            g.f2157 = ((g.f2157 + c10) - 1) % c10;
                            int i12 = (g.f2154 * c10) + g.f2152;
                            int i13 = (g.f2157 * c10) + g.f2150;
                            int i14 = g.f2156;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2154 == g.f2157) {
                            g.f2152 = ((g.f2152 + c10) - 1) % c10;
                            g.f2150 = ((g.f2150 + c10) - 1) % c10;
                            int i15 = (g.f2154 * c10) + g.f2152;
                            int i16 = (g.f2157 * c10) + g.f2150;
                            int i17 = g.f2156;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2154 * c10) + g.f2150;
                            int i19 = (g.f2157 * c10) + g.f2152;
                            int i20 = g.f2156;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2156 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m6549() {
        try {
            Cipher cipher = Cipher.getInstance(m6550(" \u0019\ufff3\ufff7\u0005￡\ufff5\ufff4\ufff5￡\u0002�\ufff5\u0005\uffe7\u0002\u0013\u0016\u0016\u001b", 19 - ((byte) KeyEvent.getModifierMetaStateMask()), false, 2 - TextUtils.getOffsetAfter("", 0), 236 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
            this.f2490 = cipher;
            SecretKey secretKey = this.f2489;
            byte[] bArr = f2487;
            cipher.init(1, secretKey, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(m6550(" \u0019\ufff3\ufff7\u0005￡\ufff5\ufff4\ufff5￡\u0002�\ufff5\u0005\uffe7\u0002\u0013\u0016\u0016\u001b", 20 - (ViewConfiguration.getPressedStateDuration() >> 16), false, Process.getGidForName("") + 3, TextUtils.indexOf((CharSequence) "", '0') + 237).intern());
            this.f2488 = cipher2;
            cipher2.init(2, this.f2489, new IvParameterSpec(bArr));
            int i10 = f2482 + 83;
            f2484 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException(m6548("\u0004\u0000\u0006\u0007\b\t\u0005\u000e\u000e\u0001\u0006\t\r\u000e\t\u0013\u000e\u0001\u0014\u000f¨", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20, (byte) (MotionEvent.axisFromString("") + 119)).intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6550(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f728) {
            char[] cArr2 = new char[i10];
            b.f726 = 0;
            while (true) {
                int i13 = b.f726;
                if (i13 >= i10) {
                    break;
                }
                b.f727 = cArr[i13];
                cArr2[b.f726] = (char) (b.f727 + i12);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f2486);
                b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i17 = b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m6551() {
        f2486 = 158;
        f2485 = (char) 5;
        f2483 = new char[]{'M', 'D', '5', 'I', 'n', 'v', 'a', 'l', 'i', 'd', ' ', 'e', 'r', 'o', 'm', 't', '2', ':', 'N', 'O', 'P', 'Q', 'R', 'S', 'T'};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized String m6552(String str) {
        if ((TextUtils.isEmpty(str) ? '+' : 'Z') == '+') {
            int i10 = f2484 + 125;
            f2482 = i10 % 128;
            int i11 = i10 % 2;
            return str;
        }
        try {
            try {
                Cipher cipher = this.f2490;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m6550("\n\u0015\u0016ￏ\b\u000f\n\r\r\n\u0003ￏ\u0002\r\u000e\u0010\u0010\u0014ￏ\u000e\u0010\u0004\u001dￒￎ\u0013\u0010\u0015\u0002\u0004\u0014\u0016\u0007\u0003\ufff0\ufff4￦￢ￏ\r", 39 - MotionEvent.axisFromString(""), true, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 252).intern());
                sb2.append(str);
                String strM6544 = ie.m6544(cipher.doFinal(sb2.toString().getBytes(m6550("\u0011\u0010\u0002￩\ufff4", Color.rgb(0, 0, 0) + 16777221, false, View.combineMeasuredStates(0, 0) + 5, 226 - View.resolveSize(0, 0)).intern())));
                int i12 = f2482 + 115;
                f2484 = i12 % 128;
                int i13 = i12 % 2;
                return strM6544;
            } catch (UnsupportedEncodingException e10) {
                m6549();
                throw new RuntimeException(m6548("\u0004\u0000\u0006\u0007\b\t\u0005\u000e\u000e\u0001\u0006\t\r\u000e\t\u0013\u000e\u0001¬", 19 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (56 - View.combineMeasuredStates(0, 0))).intern(), e10);
            }
        } catch (GeneralSecurityException e11) {
            m6549();
            throw new RuntimeException(m6548("\u0004\u0000\u0006\u0007\b\t\u0005\u000e\u000e\u0001\u0006\t\r\u000e\t\u0013\u000e\u0001¬", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 55)).intern(), e11);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m6553(String str) throws e {
        if ((TextUtils.isEmpty(str) ? ' ' : 'Z') != 'Z') {
            int i10 = f2482 + 29;
            f2484 = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        try {
            try {
                String str2 = new String(this.f2488.doFinal(ie.m6547(str)), m6550("\u0011\u0010\u0002￩\ufff4", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4, false, 5 - TextUtils.indexOf("", "", 0), TextUtils.getCapsMode("", 0, 0) + Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE).intern());
                if (str2.indexOf(m6550("\n\u0015\u0016ￏ\b\u000f\n\r\r\n\u0003ￏ\u0002\r\u000e\u0010\u0010\u0014ￏ\u000e\u0010\u0004\u001dￒￎ\u0013\u0010\u0015\u0002\u0004\u0014\u0016\u0007\u0003\ufff0\ufff4￦￢ￏ\r", Color.alpha(0) + 40, true, 22 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 253 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern()) != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m6550("\u0010\u000bￇ\u000b\b\u001b\bￇ\u0016\u0019ￇ\u0012\f \uffd0￡\uffef\f\b\u000b\f\u0019ￇ\u0015\u0016\u001bￇ\r\u0016\u001c\u0015\u000bￇￏ\u0010\u0015\u001d\b\u0013", 39 - View.getDefaultSize(0, 0), false, 17 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 247 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                    sb2.append(str);
                    throw new e(sb2.toString());
                }
                String strSubstring = str2.substring(m6550("\n\u0015\u0016ￏ\b\u000f\n\r\r\n\u0003ￏ\u0002\r\u000e\u0010\u0010\u0014ￏ\u000e\u0010\u0004\u001dￒￎ\u0013\u0010\u0015\u0002\u0004\u0014\u0016\u0007\u0003\ufff0\ufff4￦￢ￏ\r", 39 - ExpandableListView.getPackedPositionChild(0L), true, KeyEvent.keyCodeFromString("") + 22, 253 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern().length(), str2.length());
                int i12 = f2482 + 95;
                f2484 = i12 % 128;
                int i13 = i12 % 2;
                return strSubstring;
            } catch (ic e10) {
                m6549();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e10.getMessage());
                sb3.append(m6548("\u008c", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, (byte) (82 - (ViewConfiguration.getJumpTapTimeout() >> 16))).intern());
                sb3.append(str);
                throw new e(sb3.toString());
            } catch (IllegalBlockSizeException e11) {
                m6549();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(e11.getMessage());
                sb4.append(m6548("\u008c", '1' - AndroidCharacter.getMirror('0'), (byte) (82 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern());
                sb4.append(str);
                throw new e(sb4.toString());
            }
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException(m6548("\u0004\u0000\u0006\u0007\b\t\u0005\u000e\u000e\u0001\u0006\t\r\u000e\t\u0013\u000e\u0001¬", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19, (byte) (56 - Color.green(0))).intern(), e12);
        } catch (BadPaddingException e13) {
            m6549();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(e13.getMessage());
            sb5.append(m6548("\u008c", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 81)).intern());
            sb5.append(str);
            throw new e(sb5.toString());
        }
    }
}
