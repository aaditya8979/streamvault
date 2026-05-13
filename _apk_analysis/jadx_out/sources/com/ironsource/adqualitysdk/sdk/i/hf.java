package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes11.dex */
public final class hf extends hb<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2330 = {'9', 'p', 'q', 'j', 'i', 'p', 'i', 'd', 'T', '[', 'k', 'i', 'i', 'l', 's', 'n', 'Z', ']', 'n', 'l', 'n', 'l', 'h', 'n', 'n', 'n', 'Y', 'X', '^', 'L', 175, 198, 196, 196, 157, 152, 191, 155, 154, 180, 175, 171, 174, 194, 199, 192, 189, 189, 191, 157, 155, 194, 172, 173, 194, 194, 194, 188, 192, 194, 192, 194};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2331 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2332 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b f2333;

    public interface b {
        /* JADX INFO: renamed from: ﻛ */
        void mo5912(hf hfVar, MediaPlayer mediaPlayer);
    }

    public hf(MediaPlayer.OnCompletionListener onCompletionListener, b bVar) {
        super(onCompletionListener);
        this.f2333 = bVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6324(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2470) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f2330, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2469 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2469;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2469 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2469 = 0;
                while (true) {
                    int i16 = i.f2469;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2469 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2469 = 0;
                while (true) {
                    int i17 = i.f2469;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2469 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/hf;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.g.f53132f, mediaPlayer);
        safedk_hf_onCompletion_64fd8678fbbbd5308a6119e4a6fe7e34(mediaPlayer);
    }

    public void safedk_hf_onCompletion_64fd8678fbbbd5308a6119e4a6fe7e34(MediaPlayer mediaPlayer) {
        int i10 = f2331 + 89;
        f2332 = i10 % 128;
        try {
        } catch (Throwable th2) {
            kd.m6948(m6324(new int[]{0, 29, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001", true).intern(), m6324(new int[]{29, 33, 84, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001", false).intern(), th2, false);
        }
        if (i10 % 2 == 0) {
            this.f2333.mo5912(this, mediaPlayer);
            throw null;
        }
        this.f2333.mo5912(this, mediaPlayer);
        if (mo4818() != null) {
            int i11 = f2331 + 55;
            f2332 = i11 % 128;
            boolean z10 = i11 % 2 != 0;
            mo4818().onCompletion(mediaPlayer);
            if (z10) {
            } else {
                throw null;
            }
        }
    }
}
