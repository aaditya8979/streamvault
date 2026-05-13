package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class UN extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final VM A03;

    static {
        A04();
        A06 = UN.class.getSimpleName();
    }

    public UN(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = VM.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C2750gz A01(C2746gv c2746gv, String str) {
        C2750gz c2750gz = new C2750gz(c2746gv, this.A03, str);
        c2750gz.A0G(c2746gv.A0B(), c2746gv.A07());
        return c2750gz;
    }

    private C2747gw A02(C2737gm c2737gm, String str) {
        C2747gw c2747gw = new C2747gw(c2737gm, this.A03, str);
        c2747gw.A0J(c2737gm.A05, c2737gm.A02, c2737gm.A08);
        return c2747gw;
    }

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -12, -14, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, ExifInterface.MARKER_APP1, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, 16, 29, 0, 19, 12, 2, 10, 3, 29, 9, 3, 23, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, 21, 22, 20, 33, 21, 7, 20, 24, 11, 5, 7, 33, 21, 6, 13, 33, 24, 7, 20, 21, 11, 17, 16};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (this.A01 == null || !this.A01.handleMessage(message)) {
                Messenger messenger = message.replyTo;
                if (message.what == 1) {
                    if (messenger != null) {
                        VM.A00().A07(2, null, A00(), messenger);
                        return;
                    }
                    return;
                }
                String string = message.getData().getString(A03(27, 13, 58));
                if (string == null) {
                    return;
                }
                C2529dL c2529dLA05 = RB.A05(this.A00, string);
                c2529dLA05.A0F().AIi(message.getData().getBoolean(A03(6, 21, 22), false));
                String strVerifyPackage = this.A02 != null ? this.A02.verifyPackage(this.A00, message, message.getData().getString(A03(40, 14, 88))) : null;
                if (strVerifyPackage == null) {
                    if (messenger != null) {
                        VM.A00().A07(20, string, null, messenger);
                    }
                    c2529dLA05.A0F().AHB();
                    return;
                }
                switch (message.what) {
                    case 1010:
                        if (messenger == null) {
                            return;
                        }
                        UK ukA04 = VM.A00().A04(string);
                        if (ukA04 == null) {
                            ukA04 = VM.A00().A05(string, messenger, strVerifyPackage);
                        }
                        C2746gv c2746gvA04 = AbstractC2013Nt.A04(c2529dLA05, message.getData(), strVerifyPackage);
                        if (ukA04.A00 == null) {
                            ukA04.A00 = A01(c2746gvA04, string);
                        } else if (ukA04.A00 instanceof C2750gz) {
                            ((C2750gz) ukA04.A00).A0G(c2746gvA04.A0B(), c2746gvA04.A07());
                        }
                        VM.A00().A07(1011, string, A00(), messenger);
                        return;
                    case 1012:
                    case 2002:
                        VM.A00().A08(string);
                        return;
                    case 2000:
                        if (messenger == null) {
                            return;
                        }
                        UK ukA042 = VM.A00().A04(string);
                        if (ukA042 == null) {
                            ukA042 = VM.A00().A05(string, messenger, strVerifyPackage);
                        }
                        C2737gm c2737gmA05 = AbstractC2013Nt.A05(c2529dLA05, message.getData(), strVerifyPackage);
                        if (ukA042.A00 == null) {
                            ukA042.A00 = A02(c2737gmA05, string);
                        } else if (ukA042.A00 instanceof C2747gw) {
                            ((C2747gw) ukA042.A00).A0J(c2737gmA05.A05, c2737gmA05.A02, c2737gmA05.A08);
                        }
                        VM.A00().A07(2001, string, A00(), messenger);
                        return;
                    case 2003:
                        InterfaceC1996Nc interfaceC1996NcA03 = VM.A00().A03(string);
                        if (interfaceC1996NcA03 instanceof C2747gw) {
                            RewardData rewardDataA01 = AbstractC2014Nu.A01(message.getData());
                            C2747gw c2747gw = (C2747gw) interfaceC1996NcA03;
                            if (rewardDataA01 != null) {
                                c2747gw.A0I(rewardDataA01);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th2) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
